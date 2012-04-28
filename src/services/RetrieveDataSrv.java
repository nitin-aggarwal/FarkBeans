package services;

import java.util.List;

import javax.persistence.Query;
import entities.AbstractDB;


public class RetrieveDataSrv extends BaseSrv {

   public static List<AbstractDB> retrieveRecords(String tableName,String site)
   {
       Query query = null;
       if(site.equals("others"))
       {
           query = getEntityManger().createQuery("SELECT st FROM "+ tableName+ " st");
       }
       else
       {
           query = getEntityManger().createQuery("SELECT article FROM "+ tableName+" st where sourceURL="+site);
       }
       @SuppressWarnings("unchecked")
       List<AbstractDB> articleList = query.getResultList();
       return articleList;
   }
   
   public static List<AbstractDB> retrieveRecordsbyTag(String tableName, String tag)
   {
       Query query = null;
       query = getEntityManger().createQuery("Select st FROM "+ tableName+" st WHERE st.farkTag='"+tag+"' and st.articleContent is NULL");
      // query.setMaxResults(10);
       @SuppressWarnings("unchecked")
       List<AbstractDB> articleList = query.getResultList();
       return articleList;
   }
   
   public static List<AbstractDB> retrieveRecords(String tableName,String site , String tag)
   {
	   Query query = null;
       query = getEntityManger().createQuery("Select st FROM "+ tableName+" st WHERE st.farkTag='"+tag+"' and st.sourceURL='"+site+"'");
       @SuppressWarnings("unchecked")
       List<AbstractDB> articleList = query.getResultList();
       return articleList;
	   
   }
   
   public static List<AbstractDB> retrieveRecords(String tableName, String[] tags)
   {
       Query query = null;
       StringBuilder tagConditions = new StringBuilder();
       for(String s: tags)
    	   tagConditions.append("'"+s+"',");
       tagConditions.setLength(tagConditions.length()-1);
       System.out.println(tagConditions);
       
       query = getEntityManger().createQuery("Select st FROM "+ tableName+" st WHERE st.farkTag IN ("+tagConditions+
    		   ") and st.articleContent is NOT NULL and length(st.articleContent) < 6000");
       //query.setMaxResults(1);
       
       @SuppressWarnings("unchecked")
       List<AbstractDB> articleList = query.getResultList();
       return articleList;
   }
   
   public static List<Integer> retrieveAttr(String tableName, String attribute)
   {
       Query query = null;
       query = getEntityManger().createQuery("Select st."+attribute+" FROM "+ tableName+ " st where st.id > 0");
       @SuppressWarnings("unchecked")
       List<Integer> listIds = query.getResultList();
       return listIds;
   }
}


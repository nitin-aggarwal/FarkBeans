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
       List<AbstractDB> articleList = query.getResultList();
       return articleList;
   }
   
   public static List<AbstractDB> retrieveRecordsbyTag(String tableName, String tag)
   {
       Query query = null;
       query = getEntityManger().createQuery("Select st FROM "+ tableName+" st WHERE st.farkTag='"+tag+"' and st.articleContent is NULL");
      // query.setMaxResults(10);
       List<AbstractDB> articleList = query.getResultList();
       return articleList;
   }
   
   public static List<AbstractDB> retrieveRecords(String tableName,String site , String tag)
   {
	   Query query = null;
       query = getEntityManger().createQuery("Select st FROM "+ tableName+" st WHERE st.farkTag='"+tag+"' and st.sourceURL='"+site+"'");
       List<AbstractDB> articleList = query.getResultList();
       return articleList;
	   
   }
   
}

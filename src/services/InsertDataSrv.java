package services;

import entities.AbstractDB;

public class InsertDataSrv extends BaseSrv {

	
	
	public static void save(AbstractDB ad) {
		// TODO Auto-generated method stub
		try
		{
			getEntityManger().persist(ad);
		}
		catch(Exception ex)
		{
			//System.out.println(ex.getMessage());
			//ex.printStackTrace();
			System.out.println(ad);	
		}
	}
	
	

}

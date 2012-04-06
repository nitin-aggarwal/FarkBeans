package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseSrv {

	protected static EntityManager em;
	
	
	public static void beginTransaction()
	{
		getEntityManger().getTransaction().begin();
	}
	
	
	public static EntityManager getEntityManger()
	{
		if(em == null)
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
			em = emf.createEntityManager();
		}
		return em;
	}
	
	public static void commit()
	{
		try
		{
			if(getEntityManger().getTransaction().isActive())
				getEntityManger().getTransaction().commit();
		}
		catch(Exception ex)
		{
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}

	public static void close()
	{
		getEntityManger().close();
	}
	
}

import java.math.BigDecimal;
import java.util.ArrayList;

public class CompagnieAutoroute 
{
	ArrayList<Route> routes = new ArrayList<Route>();
	ArrayList<Tarif> tarifs = new ArrayList<Tarif>();
	
	
	
	public ArrayList<Route> getRoutes() {
		return routes;
	}
	public void setRoutes(ArrayList<Route> routes) {
		this.routes = routes;
	}
	public ArrayList<Tarif> getTarifs() {
		return tarifs;
	}
	public void setTarifs(ArrayList<Tarif> tarifs) {
		this.tarifs = tarifs;
	}


	public CompagnieAutoroute() 
	{
		
	}
	
	public BigDecimal obtenirTarif(Porte entre, Porte sortie)
	{
		Tarif tarif;
		BigDecimal retour;
		if(getTarifExacte(entre, sortie) != null)
		{
			tarif = getTarifExacte(entre, sortie);
			retour = tarif.getPrix();
		}
		else
		{
			tarif = getTarifCalule(entre, sortie);
			retour = tarif.getPrix();
		}
		
		return retour;
	}
	
	private Tarif getTarifCalule(Porte entre, Porte sortie)
	{
		
		BigDecimal b = null;
		for (Tarif var : tarifs )
		{
			if(var.getEntree().getNumeroDePorte() >= entre.getNumeroDePorte() && var.getSortie().getNumeroDePorte() >= sortie.getNumeroDePorte())
			{
				b = var.getPrix();
			}
		}
		Tarif retour = new Tarif(entre, sortie, b);
		return retour;
	}
	
	private Tarif getTarifExacte(Porte entre, Porte sortie)
	{
		Tarif retour = null;
		for(Tarif var : tarifs) 
		{ 
		    if( var.getEntree() == entre && var.getSortie() == sortie || var.getEntree() == sortie && var.getSortie() == entre)
		    {
		    	retour = var;
		    }
		}
		return retour;
	}
	
	public void ajouterTarif(Tarif a)
	{
		tarifs.add(a);
	}
	
	public void ajouterRoute(Route a)
	{
		routes.add(a);
	}
	
}

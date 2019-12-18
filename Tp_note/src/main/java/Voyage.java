import java.math.BigDecimal;

public class Voyage 
{

	Porte entree;
	BigDecimal tarif;
	Porte sortie;
	CompagnieAutoroute autoroute;
	 
	
	
	public Porte getEntree() {
		return entree;
	}

	public void setEntree(Porte entree) {
		this.entree = entree;
	}

	public BigDecimal getTarif() {
		return tarif;
	}

	public Porte getSortie() {
		return sortie;
	}

	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}

	public CompagnieAutoroute getAutoroute() {
		return autoroute;
	}

	public void setAutoroute(CompagnieAutoroute autoroute) {
		this.autoroute = autoroute;
	}

	public Voyage(Porte a, Porte b, CompagnieAutoroute c)
	{
		
	}
}

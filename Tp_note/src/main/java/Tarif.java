import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Tarif 
{

	Porte entree;
	Porte sortie;
	LocalDateTime dateValidite;
	BigDecimal prix;
	
	
	public Porte getEntree() {
		return entree;
	}

	public void setEntree(Porte entree) {
		this.entree = entree;
	}

	public Porte getSortie() {
		return sortie;
	}

	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}

	public LocalDateTime getDateValidite() {
		return dateValidite;
	}

	public void setDateValidite(LocalDateTime dateValidite) {
		this.dateValidite = dateValidite;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	
	public Tarif(Porte entree, Porte sortie) {
		super();
		this.entree = entree;
		this.sortie = sortie;
	}
	
	public Tarif(Porte entree, Porte sortie,BigDecimal a) {
		super();
		this.entree = entree;
		this.sortie = sortie;
		this.prix = a;
	}
	

	@Override
	public String toString() {
		return "Tarif [entree=" + entree + ", sortie=" + sortie + ", dateValidite=" + dateValidite + ", prix=" + prix
				+ "]";
	}
}


public class Porte 
{

	Integer numeroDePorte;
	
	
	public Integer getNumeroDePorte() {
		return numeroDePorte;
	}

	public void setNumeroDePorte(Integer numeroDePorte) {
		this.numeroDePorte = numeroDePorte;
	}

	public Porte(Integer a)
	{
		numeroDePorte = a;
	}
		
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDePorte == null) ? 0 : numeroDePorte.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Porte other = (Porte) obj;
		if (numeroDePorte == null) {
			if (other.numeroDePorte != null)
				return false;
		} else if (!numeroDePorte.equals(other.numeroDePorte))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		return "Porte [numeroDePorte=" + numeroDePorte + "]";
	}
	
	
}

import java.util.ArrayList;

public class Route 
{

	ArrayList<Porte> portes = new ArrayList<Porte>();
	
	public Route()
	{
		
	}
	
	void addPorte(Porte a)
	{
		portes.add(a);
	}

	@Override
	public String toString() {
		return "Route [portes=" + portes + "]";
	}
	
	
}

package curso321;

public class Animal implements Acciones {

	private String nombre;
	public String raza;
	public String altura;

	public String GetNombret() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public void SetNombre(String name) {
		// TODO Auto-generated method stub
		nombre = name;

	}

	@Override
	public String Correr() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Nadar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String dormir() {
		return "";
	}

	public String HacerRuido() {
		return "";
	}
}

package curso321;
public class Main {
	public static void main(String args[]) {
		/*
		System.out.println("Hola Mundo cruel");
		Perro P = new Perro();
		P.nombre = "Firulais";
		P.altura = "2 Metro";
		System.out.println(P.Comer("carne"));
		*/
		
		Gato GatoObj = new Gato();
		GatoObj.SetNombre("Pancha");
		
		Dinosaurio DinosaurioObj = new Dinosaurio();
		DinosaurioObj.SetNombre("T-Rex");

		System.out.println(DinosaurioObj.GetNombret());
		Ruido(GatoObj);
		Ruido(DinosaurioObj);
	}
	
	public static void Ruido(Animal Aobj) {
		System.out.println(Aobj.HacerRuido());
	}
	
	
}

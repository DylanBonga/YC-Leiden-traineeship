class Chocola{
	public static void main(String[] args){
		int getal; // declaratie
		getal = 5; // initialisatie
		String zin = "Snackies zijn lekker"; 
		System.out.println(getal);
		System.out.println(zin);
		Student jojo = new Student();
		

		jojo.voornaam = "Fredje"; 
		jojo.achternaam = "Frintsom";
		System.out.println(jojo);
		new Chocola().hups();
	}
	static void hups(){
		System.out.println("hups");
	}

}

class Student{
	String voornaam;
	String achternaam;
	
}

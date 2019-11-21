class Demo{
	public static void main(String[] args){
		System.out.println("Welcome!");
		Auto mijnAuto = new Auto();
		AutoSpuiterij as = new AutoSpuiterij();
		System.out.println("kleur auto1: " + mijnAuto.kleur);
		as.autoOverspuiten("lichtblauw", mijnAuto);
	}
}



class Auto{
	String merk;
	String type;
	String kleur;
	
}

class AutoSpuiterij{
	
	void autoOverspuiten(String kleur, Auto auto){
		System.out.println("Ik ben in de autospuiterij!");
	}
}

package torneoDeHeroes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// objetos heroe
		Heroe Lycan= new Heroe("Lycan", 17, 25, 16);
		Heroe Storm_Spirit= new Heroe("Storm Spirit",23,21,22);
		Heroe Timbersaw= new Heroe("Timbersaw",23,23,16);
		Heroe Ursa= new Heroe("Ursa",16,24,18);
		Heroe Spectre= new Heroe("Spectre",16,23,23);
		Heroe Pugna= new Heroe("Pugna",24,19,16);
		Heroe Naga_Siren= new Heroe("Naga Siren",21,22,21);
		Heroe Morphling= new Heroe("Morphling",13,20,24);
		
		Torneo torneoEnCurso= new Torneo(); // objeto creado
		
		
		// agregado de heroes
		torneoEnCurso.agregarHeroes(Lycan);
		torneoEnCurso.agregarHeroes(Storm_Spirit);
		torneoEnCurso.agregarHeroes(Timbersaw);
		torneoEnCurso.agregarHeroes(Ursa);
		torneoEnCurso.agregarHeroes(Spectre);
		torneoEnCurso.agregarHeroes(Pugna);
		torneoEnCurso.agregarHeroes(Naga_Siren);
		torneoEnCurso.agregarHeroes(Morphling);
		
		//inicio metodo empezar torneo objeto torneoEnCurso
		torneoEnCurso.empezarTorneo();
	}

}

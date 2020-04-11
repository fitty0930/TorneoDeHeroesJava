package torneoDeHeroes;

public class Heroe {
	// atributos
	private String nombre;
	final static int INTELIGENCIA = 0;
	final static int FUERZA = 1;
	final static int AGILIDAD = 2;
	private int[] atributos = { INTELIGENCIA, FUERZA, AGILIDAD }; // revisar
	private static String[]NombreAtr= {"Inteligencia","Fuerza","Agilidad"};

	// constructor
	public Heroe(String nombre, int atributoInteligencia, int atributoFuerza, int atributoAgilidad) {
		// setear
		this.nombre = nombre;
		this.atributos[0] = atributoInteligencia;
		this.atributos[1] = atributoFuerza;
		this.atributos[2] = atributoAgilidad;

	}

	// metodos
	public String getNombre() {
		return nombre;
	}

	public int getAtributo(int a) {
		return atributos[a];
	}
	
	public static String getAtributoNombre(int b) {
		return NombreAtr[b];
	}

	public int pelear(int atributoP, Heroe personaje) {
		int resultado = 0;
		if (this.atributos[atributoP] >= personaje.atributos[atributoP]) {
			resultado= 1;
		} else {
			resultado= -1;
		}

		return resultado;
	}

}

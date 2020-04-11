package torneoDeHeroes;

public class Torneo {
	// atributos
	final static int PARTICIPANTES = 8;
	private Heroe[] participantes;
//	String[]atributos= {"Inteligencia","Fuerza","Agilidad"};

	// constructor
	public Torneo() {
		participantes = new Heroe[PARTICIPANTES];
	}

	// metodos
	public void empezarTorneo() {
		int resultado = 0;
		int i = 0;
		// presentacion de personajes
		presentarPersonajes();
		// torneo

		while (i < PARTICIPANTES-1) {
			if (participantes[i] != null && participantes[i + 1] != null) {
				int AtrPelear = (int) Math.floor(Math.random() * 3);
				System.out.println(participantes[i].getNombre() + " vs " + participantes[i + 1].getNombre()); // imprimo
																												// batalla

				System.out.println("Batalla por el atributo " + Heroe.getAtributoNombre(AtrPelear));

				resultado = participantes[i].pelear(AtrPelear, participantes[i + 1]);
				if (resultado == 1) {
					System.out.println("Ganador de la ronda: " + participantes[i].getNombre());
					corrimientoaIzq(i + 1);
				} else if (resultado == -1) {
					System.out.println("Ganador de la ronda: " + participantes[i + 1].getNombre());
					corrimientoaIzq(i);
				}
				System.out.println("  ");
			}
			i++;
			if (i == PARTICIPANTES-1 && participantes[1] != null) {
				i = 0;
			}

		}
		System.out.println(" ");
		System.out.println("El ganador del torneo es:" + participantes[0].getNombre());
	}

	private void presentarPersonajes() {
		System.out.println("Los participantes son: ");
		for (int j = 0; j < PARTICIPANTES; j++) {
			System.out.println("Participante " + (j + 1) + ": " + participantes[j].getNombre() + " con "
					+ participantes[j].getAtributo(0) + " puntos de inteligencia,");
			System.out.println(participantes[j].getAtributo(1) + " puntos de fuerza y "
					+ participantes[j].getAtributo(2) + " puntos de agilidad");
		}

		System.out.println(" ");
	}

	private void corrimientoaIzq(int posCorr) {
		for (int i = posCorr; i < PARTICIPANTES - 1; i++) {
			participantes[i] = participantes[i + 1];
		}
		participantes[PARTICIPANTES - 1] = null;
	}

	public void agregarHeroes(Heroe heroe1) {
		int i = 0;
		while (i < PARTICIPANTES) {
			if (participantes[i] == null) {
				participantes[i] = heroe1;
				i = PARTICIPANTES;
			}
			i++;
		}
	}
}

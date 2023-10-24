// Posizione di questa classe: quando le classi non stanno nel package di default,
// viene automaticamente specificata la posizione (il percorso) della classe
package com.nttdata.main;

// Import del tipo di dato "Persona" che viene usato in questa classe. Anche qui
// bisogna specificare la posizione (il percorso) dove si trova tale classe
import com.nttdata.model.Persona;

public class Main {
	public static void main(String[] args) {

		/*
		 * Encapsulation & information hiding
		 * 
		 * L'encapsulation e' uno dei quattro principi piu' popolari della
		 * programmazione orientata agli oggetti. Il principio dice che e' buona norma
		 * regolare l'accesso ai membri interni di una classe (membri = attributi +
		 * metodi) tramite l'uso di "modificatori di accesso" e dei metodi getters &
		 * setters. L'accesso diretto agli attributi di una classe e' scoraggiato.
		 * 
		 * Per regolare l'accesso ai membri di una classe il linguaggio riserva delle
		 * parole chiave che in letteratura vengono chiamate proprio
		 * "modificatori di accesso". Esse sono:
		 * 
		 * - private: rende il membro visibile soltanto all'interno della classe stessa
		 * 
		 * - nessuno: non impostare alcun modificatore di accesso rende il membro della
		 * classe visibile soltanto dall'interno della classe e da altre classi presenti
		 * nello stesso package
		 * 
		 * - protected: rende il membro visibile soltanto dall'interno della classe
		 * stessa o da altre classi presenti nello stesso package (ed anche da classi
		 * derivate, argomento che tratteremo piu' avanti con l'ereditarieta')
		 * 
		 * - public: rende il membro visibile ovunque
		 *
		 * In virtu' di quanto appena detto, e' preferibile rendere gli attributi della
		 * classe private, mentre i getters & setters (cosi' come i costruttori) saranno
		 * public (vedi classe "Persona").
		 * 
		 * Per "accesso all'attributo di un oggetto" intendiamo naturalmente la lettura
		 * del suo valore (ottenibile grazie al metodo di get) e la scrittura del suo
		 * valore (metodo di set).
		 * 
		 * Vediamo come l'encapsulation cambia le carte in tavola: dichiariamo un
		 * oggetto di tipo Persona invocando il suo costruttore public:
		 */

		Persona pincoPallo = new Persona("Pinco", "Pallo", 23);

		/*
		 * Se proviamo ad accedere direttamente all'attributo "nome", il compilatore ci
		 * avverte che tale campo non e' visibile. Non lo e' perche' il campo e' stato
		 * dichiarato private, pertanto non e' possibile accedervi dall'esterno, ovvero
		 * da dove ci troviamo ora, in una classe di un altro package:
		 */
		pincoPallo.nome = "Marco";

		/*
		 * Pertanto, se vogliamo modificare il nome dell'oggetto referenziato da
		 * "pincoPallo", dobbiamo usare il suo setter (dichiarato ovviamente public):
		 */
		pincoPallo.setNome("Marco");

		/*
		 * Avere quindi nascosto all'esterno le proprieta' interne di un oggetto le ha,
		 * per cosi' dire, incapsulate nell'oggetto stesso. Per questo parliamo di
		 * "encapsulation" ed "information hiding". Tuttavia il concetto di information
		 * hiding e' piu' esteso (ed applicabile non solo agli attributi di una semplice
		 * classe, ma a molti piu' elementi che compongono lo sviluppo di un software) e
		 * lo vedremo meglio man mano che i nostri progetti prendono corpo :)
		 */

	}
}

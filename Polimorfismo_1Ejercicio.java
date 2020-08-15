/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo_1.ejercicio;

/**
 *
 * @author User
 */
class Distractor {

    public void distraer() {
        System.out.println("Cuidado...");
    }
}

class Uso_Celular extends Distractor {

    public void distraer() {
        System.out.println("Cuidado");
    }
}

class Hablar_telefono extends Distractor {

    public void distraer() {
        System.out.println("Cuidado");
    }
}

class Maquillarse extends Distractor {

    public void distraer() {
        System.out.println("Cuidado");
    }
}

class Operar_radio extends Distractor {

    public void distraer() {
        System.out.println("Cuidado");
    }
}

class Beber extends Distractor {

    public void distraer() {
        System.out.println("Cuidado");
    }
}

class Conduccion_normal extends Distractor {

    public void distraer() {
        System.out.println("Seguro...");
    }
}

public class Polimorfismo_1Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Distractor Objeto1 = new Uso_Celular();
        Distractor Objeto2 = new Hablar_telefono();
        Distractor Objeto3 = new Maquillarse();
        Distractor Objeto4 = new Operar_radio();
        Distractor Objeto5 = new Beber();
        Distractor Objeto6 = new Conduccion_normal();

        System.out.println("Distractor que no es seguro: Uso celular");
        Objeto1.distraer();
        System.out.println("Distractor que no es seguro: Hablar por telefono");
        Objeto2.distraer();
        System.out.println("Distractor que no es seguro: Maquillarse");
        Objeto3.distraer();
        System.out.println("Distractor que no es seguro: Operar radio");
        Objeto4.distraer();
        System.out.println("Distractor que no es seguro: Beber");
        Objeto5.distraer();
        System.out.println("Distractor que es seguro: Conduccion normal");
        Objeto6.distraer();
    }

}

package source.entidades;

public class Ecuacion {

    double a;
    double b;
    double c;
    double disc;
    double raiz1;
    double raiz2;

    public Ecuacion(Integer[] nums) {
        this.a = nums[0];
        this.b = nums[1];
        this.c = nums[2];
    }
    
    public void resolver() {
        //Discriminante
        disc = Math.pow(b, 2) - 4 * a * c;

        if (disc < 0) {

            System.out.println("Raices complejas.");

        } else {

            raiz1 = (-b + Math.sqrt(disc)) / (2 * a);

            raiz2 = (-b - Math.sqrt(disc)) / (2 * a);

            System.out.println(raiz1);

            System.out.println(raiz2);

        }
    }
}

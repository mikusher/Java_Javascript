




package cv.mikusher.cursojava.aula35;





public class Calculadora {

    public static int fibonacci(int num) {

        if (num < 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }





    public static int somatorio(int num) {

        if (num == 0) {
            return num;
        }
        return num + somatorio(num - 1);
    }
}

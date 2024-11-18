import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         //Dado (h:m:s) en ambos puntos calcula cuanto se hizo en total de tiempo

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Ingrese a que hora inicio la carrera: ");
//        System.out.println("Ingrese la hora: ");
//        int h = input.nextInt();
//        System.out.println("Ingrese los minutos: ");
//        int m = input.nextInt();
//        System.out.println("Ingrese los segundos: ");
//        int s = input.nextInt();
//
//        System.out.println("Ingrese el tiempo que tardo la carrera: ");
//        System.out.println("Ingrese la hora: ");
//        int h2 = input.nextInt();
//        System.out.println("Ingrese los minutos: ");
//        int m2 = input.nextInt();
//        System.out.println("Ingrese la segundos: ");
//        int s2 = input.nextInt();
//
//        int calcSecAllFirst = (h*3600) + (m * 60) + s;
//        int calcSecAllSecond = (h2*3600) + (m2 * 60) + s2;
//
//        int sumBothTemps = calcSecAllFirst+calcSecAllSecond;
//
//
//        int getH = sumBothTemps/3600;
//        int getM = (sumBothTemps%3600) / 60;
//        int getS = (sumBothTemps%3600) % 60;
        // 15:59:30
        //1:01:30 -> 3600+60+30->3690
        // 17:01:00

//        System.out.println("h: " + getH + " m: " + getM + " s: " + getS);


        // Simulando una web de Tickets

/*        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el precio: ");
        float price = input.nextFloat();
        System.out.println("Introduce la edad: ");
        int yearsOld = input.nextInt();
        System.out.println("Introduce el dia de la semana en numero: ");
        int daysOfWeekend = input.nextInt();
        System.out.println("Introduce si es con descuento o no (true o false): ");
        boolean descuentTicket = input.nextBoolean();

        double priceResult= 0;

        if (yearsOld<0 || price<0 || daysOfWeekend>7 || daysOfWeekend<1) {
            System.out.println("Por favor introducir un Valor correcto");
            System.out.println("La edad no puede ser menor que 0");
            System.out.println("El precio no puedo ser menor que 0");
            System.out.println("Los dias de la semana tiene que ser entre(1-7)");
            return;
        }

        if (yearsOld < 6){
            priceResult = (price * 0);
        } else if (yearsOld < 18) {
            priceResult = (price*0.90);
        } else if (yearsOld>=65) {
            priceResult = (price*0.85);
        } else {
            priceResult = price;
        }

        if (descuentTicket){
            priceResult = priceResult*0.70;
        } else {
            if (daysOfWeekend==3) {
                priceResult = priceResult*0.75;
            } else if (daysOfWeekend == 6 || daysOfWeekend == 7) {
                priceResult = priceResult*1.05;
            }
        }

        System.out.println("El precio final es: " + priceResult);*/


        //Si la persona es menor de 6 años es gratuita
        // , si es menor de 18 años 10%
        //Si tiene 65 años o mas se aplica 15%


        //Dia de la semana
        //Miercoles 25%
        //Sabado y Domingo se aumenta el 5%

        //Cupon de descuento 30%

        //Primero por edad despues de semana
        //Si se aplica descuento y el dia de la semana solo sera el dia de la semana



       /* Scanner input = new Scanner(System.in);

        System.out.println("Ingresa nota del los alumnos: ");
        float numAdd = input.nextFloat();
        int numAlumno = 1;

        float numMax = Integer.MIN_VALUE;
        float numMin = Integer.MAX_VALUE;

        String caracter = "*";

        int acumSuspendidos = 0;
        int acumAprovados = 0;
        int acumNotables = 0;
        int acumExcelentes = 0;

        float acumNumAdd = 0;


        while (numAdd>=0){
            if (numAdd < 5) {
                System.out.println("Alumne "+ numAlumno +" tè un suspes");
                acumSuspendidos++;
            } else if (numAdd<7) {
                System.out.println("Alumne "+ numAlumno +" tè un aprovat");
                acumAprovados++;
            } else if (numAdd < 8.5) {
                System.out.println("Alumne "+ numAlumno +" tè un notable");
                acumNotables++;
            } else if (numAdd <= 10){
                System.out.println("Alumne "+ numAlumno +" tè un excelent");
                acumExcelentes++;
            } else {
                System.out.println("Ingresa nu numero correcto");
            }

            if (numAdd>numMax){
                numMax = numAdd;
            } else if (numAdd<numMin) {
                numMin = numAdd;
            }
            acumNumAdd+=numAdd;
            numAlumno++;

            numAdd = input.nextFloat();

        }


        System.out.println("El valor Maximo: " +numMax);
        System.out.println("El valor Minimo: " +numMin);
        System.out.println("El promedio: " + acumNumAdd/(numAlumno-1));
        System.out.println("Supendidos: " + caracter.repeat(acumSuspendidos));
        System.out.println("Aprobados: " + caracter.repeat(acumAprovados));
        System.out.println("Notables: " + caracter.repeat(acumNotables));
        System.out.println("Excelentes: " + caracter.repeat(acumExcelentes));


        if ((acumAprovados+acumNotables+acumExcelentes) <= (numAlumno*0.20)) {
            System.out.println("El examen repetira");
        } else if (acumExcelentes >= numAlumno*0.20) {
            System.out.println("El examen era mas facil");
        }*/



    }

}

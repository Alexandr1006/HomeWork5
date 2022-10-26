public class Main {
    public static void main(String[] args) {

//OneTask

        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Совершеннолетие еще не наступило, подожди немного.");
        }

//TwoTask

        int ageChild = 5;
        if (ageChild < 7){
            System.out.println("Детский сад");
        }
        else if (ageChild >= 7 && ageChild < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        else if (ageChild >= 18 && ageChild < 24){
            System.out.println("Человек закончил школу, может отправляться в университет");
    }
        else if (ageChild >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

//ThreeTask

        int peopleInCarriage = 105;
        if (peopleInCarriage < 60){
            System.out.println("Еще есть сидячие места.");
        }

        else if (peopleInCarriage >= 60 && peopleInCarriage <= 101){
            System.out.println("Сидячие места закончились, остались стоячие");
        }

        else if (peopleInCarriage == 102){
            System.out.println("Вагон переполнен");
        }

        else if (peopleInCarriage > 102){
            System.out.println("Мест нет");
        }

//FourTask

        int agePeople = 19;
        if (agePeople >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else{
            System.out.println("Совершеннолетие еще не наступило, подожди немного.");
        }
//FiveTask

        int human = 17;
        if (human < 7){
            System.out.println("Детский сад");
        }
        else if (human >= 7 && human < 18){
            System.out.println("Ходит в школу");
        }
        else if (human >= 18 && human < 24) {
            System.out.println("Ходит в университет");
        } else {
            System.out.println("Идет на работу");
        }

//SixTask
        int peopleInCar = 80;
        if (peopleInCar < 60){
            System.out.println("Еще есть сидячие места.");
        }

        else if (peopleInCar >= 60 && peopleInCar <= 101){
            System.out.println("Сидячие места закончились, остались стоячие");
        }
        else if (peopleInCar == 102){
            System.out.println("Вагон переполнен");
        } else {
            System.out.println("Мест нет");

        }

//SevenTask

        int ageMan = 25;
        boolean goToKindergarten = (ageMan > 2 && ageMan <= 6);
        boolean goToShool = (ageMan >= 7 && ageMan < 18);
        boolean goToUniversity = (ageMan > 18 && ageMan < 24);

        if (goToKindergarten)
            System.out.println("Если возраст человека равен " + ageMan + " то ему нужно ходить в детский сад.");
        else if (goToShool)
            System.out.println("Если возраст человека равен " + ageMan + " то ему нужно ходить в школу.");
        else if (goToUniversity)
            System.out.println("Если возраст человека равен " + ageMan + " то ему нужно ходить в университет.");
        else
            System.out.println("Если возраст человека равен " + ageMan + " то ему нужно ходить на работу.");


//EightTask

        int ageKid = 14;
        if (ageKid < 5){
            System.out.println("Младше 5 лет кататься запрещено.");
        }
        else if (ageKid >= 5 && ageKid < 14){
            System.out.println("Катаемся со взрослыми, без взрослых нельзя");
        }
        else{
            System.out.println("Кататься разрешено");
        }
//nineTask
        int number1 = 5230;
        int number2 = 755;
        int number3 = 22990;
        if (number1 > number2 && number1 > number3)
            System.out.println("Первое число самое большое.");
        else if (number1 < number2 && number2 > number3)
            System.out.println("Второе число самое большое.");
        else
            System.out.println("Третье число самое большое.");



    }
}
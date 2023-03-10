package example;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Есть двумерная карта с роботами
        // Роботы это объекты, они могут перемещаться по карте
        // Карта имеет какие-то границы
        // 2 робота не могут находиться в одной точке одновременно
        // Роботы имеют направление (которое можно менять (поворачивать)),
        //              роботы идут только вперед (или стоят на месте).

//        RobotMap.Robot robot = new RobotMap.Robot();
        //  0, 0                  0, n   -> <-
        //  1, 0                  1, n


        // m, 0                    m, n
        //

//        Scanner scanner = new Scanner(System.in);
//        RobotMap map = null;
//
//        System.out.println("Введите размер поля: (2 числа через пробел)");
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        try {
//            map = new RobotMap(n, m);
//        } catch (IllegalArgumentException e) {
//            System.err.println("Не удалось создать карту: " + e.getMessage());
//            System.out.println("Попробуйте еще раз");
//        }

        RobotMap map = new RobotMap(100, 100, 15);
        try {
            RobotMap.Robot robot1 = map.createRobot(new Point(-3, 5));
        } catch (RobotCreationException e) {
            System.err.println("Не удалось создать робота!");
        }
        try {
            RobotMap.Robot robot2 = map.createRobot(new Point(4, 5)); // Direction = Direction.TOP
            robot2.changeDirection(Direction.BOTTOM);
            robot2.move();
            System.out.println(robot2);
        } catch (RobotCreationException e) {
            System.err.println("Не удалось создать робота!");
        } catch (RobotMoveException e) {
            System.err.println("Не удалось сдвинуть робота с места!");
        }

        try {
            RobotMap.Robot robot = map.createRobot(new Point(100, 100));
            robot.changeDirection(Direction.BOTTOM);
            robot.move();
            System.out.println(robot);
        } catch (RobotCreationException e) {
            System.err.println("Не удалось создать робота!");
        } catch (RobotMoveException e) {
            System.err.println("Не удалось сдвинуть робота " + e.getRobot() + " с места!");
        }


    }

    private void homework() {





    }

}

package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль!");
        String Password=in.nextLine();
        if(Password.equals("Hello123")) {
            Consolemenu cs = new Consolemenu();
            Controller AB=new Controller();
            Model AL=new Model();
            int ch=0;
            cs.ShowMenu();
            do {
                ch=in.nextInt();
                switch (ch) {
                    case 1: {
                        System.out.println("Все данные!");
                        AL.Basa2();
                        System.out.println("----------------------");
                        cs.ShowMenu();
                        break;
                    }
                    case 2:{
                        System.out.println("Добавьте данные! Так же в начале указывайте $ и номер строки без пробела между ними.");
                        AB.Add1();
                        System.out.println("Данные успешно добавлены!");
                        System.out.println("----------------------");
                        cs.ShowMenu();
                        break;
                    }
                    case 3: {
                        System.out.println("Выберите данные которые вы хотите редактировать! Например '2'");
                        AB.Delete(false);
                        System.out.println("Данные успешно заменены!");
                        System.out.println("----------------------");
                        cs.ShowMenu();
                        break;
                    }
                    case 4: {
                        System.out.println("Выберите данные которые вы хотите удалить! Например '3'");
                        AB.Delete(true);
                        System.out.println("Данные успешно удалены!");
                        System.out.println("----------------------");
                        cs.ShowMenu();
                        break;
                    }
                    default:{
                        if(ch!=5) {
                            System.out.println("Неверные данные, выберите вариант от одного до пяти!");
                            break;
                        }
                    }
                }
            } while (ch != 5);
        }else{
            System.out.println("Неверный пароль!");
        }
    }}
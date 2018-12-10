package com.company;
import java.util.Scanner;

public class Controller extends Model {
    Consolemenu cs = new Consolemenu();
    Model AL = new Model();

    public void Add1() {
        Scanner in = new Scanner(System.in);
        B +="\n"+ in.nextLine();
    }

    public void Delete(boolean ex) {
        Scanner in = new Scanner(System.in);
        int x=0;
        int z=0;
        boolean b=false;
        boolean b2=false;
        boolean b3=false;
        String g = in.nextLine();
        char e[];
        e=g.toCharArray();
        for (char element : B.toCharArray()){
            if(element=='$'){
                b3=true;
            }
            if (b3 && element == e[0]){
                b=true;
            }
            if(element!='$'){
                b3=false;
            }
            if (x>0&&element == '\n'){
                b=false;
                b2=true;
            }
            if(b){
                x++;
            }
            if(!b){
                z++;
            }
            if(b2){
                z--;
            }
        }
        g = B.substring(z-1,x+z);
        if(ex) {
            B = B.replace(g, "");
        }
        if(!ex){
            System.out.println("Измените строку! Так же в начале указывайте $ и номер строки без пробела между ними.");
            B = B.replace(g,in.nextLine());
        }
    }
}
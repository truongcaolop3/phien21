/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien21;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Phien21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập x: ");
        x = sc.nextInt();
        System.out.println("nhập y: ");
        y = sc.nextInt();
        
        switch ( x) {
            case 1:
                System.out.println(y + " " + "has " + 31 + "day  ");
            break;
            case 2:
                System.out.println(y +" "+ "has " + 29 + "day  ");
            break;
            case 3:
                System.out.println(y +" "+ "has " + 31 + "day  ");
            break;
            case 4:
                System.out.println(y+" " + "has " + 30 + "day  ");
            break;
            case 5:
                System.out.println(y +" "+ "has " + 31 + "day  ");
            break;
            case 6:
                System.out.println(y +" "+ "has " + 30 + "day  ");
            break;
            case 7:
                System.out.println(y+" " + "has " + 31 + "day  ");
            break;
            case 8:
                System.out.println(y +" "+ "has " + 31 + "day  ");
            break;
            case 9:
                System.out.println(y +" "+ "has " + 30 + "day  ");
            break;
            case 10:
                System.out.println(y +" "+ "has " + 31 + "day  ");
            break;
            case 11:
                System.out.println(y +" "+ "has " + 30 + "day  ");
            break;
            case 12:
                System.out.println(y+" " + "has " + 31 + "day  ");
            break;
            default:
               System.out.println("error"); 
               break;
        }
    }
    
}

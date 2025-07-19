/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airportsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class AirportSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner scan=new Scanner(System.in);
        System.out.println("welcome the THY SYSTEM!!!");
        System.out.println("enter the your name;");
        String name=scan.next();
        System.out.println("enter the seat number;");
        int seatNumber=scan.nextInt();
        System.out.println("enter the Id;");
        String Id=scan.next();
        
        if(Id.length()!=11){
            System.out.println("you must try again");
        }else{
            System.out.println("login is succesfully!!");
        }
        Pilot p=new Pilot("captain ","murat","31424");
       Traveller t=new Traveller("ufuk",11,"12345678900");
       Flying f=new Flying("maraş","londra","10.30","12.30",p);
       Bilet b=new Bilet("wd4dx",1234,t,f);
       b.createBilet();
       b.writeable();
        
    }}
    


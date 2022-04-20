 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import ServerInterface.Dictionary;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry reg = LocateRegistry.getRegistry("localhost",1099);
        Scanner input = new Scanner(System.in);
        String word = input.next();
        Dictionary tr = (Dictionary) reg.lookup("ترجمة");
        String translated = tr.translate(word);
        System.out.println(translated);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FirstJavaProgramm;

/**
 * Данный класс является точкой входа в программу
 * А так же содержит тестовую программу, созданую, чтобы показать работу Очереди
 * @author Мокрецов Роман
 */
public class FirstJavaProject {

    /**
     * Точка входа в программу
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue t = new Queue();
        System.out.print(t.Size());
        System.out.print("\n");
        t.PutQueue(10);
        t.PutQueue(-40);
        t.PutQueue(35);
        System.out.print(t.GetQueue());
        System.out.print("\n");
        System.out.print(t.Size());
        System.out.print("\n");
    }
    
}


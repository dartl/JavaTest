/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FirstJavaProgramm;

/**
 * Подкласс класса "Очередь", который реализует элемент очереди.
 * @author Мокрецов Роман
 * @version 1.0
 */

public class QueueNode {

    /** 
     * Инициализирует поле {@link QueueNode#next} значением {@code null}
     * @see QueueNode
     */
    public QueueNode() {
        next = null;
    }
    
    /** Переменная хранит значение элемента очереди */
    public int data;
    
    /** Переменная хранит ссылку на следующий элемент */
    public QueueNode next;
}

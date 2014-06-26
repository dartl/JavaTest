/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FirstJavaProgramm;

/**
 * Данный класс реализует динамическую структуру данных "Очередь".
 * @author Мокрецов Роман
 * @version 1.0
 */
public class Queue {
    
    /**
     * Инициализирует экземпляр очереди со значениеями полей:
     * {@link Queue#count} = 0
     * {@link Queue#beginQ} = null
     * {@link Queue#lastQ} = null
     * @see Queue
     */
    public Queue() {
        beginQ = null;
        lastQ = null;
        count = 0;
    }
    
    /**
     * Добавляет новый элемент в очередь, с заданным значением
     * @param data значение элемента для постановки в очередь
     * @return true
     */
    public boolean PutQueue (int data)
    {
        QueueNode tmp = new QueueNode();
        count++;
        if (beginQ == null)
        {
            tmp.data = data;
            beginQ = tmp;
            lastQ = tmp;
        }
        else
        {
            tmp.data = data;
            lastQ.next = tmp;
            lastQ.next = lastQ;
        }
        return true;
    }
    
    /**
     * Вытаскивает значение первого элемента в очереди, удаляя его из очереди
     * @see Queue
     * @return значение верхнего элемента очереди
     */
    public int GetQueue()
    {
        int tmp = 0;
        if (beginQ != null)
        {
            count--;
            tmp = beginQ.data;
            beginQ = beginQ.next;
            if (beginQ == null) lastQ = null;
        }
        return tmp;
    }
    
    /**
     * Метод для нахождения размера очереди
     * @see Queue
     * @return количество элементов в очереди
     */
    public int Size()
    {
        return count;
    }
    
    /** Ссылка на первый элемент очереди */
    public QueueNode beginQ;
    /** Ссылка на последний элемент очереди */
    public QueueNode lastQ;
    /** Счетчик количества элементов в очереди в данный момент */
    private int count;
}

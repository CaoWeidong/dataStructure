package com.flydog.listdemo;

import java.util.Random;

/**
 * @author CaoWeidong
 * @date 2020/7/19
 */
public class ArrayListDemo extends AbstractList {
    private int nElemt;
    private int[] container;

    public static void main(String[] args) {
        int clist = 1000;
        ArrayListDemo alist = new ArrayListDemo(clist);
        alist.fill(clist);
        alist.bubbleSort();

    }

    public ArrayListDemo(int cSize) {
        this.nElemt = 0;
        this.container = new int[cSize];

    }

    @Override
    public void insert(int element, int index) {
        if (this.nElemt + 1 > this.container.length) {
            System.out.println("out of container rang " + this.nElemt);
        } else if (index > this.nElemt) {
            System.out.println("out of list rang " + this.nElemt);
        } else {
            this.nElemt++;
            for (int i = this.nElemt - 1; i > index; i--) {
                container[i] = container[i - 1];
            }
            container[index] = element;
        }
    }

    @Override
    public void fill(int count) {
        for (int i = 0; i < count; i++) {
            Random rd = new Random();
            int el = rd.nextInt(100);
            if (el != 0) {
                container[i] = el;
                this.nElemt++;
            }
        }
    }

    @Override
    public String displayAll() {
        StringBuffer result = new StringBuffer();
        result.append("Element in List: [");
        for (int i = 0; i < this.nElemt; i++) {
            result.append(container[i]);
            result.append(",");
        }
//        result.append("].Element in container:[");
//        for (int i = 0; i < this.container.length; i++) {
//            result.append(container[i]);
//            result.append(",");
//        }
        result.append("]");
        return result.toString();
    }

    @Override
    public void insert(int element) {
        nElemt++;
        if (nElemt <= this.container.length) {
            container[nElemt - 1] = element;
        } else {
            System.out.println("out of container rang " + this.nElemt);
            nElemt--;
        }
    }

    @Override
    public boolean delete(int element) {
        int elemIndex = this.findIndex(element);
        if (elemIndex >= 0) {
            for (int i = elemIndex; i < this.nElemt; i++) {
                this.container[i] = this.container[i + 1];
            }
            this.nElemt--;
            return true;
        }
        return false;
    }

    @Override
    public boolean isContent(int element) {
        if (this.findIndex(element) >= 0) {
            return true;
        }
        return false;
    }


    private int findIndex(int element) {
        for (int i = 0; i < this.nElemt; i++) {
            if (this.container[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return this.nElemt;
    }

    @Override
    public boolean isEmpty() {
        return this.nElemt == 0;
    }

    /**
     * 冒泡排序
     */
    public void bubbleSort() {
        for (int out = this.nElemt - 1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if (container[in] > container[in + 1]) {
                    this.swapElement(in, in + 1);
                }
                System.out.println("step" + (out) + "-" + in + this.displayAll());
            }
        }

    }

    private void swapElement(int index1, int index2) {
        int temp = this.container[index1];
        this.container[index1] = this.container[index2];
        this.container[index2] = temp;
    }
}

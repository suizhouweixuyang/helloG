package com.wxy.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("123");
        list.add("234");
        list.add("345");
        for(int i = 0;i < list.size();i++) {
            if("234".equals(list.get(i))) {
                list.remove(i);
                i--;
            }
        }
        list.forEach(System.out::println);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if(("123").equals(next)) {
                iterator.remove();
            }
        }
        list.forEach(System.out::println);

        CopyOnWriteArrayList<String> s = new CopyOnWriteArrayList<>();
    }
}


package io.github.mateomate1;

import io.github.mateomate1.Logic.GridMapper;

public class Main {
    public static void main(String[] args) {
        GridMapper g = new GridMapper(new Long[]{0L,0L}, new Long[]{1L,1L,1L});
        System.out.println(g.toString());
    }
}
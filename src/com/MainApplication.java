package com;

import java.util.HashSet;

public class MainApplication {
    public static void main(String[] args) {
        HashSet<Integer> lotto = new HashSet<>();
        HashSet<Integer> pick = new HashSet<>();

        while(lotto.size()<6){
            int num = (int)(Math.random()*45+1);
            lotto.add(num);
        }           // 정답인 6개의 난수 생성.

//        while(pick.size()<6){
//            int num = (int)(Math.random()*45+1);
//            pick.add(num);
//        }           // 고른 6개의 난수 생성.



        System.out.println("1억번의 시도 중 몇 번의 일치가 있는지 알려주는 프로그램.");
        long success =0;
        long failure =0;
        for(long l=0;l<100000000;l++){
            while(pick.size()<6){
                int num = (int)(Math.random()*45+1);
                pick.add(num);
            }           // 고른 6개의 난수 생성.
            if(lotto.equals(pick)) {success++;}
            else {failure++;}
            pick.clear();
        }
        System.out.println("1억번의 시도 중, 성공 : "+success+" 실패 : "+failure);
        double lottoPer = (double) success/100000000;
        System.out.println(lottoPer+"이 로또의 통계적 확률입니다.");
    }
}


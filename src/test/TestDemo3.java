package test;

import cn.jack.com.Demo3;

import java.util.concurrent.CountDownLatch;

public class TestDemo3 {

    public static void main(String[] args) {

        int count = 20;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                System.out.println(Demo3.getInstance());
            }).start();
        }

        latch.countDown();
        System.out.println("线程开始---------------");

    }
}

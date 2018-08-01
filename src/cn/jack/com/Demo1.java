package cn.jack.com;

/**
 * 1.利用静态在类加载之前就将对象实例化
 * 从而保证每次调用都是同一个对象
 * 这种方式也称为饿汉式加载，相比懒汉式，没有线程安全问题
 */
public class Demo1 {

    private Demo1() {
    }

    private static Demo1 demo1 = new Demo1();

    public static Demo1 getInstance() {
        return demo1;
    }

}

package cn.jack.com;

/**
 * 3.利用内部类构建单例
 * 目前来说是最厉害的一种创建单例的方式
 * 缺陷是可以利用反射侵入
 */
public class Demo3 {

    private Demo3() {
    }

    public static Demo3 getInstance() {
        return InnerInstance.DEMO;
    }


    private static class InnerInstance {
        //创建一个常量
        public static final Demo3 DEMO = new Demo3();
    }

}

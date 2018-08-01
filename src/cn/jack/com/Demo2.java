package cn.jack.com;

import sun.security.jca.GetInstance;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 2.注册式单例
 * 注册式单例是spring中的做法，在程序加载的时候，初始化一个map容器，然后将对象放入容器中，
 * 每次调用会传入一个name去容器中拿，如果没有则新建放入容器中
 * 没有线程安全问题
 * <p>
 * 实际测试时 并不是单例----待优化
 */
public class Demo2 {

    private Demo2() {
    }

    //初始化map
    private static Map<String, Demo2> map = new ConcurrentHashMap<>();

    public static Demo2 getInstance(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            map.put(name, new Demo2());
        }
        return map.get(name);
    }

}

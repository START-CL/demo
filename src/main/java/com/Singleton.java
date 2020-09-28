package com;

public class Singleton {

    // 将自身实例化对象设置为一个属性，并用static修饰(饿汉式)
    private static  Singleton singleton = new Singleton();

    // 将自身实例化对象设置为一个属性，并用static修饰(懒汉式)
    private static Singleton singleton1 = null;

    // 构造方法私有化
    private Singleton(){}

    // 静态方法返回该实例
    public static Singleton getInstance(){
        return singleton;
    }

    // 静态方法返回该实例
    public static Singleton getInstance1(){
        if (singleton1 ==null){
            singleton1 = new Singleton();
        }
            return singleton1;
    }

    /*
    synchronized关键字实现同步
    优点：在多线程情形下，保证了“懒汉模式”的线程安全。
    缺点：众所周知在多线程情形下，synchronized方法通常效率低，显然这不是最佳的实现方案。
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    DCL双检查锁机制（DCL：double checked locking
    单例模式的最佳实现方式。内存占用率高，效率高，线程安全，多线程操作原子性。
    public static Singleton getInstance() {
        // 第一次检查instance是否被实例化出来，如果没有进入if块
        if(instance == null) {
            synchronized (Singleton.class) {
                // 某个线程取得了类锁，实例化对象前第二次检查instance是否已经被实例化出来，如果没有，才最终实例出对象
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    * */

}

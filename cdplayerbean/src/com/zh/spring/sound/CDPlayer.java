package com.zh.spring.sound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    /**
     * @Autowired 除修饰属性外，也可以修饰方法，不止是构造方法，setter方法或者其他任何合法的方法都可以。
     * 只要被Autowired修饰，Spring都会尝试满足方法中所声明的依赖。
     * 如果没有匹配的bean， 那么在应用上下文创建的时候， Spring会抛出一个异常。 为了避免异常的出现， 可以将@Autowired的required属性设置为false；
     * 将required属性设置为false时， Spring会尝试执行自动装配， 但是如果没有匹配的bean的话， Spring将会让这个bean处于未装配的状态。
     * 但是， 把required属性设置为false时， 需要谨慎对待。 如果在的代码中没有进行null检查的话， 这个处于未装配状态的属性有可能会出现NullPointerException。
     *
     * @param cd
     */
    @Autowired(required = false)
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void paly() {
        cd.paly();
    }
}

package com.zh.spring.config;

import com.zh.spring.sound.CDPlayer;
import com.zh.spring.sound.CompactDisc;
import com.zh.spring.sound.MediaPlayer;
import com.zh.spring.sound.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Configuration 表明这是个Java配置类。
 */
@Configuration
// 设置默认扫描基础包
//@ComponentScan(basePackages = "com.zh.spring.sound")
// 设置默认扫描基础包
//@ComponentScan(basePackageClasses = {SgtPeppers.class, CDPlayer.class})
//public class CDPlayerConfig {
//    @Bean
//    public CompactDisc sgtPeppers(){
//        return new SgtPeppers();
//    }
//}

public class CDPlayerConfig {
    //带有@Bean注解的方法可以采用任何必要的Java功能来产生bean实例。 构造器和Setter方法只是@Bean方法的两个简单样例。
    //这里所存在的可能性仅仅受到Java语言的限制。
//    @Bean
//    public CompactDisc sgtPeppers(){
//        return new SgtPeppers();
//    }
////    @Bean
////    public MediaPlayer cdPlayer(){
////        return new CDPlayer(sgtPeppers());
////    }
//    @Bean
//    public MediaPlayer cdPlayer(CompactDisc cd){
//        return new CDPlayer(cd);
//    }
}

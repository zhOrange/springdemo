
package com.zh.spring.sound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Component 注解表明，该类会作为组件类，告知Spring为SgtPeppers创建bean。
 * 组件扫描默认不会启用，需要配置Spring使用。
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "";
    private String artist = "";
    public SgtPeppers(){

    }

    @Override
    public void paly() {
        System.out.println("Palying " + title + " by " + artist);
    }
}

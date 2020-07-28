import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        // 根据xml获取上下文
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        // 由上下文创建Bean
        Knight knight = ctx.getBean(Knight.class);
        knight.embarkOnQuest();
        ctx.close();
    }
}

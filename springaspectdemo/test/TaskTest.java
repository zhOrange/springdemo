
import com.zh.spring.TaskInterface;
import com.zh.spring.config.LogEventConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= LogEventConfig.class)
public class TaskTest {
    @Autowired
    private TaskInterface task;

    @Test
    public void testRun(){
        task.executeTask();
    }
}

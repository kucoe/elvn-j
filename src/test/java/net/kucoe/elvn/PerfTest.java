package net.kucoe.elvn;

import static org.junit.Assert.assertEquals;
import net.kucoe.elvn.lang.result.TaskResult;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class PerfTest extends AbstractConfigTest {
    
    @Test
    public void testBigCreate() throws Exception {
        TaskResult command = new TaskResult("b", "a");
        long s = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            command.execute(display, config);
        }
        long e = System.currentTimeMillis();
        System.out.println(e - s + "ms");
        java.util.List<Task> tasks = config.getList(ListColor.Blue).getTasks();
        assertEquals(5001, tasks.size());
    }
}

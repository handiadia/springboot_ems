
import com.baizhi.App;
import com.baizhi.dao.WorkDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class TestWork {
    @Autowired
    private WorkDAO workDAO;

    @Test
    public void test() {
        workDAO.queryAll();
    }
}

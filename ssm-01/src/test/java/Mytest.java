import com.ky.pojo.Books;
import com.ky.service.BooksService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService bookServiceImpl =(BooksService) context.getBean("BookServiceImpl");
        for(Books books:bookServiceImpl.queryAll()){
            System.out.println(books);
        }
    }
}

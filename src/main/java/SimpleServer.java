import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.*;


public class SimpleServer {

    public static Logger log = LoggerFactory.getLogger(SimpleServer.class);

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World" );
        post("/workflow", (req, res) -> {
            log.info(req.body());
            res.type("text/plain");
            res.status(200);
            return "That worked!";
        });
    }
}


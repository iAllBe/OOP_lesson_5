import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    static Logger LOGGER;
    static {
        try(FileInputStream ins = new FileInputStream("log.config")){
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Main.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            LOGGER.log(Level.INFO,"Начало новой операции");
            Controller controller = new Controller(new View(), CalcBuilder.getInstance().setX(9).setY(3).build());

            LOGGER.log(Level.INFO,"Вывод результата операции");
            controller.Result();
        } catch (Exception e){
            LOGGER.log(Level.WARNING,"что-то пошло не так" , e);
        }
    }
}
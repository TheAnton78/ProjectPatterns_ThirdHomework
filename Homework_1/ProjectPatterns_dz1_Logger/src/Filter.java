import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result;
        logger.log("запускаем фильтрацию");
        result = source.stream()
                .filter(x -> {if(x < treshold) {
                                logger.log("Элемент " + x + " проходит");
                                return true;
                            }else{
                                logger.log("Элемент " + x + " не проходит");
                                return false;
                            }})
                .collect(Collectors.toList());
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());

        return result;
    }
}

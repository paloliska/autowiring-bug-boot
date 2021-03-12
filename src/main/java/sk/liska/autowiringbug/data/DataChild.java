package sk.liska.autowiringbug.data;

/**
 * @author pavol.liska
 * @date 3/11/2021
 */
public class DataChild extends DataParent{
    String contentChild;

    public DataChild(String contentChild) {
        this.contentChild = contentChild;
    }

    @Override
    public String toString() {
        return "DataChild{" +
                "contentChild='" + contentChild + '\'' +
                '}';
    }
}

package files;

        import java.io.File;
        import java.util.Arrays;

public class ListContentDirectoryFilter {

    public File file;

    public ListContentDirectoryFilter(String path) {
        this.file = new File(path);
    }

    public File[] listFile(){

        File[] list = file.listFiles();

        return list;
    }

    public static void main(String[] args){
        ListContentDirectoryFilter list1 = new ListContentDirectoryFilter(".");

        list1.listFile();



    }
}


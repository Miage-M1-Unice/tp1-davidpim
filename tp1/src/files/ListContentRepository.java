package files;

import java.io.File;

public class ListContentRepository {

    public File file;


    public ListContentRepository(String path) {
        this.file = new File(path);
    }

    public String[] listString(){
        String[] list = file.list();
        return list;
    }

    public static void main(String[] args){
        ListContentRepository list1 = new ListContentRepository(".");

        String[] files = list1.listString();

        for(String file  : files){
            System.out.println(file);
        }
    }
}

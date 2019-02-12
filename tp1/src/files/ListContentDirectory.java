package files;

import java.io.File;

public class ListContentDirectory {

    public File file;


    public ListContentDirectory(String path) {
        this.file = new File(path);
    }

    public String[] listString(){
        String[] list = file.list();
        return list;
    }

    public static void main(String[] args){
        ListContentDirectory list1 = new ListContentDirectory(".");

        String[] files = list1.listString();

        for(String file  : files){
            System.out.println(file);
        }
    }
}

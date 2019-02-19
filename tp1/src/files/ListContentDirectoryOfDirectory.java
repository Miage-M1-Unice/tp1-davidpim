package files;

import java.io.File;
import java.util.Arrays;

public class ListContentDirectoryOfDirectory {

    public File file;

    public ListContentDirectoryOfDirectory(String path) {
        this.file = new File(path);
    }

    public File[] listFile(){

        File[] list = file.listFiles();

        for (File file : list) {
            if (file.isFile()) {
                System.out.println(file);
            } else if (file.isDirectory()) {
                System.out.println(file);
                this.file = file;
                listFile();
            }
        }

        return list;
    }

    public static void main(String[] args){
        ListContentDirectoryOfDirectory list1 = new ListContentDirectoryOfDirectory(".");

        list1.listFile();

    }
}


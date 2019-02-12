package files;

import java.io.File;

public class ListContentDirectoryOfDirectory {

    public File file;

    public ListContentDirectoryOfDirectory(String path) {
        this.file = new File(path);
    }

    public File[] listFile(){
        File[] list = file.listFiles();
        return list;
    }

    public static void main(String[] args){
        ListContentDirectoryOfDirectory list1 = new ListContentDirectoryOfDirectory(".");

        File[] files = list1.listFile();

        for(File file  : files){
            System.out.println(file);
        }
    }
}


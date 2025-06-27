public interface FileReader {
    String read();
}

public interface FileWriter {
    void write(String content);
}

public class FileService {
    private FileReader reader;
    private FileWriter writer;

    public FileService(FileReader reader, FileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String processFile() {
        String content = reader.read();
        writer.write(content);
        return "Processed " + content;
    }
}

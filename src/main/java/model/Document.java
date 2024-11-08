package model;

import jakarta.persistence.*;
import model.enums.FileType;
import org.h2.engine.User;

import java.util.List;

@Entity
public class Document {

    //vars
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private long id;
    private String fileName;
    private String email;

    private List<UserSelections> userSelections;

    @Enumerated(EnumType.STRING)
    private FileType fileType; // Use the enum as a field type

    //getters
    public FileType getFileType() {
        return fileType;
    }

    //setters
    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }
}

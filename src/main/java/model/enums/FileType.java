package model.enums;

public enum FileType {
    WORD(".docx"),
    PDF(".pdf"),
    TEXT(".txt");

    private final String extension;

    FileType(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return this.name() + " (" + extension + ")";
    }
}

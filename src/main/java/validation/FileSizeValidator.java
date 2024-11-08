package validation;

import java.io.File;

public class FileSizeValidator {

    File file = new File("path/to/your/file.txt");

        if (file.exists() && file.isFile()) {
        // Get the file size in bytes
        long fileSizeInBytes = file.length();

        // Convert bytes to megabytes
        double fileSizeInMegabytes = (double) fileSizeInBytes / (1024 * 1024);

        // Print the file size
        System.out.printf("File size: %.2f MB%n", fileSizeInMegabytes);

        // Check if the file size is valid (greater than 1 byte and smaller than 20 MB)
        boolean validFileSize = isValidFileSize(fileSizeInBytes);

    }


    // Method to check if the file size is valid (between 1 byte and 20 MB)
    public static boolean isValidFileSize(long fileSizeInBytes) {
        // 1 byte = 1 byte, and 20 MB = 20 * 1024 * 1024 bytes
        long minSize = 1; // Minimum size in bytes
        long maxSize = 20 * 1024 * 1024; // Maximum size in bytes (20 MB)

        return fileSizeInBytes > minSize && fileSizeInBytes < maxSize;
    }
}

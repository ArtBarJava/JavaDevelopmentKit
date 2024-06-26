package org.example.homeWork_2.server.repository;

import java.io.FileReader;
import java.io.FileWriter;

public class FileStorage implements Repository {
    private static final String LOG_PATH = "src/main/java/org/example/homeWork_2/server/repository/log.txt";

    @Override
    public void save(String text) {
        try (FileWriter writer = new FileWriter(LOG_PATH, true)) {
            writer.write(text);
            writer.write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String load() {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(LOG_PATH);) {
            int c;
            while ((c = reader.read()) != -1) {
                stringBuilder.append((char) c);
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

package ku.cs.services;

import ku.cs.models.StudentList;
import ku.cs.models.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

class StudentListFileDatasourceTest {

    private final String testDir = "test-data";
    private final String testFile = "students.csv";


    @Test
    @DisplayName("ทดสอบเขียนและอ่านข้อมูล")
    void testWriteAndReadData() {
        StudentListFileDatasource ds = new StudentListFileDatasource(testDir, testFile);

        StudentList list = new StudentList();
        list.addNewStudent("6710400001", "First", 50);
        list.addNewStudent("6710400002", "Second", 80);

        ds.writeData(list); // เขียนลงไฟล์

        StudentList readList = ds.readData(); // อ่านจากไฟล์
        assertEquals(2, readList.getStudents().size());

        Student s1 = readList.findStudentById("6710400001");
        assertNotNull(s1);
        assertEquals("First", s1.getName());
        assertEquals(50, s1.getScore());

        Student s2 = readList.findStudentById("6710400002");
        assertNotNull(s2);
        assertEquals("Second", s2.getName());
        assertEquals(80, s2.getScore());
    }
}
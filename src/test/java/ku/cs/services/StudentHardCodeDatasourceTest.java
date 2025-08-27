package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    @Test
    @DisplayName("ทดสอบการอ่านข้อมูลใน hard code data")
    void testReadData() {
        StudentHardCodeDatasource ds = new StudentHardCodeDatasource();
        StudentList list = ds.readData();

        assertEquals(4, list.getStudents().size());
        assertEquals("First", list.getStudents().get(0).getName());
        assertEquals("Second", list.getStudents().get(1).getName());
    }
}
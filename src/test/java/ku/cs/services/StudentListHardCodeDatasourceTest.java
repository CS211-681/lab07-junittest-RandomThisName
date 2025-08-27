package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentListHardCodeDatasourceTest {

    @Test
    @DisplayName("ทดสอบการอ่านข้อมูล")
    void testReadData() {
        StudentListHardCodeDatasource data = new StudentListHardCodeDatasource();
        StudentList list = data.readData();

        assertEquals(10, list.getStudents().size());
        assertEquals("First", list.getStudents().get(0).getName());
        assertEquals("Tenth", list.getStudents().get(9).getName());
    }

    @Test
    @DisplayName("ทดสอบการเขียนข้อมูล")
    void testWriteDataDoesNothing() {
        StudentListHardCodeDatasource data = new StudentListHardCodeDatasource();
        StudentList list = data.readData();
        data.writeData(list);
    }
}
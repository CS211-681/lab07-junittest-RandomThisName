package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    @DisplayName("ทดสอบเพิ่มนักศึกษาแบบไม่มีคะแนน")
    void testAddNewStudentWithoutScore() {
        StudentList list = new StudentList();
        list.addNewStudent("6710451112", "Ritsu Makoto");
        Student s = list.findStudentById("6710451112");
        assertNotNull(s);
        assertEquals("Ritsu Makoto", s.getName());
        assertEquals(0, s.getScore());
    }

    @Test
    @DisplayName("ทดสอบเพิ่มนักศึกษาแบบมีคะแนนเริ่มต้น")
    void testAddNewStudentWithScore() {
        StudentList list = new StudentList();
        list.addNewStudent("6710451111", "Jamal Robinson", 75);
        Student s = list.findStudentById("6710451111");
        assertNotNull(s);
        assertEquals("Jamal Robinson", s.getName());
        assertEquals(75, s.getScore());
    }

    @Test
    @DisplayName("ทดสอบหาชื่อนิสิตที่มีชื่อนี้ว่ามีกี่คน")
    void testFilterByName() {
        StudentList list = new StudentList();
        list.addNewStudent("6710451112", "Ritsu Makoto");
        list.addNewStudent("6710451111", "Jamal Robinson");
        list.addNewStudent("6710451113", "Visible White");

        StudentList filtered = list.filterByName("Ritsu");
        assertEquals(1, filtered.getStudents().size());
    }

    @Test
    @DisplayName("ทดสอบให้คะแนนแก่รหัสนิสิตนี้")
    void testGiveScoreToId() {
        StudentList list = new StudentList();
        list.addNewStudent("6710451112", "Ritsu Makoto");
        list.giveScoreToId("6710451112", 80);
        assertEquals(80, list.findStudentById("6710451112").getScore());
    }

    @Test
    @DisplayName("ทดสอบการดูเกรดของนิสิตรหัสนี้")
    void testViewGradeOfId() {
        StudentList list = new StudentList();
        list.addNewStudent("6710451112", "Ritsu Makoto", 85);
        assertEquals("A", list.viewGradeOfId("6710451112"));
    }
}
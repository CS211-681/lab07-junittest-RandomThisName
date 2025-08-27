package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 44.44 คะแนน")
    void testAddScore(){
        Student s = new Student("6710451112", "Ritsu Makoto");
        s.addScore(44.44);
        assertEquals(44.44, s.getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s = new Student("6710451112", "Ritsu Makoto");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("ทดสอบเปลี่ยนชื่อ")
    void testChangeName(){
        Student s = new Student("6710451112", "Ritsu Makoto");
        s.changeName("Jamal Robinson");
        assertEquals("Jamal Robinson", s.getName());
    }

    @Test
    @DisplayName("ทดสอบตรวจสอบรหัสนิสิต")
    void testIsId(){
        Student s = new Student("6710451112", "Ritsu Makoto");
        assertEquals("6710451112", s.getId());

    }

    @Test
    @DisplayName("ทดสอบตรวจสอบชื่อนิสิต")
    void testIsNameContains(){
        Student s = new Student("6710451112", "Ritsu Makoto");
        assertEquals("Ritsu Makoto", s.getName());
    }
}
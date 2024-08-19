import java.util.Scanner; // นำเข้าคลาส Scanner จาก package java.util
public class W04_01AreaCircle {

    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in); // สร้างอ็อบเจ็กต์ของคลาส Scanner
      System.out.print("ป้อนรัศมีของวงกลม: "); // แสดงข้อความที่ให้ผู้ใช้ป้อนค่ารัศมี
      double radius = sc.nextDouble(); // รับค่ารัศมีจากผู้ใช้และเก็บในตัวแปร radius

       //double radius;  // ประกาศตัวแปรเเก็บค่ารัศมี
       //radius = 34;    // กำหนดค่ารัศมีเป็น 10

       double area;    // ประกาศตัวแปรเก็บค่าพื้นที่
       final double PI=3.14159;    // ประกาศค่าคงที่ PI 

       area = PI*radius*radius;  // ตำนวณพื้นที่ของวงกลม
       System.out.println ("พื้นที่ของวงกลมที่มีรัศมีเท่ากับ "+radius+" คือ "+area);
    }
 }

// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 
package W12;

public class W12_00_exLoopWhile {

    public static void main(String[] args) {

        // System.out.println("รอบที่ 1");
        // System.out.println("รอบที่ 2");
        // System.out.println("รอบที่ 3");
        // System.out.println("รอบที่ 4");
        // System.out.println("รอบที่ 5");
        // โครงสร้างคำสั่งลูป for แบ่งออกเป็น 3 ส่วน
        // 1. ส่วนตัวแปรเริ่มต้น
        // 2. เงื่อนไข
        // 3. การเพิ่มค่า / การลดค่า
        // TODO 1
        System.out.println("TODO 1-For Loop");
        for (int i = 1; i <= 5; i++) {
            // คำสั่งที่ต้องการทำซ้ำ
            System.out.println("รอบที่ " + i);
        }
        System.out.println("---------------------------------------");

// ===========================TODO1 Eng for Loop===========================================
        System.out.println("TODO 1-For Loop");
        int n1 = 1;
        while (n1 <= 5) {
            System.out.println("รอบที่ " + n1);
            n1++;
        }
// ======================================================================
// TODO 2
//คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 Hello World
// รอบที่ 2 Hello World
// รอบที่ 3 Hello World
// รอบที่ 4 Hello World
// รอบที่ 5 Hello World
        System.out.println("TODO 2-For Loop");
        for (int i = 1; i <= 5; i++) {
            // คำสั่งที่ต้องการทำซ้ำ
            System.out.println("รอบที่ " + i + " Hello World ");
        }
        System.out.println("---------------------------------------");

        System.out.println("TODO 2-For Loop");

        System.out.println("---------------------------------------");

// ======================================================================
// TODO 3
        //คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
        // ===============
        // 1 2 3 4 5 6 7 8 9 10
        for (int j = 1; j <= 10; j++) {

            System.out.print(j + " ");
        }

// ======================================================================
// TODO 4
        //คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
        // ===============
        // 1 2 3 4 5 6 7 8 9 10 = 55
        System.out.println();
        int sum = 0;
        for (int j = 1; j <= 10; j++) {

            System.out.print(j + "  ");
            sum = sum + j; // sum += j;

        }
        System.out.println("= " + sum);

// ======================================================================
// TODO 5  
        //คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
        // ===============
        // 1+2+3+4+5+6+7+8+9+10 = 55
        sum = 0;
        for (int j = 1; j <= 10; j++) {

            System.out.print(j);
            if (j < 10) {
                System.out.print("+");
            }
            sum = sum + j; // sum += j;

        }
        System.out.println(" = " + sum);

// ======================================================================
// TODO 6
        //คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
        // ===============
        // 10 9 8 7 6 5 4 3 2 1
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + "  ");
        }

// ======================================================================
// TODO 7
        //คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
        // ===============
        // 1 3 5 7 9 11 13 15 17 19
        System.out.println();
        for (int j = 1; j <= 19; j += 2) {
            System.out.print(j + " ");

        }

// ======================================================================
// TODO 8
        //คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
        // ===============
        // 2 4 6 8 10 12 14 16 18 20
        System.out.println();
        for (int j = 2; j <= 20; j += 2) {
            System.out.print(j + " ");

        }

// ===============s=======================================================
// TODO 9
        //คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
        // ===============
        // 1 4 9 16 25 36 49 64 81 100
        System.out.println("TODO 9-For Loop");
        int n9 = 2;
        while (n9 <= 10) {
            System.out.print(n9 * n9 + " ");
            n9++;
        }

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println("---------------------------------------");
// ======================================================================

// TODO 10
        //คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
        // ===============
        // รอบที่ 1 เลขคี่
        // รอบที่ 2 เลขคู่
        // รอบที่ 3 เลขคี่
        // รอบที่ 4 เลขคู่
        // รอบที่ 5 เลขคี่
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {

                System.out.println("เลขคุ่" + i);
            } else {
                System.out.println("เลขคี่" + i);
            }
        }

// ======================================================================
    }
}
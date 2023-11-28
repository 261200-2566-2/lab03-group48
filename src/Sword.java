/*
    1.how and where to store data
    -private String swordName; แสดงชื่อดาบ
    -private int level = 1; level ปัจจุบัน
    -private double swordBaseDmg; ดาเมจดาบมาตราฐาน
    -private double swordDmg; ดาเมจของดาบ
    -private double swordRunSpeed; ความเร็วตอนถือดาบ
    2.what operations are needed และ  3.how and where to compute information
    -public void selectHand() เลือกมือที่ใช้ในการเลือกมือที่จะถืออาวุธ
    -public void selectSword() เลือกดาบ
    -public void swordChoice() แสดงตัวเลือกของดาบทั้งหมด
    -public void showSwordStatus() แสดงสถานะของดาบแต่ละเล่ม
    -public void sword_Dmg(String swordName, String handed) ส่งค่าสถานะของดาบไปเก็บในข้อมูลตัวละคร
    -private Sword allSword(int i) สร้างดาบขึ้นมาเก็บตำแหน่ง i
    i = 1:
    Sword Sword1 = new Sword();
    Sword1.swordName = "Sword1";
    Sword1.swordBaseDmg = 5;
    Sword1.swordDmg = Sword1.swordDmg * (1 + 0.1*level)
    Sword1.swordRunSpeed = 0.1 + 0.04*level
    .
    .
    .
 */
public class Sword {
    private String swordName;
    private int level = 1;
    private double swordBaseDmg;
    private double swordDmg;
    private double swordRunSpeed;

    public Sword(){

    }
    public void selectHand(){

    }
    public void selectSword(){

    }
    public void swordChoice(){

    }
    public void showSwordStatus(){

    }
    public void sword_Dmg(String swordName, String handed){

    }
    private Sword allSword(int i){
        return ;
    }

}

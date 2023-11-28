/*
    1.how and where to store data
    -private String shieldName; ชื่อของโล่
    -private int level = 1; level ปัจจุบัน
    -private double shieldBaseDmg; ดาเมจโล่มาตราฐาน
    -private double shieldDef; การป้องกันของโล่
    -private double shieldRunSpeed; ความเร็วตอนถือโล่
    2.what operations are needed และ 3.how and where to compute information
    -public void selectHand() เลือกมือที่ใช้ในการเลือกมือที่จะถืออาวุธ
    -public void selectShield() เลือกโล่
    -public void shieldChoice() แสดงตัวเลือกของโล่ทั้งหมด
    -public void showShieldStatus() แสดงสถานะของโล่แต่ละอัน
    -public void shield_Def() ส่งค่าสถานะของโล่ไปเก็บในข้อมูลตัวละคร
    -private Shield allShield(int i ) สร้างโล่ขึ้นมาเก็บตำแหน่ง i
    i = 1 :
    Shield Shield1 = new Shield();
    Shield1.shieldName = "Shield1";
    Shield1.shieldBaseDmg = 5;
    Shield1.shieldDef = Shield1.shieldDef * (1 + 0.05*level)
    Shield1.shieldRunSpeed = 0.1 + 0.08*level
    .
    .
    .
 */
public class Shield {
    private String shieldName;
    private int level = 1;
    private double shieldBaseDmg;
    private double shieldDef;
    private double shieldRunSpeed;

    public Shield(){

    }
    public void selectHand(){

    }
    public void selectShield(){

    }
    public void shieldChoice(){

    }
    public void showShieldStatus(){

    }
    public void shield_Def(){

    }
    private Shield allShield(int i ){
        return ;
    }

}

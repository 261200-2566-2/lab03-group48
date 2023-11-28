/*
    1.how and where to store data
    -private String name; ชื่อของตัวละคร
    -private int level = 1; level ปัจจุบัน
    -private double maxHP; เลือดที่เต็มหลอด
    -private double HP; เลือดปัจจุบัน
    -private double maxMana; มานาที่เต็มหลอด
    -private double Mana; มานาปัจจุบัน
    -private double dmg; ดาเมจที่สร้างได้
    -private double def; การป้องกันที่กันได้
    -private double baseRunSPD; ความเร็วมาตราฐาน
    -private double maxRunSpeed; ความเร็วสูงสุด
    -private double runSpeedDecrease; ความเร็วที่ลดลงตอนถืออุปกรณ์
    -private double LHSpdDecrease; ความเร็วที่ลดลงตอนถืออุปกรณ์ข้างซ้าย
    -private double RHSpdDecrease; ความเร็วที่ลดลงตอนถืออุปกรณ์ข้างขวา
    -private double LDmg; ดาเมจข้างซ้ายที่ทำได้
    -private double RDmg; ดาเมจข้างขวาที่ทำได้
    -private double LDef; การป้องกันด้านซ้ายที่กันได้
    -private double RDef; การป้องกันขวาซ้ายที่กันได้
    -private boolean leftHand ; ถือด้านซ้าย
    -private boolean rightHand ; ถือด้านขวา

    2.what operations are needed และ 3.how and where to compute information
    -public void RunSpd_Decrease() ใช้ในการคำนวณหาความเร็วที่ถูกลดขณะถืออุปกรณ์
    -public void EquipmentCal() ใช้คำนวณ dmg กับ def ที่ขึ้นอยู่กับ stat อุปกรณ์ทั้งสองมือ
        -public void dmgCal() -> dmg = LDmg + RDmg
        -public void defCal() -> def = LDef + RDef
    -public void levelSetUp() ใช้ในการกำหนดค่า level ตัวละคร
    -public void UnEquipLR_Hand() ใช้ในการถอดอาวุธทั้งสองข้าง หรือ ข้างใดข้างนึง
    -public void setUpCharacter() ไว้เรียกใช้เฉพาะตอนสร้างตัวละครใหม่
        -maxHp = 100 + (10*level)
        -maxMana = 50 + (2*level)
        -Hp = maxHp;
        -Mana = maxMana;
        -baseRunSPD = 30.0
        -RunSpd_Decrease()
        -หากความเร็วยังไม่ลดลง (RunSpd_Decrease()) -> runSpeedDecrease = 0;
                                              -> maxRunSpeed = (baseRunSPD + 0.03*level)
        -หากไม่มีอุปกรณ์ -> LDmg,RDmg,LDef,RDef,LHSpdDecrease,RHSpdDecrease = 0
        -หากมีดาบด้านซ้ายหรือขวา -> rightHandlsSword() -> sword_Dmg(" ")
                           -> leftHandlsSword() -> sword_Dmg(" ")
        -หากมีโล่ด้านซ้ายหรือขวา  -> shield_Def(" ") / shield_Def(" ")
        -EquipmentCal()
    -public void reStatus() -> คล้ายก่อนหน้า แต่ไม่มี  Hp = maxHp; ,  Mana = maxMana;
 */


public class RPGcharacters {
    private String name;
    private int level = 1;
    private double maxHP;
    private double HP;
    private double maxMana;
    private double Mana;
    private double dmg;
    private double def;
    private double baseRunSPD;
    private double maxRunSpeed;
    private double runSpeedDecrease;
    private double LHSpdDecrease;
    private double RHSpdDecrease;
    private double LDmg;
    private double RDmg;
    private double LDef;
    private double RDef;
    private boolean leftHand = false;
    private boolean rightHand = false;

    public RPGcharacters(String name, double baseRunSPD){

    }
    // ใช้ในการคำนวณหาความเร็วที่ถูกลดขณะถืออุปกรณ์ฝฝ
    public void RunSpd_Decrease(){

    }
    // ใช้คำนวณ dmg กับ def ที่ขึ้นอยู่กับ stat อุปกรณ์ทั้งสองมือ
    public void Equipment(){

    }
    public void dmgCal(){

    }
    public void defCal(){

    }
    // ไว้ใช้ในการกำหนดค่า Level ตัวละคร
    public void levelSetUp(){

    }
    // ไว้ใช้ในการถอดอวาวุธข้างใดข้างนึง หรือ ทั้งสอง
    public void UnEquipLR_Hand(){

    }
    // เรียกใช้เฉพาะตอนสร้างตัวละครใหม่
    public void setUpCharacter(){
        /*
        maxHP = 100 + (10*level)
        Hp = maxHP
        Mana = maxMana
        maxMana = 50 + (2*level)
        baseRunSPD = 30
        RunSpd_Decrease()

        */

    }
    // resetค่าต่างๆของตัวละคร
    public void reStatus(){

    }

}

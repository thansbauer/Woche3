package Beispiel1;

public class Weapon {
    private String name;
    private CombatType cType;
    private DamageType dType;
    private int damage;
    private int speed;
    private int strength;
    private int value;

    public Weapon(String name, CombatType cType, DamageType dType, int damage, int speed, int strength, int value) {
        this.name = name;
        this.cType = cType;
        this.dType = dType;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", cType=" + cType +
                ", dType=" + dType +
                ", damage=" + damage +
                ", speed=" + speed +
                ", strength=" + strength +
                ", value=" + value +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CombatType getcType() {
        return cType;
    }

    public void setcType(CombatType cType) {
        this.cType = cType;
    }

    public DamageType getdType() {
        return dType;
    }

    public void setdType(DamageType dType) {
        this.dType = dType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}

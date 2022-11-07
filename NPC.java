public abstract class NPC {

    protected int attack;
    protected int defense;
    protected int shots;
    protected int[] damage;
    protected float health;
    protected int speed;
    protected boolean delivery;
    protected boolean magic;
    protected String name;

    public int getAttack;

    public int setAttack(int attack) {
        if (attack < 0) return 0;
        this.attack = attack;
        return attack;
    }

    public int getDef;
    public int getShots;

    public int setShots(int shots) {
        if (shots < 0) return 0;
        this.shots = shots;
        return shots;
    }

    public int getDamage;

    public int[] setDamage(int[] damage) {
        for (int i = 0; i < damage.length; i++) {
            if (damage[i] < 0) {
                damage[i] = 0;
            }
        }
        this.damage = damage;
        return damage;
    }

    public int getHealth;

    public float setHealth(int health) {
        if (health < 0) return 0;
        this.health = health;
        return health;
    }

    public int getSpeed;
    public int getDel;
    public int getMagic;
    public int getName;

    public NPC(int attack, int defense, int shots, int[] damage,
               float health, int speed, boolean delivery, boolean magic, String name) {
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.name = name;
    }

    public void print() {
        System.out.println("Name: " + name + " Attack: " + attack + " Shots: " + shots + " Damage: " + damage +
                " Health: " + health + " Speed: " + speed + " Delivery: " + delivery + " Magic: " + magic);
    }
}



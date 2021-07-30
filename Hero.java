public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;


    public void kill(Mortal m){
        m.die(this.name);
    }


    public static void main(String[] args) {
        Hero a = new Hero();
        a.name = "盖伦";

        ADHero adHero = new ADHero();
        adHero.name = "女枪";

        APHero apHero = new APHero();
        apHero.name = "火女";

        ADAPHero adapHero = new ADAPHero();
        adapHero.name = "伊泽瑞尔";

        a.kill(adHero);
        a.kill(apHero);
        a.kill(adapHero);

    }
}
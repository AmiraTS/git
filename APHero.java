public class APHero extends Hero implements Mortal{
    @Override
    public void die(String abc) {
        System.out.println(abc + "用魔法攻击，击杀了" + this.name);
    }
}
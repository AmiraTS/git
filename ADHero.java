public class ADHero extends Hero implements Mortal{
    @Override
    public void die(String abc) {
        System.out.println(abc + "用物理攻击，击杀了" + this.name);
    }
}

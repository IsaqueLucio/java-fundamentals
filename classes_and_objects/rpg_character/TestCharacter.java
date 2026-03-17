package classes_and_objects.rpg_character;

public class TestCharacter{
    public static void main(String[] args) {
        Character chr1 = new Character("Luke", "Warrior");
        Character chr2 = new Character("Lucian","Mage");

        chr1.levelUp();
        chr1.levelUp();
        chr1.levelUp();

        System.out.println(chr1.level);
        System.out.println(chr2.level);
    }
}
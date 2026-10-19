public class Problem1HealthBar {
    static class Character {
        private int health;
        private final int maxHealth;

        public Character(int maxHealth) {
            if (maxHealth < 0) {
                throw new IllegalArgumentException("Maximum health cannot be negative.");
            }
            this.maxHealth = maxHealth;
            this.health = maxHealth;
        }

        public void takeDamage(int amount) {
            if (amount > 0) {
                health = Math.max(0, health - amount);
            }
        }

        public void heal(int amount) {
            if (amount > 0) {
                health = Math.min(maxHealth, health + amount);
            }
        }

        public int getHealth() {
            return health;
        }

        public int getMaxHealth() {
            return maxHealth;
        }
    }

    public static void main(String[] args) {
        Character c = new Character(100);
        c.takeDamage(30);
        System.out.println("After 30 damage: " + c.getHealth());
        c.heal(50);
        System.out.println("After healing: " + c.getHealth());
        c.takeDamage(150);
        System.out.println("After 150 damage: " + c.getHealth());
    }
}

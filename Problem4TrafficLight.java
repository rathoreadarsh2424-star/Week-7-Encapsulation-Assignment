public class Problem4TrafficLight {
    static class TrafficLight {
        private static final String[] COLORS = {"RED", "GREEN", "YELLOW"};
        private final String id;
        private int colorIndex;

        public TrafficLight(String id) {
            if (id == null || id.isEmpty()) {
                throw new IllegalArgumentException("ID cannot be empty.");
            }
            this.id = id;
            this.colorIndex = 0;
        }

        public String getColor() {
            return COLORS[colorIndex];
        }

        public String getId() {
            return id;
        }

        public void next() {
            colorIndex = (colorIndex + 1) % COLORS.length;
        }
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println(t.getColor());
        t.next();
        System.out.println(t.getColor());
        t.next();
        System.out.println(t.getColor());
        t.next();
        System.out.println(t.getColor());
    }
}

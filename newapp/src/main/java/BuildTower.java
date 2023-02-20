public class BuildTower {
    public static String[] towerBuilder(int nFloors)
    {
        String[] tower = new String[nFloors];

        for (int i = 0; i < nFloors; i++) {
            String floor = "";
            for (int j = 0; j < (nFloors - i - 1); j++) {
                floor += " ";
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                floor += "*";
            }
            tower[i] = floor;
        }

        return tower;
    }

    public static void main(String[] args) {
        String [] tower = BuildTower.towerBuilder(3);
        for (String floor : tower){
            System.out.println(floor);
        }
    }
}

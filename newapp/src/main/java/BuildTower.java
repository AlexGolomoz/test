public class BuildTower {
    public static String[] towerBuilder(int nFloors)
    {
        String[] tower = new String[nFloors];

        for (int i = 0; i < nFloors; i++) {
            String floor = "";
            String whitespace = "";
            for (int j = 0; j < (nFloors - i - 1); j++) {
                floor += " ";
                whitespace += " ";
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                floor +="*";
            }
            tower[i] = floor + whitespace;
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

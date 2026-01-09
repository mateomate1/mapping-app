package io.github.mateomate1.Map;

/**
 * Trying to make my own kind of map based on csv
 * Atributes:
 * -Coordenates(i position + j position)
 * -Content(A number that contains the coordinate info(speed which is 0 for
 * occupied blocks))
 */
public class GridMap {
    private final Integer[][] map;

    public GridMap(Integer[][] map) {
        this.map = map;
    }

    public void updateCoordinate(Integer row, Integer column, Integer speed) {
        map[row][column] = speed;
    }
}

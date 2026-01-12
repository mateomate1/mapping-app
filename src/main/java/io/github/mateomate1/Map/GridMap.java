package io.github.mateomate1.Map;

/**
 * Grid Map:
 *
 * This map represents a 2D space divided in cells, for simplicity you will onl
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

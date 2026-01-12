package io.github.mateomate1.Logic;

import java.util.Arrays;

public class GridMapper {
    private final byte dimensions = 2;
    private final Long[] start;
    private final Long[] objective;
    private Long[] position;

    public GridMapper(Long[] start, Long[] objective) {
        this.start = new Long[dimensions];
        this.objective = new Long[dimensions];

        for (int i = 0; i < dimensions; i++) {
            this.start[i] = start[i];
            this.objective[i] = objective[i];
        }

        this.position = this.start;
    }

    /*
     * [ ][ ][ ][ ]
     * [2][2][2][f]
     * [s][1][1][1]
     */

    private void updatePosition(Long[] pos) {
        position = pos;
    }

    @Override
    public String toString() {
        return "GridMapper [dimensions=" + dimensions + ", start=" + Arrays.toString(start) + ", objective="
                + Arrays.toString(objective) + ", position=" + Arrays.toString(position) + "]";
    }
}

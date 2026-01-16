package io.github.mateomate1.Logic;

import java.util.Arrays;

import io.github.mateomate1.Errors.ArrayLengthException;

public class GridMapper {
    private final byte dimensions = 2;
    private final Long[] start;
    private final Long[] objective;
    private Long[] position;

    public GridMapper(Long[] start, Long[] objective) throws ArrayLengthException {
        if (start.length != dimensions || objective.length != dimensions)
            throw new ArrayLengthException(dimensions);

        this.start = start;
        this.objective = objective;

        this.position = this.start;
    }

    /*
     * [ ][ ][ ][ ]
     * [2][2][2][f]
     * [s][1][1][1]
     */

    private void updatePosition(Long[] pos) throws ArrayLengthException{
        if (pos.length != dimensions)
            throw new ArrayLengthException(dimensions);
        position = pos;
    }

    @Override
    public String toString() {
        return "GridMapper [dimensions=" + dimensions + ", start=" + Arrays.toString(start) + ", objective="
                + Arrays.toString(objective) + ", position=" + Arrays.toString(position) + "]";
    }
}

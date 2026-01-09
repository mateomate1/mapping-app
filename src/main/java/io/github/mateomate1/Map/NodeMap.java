package io.github.mateomate1.Map;

import java.util.Map;

/**
 * Trying to make my own kind of map file based on sql
 * Atributes:
 *  id
 *  connections(id)
 *  speed(variable in case of accident)
 *  length(final)
 *  coordinates(not needed initialy, only to translate to visual map)
 *
 * @author mateomate1
 * @since 9/1/2026
 * @version 0.0.0
 */
public class NodeMap {
    private final Long id;
    private Map<Long, Long> node;
    private Long lenght;
    private Double[][][]coordinates;

    public NodeMap(Long id){
        this.id = id;
    }

}

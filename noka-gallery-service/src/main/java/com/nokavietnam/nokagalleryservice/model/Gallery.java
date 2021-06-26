package com.nokavietnam.nokagalleryservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author : NOKA NGUYEN
 * @since : 6/25/2021, Fri
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gallery {

    private Integer id;
    private List<Object> images;

    public Gallery(Integer id) {
        this.id = id;
    }
}

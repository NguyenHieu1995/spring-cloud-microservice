package com.nokavietnam.nokaimageservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : NOKA NGUYEN
 * @since : 6/25/2021, Fri
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Image {
    private Integer id;
    private String title;
    private String url;
}

package com.ryudj.chartSys.domain.model.artist;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Artist {

    private int artistIdx;
    private String artistName;
    private Date birthDay;

}

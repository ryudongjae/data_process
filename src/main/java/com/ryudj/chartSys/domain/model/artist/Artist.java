package com.ryudj.chartSys.domain.model.artist;

import com.ryudj.chartSys.metadata.ht.HtMeta;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Artist extends HtMeta {

    private int artistIdx;
    private String artistName;
    private Date birthDay;

}

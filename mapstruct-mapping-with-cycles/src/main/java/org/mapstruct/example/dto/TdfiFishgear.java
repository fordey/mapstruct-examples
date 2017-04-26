/**
 * Copyright 2012-2017 Gunnar Morling (http://www.gunnarmorling.de/)
 * and/or other contributors as indicated by the @authors tag. See the
 * copyright.txt file in the distribution for a full listing of all
 * contributors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mapstruct.example.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author Filip Hrisafov
 */
public class TdfiFishgear implements Serializable {
    private static final long serialVersionUID = 1L;


    private long tdfiFishgearid;
    private Long avghookcount;
    private BigDecimal avgnetheight;
    private Long avgnetheighuomid;
    private BigDecimal avgnetlength;
    private Long avgnetlengthuomid;
    private Timestamp createdate;
    private String createdby;
    private BigDecimal fishingdepth;
    private Long geartypeid;
    private String inactiveind;
    private Timestamp lastchangedate;

    public long getTdfiFishgearid() {
        return tdfiFishgearid;
    }

    public void setTdfiFishgearid(long tdfiFishgearid) {
        this.tdfiFishgearid = tdfiFishgearid;
    }

    public Long getAvghookcount() {
        return avghookcount;
    }

    public void setAvghookcount(Long avghookcount) {
        this.avghookcount = avghookcount;
    }

    public BigDecimal getAvgnetheight() {
        return avgnetheight;
    }

    public void setAvgnetheight(BigDecimal avgnetheight) {
        this.avgnetheight = avgnetheight;
    }

    public Long getAvgnetheighuomid() {
        return avgnetheighuomid;
    }

    public void setAvgnetheighuomid(Long avgnetheighuomid) {
        this.avgnetheighuomid = avgnetheighuomid;
    }

    public BigDecimal getAvgnetlength() {
        return avgnetlength;
    }

    public void setAvgnetlength(BigDecimal avgnetlength) {
        this.avgnetlength = avgnetlength;
    }

    public Long getAvgnetlengthuomid() {
        return avgnetlengthuomid;
    }

    public void setAvgnetlengthuomid(Long avgnetlengthuomid) {
        this.avgnetlengthuomid = avgnetlengthuomid;
    }

    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public BigDecimal getFishingdepth() {
        return fishingdepth;
    }

    public void setFishingdepth(BigDecimal fishingdepth) {
        this.fishingdepth = fishingdepth;
    }

    public Long getGeartypeid() {
        return geartypeid;
    }

    public void setGeartypeid(Long geartypeid) {
        this.geartypeid = geartypeid;
    }

    public String getInactiveind() {
        return inactiveind;
    }

    public void setInactiveind(String inactiveind) {
        this.inactiveind = inactiveind;
    }

    public Timestamp getLastchangedate() {
        return lastchangedate;
    }

    public void setLastchangedate(Timestamp lastchangedate) {
        this.lastchangedate = lastchangedate;
    }
}

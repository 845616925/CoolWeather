package xin.mcosmos.coolweather.db;

import org.litepal.crud.LitePalSupport;


/**
 * 项目名称: com.example.asd84.coolweather.db
 * 类描述
 * 创建人: asd84
 * 创建时间: 2018/12/15 11:43
 * 修改人: asd84
 * 修改时间: 2018/12/15
 * 修改备注:
 */
public class County extends LitePalSupport {
    private int id;
    private String countyName;
    private int countyCode;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

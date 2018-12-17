package xin.mcosmos.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * 项目名称: com.example.asd84.coolweather.db
 * 类描述
 * 创建人: asd84
 * 创建时间: 2018/12/14 11:53
 * 修改人: asd84
 * 修改时间: 2018/12/14
 * 修改备注:
 */
public class City extends LitePalSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

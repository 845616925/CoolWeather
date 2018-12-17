package xin.mcosmos.coolweather.db;

import org.litepal.crud.LitePalSupport;


/**
 * 项目名称: com.example.asd84.coolweather.db
 * 类描述
 * 创建人: asd84
 * 创建时间: 2018/12/15 10:17
 * 修改人: asd84
 * 修改时间: 2018/12/15
 * 修改备注:
 */
public class Province extends LitePalSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

package xin.mcosmos.coolweather.utils;

import android.text.TextUtils;
import android.util.Log;



import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import xin.mcosmos.coolweather.db.City;
import xin.mcosmos.coolweather.db.County;
import xin.mcosmos.coolweather.db.Province;

/**
 * 项目名称: com.example.asd84.coolweather.utils
 * 类描述
 * 创建人: asd84
 * 创建时间: 2018/12/15 12:18
 * 修改人: asd84
 * 修改时间: 2018/12/15
 * 修改备注:
 */
public class Utility {

    /**
     * 解析处理省级数据
     *
     * @param response 省级JSON数据
     * @return 是否成功
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);

                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();

                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析处理市级数据
     *
     * @param response 市级JSON数据
     * @return 是否成功
     */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);

                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();

                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析处理县级数据
     *
     * @param response 县级JSON数据
     * @return 是否成功
     */
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject cityObject = allCounties.getJSONObject(i);

                    County county = new County();
                    county.setCountyName(cityObject.getString("name"));
                    county.setCountyCode(cityObject.getInt("id"));
                    county.setCityId(cityId);
                    county.save();

                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }


}

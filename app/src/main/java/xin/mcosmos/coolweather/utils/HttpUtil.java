package xin.mcosmos.coolweather.utils;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 项目名称: com.example.asd84.coolweather.utils
 * 类描述
 * 创建人: asd84
 * 创建时间: 2018/12/15 11:46
 * 修改人: asd84
 * 修改时间: 2018/12/15
 * 修改备注:
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();

        client.newCall(request).enqueue(callback);
    }

}

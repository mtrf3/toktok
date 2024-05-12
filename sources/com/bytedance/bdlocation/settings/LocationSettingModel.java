package com.bytedance.bdlocation.settings;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class LocationSettingModel {
    public boolean isLatLngEncrypt;
    public boolean reportLocationAtStart;
    public JSONObject shakeConfig;
    public boolean collectConfig = true;
    public boolean reportAtStart = true;
    public boolean pollingUpload = true;
    public int locateType = 3;
    public int reportIntervalSeconds = 600;
    public int reportWifiMax = 30;
    public int reportBssMax = 10;
    public boolean reportGps = true;
    public boolean reportWifi = true;
    public boolean reportBss = true;
    public int overseasUploadInterval = 86400;
    public int uploadMaxCount = 1;
    public int latlngPrecision = 2;
    public boolean enable_h3 = true;
    public boolean enableTraceroute = true;
    public int h3Resolution = 7;
    public int h3Distance = 1;

    public static LocationSettingModel toModel(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LocationSettingModel locationSettingModel = new LocationSettingModel();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("locationsdk_config_android");
            if (optJSONObject != null) {
                locationSettingModel.collectConfig = optJSONObject.optBoolean("collect_config", true);
                locationSettingModel.pollingUpload = optJSONObject.optBoolean("polling_upload", true);
                locationSettingModel.locateType = optJSONObject.optInt("locate_type", 3);
                locationSettingModel.reportIntervalSeconds = optJSONObject.optInt("report_interval_seconds", 300);
                locationSettingModel.reportAtStart = optJSONObject.optBoolean("report_at_start", true);
                locationSettingModel.reportLocationAtStart = optJSONObject.optBoolean("report_location_at_start", false);
                locationSettingModel.reportGps = optJSONObject.optBoolean("report_gps", true);
                locationSettingModel.reportWifi = optJSONObject.optBoolean("report_wifi", true);
                locationSettingModel.reportBss = optJSONObject.optBoolean("report_bss", true);
                locationSettingModel.enableTraceroute = optJSONObject.optBoolean("enable_traceroute", true);
                locationSettingModel.reportBssMax = optJSONObject.optInt("report_bss_max", 10);
                locationSettingModel.reportWifiMax = optJSONObject.optInt("report_wifi_max", 30);
            }
            locationSettingModel.shakeConfig = jSONObject.optJSONObject("locationsdk_shake_config_android");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("locationsdk_overseas_config_android");
            if (optJSONObject2 != null) {
                locationSettingModel.overseasUploadInterval = optJSONObject2.optInt("overseas_upload_interval");
                locationSettingModel.uploadMaxCount = optJSONObject2.optInt("upload_max_count");
                locationSettingModel.latlngPrecision = optJSONObject2.optInt("latlng_precision");
                locationSettingModel.enable_h3 = optJSONObject2.optBoolean("enable_h3");
                locationSettingModel.h3Resolution = optJSONObject2.optInt("h3_resolution");
                locationSettingModel.h3Distance = optJSONObject2.optInt("h3_distance");
                locationSettingModel.isLatLngEncrypt = optJSONObject2.optBoolean("location_ropa_encrypt");
            }
        } catch (JSONException unused) {
        }
        return locationSettingModel;
    }
}

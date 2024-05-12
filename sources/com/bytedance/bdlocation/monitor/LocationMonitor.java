package com.bytedance.bdlocation.monitor;

import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.utils.json.JsonUtil;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* loaded from: classes24.dex */
public class LocationMonitor {
    public static void doBackgroundLocationError(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutBoolean(jSONObject, "is_init_provider", z);
        LocationMonitorUtil.monitorEvent("bd_location_background_location_error", jSONObject, null);
    }

    public static void doFirstLocationDuration(long j) {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutLong(jSONObject, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_first_location_duration", null, jSONObject);
    }

    public static void doFirstSubmitDuration(long j) {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutLong(jSONObject, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_first_submit_duration", null, jSONObject);
    }

    public static void fetchStationDuration(long j) {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutLong(jSONObject, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_fetch_station_duration", null, jSONObject);
    }

    public static void fetchWifiDuration(long j) {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutLong(jSONObject, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_fetch_wifi_duration", null, jSONObject);
    }

    public static void uploadAuthStatus(int i) {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutInt(jSONObject, "auth_status", i);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_auth_status", jSONObject, null);
    }

    public static void doDesiredLocationFail(long j, BDLocationException bDLocationException, LocationOption locationOption) {
        JSONObject jSONObject = new JSONObject();
        if (bDLocationException != null) {
            JsonUtil.safePutString(jSONObject, "location_name", bDLocationException.getSdkName());
            JsonUtil.safePutBoolean(jSONObject, "is_timeout", bDLocationException.getCode().equals(CardStruct.IStatusCode.DEFAULT));
            JsonUtil.safePutString(jSONObject, "err_code", bDLocationException.getCode());
            JsonUtil.safePutString(jSONObject, "err_msg", bDLocationException.getMessage());
        } else {
            JsonUtil.safePutString(jSONObject, "location_name", "");
            JsonUtil.safePutBoolean(jSONObject, "is_timeout", false);
            JsonUtil.safePutString(jSONObject, "err_code", "-2");
            JsonUtil.safePutString(jSONObject, "err_msg", "exception is null");
        }
        JsonUtil.safePutBoolean(jSONObject, "is_success", false);
        JsonUtil.safePutBoolean(jSONObject, "is_cache", false);
        JsonUtil.safePutInt(jSONObject, "accuracy_level", locationOption.getAccuracyLevel());
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtil.safePutDouble(jSONObject3, "accuracy", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        JsonUtil.safePutLong(jSONObject3, "cache_time", locationOption.getMaxCacheTime());
        JsonUtil.safePutLong(jSONObject3, "timeout", locationOption.getLocationTimeOutMs());
        JsonUtil.safePutString(jSONObject3, "upload_source", locationOption.getUploadSource());
        JsonUtil.safePutLong(jSONObject3, "intel_upload_interval", locationOption.getUploadInterval());
        JsonUtil.safePutLong(jSONObject3, "cache_timestamp", 0L);
        JsonUtil.safePutLong(jSONObject3, "cache_duration", 0L);
        JsonUtil.safePutLong(jSONObject3, "timestamp", System.currentTimeMillis());
        LocationMonitorUtil.monitorEvent("bd_location_sdk_desired_location", jSONObject, jSONObject2, jSONObject3);
    }

    public static void doDesiredLocationSuccess(long j, BDLocation bDLocation, LocationOption locationOption) {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutString(jSONObject, "location_name", bDLocation.getLocationSDKName());
        JsonUtil.safePutString(jSONObject, "err_code", "200");
        JsonUtil.safePutString(jSONObject, "err_msg", "success");
        JsonUtil.safePutBoolean(jSONObject, "is_success", true);
        JsonUtil.safePutBoolean(jSONObject, "is_timeout", false);
        JsonUtil.safePutBoolean(jSONObject, "is_cache", bDLocation.isCache());
        JsonUtil.safePutInt(jSONObject, "accuracy_level", locationOption.getAccuracyLevel());
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtil.safePutDouble(jSONObject3, "accuracy", bDLocation.getAccuracy());
        JsonUtil.safePutLong(jSONObject3, "cache_time", locationOption.getMaxCacheTime());
        JsonUtil.safePutLong(jSONObject3, "timeout", locationOption.getLocationTimeOutMs());
        JsonUtil.safePutString(jSONObject3, "upload_source", locationOption.getUploadSource());
        JsonUtil.safePutLong(jSONObject3, "intel_upload_interval", locationOption.getUploadInterval());
        if (bDLocation.isCache()) {
            JsonUtil.safePutLong(jSONObject3, "cache_timestamp", bDLocation.getLocationMs());
            JsonUtil.safePutLong(jSONObject3, "cache_duration", System.currentTimeMillis() - bDLocation.getLocationMs());
        } else {
            JsonUtil.safePutLong(jSONObject3, "cache_timestamp", 0L);
            JsonUtil.safePutLong(jSONObject3, "cache_duration", 0L);
        }
        JsonUtil.safePutLong(jSONObject3, "timestamp", System.currentTimeMillis());
        LocationMonitorUtil.monitorEvent("bd_location_sdk_desired_location", jSONObject, jSONObject2, jSONObject3);
    }

    public static void doGeocode(long j, int i, String str) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        JsonUtil.safePutInt(jSONObject, "status", i2);
        JsonUtil.safePutInt(jSONObject, "err_code", i);
        JsonUtil.safePutString(jSONObject, "err_msg", str);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_geocode", jSONObject, jSONObject2);
    }

    public static void doGis(long j, int i, String str) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        JsonUtil.safePutInt(jSONObject, "status", i2);
        JsonUtil.safePutInt(jSONObject, "err_code", i);
        JsonUtil.safePutString(jSONObject, "err_msg", str);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_gis", jSONObject, jSONObject2);
    }

    public static void doScanRefresh(long j, int i, String str) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        JsonUtil.safePutInt(jSONObject, "status", i2);
        JsonUtil.safePutInt(jSONObject, "err_code", i);
        JsonUtil.safePutString(jSONObject, "err_msg", str);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_scan_refresh", jSONObject, jSONObject2);
    }

    public static void doScanUpload(long j, int i, String str) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        JsonUtil.safePutInt(jSONObject, "status", i2);
        JsonUtil.safePutInt(jSONObject, "err_code", i);
        JsonUtil.safePutString(jSONObject, "err_msg", str);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_scan_upload", jSONObject, jSONObject2);
    }

    public static void doSubmit(long j, int i, String str) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        JsonUtil.safePutInt(jSONObject, "status", i2);
        JsonUtil.safePutInt(jSONObject, "err_code", i);
        JsonUtil.safePutString(jSONObject, "err_msg", str);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_submit_v2", jSONObject, jSONObject2);
    }

    public static void fetchTracerouteConfig(long j, int i, String str) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        JsonUtil.safePutInt(jSONObject, "status", i2);
        JsonUtil.safePutInt(jSONObject, "err_code", i);
        JsonUtil.safePutString(jSONObject, "err_msg", str);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_traceroute_fetch_config", jSONObject, jSONObject2);
    }

    public static void getLastLocation(boolean z, int i, String str) {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutBoolean(jSONObject, "is_null", z);
        JsonUtil.safePutInt(jSONObject, "accuracy_level", i);
        JsonUtil.safePutString(jSONObject, "cert_token", str);
        LocationMonitorUtil.monitorEvent("bd_location_last_location", jSONObject, null);
    }

    public static void uploadBaseInfo(long j, int i, String str) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        JsonUtil.safePutInt(jSONObject, "status", i2);
        JsonUtil.safePutInt(jSONObject, "err_code", i);
        JsonUtil.safePutString(jSONObject, "err_msg", str);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_base_info", jSONObject, jSONObject2);
    }

    public static void uploadRestrictedInfo(long j, int i, String str) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        JsonUtil.safePutInt(jSONObject, "status", i2);
        JsonUtil.safePutInt(jSONObject, "err_code", i);
        JsonUtil.safePutString(jSONObject, "err_msg", str);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_restricted_info", jSONObject, jSONObject2);
    }

    public static void doContinueLocation(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutString(jSONObject, "location_name", str);
        JsonUtil.safePutString(jSONObject, "err_code", str2);
        JsonUtil.safePutString(jSONObject, "err_msg", str3);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutString(jSONObject2, "detail_err_msg", str4);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_continue", jSONObject, null, jSONObject2);
    }

    public static void encryptLocation(long j, boolean z, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutBoolean(jSONObject, "is_success", z);
        JsonUtil.safePutString(jSONObject, "err_code", str);
        JsonUtil.safePutString(jSONObject, "err_msg", str2);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_encrypt_location", jSONObject, jSONObject2);
    }

    public static void uploadTraceroute(long j, int i, int i2, String str) {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutInt(jSONObject, "status", i);
        JsonUtil.safePutInt(jSONObject, "err_code", i2);
        JsonUtil.safePutString(jSONObject, "err_msg", str);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_traceroute_upload", jSONObject, jSONObject2);
    }

    public static void doDesiredLocationDuration(String str, long j, String str2, String str3, String str4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("locationmonitor location only duration is: ");
        LIZ.append(j);
        LIZ.append("ms");
        Logger.i(X1D.LIZIZ(LIZ));
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutString(jSONObject, "location_name", str);
        JsonUtil.safePutString(jSONObject, "err_code", str2);
        JsonUtil.safePutString(jSONObject, "err_msg", str3);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtil.safePutString(jSONObject3, "detail_err_msg", str4);
        LocationMonitorUtil.monitorEvent("bd_location_sdk_desired_location_duration", jSONObject, jSONObject2, jSONObject3);
    }

    public static void decryptLocation(long j, boolean z, String str, String str2, String str3, boolean z2, int i, int i2, int i3) {
        JSONObject jSONObject = new JSONObject();
        JsonUtil.safePutBoolean(jSONObject, "is_success", z);
        JsonUtil.safePutString(jSONObject, "err_code", str);
        JsonUtil.safePutString(jSONObject, "err_msg", str2);
        JsonUtil.safePutString(jSONObject, "cert_token", str3);
        JsonUtil.safePutBoolean(jSONObject, "is_encrypt_enable", z2);
        JsonUtil.safePutInt(jSONObject, "accuracy_level", i);
        JsonUtil.safePutInt(jSONObject, "encrypted_lat_len", i2);
        JsonUtil.safePutInt(jSONObject, "encrypted_lng_len", i3);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtil.safePutLong(jSONObject2, "total_duration", j);
        LocationMonitorUtil.monitorEvent("bd_location_decrypt_location", jSONObject, jSONObject2);
    }
}

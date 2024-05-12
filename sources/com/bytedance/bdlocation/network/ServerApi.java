package com.bytedance.bdlocation.network;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.entity.gis.BdGisResult;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.monitor.LocationMonitor;
import com.bytedance.bdlocation.network.model.BaseResp;
import com.bytedance.bdlocation.network.model.DeviceLocation;
import com.bytedance.bdlocation.network.model.DeviceStatus;
import com.bytedance.bdlocation.network.model.LocationResult;
import com.bytedance.bdlocation.network.model.LocationUploadExtra;
import com.bytedance.bdlocation.network.model.ShakeUploadInfo;
import com.bytedance.bdlocation.network.response.LocationResp;
import com.bytedance.bdlocation.utils.json.JsonUtil;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.retrofit2.mime.TypedString;
import com.google.gson.j;
import com.google.gson.m;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes24.dex */
public class ServerApi {
    public static boolean sIsFirstUpload = true;

    public static boolean checkoutUploadRule() {
        if (BDLocationConfig.isRestrictedModeOn()) {
            Logger.i("The collection of data is allowed restricted mode off!");
            return false;
        }
        if (BDLocationConfig.isBackground()) {
            Logger.i("The collection of data is allowed enter foreground!");
            return false;
        }
        if (!BDLocationConfig.isPrivacyConfirmed()) {
            Logger.i("The collection of data is allowed after user confirmed the privacy!");
            return false;
        }
        return true;
    }

    public static LocationResp analysisLocationResult(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.i("analysisLocationResult networkResponse is null");
            return null;
        }
        try {
            return (LocationResp) JsonUtil.sGson.LJI(str, LocationResp.class);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("analysisLocationResult exception:");
            LIZ.append(e.toString());
            Logger.i(X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public static LocationResult getIPResult(int i) {
        if (!checkoutUploadRule() || BDLocationConfig.isOverSeas()) {
            Logger.i("The collection of data is allowed checkoutUploadRule!");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("dwinfo", packFingerprint(new m()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("sdk_version", BDLocationConfig.getSdkVersion());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            JSONObject jSONObject = new JSONObject(NetworkRequestManager.post("/location/geocode/", linkedHashMap, linkedHashMap2, i));
            int optInt = jSONObject.optInt("err_no");
            LocationMonitor.doGeocode(SystemClock.elapsedRealtime() - elapsedRealtime, optInt, jSONObject.optString("err_msg"));
            if (optInt == 0) {
                return (LocationResult) JsonUtil.sGson.LJI(unpackFingerprint(JSONObjectProtectorUtils.getString(jSONObject, "data")), LocationResult.class);
            }
        } catch (Exception e) {
            LocationMonitor.doGeocode(SystemClock.elapsedRealtime() - elapsedRealtime, -2, e.getMessage());
            C16880lQ.LLLLIIL(e);
        }
        return null;
    }

    public static String packFingerprint(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("utf-8");
            int length = bytes.length;
            for (int i = 0; i < length; i++) {
                bytes[i] = (byte) (bytes[i] ^ (-99));
            }
            return Base64.encodeToString(bytes, 10);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String unpackFingerprint(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                byte[] decode = Base64.decode(str, 2);
                int length = decode.length;
                for (int i = 0; i < length; i++) {
                    decode[i] = (byte) (decode[i] ^ (-99));
                }
                return new String(decode);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String packFingerprint(m mVar) {
        if (mVar == null) {
            return null;
        }
        return packFingerprint(mVar.toString());
    }

    public static BdGisResult getGisResult(double d, double d2, int i) {
        if (!checkoutUploadRule() || BDLocationConfig.isOverSeas()) {
            Logger.i("The collection of data is allowed checkoutUploadRule!");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("longitude", String.valueOf(d2));
        linkedHashMap.put("latitude", String.valueOf(d));
        Locale locale = BDLocationConfig.getLocale();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        linkedHashMap.put("language", LocationUtil.languageTag(locale));
        String worldView = BDLocationConfig.getWorldView();
        if (!TextUtils.isEmpty(worldView)) {
            linkedHashMap.put("worldview", worldView);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            BdGisResult bdGisResult = (BdGisResult) JsonUtil.sGson.LJI(NetworkRequestManager.get("/location/gis/reverse_geolocation", linkedHashMap, i), BdGisResult.class);
            if (bdGisResult != null && bdGisResult.baseResp != null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                BaseResp baseResp = bdGisResult.baseResp;
                LocationMonitor.doGis(elapsedRealtime2, baseResp.statusCode, baseResp.statusMessage);
            }
            return bdGisResult;
        } catch (Exception e) {
            LocationMonitor.doGis(SystemClock.elapsedRealtime() - elapsedRealtime, -1, e.getMessage());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getGisResult Exception:");
            LIZ.append(e.toString());
            Logger.i(X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public static LocationResp getLocationInfo(DeviceLocation deviceLocation, DeviceStatus deviceStatus, LocationUploadExtra locationUploadExtra) {
        String postJson;
        m mVar = new m();
        if (locationUploadExtra != null) {
            mVar.LJJIIJ("upload_interval", Long.valueOf(locationUploadExtra.getUploadInterval()));
            mVar.LJJIIZ("upload_source", locationUploadExtra.getUploadSource());
            mVar.LJJIII(Boolean.valueOf(locationUploadExtra.isLatestAdminVersion()), "latest_admin_version");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getLocationInfo upload_source:");
            LIZ.append(locationUploadExtra.getUploadSource());
            LIZ.append("-upload_interval:");
            LIZ.append(locationUploadExtra.getUploadInterval());
            Logger.i(X1D.LIZIZ(LIZ));
        }
        mVar.LJJII("location", JsonUtil.safeToJsonTree(deviceLocation));
        mVar.LJJII("status", JsonUtil.safeToJsonTree(deviceStatus));
        mVar.LJJII("user_network_status_list", JsonUtil.safeToJsonTree(locationUploadExtra.getsNetworkStatusList()));
        mVar.LJJII("upload_gps", JsonUtil.safeToJsonTree(locationUploadExtra.getGPSCache()));
        mVar.LJJIIZ("language", LocationUtil.getLanguage());
        mVar.LJJIIZ("world_view", BDLocationConfig.getWorldView());
        mVar.LJJIII(Boolean.valueOf(LocationUtil.checkVPN()), "is_vpn");
        mVar.LJJIII(Boolean.valueOf(LocationUtil.isProxy()), "is_proxy");
        mVar.LJJIIJ("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdk_version", BDLocationConfig.getSdkVersion());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (sIsFirstUpload) {
            LocationMonitor.doFirstSubmitDuration(elapsedRealtime - BDLocationConfig.getInitStartTime());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("locationmonitor first submit duration is: ");
            LIZ2.append(elapsedRealtime - BDLocationConfig.getInitStartTime());
            LIZ2.append("ms");
            Logger.i(X1D.LIZIZ(LIZ2));
            sIsFirstUpload = false;
        }
        if (BDLocationConfig.isNetworkBodyEncrypt()) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String packFingerprint = packFingerprint(mVar);
            linkedHashMap2.put("locinfo", packFingerprint);
            if (packFingerprint != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("submit:getLocationInfo:");
                LIZ3.append(packFingerprint.substring(0, packFingerprint.length() / 2));
                Logger.i(X1D.LIZIZ(LIZ3));
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("submit:getLocationInfo2:");
                LIZ4.append(packFingerprint.substring(packFingerprint.length() / 2));
                Logger.i(X1D.LIZIZ(LIZ4));
            }
            postJson = NetworkRequestManager.post("/location/submit-v2/", linkedHashMap2, linkedHashMap, locationUploadExtra.getTriggerType());
        } else {
            TypedString typedString = new TypedString(mVar.toString());
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(BDLocationConfig.getPathPrefix());
            LIZ5.append("/location/submit-v2/");
            postJson = NetworkRequestManager.postJson(X1D.LIZIZ(LIZ5), typedString, linkedHashMap);
        }
        LocationResp analysisLocationResult = analysisLocationResult(postJson);
        if (analysisLocationResult != null) {
            LocationMonitor.doSubmit(SystemClock.elapsedRealtime() - elapsedRealtime, analysisLocationResult.resultCode, analysisLocationResult.resultMsg);
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("locationmonitor submit total duration is: ");
            LIZ6.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            LIZ6.append("ms");
            Logger.i(X1D.LIZIZ(LIZ6));
        } else {
            LocationMonitor.doSubmit(SystemClock.elapsedRealtime() - elapsedRealtime, -2, "result is null");
        }
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("end network duration is ");
        LIZ7.append(System.currentTimeMillis() - elapsedRealtime);
        Logger.i("ServerApi", X1D.LIZIZ(LIZ7));
        return analysisLocationResult;
    }

    public static LocationResp uploadLocationInfo(DeviceLocation deviceLocation, DeviceStatus deviceStatus, LocationUploadExtra locationUploadExtra) {
        if (!checkoutUploadRule()) {
            Logger.i("The collection of data is allowed checkoutUploadRule!");
            return null;
        }
        return getLocationInfo(deviceLocation, deviceStatus, locationUploadExtra);
    }

    public static LocationResp uploadMccAndSystemRegionInfo(Context context, String str, int i) {
        String postJson;
        if (!checkoutUploadRule()) {
            Logger.i("The collection of data is allowed checkoutUploadRule!");
            return null;
        }
        DeviceStatus deviceStatus = LocationUtil.getDeviceStatus(context);
        m mVar = new m();
        if (str != null) {
            mVar.LJJIIZ("upload_source", str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("uploadMccAndSystemRegionInfo upload_source:");
            LIZ.append(str);
            Logger.i(X1D.LIZIZ(LIZ));
        }
        mVar.LJJII("status", JsonUtil.safeToJsonTree(deviceStatus));
        mVar.LJJIIJ("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
        mVar.LJJIII(Boolean.valueOf(LocationUtil.checkVPN()), "is_vpn");
        mVar.LJJIII(Boolean.valueOf(LocationUtil.isProxy()), "is_proxy");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("submit device:");
        LIZ2.append(GsonProtectorUtils.toJson(JsonUtil.sGson, (j) mVar));
        Logger.i(X1D.LIZIZ(LIZ2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdk_version", BDLocationConfig.getSdkVersion());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (BDLocationConfig.isNetworkBodyEncrypt()) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("locinfo", packFingerprint(mVar));
            postJson = NetworkRequestManager.post("/location/info/", linkedHashMap2, linkedHashMap, i);
        } else {
            TypedString typedString = new TypedString(mVar.toString());
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(BDLocationConfig.getPathPrefix());
            LIZ3.append("/location/info/");
            postJson = NetworkRequestManager.postJson(X1D.LIZIZ(LIZ3), typedString, linkedHashMap);
        }
        LocationResp analysisLocationResult = analysisLocationResult(postJson);
        if (analysisLocationResult != null) {
            LocationMonitor.uploadBaseInfo(SystemClock.elapsedRealtime() - elapsedRealtime, analysisLocationResult.resultCode, analysisLocationResult.resultMsg);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("locationmonitor info total duration is: ");
            LIZ4.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            LIZ4.append("ms");
            Logger.i(X1D.LIZIZ(LIZ4));
            if (BDLocationConfig.isRestrictedModeOn()) {
                LocationMonitor.uploadRestrictedInfo(SystemClock.elapsedRealtime() - elapsedRealtime, analysisLocationResult.resultCode, analysisLocationResult.resultMsg);
            }
        } else {
            LocationMonitor.uploadBaseInfo(SystemClock.elapsedRealtime() - elapsedRealtime, -2, "result is null");
        }
        return analysisLocationResult;
    }

    public static boolean uploadShakeInfo(ShakeUploadInfo shakeUploadInfo, boolean z, int i) {
        String str;
        if (!checkoutUploadRule()) {
            Logger.i("The collection of data is allowed checkoutUploadRule!");
            return false;
        }
        String json = GsonProtectorUtils.toJson(JsonUtil.sGson, shakeUploadInfo);
        Logger.i("start submit uploadShakeInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("userloc", packFingerprint(json));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("sdk_version", BDLocationConfig.getSdkVersion());
        Logger.d("ServerApi uploadShakeInfo");
        if (z) {
            str = "/location/refresh-nearby-user-info/";
        } else {
            str = "/location/submit-nearby-user-info/";
        }
        return shakeSubmitResult(NetworkRequestManager.post(str, linkedHashMap, linkedHashMap2, i), "upload location info success", "upload location info failed", SystemClock.elapsedRealtime(), z);
    }

    public static boolean shakeSubmitResult(String str, String str2, String str3, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            LocationResp locationResp = (LocationResp) JsonUtil.sGson.LJI(str, LocationResp.class);
            if (locationResp == null) {
                return true;
            }
            if (z) {
                LocationMonitor.doScanRefresh(SystemClock.elapsedRealtime() - j, locationResp.resultCode, locationResp.resultMsg);
            } else {
                LocationMonitor.doScanUpload(SystemClock.elapsedRealtime() - j, locationResp.resultCode, locationResp.resultMsg);
            }
            if (locationResp.resultCode == 0) {
                String str4 = locationResp.data;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(unpackFingerprint(str4));
                LIZ.append("---end");
                Logger.d("BDLocationUPTest UploadSchedule: result", X1D.LIZIZ(LIZ));
                Logger.i(str2);
                return true;
            }
            Logger.i(str3);
            return false;
        } catch (Exception e) {
            if (z) {
                LocationMonitor.doScanRefresh(SystemClock.elapsedRealtime() - j, -1, e.getMessage());
            } else {
                LocationMonitor.doScanUpload(SystemClock.elapsedRealtime() - j, -1, e.getMessage());
            }
            C16880lQ.LLLLIIL(e);
            Logger.e("The exception was occurred when the response data was convert to LocInfoRspData ");
            return false;
        }
    }
}

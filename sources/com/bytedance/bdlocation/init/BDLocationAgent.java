package com.bytedance.bdlocation.init;

import android.content.Context;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.callback.LocationNotification;
import com.bytedance.bdlocation.callback.RegionUploadCallback;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.entity.bpea.BDDecryptLocation;
import com.bytedance.bdlocation.entity.gis.BdGisResult;
import com.bytedance.bdlocation.entity.region.RegionBean;
import org.json.JSONObject;

/* loaded from: classes24.dex */
public class BDLocationAgent {
    public static void clearLocationCache() {
        BDLocationHelper.getInstance().clearLocationCache();
    }

    public static boolean isInit() {
        return BDLocationHelper.getInstance().isInit();
    }

    public static boolean uploadRegionInfo() {
        return BDLocationHelper.getInstance().uploadRegionInfo();
    }

    public static BDPoint convertGCJ02(BDPoint bDPoint) {
        return BDLocationHelper.getInstance().convertGCJ02(bDPoint);
    }

    public static BDLocation getLastKnownLocation(Object obj) {
        return BDLocationHelper.getInstance().getLastKnowLocation(obj);
    }

    public static RegionBean getRegion(boolean z) {
        return BDLocationHelper.getInstance().getRegion(z);
    }

    public static void init(LocationInitConfig locationInitConfig) {
        BDLocationHelper.getInstance().init(locationInitConfig);
    }

    public static void setBaseUrl(String str) {
        BDLocationHelper.getInstance().setBaseUrl(str);
    }

    public static void uploadRegionInfoAsync(RegionUploadCallback regionUploadCallback) {
        BDLocationHelper.getInstance().uploadRegionInfoAsync(regionUploadCallback);
    }

    public static void addNotification(LocationNotification locationNotification, int i) {
        BDLocationHelper.getInstance();
        BDLocationHelper.addNotification(locationNotification, i);
    }

    public static BDLocation getIPLocation(Object obj, int i) {
        return BDLocationHelper.getInstance().getIPLocation(obj, i);
    }

    public static BDLocation getLastKnownLocation(int i, boolean z) {
        return BDLocationHelper.getInstance().getLastKnowLocation(i, z);
    }

    public static RegionBean getRegion(boolean z, boolean z2) {
        return BDLocationHelper.getInstance().getRegion(z, z2);
    }

    public static void removeNotification(LocationNotification locationNotification, int i) {
        BDLocationHelper.getInstance();
        BDLocationHelper.removeNotification(locationNotification, i);
    }

    public static void updateSettings(Context context, JSONObject jSONObject) {
        BDLocationHelper.getInstance().updateSettings(context, jSONObject);
    }

    public static void addNotification(LocationNotification locationNotification, Object obj) {
        BDLocationHelper.getInstance();
        BDLocationHelper.addNotification(locationNotification, obj);
    }

    public static BDLocation getLastKnownLocation(Object obj, Object obj2) {
        return BDLocationHelper.getInstance().getLastKnowLocation(obj, obj2);
    }

    public static BDDecryptLocation decryptLatLng(String str, String str2, Object obj) {
        return BDLocationHelper.getInstance().decryptLatLng(str, str2, obj);
    }

    public static BDLocation getLastKnownLocation(Object obj, int i, boolean z) {
        return BDLocationHelper.getInstance().getLastKnowLocation(obj, i, z);
    }

    public static BDLocation geocode(double d, double d2, int i, Object obj) {
        BdGisResult bdGisResult = getBdGisResult(d, d2, i, obj);
        if (bdGisResult == null) {
            return null;
        }
        return LocationUtil.locationResultToBDLocation(null, bdGisResult.location);
    }

    public static BdGisResult getBdGisResult(double d, double d2, int i, Object obj) {
        return BDLocationHelper.getInstance().geocode(d, d2, i, obj);
    }

    public static BDLocation geocode(double d, double d2, int i, boolean z) {
        BdGisResult bdGisResult = getBdGisResult(d, d2, i, z);
        if (bdGisResult == null) {
            return null;
        }
        return LocationUtil.locationResultToBDLocation(null, bdGisResult.location);
    }

    public static BdGisResult getBdGisResult(double d, double d2, int i, boolean z) {
        return BDLocationHelper.getInstance().geocode(d, d2, i, z);
    }
}

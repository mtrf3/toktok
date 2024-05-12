package com.bytedance.bdlocation.init;

import android.content.Context;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.LocationNotification;
import com.bytedance.bdlocation.callback.RegionUploadCallback;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.entity.bpea.BDDecryptLocation;
import com.bytedance.bdlocation.entity.gis.BdGisResult;
import com.bytedance.bdlocation.entity.region.RegionBean;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public interface IBDLocationAgent {
    void addNotification(LocationNotification locationNotification, int i);

    void addNotification(LocationNotification locationNotification, Object obj);

    void clearLocationCache();

    BDPoint convertGCJ02(BDPoint bDPoint);

    BDDecryptLocation decryptLatLng(String str, String str2, Object obj);

    BDLocation geocode(double d, double d2, int i, Object obj);

    BDLocation geocode(double d, double d2, int i, boolean z);

    BdGisResult getBdGisResult(double d, double d2, int i, Object obj);

    BdGisResult getBdGisResult(double d, double d2, int i, boolean z);

    BDLocation getIPLocation(Object obj, int i);

    BDLocation getLastKnownLocation(int i, boolean z);

    BDLocation getLastKnownLocation(Object obj);

    BDLocation getLastKnownLocation(Object obj, int i, boolean z);

    BDLocation getLastKnownLocation(Object obj, Object obj2);

    RegionBean getRegion(boolean z);

    RegionBean getRegion(boolean z, boolean z2);

    void init(LocationInitConfig locationInitConfig);

    boolean isInit();

    void removeNotification(LocationNotification locationNotification, int i);

    void setBaseUrl(String str);

    void updateSettings(Context context, JSONObject jSONObject);

    boolean uploadRegionInfo();

    void uploadRegionInfoAsync(RegionUploadCallback regionUploadCallback);
}

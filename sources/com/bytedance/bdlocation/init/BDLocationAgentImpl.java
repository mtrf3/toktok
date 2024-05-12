package com.bytedance.bdlocation.init;

import X.C58096Mr6;
import android.content.Context;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.LocationNotification;
import com.bytedance.bdlocation.callback.RegionUploadCallback;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.entity.bpea.BDDecryptLocation;
import com.bytedance.bdlocation.entity.gis.BdGisResult;
import com.bytedance.bdlocation.entity.region.RegionBean;
import org.json.JSONObject;

/* loaded from: classes24.dex */
public class BDLocationAgentImpl implements IBDLocationAgent {
    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public boolean isInit() {
        return BDLocationAgent.isInit();
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public boolean uploadRegionInfo() {
        return BDLocationAgent.uploadRegionInfo();
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public void clearLocationCache() {
        BDLocationAgent.clearLocationCache();
    }

    public static IBDLocationAgent createIBDLocationAgentbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IBDLocationAgent.class, z);
        if (LIZ != null) {
            return (IBDLocationAgent) LIZ;
        }
        if (C58096Mr6.LIZLLL == null) {
            synchronized (IBDLocationAgent.class) {
                if (C58096Mr6.LIZLLL == null) {
                    C58096Mr6.LIZLLL = new BDLocationAgentImpl();
                }
            }
        }
        return (BDLocationAgentImpl) C58096Mr6.LIZLLL;
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public BDPoint convertGCJ02(BDPoint bDPoint) {
        return BDLocationAgent.convertGCJ02(bDPoint);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public BDLocation getLastKnownLocation(Object obj) {
        return BDLocationAgent.getLastKnownLocation(obj);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public RegionBean getRegion(boolean z) {
        return BDLocationAgent.getRegion(z);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public void init(LocationInitConfig locationInitConfig) {
        BDLocationAgent.init(locationInitConfig);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public void setBaseUrl(String str) {
        BDLocationAgent.setBaseUrl(str);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public void uploadRegionInfoAsync(RegionUploadCallback regionUploadCallback) {
        BDLocationAgent.uploadRegionInfoAsync(regionUploadCallback);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public void addNotification(LocationNotification locationNotification, int i) {
        BDLocationAgent.addNotification(locationNotification, i);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public BDLocation getIPLocation(Object obj, int i) {
        return BDLocationAgent.getIPLocation(obj, i);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public BDLocation getLastKnownLocation(int i, boolean z) {
        return BDLocationAgent.getLastKnownLocation(i, z);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public RegionBean getRegion(boolean z, boolean z2) {
        return BDLocationAgent.getRegion(z, z2);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public void removeNotification(LocationNotification locationNotification, int i) {
        BDLocationAgent.removeNotification(locationNotification, i);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public void updateSettings(Context context, JSONObject jSONObject) {
        BDLocationAgent.updateSettings(context, jSONObject);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public void addNotification(LocationNotification locationNotification, Object obj) {
        BDLocationAgent.addNotification(locationNotification, obj);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public BDLocation getLastKnownLocation(Object obj, Object obj2) {
        return BDLocationAgent.getLastKnownLocation(obj, obj2);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public BDDecryptLocation decryptLatLng(String str, String str2, Object obj) {
        return BDLocationAgent.decryptLatLng(str, str2, obj);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public BDLocation getLastKnownLocation(Object obj, int i, boolean z) {
        return BDLocationAgent.getLastKnownLocation(obj, i, z);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public BDLocation geocode(double d, double d2, int i, Object obj) {
        return BDLocationAgent.geocode(d, d2, i, obj);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public BdGisResult getBdGisResult(double d, double d2, int i, Object obj) {
        return BDLocationAgent.getBdGisResult(d, d2, i, obj);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public BDLocation geocode(double d, double d2, int i, boolean z) {
        return BDLocationAgent.geocode(d, d2, i, z);
    }

    @Override // com.bytedance.bdlocation.init.IBDLocationAgent
    public BdGisResult getBdGisResult(double d, double d2, int i, boolean z) {
        return BDLocationAgent.getBdGisResult(d, d2, i, z);
    }
}

package com.bytedance.bdlocation.settings;

import X.X1D;
import android.content.Context;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.store.LocationCache;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class LocationSettingUtil {
    public static LocationSettingModel sLocationSettingModel;

    public static void setLocationConfig() {
        if (sLocationSettingModel == null) {
            String locationSettings = LocationCache.getInstance().getLocationSettings();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LocationSettings:::");
            LIZ.append(locationSettings);
            Logger.i(X1D.LIZIZ(LIZ));
            sLocationSettingModel = LocationSettingModel.toModel(locationSettings);
        }
        LocationSettingModel locationSettingModel = sLocationSettingModel;
        if (locationSettingModel != null) {
            BDLocationConfig.setUpload(locationSettingModel.collectConfig);
            BDLocationConfig.setPollingUpload(sLocationSettingModel.pollingUpload);
            BDLocationConfig.setUploadInterval(sLocationSettingModel.reportIntervalSeconds * 1000);
            BDLocationConfig.setReportAtStart(sLocationSettingModel.reportAtStart);
            BDLocationConfig.setReportLocationAtStart(sLocationSettingModel.reportLocationAtStart);
            BDLocationConfig.setIsUploadGPS(sLocationSettingModel.reportGps);
            BDLocationConfig.setBssNum(sLocationSettingModel.reportBssMax);
            BDLocationConfig.setWifiNum(sLocationSettingModel.reportWifiMax);
            BDLocationConfig.setShakeConfig(sLocationSettingModel.shakeConfig);
            BDLocationConfig.setEnableTraceroute(sLocationSettingModel.enableTraceroute);
            BDLocationConfig.setLocateType(sLocationSettingModel.locateType);
            BDLocationConfig.setOverseaUploadInterval(sLocationSettingModel.overseasUploadInterval);
            BDLocationConfig.setOverseaUploadMaxCount(sLocationSettingModel.uploadMaxCount);
            BDLocationConfig.setLatlngPrecision(sLocationSettingModel.latlngPrecision);
            BDLocationConfig.setH3Distance(sLocationSettingModel.h3Distance);
            BDLocationConfig.setH3Resolution(sLocationSettingModel.h3Resolution);
            BDLocationConfig.setEnableH3(sLocationSettingModel.enable_h3);
            BDLocationConfig.setLatLngEncrypt(sLocationSettingModel.isLatLngEncrypt);
        }
    }

    public static LocationSettingModel getLocationConfig() {
        return sLocationSettingModel;
    }

    public static void updateSettings(Context context, JSONObject jSONObject) {
        if (context == null || jSONObject == null) {
            return;
        }
        if (jSONObject.has("sdk_key_BDUGLocationKit") && (jSONObject = jSONObject.optJSONObject("sdk_key_BDUGLocationKit")) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateSettings:::");
        LIZ.append(jSONObject.toString());
        Logger.i(X1D.LIZIZ(LIZ));
        sLocationSettingModel = LocationSettingModel.toModel(jSONObject.toString());
        setLocationConfig();
        LocationCache.getInstance().setLocationSettings(context, jSONObject.toString());
    }
}

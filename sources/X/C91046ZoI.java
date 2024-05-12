package X;

import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.store.LocationCache;

/* renamed from: X.ZoI, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final class C91046ZoI {
    public static void LIZIZ() {
        LocationCache locationCache = C91041ZoD.LJFF().LIZ;
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = locationCache.getLongValue("firstUploadTime");
        if (longValue == 0) {
            locationCache.setLongValue("firstUploadTime", currentTimeMillis);
            longValue = currentTimeMillis;
        }
        long longValue2 = locationCache.getLongValue("lastUploadInterval");
        int intValue = locationCache.getIntValue("uploadCount");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadScheduleController--requestUploadLocation:--lastuploadTime:");
        LIZ.append(longValue2);
        LIZ.append("--thisTIme:");
        LIZ.append(currentTimeMillis);
        LIZ.append("-interval:");
        LIZ.append(BDLocationConfig.getOverseaUploadInterval() / 1000);
        Logger.d("BDRegionLocation upload: time", X1D.LIZIZ(LIZ));
        if (currentTimeMillis - longValue > BDLocationConfig.getOverseaUploadMaxDuration()) {
            locationCache.setLongValue("firstUploadTime", currentTimeMillis);
            locationCache.setIntValue("uploadCount", 0);
            intValue = 0;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("---");
        LIZ2.append(intValue);
        LIZ2.append("--MaxuploadCount:");
        LIZ2.append(BDLocationConfig.getOverseaUploadMaxCount());
        Logger.d("BDRegionLocation uploadCount:", X1D.LIZIZ(LIZ2));
        if (intValue >= BDLocationConfig.getOverseaUploadMaxCount()) {
            Logger.d("BDRegionLocation upload: count", "Over max times");
        } else if (currentTimeMillis - longValue2 < BDLocationConfig.getOverseaUploadInterval()) {
            Logger.d("BDRegionLocation upload: time", "Not yet reported time");
        } else if ("1".equals(LocationUtil.allowUseLocation(true))) {
            LocationCache locationCache2 = LocationCache.getInstance();
            locationCache2.setLongValue("lastUploadInterval", System.currentTimeMillis());
            locationCache2.setIntValue("uploadCount", locationCache2.getIntValue("uploadCount") + 1);
            LIZ("bdlocation_boot_upload_location_info", 0, 30000L, BDLocationConfig.getBpeaCert("coldstart_cert"), false);
            return;
        }
        LocationUtil.uploadDeviceStatus("bdlocation_boot_upload_device_info", 0);
    }

    public static void LIZ(String str, int i, long j, Object obj, boolean z) {
        LocationOption locationOption = new LocationOption();
        locationOption.setUploadSource(str);
        locationOption.setMaxCacheTime(0L);
        locationOption.setTriggerType(i);
        locationOption.setUpload(true);
        locationOption.setLocationTimeOutMs(j);
        locationOption.setLocateType(BDLocationConfig.getLocateType());
        locationOption.setBpeaCert(obj);
        locationOption.setBpeaAction("getLocation");
        locationOption.setNeedCache(z);
        if (BDLocationConfig.isOverSeas()) {
            locationOption.setLocateType(0);
            locationOption.setAccuracyLevel(3);
        }
        C91041ZoD.LJFF().LJIILIIL(new C91056ZoS(), locationOption);
    }
}

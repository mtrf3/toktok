package com.byted.cast.common;

import X.C16880lQ;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.bean.DeviceInfo;
import com.byted.cast.common.bean.SinkDeviceInfo;
import com.byted.cast.common.bean.SourceDeviceInfo;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.utils.FIFOMap;
import com.byted.cast.common.utils.GsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes29.dex */
public class DeviceInfoManager {
    public static volatile DeviceInfoManager sInstance;
    public DeviceInfo localDeviceInfo;
    public final ContextManager.CastContext mCastContext;
    public final FIFOMap<String, SourceDeviceInfo> sourceDeviceInfoMap = new FIFOMap<>(5);
    public SinkDeviceInfo tempSinkDeviceInfo;

    public void resetSinkDeviceInfo() {
        this.tempSinkDeviceInfo = null;
    }

    public static DeviceInfoManager getInstance() {
        if (sInstance == null) {
            synchronized (DeviceInfoManager.class) {
                if (sInstance == null) {
                    sInstance = new DeviceInfoManager(null);
                }
            }
        }
        return sInstance;
    }

    public DeviceInfo getLocalDeviceInfo() {
        DeviceInfo deviceInfo = this.localDeviceInfo;
        if (deviceInfo != null && (deviceInfo instanceof SourceDeviceInfo)) {
            TeaEventTrack teaEventTrack = ContextManager.getTeaEventTrack(this.mCastContext);
            DeviceInfo deviceInfo2 = this.localDeviceInfo;
            ((SourceDeviceInfo) deviceInfo2).browseId = teaEventTrack.browseId;
            deviceInfo2.connectId = teaEventTrack.connectId;
        }
        return this.localDeviceInfo;
    }

    public List<SourceDeviceInfo> getSourceDeviceInfo() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, SourceDeviceInfo>> it = this.sourceDeviceInfoMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public SinkDeviceInfo getSinkDeviceInfo() {
        return this.tempSinkDeviceInfo;
    }

    public DeviceInfoManager(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
    }

    public static DeviceInfoManager createInstance(ContextManager.CastContext castContext) {
        if (castContext == null) {
            return getInstance();
        }
        return new DeviceInfoManager(castContext);
    }

    public boolean isSinkDeviceInfoExist(ServiceInfo serviceInfo) {
        if (serviceInfo != null && this.tempSinkDeviceInfo != null) {
            return true;
        }
        return false;
    }

    public void saveSinkDeviceInfo(SinkDeviceInfo sinkDeviceInfo) {
        this.tempSinkDeviceInfo = sinkDeviceInfo;
        TeaEventTrack teaEventTrack = ContextManager.getTeaEventTrack(this.mCastContext);
        TeaEventTrack.DeviceTrackInfo deviceTrackInfo = new TeaEventTrack.DeviceTrackInfo();
        deviceTrackInfo.did = sinkDeviceInfo.deviceId;
        deviceTrackInfo.userId = sinkDeviceInfo.userId;
        deviceTrackInfo.os = sinkDeviceInfo.platform;
        deviceTrackInfo.deviceModel = sinkDeviceInfo.deviceModel;
        deviceTrackInfo.deviceBrand = sinkDeviceInfo.deviceBrand;
        deviceTrackInfo.deviceName = sinkDeviceInfo.name;
        teaEventTrack.setDeviceTrackInfo(deviceTrackInfo);
    }

    public void fillSystemInfo(Context context, DeviceInfo deviceInfo) {
        deviceInfo.platform = "android";
        deviceInfo.osVersion = Build.VERSION.RELEASE;
        deviceInfo.deviceModel = Build.MODEL;
        deviceInfo.deviceBrand = Build.BRAND;
        deviceInfo.supportGetDeviceInfo = true;
        try {
            deviceInfo.appName = (String) context.getPackageManager().getApplicationLabel(C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 0));
            deviceInfo.appVersion = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveLocalSinkDeviceInfo(Context context, SinkDeviceInfo sinkDeviceInfo) {
        fillSystemInfo(context, sinkDeviceInfo);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        sinkDeviceInfo.width = displayMetrics.widthPixels;
        sinkDeviceInfo.height = displayMetrics.heightPixels;
        sinkDeviceInfo.ping = 1;
        sinkDeviceInfo.googleSinkInfo = "Sink Application";
        sinkDeviceInfo.fps = (int) windowManager.getDefaultDisplay().getRefreshRate();
        this.localDeviceInfo = sinkDeviceInfo;
        Logger.i("DeviceInfoManager", sinkDeviceInfo.toString());
    }

    public void saveLocalSourceDeviceInfo(Context context, SourceDeviceInfo sourceDeviceInfo) {
        fillSystemInfo(context, sourceDeviceInfo);
        this.localDeviceInfo = sourceDeviceInfo;
        Logger.i("DeviceInfoManager", sourceDeviceInfo.toString());
    }

    public void saveSourceDeviceInfo(String str, SourceDeviceInfo sourceDeviceInfo) {
        this.sourceDeviceInfoMap.put(str, sourceDeviceInfo);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, SourceDeviceInfo> entry : this.sourceDeviceInfoMap.entrySet()) {
            TeaEventTrack.DeviceTrackInfo deviceTrackInfo = new TeaEventTrack.DeviceTrackInfo();
            deviceTrackInfo.did = entry.getValue().deviceId;
            deviceTrackInfo.userId = entry.getValue().userId;
            deviceTrackInfo.os = entry.getValue().platform;
            deviceTrackInfo.deviceModel = entry.getValue().deviceModel;
            deviceTrackInfo.deviceBrand = entry.getValue().deviceBrand;
            deviceTrackInfo.deviceName = entry.getValue().name;
            arrayList.add(deviceTrackInfo);
        }
        ContextManager.getTeaEventTrack(this.mCastContext).setSourceDeviceTrackInfoListStr(GsonUtils.toJsonIgnoreException(arrayList));
    }
}

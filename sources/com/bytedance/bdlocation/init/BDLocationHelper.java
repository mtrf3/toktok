package com.bytedance.bdlocation.init;

import X.C16880lQ;
import X.C91041ZoD;
import X.X1D;
import Y.IDRunnableS31S0200000_28;
import Y.IDRunnableS8S0101000_28;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.LocationUtil;
import com.bytedance.bdlocation.callback.LocationNotification;
import com.bytedance.bdlocation.callback.RegionUploadCallback;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDPoint;
import com.bytedance.bdlocation.entity.bpea.BDDecryptLocation;
import com.bytedance.bdlocation.entity.gis.BdGisResult;
import com.bytedance.bdlocation.entity.region.RegionBean;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.monitor.LocationMonitorUtil;
import com.bytedance.bdlocation.service.BDLocationExtrasService;
import com.bytedance.bdlocation.settings.LocationSettingUtil;
import org.json.JSONObject;

/* loaded from: classes24.dex */
public class BDLocationHelper {
    public static BDLocationHelper sInstance;
    public volatile boolean sIsRegister;

    public static BDLocationHelper getInstance() {
        if (sInstance == null) {
            synchronized (BDLocationHelper.class) {
                if (sInstance == null) {
                    sInstance = new BDLocationHelper();
                }
            }
        }
        return sInstance;
    }

    private void initRegionData() {
        BDLocationExtrasService.getRegionDataCore().init();
    }

    private void startTraceRouterTask() {
        BDLocationExtrasService.getTraceRouteManager().init();
    }

    public void clearLocationCache() {
        C91041ZoD.LJFF().getClass();
        C91041ZoD.LJFF().LIZ.clearLocalLocationCache();
    }

    public boolean uploadRegionInfo() {
        if (!isInit()) {
            Logger.i("must be init");
            return false;
        }
        return BDLocationExtrasService.getRegionDataCore().uploadRegionInfo();
    }

    public boolean isInit() {
        return this.sIsRegister;
    }

    public static void checkConfiguration(LocationInitConfig locationInitConfig) {
        if (!TextUtils.isEmpty(locationInitConfig.getBaseUrl())) {
            if (locationInitConfig.isPrivacyConfirmed()) {
                return;
            }
            Logger.i("Privacy not Confirmed");
            throw new IllegalStateException("The Privacy must be Confirmed before initialization of SDK");
        }
        Logger.i("base url is empty");
        throw new IllegalStateException("The base url must be configured before initialization of SDK");
    }

    private boolean executeInit(LocationInitConfig locationInitConfig) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init start time:");
        LIZ.append(System.currentTimeMillis());
        Logger.i(X1D.LIZIZ(LIZ));
        Logger.addPrinter(locationInitConfig.getALogPrinter());
        BDLocationConfig.setDebug(locationInitConfig.getDebug());
        BDLocationConfig.setDeviceId(locationInitConfig.getDid());
        BDLocationConfig.setAppId(locationInitConfig.getAppId());
        BDLocationConfig.setChannel(locationInitConfig.getChannel());
        BDLocationConfig.setAppVersion(locationInitConfig.getAppVersion());
        BDLocationConfig.setUpdateVersionCode(locationInitConfig.getUpdateVersionCode());
        BDLocationConfig.setPackageName(locationInitConfig.getPackageName());
        BDLocationConfig.setOverseas(locationInitConfig.isOverseas());
        BDLocationConfig.setOverseaUploadInterval(locationInitConfig.getOverseaUploadInterval());
        BDLocationConfig.setOverseaUploadMaxDuration(locationInitConfig.getOverseaUploadMaxDuration());
        BDLocationConfig.setOverseaUploadMaxCount(locationInitConfig.getOverseaUploadMaxCount());
        BDLocationConfig.setLatlngPrecision(locationInitConfig.getLatlngPrecision());
        BDLocationConfig.setEnableH3(locationInitConfig.isEnableH3());
        BDLocationConfig.setH3Distance(locationInitConfig.getH3Distance());
        BDLocationConfig.setH3Resolution(locationInitConfig.getH3Resolution());
        BDLocationConfig.setLocateType(locationInitConfig.getLocateType());
        BDLocationConfig.setLocale(locationInitConfig.getLocale());
        BDLocationConfig.setWorldView(locationInitConfig.getWorldView());
        BDLocationConfig.setBaseUrl(locationInitConfig.getBaseUrl());
        BDLocationConfig.setAppBackgroundProvider(locationInitConfig.getBackgroundProvider());
        BDLocationConfig.setPrivacyConfirmed(locationInitConfig.isPrivacyConfirmed());
        BDLocationConfig.setNetworkApi(locationInitConfig.getCustomNetworkApi());
        BDLocationConfig.setRestrictedMode(locationInitConfig.getRestrictedMode());
        BDLocationConfig.setEventManager(locationInitConfig.getEventManager());
        BDLocationConfig.setLatLngEncrypt(locationInitConfig.isLatLngEncrypt());
        BDLocationConfig.setNetworkBodyEncrypt(locationInitConfig.isNetworkBodyEncrypt());
        BDLocationConfig.setFinePermission(locationInitConfig.getFinePermission());
        BDLocationConfig.setGPSProvider(locationInitConfig.getGPSProvider());
        BDLocationConfig.setPathPrefix(locationInitConfig.getPathPrefix());
        BDLocationConfig.setBpeaCerts(locationInitConfig.getBpeaCerts());
        BDLocationConfig.setMonitorConfigUrl(locationInitConfig.getMonitorConfigUrl());
        BDLocationConfig.setMonitorReportUrl(locationInitConfig.getMonitorReportUrl());
        BDLocationConfig.setUserRegion(locationInitConfig.getUserRegion());
        BDLocationConfig.setEnableCoarseOpt(locationInitConfig.isEnableCoarseOpt());
        LocationMonitorUtil.init(locationInitConfig.getContext());
        BDLocationConfig.init(locationInitConfig.getContext());
        C91041ZoD.LJFF();
        Logger.i("location init finish");
        startTraceRouterTask();
        initRegionData();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("init finish time:");
        LIZ2.append(System.currentTimeMillis());
        Logger.i(X1D.LIZIZ(LIZ2));
        return true;
    }

    public BDPoint convertGCJ02(BDPoint bDPoint) {
        if (!isInit()) {
            Logger.i("must be init");
            return null;
        }
        C91041ZoD.LJFF().getClass();
        return LocationUtil.convertGCJ02(bDPoint);
    }

    public synchronized BDLocation getLastKnowLocation(Object obj) {
        if (!isInit()) {
            Logger.i("must be init");
            return null;
        }
        return C91041ZoD.LJFF().LJIIIIZZ(obj, true);
    }

    public RegionBean getRegion(boolean z) {
        if (!isInit()) {
            Logger.i("must be init");
            return null;
        }
        return BDLocationExtrasService.getRegionDataCore().getRegion(z);
    }

    public synchronized void init(LocationInitConfig locationInitConfig) {
        if (this.sIsRegister) {
            Logger.i("location already init");
            return;
        }
        try {
            checkConfiguration(locationInitConfig);
            executeInit(locationInitConfig);
            this.sIsRegister = true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init error:");
            LIZ.append(e.toString());
            Logger.i(X1D.LIZIZ(LIZ));
            this.sIsRegister = false;
        }
    }

    public void setBaseUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BDLocationConfig.setBaseUrl(str);
    }

    public void uploadRegionInfoAsync(RegionUploadCallback regionUploadCallback) {
        if (!isInit()) {
            regionUploadCallback.onUpLoadResult(false, null);
            Logger.i("must be init");
        } else {
            BDLocationExtrasService.getRegionDataCore().uploadRegionInfoAsync(regionUploadCallback);
        }
    }

    public static void addNotification(LocationNotification locationNotification, int i) {
        Handler handler = C91041ZoD.LJFF().LIZJ;
        if (handler == null) {
            return;
        }
        handler.post(new IDRunnableS8S0101000_28(locationNotification, i, 0));
    }

    public static void removeNotification(LocationNotification locationNotification, int i) {
        Handler handler = C91041ZoD.LJFF().LIZJ;
        if (handler == null) {
            return;
        }
        handler.post(new IDRunnableS8S0101000_28(locationNotification, i, 1));
    }

    public BDLocation getIPLocation(Object obj, int i) {
        if (!isInit()) {
            Logger.i("must be init");
            return null;
        }
        if (C91041ZoD.LJFF().LIZIZ(obj)) {
            BDLocationExtrasService.getBPEAManager().checkAndTranslateCert(obj, "getIPLocation");
        }
        return LocationUtil.getIPResult(i);
    }

    public synchronized BDLocation getLastKnowLocation(Object obj, Object obj2) {
        if (!isInit()) {
            Logger.i("must be init");
            return null;
        }
        return C91041ZoD.LJFF().LJII(obj, obj2);
    }

    public RegionBean getRegion(boolean z, boolean z2) {
        if (!isInit()) {
            Logger.i("must be init");
            return null;
        }
        return BDLocationExtrasService.getRegionDataCore().getRegion(z, z2);
    }

    public void updateSettings(Context context, JSONObject jSONObject) {
        LocationSettingUtil.updateSettings(context, jSONObject);
    }

    public static void addNotification(LocationNotification locationNotification, Object obj) {
        Handler handler = C91041ZoD.LJFF().LIZJ;
        if (handler == null) {
            return;
        }
        handler.post(new IDRunnableS31S0200000_28(locationNotification, obj, 3));
    }

    public BDLocation getLastKnowLocation(int i, boolean z) {
        if (!isInit()) {
            Logger.i("must be init");
            return null;
        }
        C91041ZoD.LJFF().getClass();
        return C91041ZoD.LJI(i, z, true);
    }

    public BDDecryptLocation decryptLatLng(String str, String str2, Object obj) {
        C91041ZoD LJFF = C91041ZoD.LJFF();
        LJFF.getClass();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && obj != null) {
            try {
                return LJFF.LJI.decryptLocation(str, str2, obj);
            } catch (BDLocationException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return null;
    }

    public BDLocation getLastKnowLocation(Object obj, int i, boolean z) {
        if (!isInit()) {
            Logger.i("must be init");
            return null;
        }
        C91041ZoD LJFF = C91041ZoD.LJFF();
        if (LJFF.LIZIZ(obj)) {
            return LJFF.LJIIIIZZ(obj, z);
        }
        return C91041ZoD.LJI(i, true, z);
    }

    public BdGisResult geocode(double d, double d2, int i, boolean z) {
        if (!isInit()) {
            Logger.i("must be init");
            return null;
        }
        C91041ZoD LJFF = C91041ZoD.LJFF();
        LJFF.getClass();
        C91041ZoD.LIZLLL(z);
        return LJFF.LJ(d, d2, i, null);
    }

    public BdGisResult geocode(double d, double d2, int i, Object obj) {
        if (!isInit()) {
            Logger.i("must be init");
            return null;
        }
        return C91041ZoD.LJFF().LJ(d, d2, i, obj);
    }
}

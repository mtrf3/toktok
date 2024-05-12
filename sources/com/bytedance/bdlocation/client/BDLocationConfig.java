package com.bytedance.bdlocation.client;

import X.C16880lQ;
import X.RunnableC63881P5h;
import X.X1D;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.BDRestrictedMode;
import com.bytedance.bdlocation.callback.LocationNotification;
import com.bytedance.bdlocation.entity.GPSCacheEntity;
import com.bytedance.bdlocation.entity.UploadLogEntity;
import com.bytedance.bdlocation.entity.bpea.BPEACertCheckResult;
import com.bytedance.bdlocation.event.IEventManager;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.network.ICustomNetworkApi;
import com.bytedance.bdlocation.service.BDLocationExtrasService;
import com.bytedance.bdlocation.settings.LocationSettingUtil;
import com.bytedance.bdlocation.store.LocationCache;
import com.bytedance.bdlocation.utils.background.BackgroundProvider;
import com.bytedance.bdlocation.utils.json.JsonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class BDLocationConfig {
    public static boolean isDebug = false;
    public static GPSCacheEntity mGPSCacheEntity = null;
    public static JSONObject mShakeConfig = null;
    public static UploadLogEntity mUploadLogEntity = null;
    public static boolean sAllowFetchConfigAtStart = false;
    public static boolean sAllowLocateFallback = true;
    public static long sBootLegitimateTime = 3000;
    public static Map<String, Object> sBpeaCerts = null;
    public static int sBssNum = 10;
    public static Map<String, String> sCommonParams = null;
    public static Context sContext = null;
    public static Pair<String, String> sEnv = null;
    public static IEventManager sEventManager = null;
    public static String sFinePermission = null;
    public static String sGPSProvider = null;
    public static long sInitStartTime = 0;
    public static boolean sIsPollingUpload = false;
    public static boolean sIsUpload = true;
    public static boolean sIsUploadBaseSite = true;
    public static boolean sIsUploadGPS = true;
    public static boolean sIsUploadLocation = true;
    public static boolean sIsUploadWIFI = true;
    public static long sMaxLocationTimeMs = 300000;
    public static String sMockWifiMac = null;
    public static ICustomNetworkApi sNetworkApi = null;
    public static long sNetworkStatusChangeUploadInterval = 60000;
    public static BackgroundProvider sProvider = null;
    public static boolean sReportAtStart = true;
    public static boolean sReportLocationAtStart = false;
    public static BDRestrictedMode sRestrictedMode = null;
    public static String sSessionId = null;
    public static boolean sShouldRequestLocation = false;
    public static long sUploadInterval = 300000;
    public static boolean sUploadMccAndSystemRegionInfo = true;
    public static int sWifiNum = 30;
    public static String sWorldView;
    public static String userRegion;
    public static Locale sLocale = Locale.getDefault();
    public static boolean sIsChineseChannel = true;
    public static int sLocateType = 3;
    public static String RESTRICTED_LOCK = "RESTRICTED_LOCK";
    public static boolean sIsStrictRestrictedMode = false;
    public static String sBaseUrl = "";
    public static SparseArray<List<LocationNotification>> sNotifications = new SparseArray<>();
    public static boolean isPrivacyConfirmed = false;
    public static boolean sOnline = true;
    public static boolean mOverseas = false;
    public static long mOverseaUploadInterval = 86400;
    public static long mOverseaUploadMaxDuration = 86400;
    public static long mOverseaUploadMaxCount = 1;
    public static int sLatlngPrecision = 2;
    public static int sH3Resolution = 7;
    public static int sH3Distance = 1;
    public static boolean sEnableH3 = true;
    public static boolean sIsMockEnable = false;
    public static boolean sIsMockUpload = true;
    public static boolean mEnableTraceroute = true;
    public static boolean isInit = false;
    public static String sSlardarAid = "306184";
    public static String sDeviceId = "";
    public static String sAppId = "";
    public static String sSdkVersion = "2.8.0-rc.6-ttp.1-bugfix";
    public static String sChannel = "";
    public static String sAppVersion = "";
    public static String sUpdateVersionCode = "";
    public static String sPackageName = "";
    public static String sMonitorConfigUrl = "";
    public static String sMonitorReportUrl = "";
    public static boolean sIsLatLngEncrypt = false;
    public static boolean sIsNetworkBodyEncrypt = true;
    public static String sPathPrefix = "";
    public static boolean enableCoarseOpt = false;

    public static void setUploadWIFI(boolean z) {
    }

    public static void setWifiNum(int i) {
    }

    public static GPSCacheEntity getGPSCacheEntity() {
        if (mGPSCacheEntity == null) {
            try {
                mGPSCacheEntity = (GPSCacheEntity) JsonUtil.sGson.LJI(LocationCache.getInstance().getStringValue("location_upload_gps"), GPSCacheEntity.class);
                LocationCache.getInstance().removeKey("location_upload_gps");
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getGPSCacheEntity exception:");
                LIZ.append(e.toString());
                Logger.i(X1D.LIZIZ(LIZ));
            }
        }
        return mGPSCacheEntity;
    }

    public static String getMockWifiMac() {
        if (sMockWifiMac == null) {
            sMockWifiMac = LocationCache.getInstance().getMockWifiMac();
        }
        return sMockWifiMac;
    }

    public static long getOverseaUploadInterval() {
        return mOverseaUploadInterval * 1000;
    }

    public static long getOverseaUploadMaxDuration() {
        return mOverseaUploadMaxDuration * 1000;
    }

    public static BDRestrictedMode getRestricted() {
        BDRestrictedMode bDRestrictedMode = sRestrictedMode;
        if (bDRestrictedMode == null) {
            return null;
        }
        return bDRestrictedMode;
    }

    public static int getRestrictedMode() {
        BDRestrictedMode bDRestrictedMode = sRestrictedMode;
        if (bDRestrictedMode == null) {
            return 0;
        }
        return bDRestrictedMode.getRestrictedMode();
    }

    public static UploadLogEntity getUploadLogEntity() {
        if (mUploadLogEntity == null) {
            try {
                mUploadLogEntity = (UploadLogEntity) JsonUtil.sGson.LJI(LocationCache.getInstance().getStringValue("location_upload_log"), UploadLogEntity.class);
                LocationCache.getInstance().removeKey("location_upload_log");
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getUploadLogEntity exception:");
                LIZ.append(e.toString());
                Logger.i(X1D.LIZIZ(LIZ));
            }
        }
        return mUploadLogEntity;
    }

    public static boolean isInit() {
        if (sContext != null && isInit) {
            return true;
        }
        return false;
    }

    public static boolean isRestrictedModeOn() {
        BDRestrictedMode bDRestrictedMode = sRestrictedMode;
        if (bDRestrictedMode == null) {
            return false;
        }
        int restrictedMode = bDRestrictedMode.getRestrictedMode();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BDLocationConfig restrictedMode:");
        LIZ.append(restrictedMode);
        Logger.i(X1D.LIZIZ(LIZ));
        if (restrictedMode != 1) {
            return false;
        }
        return true;
    }

    public static boolean checkInit() {
        if (getContext() == null) {
            return false;
        }
        return true;
    }

    public static boolean isBackground() {
        if (getAppBackgroundProvider() == null || getAppBackgroundProvider().isBackground()) {
            return true;
        }
        return false;
    }

    public static boolean enableTraceroute() {
        return mEnableTraceroute;
    }

    public static BackgroundProvider getAppBackgroundProvider() {
        return sProvider;
    }

    public static String getAppId() {
        return sAppId;
    }

    public static String getAppVersion() {
        return sAppVersion;
    }

    public static String getBaseUrl() {
        return sBaseUrl;
    }

    public static long getBootLegitimateTime() {
        return sBootLegitimateTime;
    }

    public static int getBssNum() {
        return sBssNum;
    }

    public static String getChannel() {
        return sChannel;
    }

    public static Map<String, String> getCommonParams() {
        return sCommonParams;
    }

    public static Context getContext() {
        return sContext;
    }

    public static String getDeviceId() {
        return sDeviceId;
    }

    public static Pair getEnv() {
        return sEnv;
    }

    public static IEventManager getEventManager() {
        return sEventManager;
    }

    public static String getFinePermission() {
        return sFinePermission;
    }

    public static String getGPSProvider() {
        return sGPSProvider;
    }

    public static int getH3Distance() {
        return sH3Distance;
    }

    public static int getH3Resolution() {
        return sH3Resolution;
    }

    public static long getInitStartTime() {
        return sInitStartTime;
    }

    public static int getLatlngPrecision() {
        return sLatlngPrecision;
    }

    public static Locale getLocale() {
        return sLocale;
    }

    public static int getLocateType() {
        return sLocateType;
    }

    public static long getMaxLocationTimeMs() {
        return sMaxLocationTimeMs;
    }

    public static String getMonitorConfigUrl() {
        return sMonitorConfigUrl;
    }

    public static String getMonitorReportUrl() {
        return sMonitorReportUrl;
    }

    public static ICustomNetworkApi getNetworkApi() {
        return sNetworkApi;
    }

    public static long getNetworkStatusChangeUploadInterval() {
        return sNetworkStatusChangeUploadInterval;
    }

    public static long getOverseaUploadMaxCount() {
        return mOverseaUploadMaxCount;
    }

    public static String getPackageName() {
        return sPackageName;
    }

    public static String getPathPrefix() {
        return sPathPrefix;
    }

    public static String getSdkVersion() {
        return sSdkVersion;
    }

    public static String getSessionId() {
        return sSessionId;
    }

    public static JSONObject getShakeConfig() {
        return mShakeConfig;
    }

    public static String getSlardarAid() {
        return sSlardarAid;
    }

    public static String getUpdateVersionCode() {
        return sUpdateVersionCode;
    }

    public static long getUploadInterval() {
        return sUploadInterval;
    }

    public static String getUserRegion() {
        return userRegion;
    }

    public static int getWifiNum() {
        return sWifiNum;
    }

    public static String getWorldView() {
        return sWorldView;
    }

    public static boolean isAllowFetchConfigAtStart() {
        return sAllowFetchConfigAtStart;
    }

    public static boolean isAllowLocateFallback() {
        return sAllowLocateFallback;
    }

    public static boolean isChineseChannel() {
        return sIsChineseChannel;
    }

    public static boolean isDebug() {
        return isDebug;
    }

    public static boolean isEnableCoarseOpt() {
        return enableCoarseOpt;
    }

    public static boolean isEnableH3() {
        return sEnableH3;
    }

    public static boolean isLatLngEncrypt() {
        return sIsLatLngEncrypt;
    }

    public static boolean isMockEnable() {
        return sIsMockEnable;
    }

    public static boolean isMockUpload() {
        return sIsMockUpload;
    }

    public static boolean isNetworkBodyEncrypt() {
        return sIsNetworkBodyEncrypt;
    }

    public static boolean isOnline() {
        return sOnline;
    }

    public static boolean isOverSeas() {
        return mOverseas;
    }

    public static boolean isPollingUpload() {
        return sIsPollingUpload;
    }

    public static boolean isPrivacyConfirmed() {
        return isPrivacyConfirmed;
    }

    public static boolean isReportAtStart() {
        return sReportAtStart;
    }

    public static boolean isReportLocationAtStart() {
        return sReportLocationAtStart;
    }

    public static boolean isStrictRestrictedMode() {
        return sIsStrictRestrictedMode;
    }

    public static boolean isUpload() {
        return sIsUpload;
    }

    public static boolean isUploadBaseSite() {
        return sIsUploadBaseSite;
    }

    public static boolean isUploadGPS() {
        return sIsUploadGPS;
    }

    public static boolean isUploadLocation() {
        return sIsUploadLocation;
    }

    public static boolean isUploadMccAndSystemRegionInfo() {
        return sUploadMccAndSystemRegionInfo;
    }

    public static boolean isUploadWIFI() {
        return sIsUploadWIFI;
    }

    public static boolean shouldRequestLocation() {
        return sShouldRequestLocation;
    }

    public static Object getBpeaCert(String str) {
        if (sBpeaCerts == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return sBpeaCerts.get(str);
    }

    public static boolean init(Context context) {
        if (isInit()) {
            return true;
        }
        sInitStartTime = SystemClock.elapsedRealtime();
        sContext = context;
        LocationSettingUtil.setLocationConfig();
        Object bpeaCert = getBpeaCert("init_cert");
        if (bpeaCert != null) {
            try {
                BPEACertCheckResult checkAndTranslateCert = BDLocationExtrasService.getBPEAManager().checkAndTranslateCert(bpeaCert, "init");
                if (checkAndTranslateCert != null && checkAndTranslateCert.getParams() != null) {
                    setConfigParam(checkAndTranslateCert.getParams());
                }
            } catch (BDLocationException e) {
                throw e;
            }
        }
        isInit = true;
        Logger.i("config init finish");
        return true;
    }

    public static void setAllowFetchConfigAtStart(boolean z) {
        sAllowFetchConfigAtStart = z;
    }

    public static void setAllowLocateFallback(boolean z) {
        sAllowLocateFallback = z;
    }

    public static void setAppBackgroundProvider(BackgroundProvider backgroundProvider) {
        BackgroundProvider backgroundProvider2 = sProvider;
        List<BackgroundProvider.Callback> list = null;
        if (backgroundProvider2 != null) {
            List<BackgroundProvider.Callback> callback = backgroundProvider2.getCallback();
            sProvider.setCallback(null);
            list = callback;
        }
        sProvider = backgroundProvider;
        if (list != null && backgroundProvider != null) {
            backgroundProvider.setCallback(list);
        }
    }

    public static void setAppId(String str) {
        sAppId = str;
    }

    public static void setAppVersion(String str) {
        sAppVersion = str;
    }

    public static void setBaseUrl(String str) {
        if (!TextUtils.isEmpty(str) && !str.contains("https")) {
            if (isDebug() || !isOnline()) {
                Logger.e("The current positioning interface is not encrypted with https. The use of plaintext information violates compliance requirements. Please change it to https.");
            } else {
                throw new IllegalArgumentException("The current positioning interface is not encrypted with https. The use of plaintext information violates compliance requirements. Please change it to https.");
            }
        }
        sBaseUrl = str;
    }

    public static void setBootLegitimateTime(long j) {
        sBootLegitimateTime = j;
    }

    public static void setBpeaCerts(Map<String, Object> map) {
        sBpeaCerts = map;
    }

    public static void setBssNum(int i) {
        sBssNum = i;
    }

    public static void setChannel(String str) {
        sChannel = str;
    }

    public static void setChineseChannel(boolean z) {
        sIsChineseChannel = z;
    }

    public static void setCommonParams(Map<String, String> map) {
        sCommonParams = map;
    }

    public static void setConfigParam(JSONObject jSONObject) {
        boolean optBoolean;
        boolean optBoolean2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init config params are ");
        LIZ.append(jSONObject.toString());
        Logger.d("BDLocation", X1D.LIZIZ(LIZ));
        setIsUploadGPS(jSONObject.optBoolean("report_gps", true));
        int optInt = jSONObject.optInt("report_bss_max", 10);
        boolean z = false;
        if (optInt > 0) {
            setUploadBaseSite(true);
            setBssNum(optInt);
        } else {
            setUploadBaseSite(false);
        }
        setReportAtStart(jSONObject.optBoolean("report_at_start", false));
        setReportLocationAtStart(jSONObject.optBoolean("report_location_at_start", false));
        setUpload(jSONObject.optBoolean("is_upload", true));
        setUploadLocation(jSONObject.optBoolean("is_upload_location", true));
        if (isOverSeas()) {
            optBoolean = jSONObject.optBoolean("chinese_channel", false);
            optBoolean2 = jSONObject.optBoolean("location_ropa_encrypt", true);
        } else {
            optBoolean = jSONObject.optBoolean("chinese_channel", true);
            optBoolean2 = jSONObject.optBoolean("location_ropa_encrypt", false);
        }
        setChineseChannel(optBoolean);
        setLatLngEncrypt(optBoolean2);
        int optInt2 = jSONObject.optInt("location_update_interval", 300);
        if (jSONObject.optInt("report_interval_seconds", 300) > 0) {
            setUploadInterval(r0 * 1000);
        } else {
            setUploadInterval(optInt2 * 1000);
        }
        setDebug(jSONObject.optBoolean("debug_able", false));
        setAllowLocateFallback(jSONObject.optBoolean("allow_locate_fallback", true));
        JSONArray optJSONArray = jSONObject.optJSONArray("error_code_list_for_fallback");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(optJSONArray.optInt(i, 0)));
            }
        }
        setAllowFetchConfigAtStart(jSONObject.optBoolean("allow_fetch_config_at_start", true));
        setPollingUpload(jSONObject.optBoolean("polling_upload", true));
        setMaxLocationTimeMs(jSONObject.optLong("max_location_time_ms", LivePreviewNetworkSpeedThresholdSetting.DEFAULT));
        setLocateType(jSONObject.optInt("locate_type", 3));
        setEnableTraceroute(jSONObject.optBoolean("enable_traceroute", true));
        setOverseaUploadInterval(jSONObject.optLong("overseas_upload_interval", 86400L));
        setOverseaUploadMaxCount(jSONObject.optInt("upload_max_count", 1));
        setLatlngPrecision(jSONObject.optInt("latlng_precision", 2));
        if (jSONObject.optInt("enable_h3", 1) == 1) {
            z = true;
        }
        setEnableH3(z);
        setH3Resolution(jSONObject.optInt("h3_resolution", 7));
        setH3Distance(jSONObject.optInt("h3_distance", 1));
    }

    public static void setContext(Context context) {
        sContext = context;
    }

    public static void setDebug(boolean z) {
        isDebug = z;
    }

    public static void setDeviceId(String str) {
        sDeviceId = str;
    }

    public static void setEnableCoarseOpt(boolean z) {
        enableCoarseOpt = z;
    }

    public static void setEnableH3(boolean z) {
        sEnableH3 = z;
    }

    public static void setEnableTraceroute(boolean z) {
        mEnableTraceroute = z;
    }

    public static void setEnv(Pair<String, String> pair) {
        sEnv = pair;
    }

    public static void setEventManager(IEventManager iEventManager) {
        sEventManager = iEventManager;
    }

    public static void setFinePermission(String str) {
        sFinePermission = str;
    }

    public static void setGPSCacheEntity(GPSCacheEntity gPSCacheEntity) {
        mGPSCacheEntity = gPSCacheEntity;
    }

    public static void setGPSProvider(String str) {
        sGPSProvider = str;
    }

    public static void setH3Distance(int i) {
        if (i < 1) {
            return;
        }
        sH3Distance = i;
    }

    public static void setH3Resolution(int i) {
        if (i < 0 || i > 15) {
            return;
        }
        sH3Resolution = i;
    }

    public static void setIsUploadGPS(boolean z) {
        sIsUploadGPS = z;
    }

    public static void setLatLngEncrypt(boolean z) {
        sIsLatLngEncrypt = z;
    }

    public static void setLatlngPrecision(int i) {
        sLatlngPrecision = i;
    }

    public static void setLocale(Locale locale) {
        sLocale = locale;
    }

    public static void setLocateType(int i) {
        sLocateType = i;
    }

    public static void setMaxLocationTimeMs(long j) {
        sMaxLocationTimeMs = j;
    }

    public static void setMockEnable(boolean z) {
        sIsMockEnable = z;
    }

    public static void setMockUpload(boolean z) {
        sIsMockUpload = z;
    }

    public static void setMockWifiMac(String str) {
        sMockWifiMac = str;
        LocationCache.getInstance().setMockWifiMac(str);
    }

    public static void setMonitorConfigUrl(String str) {
        sMonitorConfigUrl = str;
    }

    public static void setMonitorReportUrl(String str) {
        sMonitorReportUrl = str;
    }

    public static void setNetworkApi(ICustomNetworkApi iCustomNetworkApi) {
        sNetworkApi = iCustomNetworkApi;
    }

    public static void setNetworkBodyEncrypt(boolean z) {
        sIsNetworkBodyEncrypt = z;
    }

    public static void setNetworkStatusChangeUploadInterval(long j) {
        sNetworkStatusChangeUploadInterval = sNetworkStatusChangeUploadInterval;
    }

    public static void setOnline(boolean z) {
        sOnline = z;
    }

    public static void setOverseaUploadInterval(long j) {
        mOverseaUploadInterval = j;
    }

    public static void setOverseaUploadMaxCount(long j) {
        mOverseaUploadMaxCount = j;
    }

    public static void setOverseaUploadMaxDuration(long j) {
        mOverseaUploadMaxDuration = j;
    }

    public static void setOverseas(boolean z) {
        mOverseas = z;
    }

    public static void setPackageName(String str) {
        sPackageName = str;
    }

    public static void setPathPrefix(String str) {
        sPathPrefix = str;
    }

    public static void setPollingUpload(boolean z) {
        sIsPollingUpload = z;
    }

    public static void setPrivacyConfirmed(boolean z) {
        isPrivacyConfirmed = z;
    }

    public static void setReportAtStart(boolean z) {
        sReportAtStart = z;
    }

    public static void setReportLocationAtStart(boolean z) {
        sReportLocationAtStart = z;
    }

    public static void setRequestLocation(boolean z) {
        sShouldRequestLocation = z;
    }

    public static void setRestrictedMode(BDRestrictedMode bDRestrictedMode) {
        sRestrictedMode = bDRestrictedMode;
    }

    public static void setSdkVersion(String str) {
        sSdkVersion = str;
    }

    public static void setSessionId(String str) {
        sSessionId = str;
    }

    public static void setShakeConfig(JSONObject jSONObject) {
        mShakeConfig = jSONObject;
    }

    public static void setSlardarAid(String str) {
        sSlardarAid = str;
    }

    public static void setStrictRestrictedMode(boolean z) {
        sIsStrictRestrictedMode = z;
    }

    public static void setUpdateVersionCode(String str) {
        sUpdateVersionCode = str;
    }

    public static void setUpload(boolean z) {
        sIsUpload = z;
    }

    public static void setUploadBaseSite(boolean z) {
        sIsUploadBaseSite = z;
    }

    public static void setUploadInterval(long j) {
        sUploadInterval = j;
    }

    public static void setUploadLocation(boolean z) {
        sIsUploadLocation = z;
    }

    public static void setUploadLogEntity(UploadLogEntity uploadLogEntity) {
        mUploadLogEntity = uploadLogEntity;
    }

    public static void setUploadMccAndSystemRegionInfo(boolean z) {
        sUploadMccAndSystemRegionInfo = z;
    }

    public static void setUserRegion(String str) {
        userRegion = str;
    }

    public static void setWorldView(String str) {
        sWorldView = str;
    }

    public static List<LocationNotification> switchNotification(int i) {
        List<LocationNotification> list = sNotifications.get(i);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            sNotifications.put(i, arrayList);
            return arrayList;
        }
        return list;
    }

    public static void addNotification(LocationNotification locationNotification, Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            synchronized (RESTRICTED_LOCK) {
                int i = 0;
                if (obj != null) {
                    BPEACertCheckResult checkAndTranslateCert = BDLocationExtrasService.getBPEAManager().checkAndTranslateCert(obj, "addNotification");
                    if (checkAndTranslateCert != null && checkAndTranslateCert.getParams() != null) {
                        i = checkAndTranslateCert.getParams().optInt("range", 0);
                    }
                }
                switchNotification(i).add(locationNotification);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addNotification interval:");
            LIZ.append(System.currentTimeMillis() - currentTimeMillis);
            Logger.i(X1D.LIZIZ(LIZ));
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("addNotification change error:");
            LIZ2.append(e.getMessage());
            Logger.d(X1D.LIZIZ(LIZ2));
        }
    }

    public static /* synthetic */ void lambda$notificationLocationChange$0(int i, BDLocation bDLocation) {
        synchronized (RESTRICTED_LOCK) {
            while (i < 5) {
                List<LocationNotification> list = sNotifications.get(i);
                if (list != null) {
                    Iterator<LocationNotification> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().onLocationChanged(bDLocation);
                    }
                }
                i++;
            }
        }
    }

    public static void notificationLocationChange(int i, BDLocation bDLocation) {
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        bDLocation2.setLongitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        bDLocation2.setLatitude(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        if (bDLocation2.getLocationResult() != null) {
            bDLocation2.getLocationResult().gps = null;
        }
        new Handler(C16880lQ.LLJJJJ()).post(new RunnableC63881P5h(i, bDLocation2));
    }

    public static void removeNotification(LocationNotification locationNotification, int i) {
        synchronized (RESTRICTED_LOCK) {
            switchNotification(i).remove(locationNotification);
        }
    }

    public static void addNotification(LocationNotification locationNotification, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (RESTRICTED_LOCK) {
            switchNotification(i).add(locationNotification);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addNotification interval:");
        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
        Logger.i(X1D.LIZIZ(LIZ));
    }
}

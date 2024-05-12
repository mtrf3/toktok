package com.ss.android.common.applog;

import X.AV1;
import X.AbstractC36814Ecc;
import X.AbstractC66846QLi;
import X.C03880Dg;
import X.C16880lQ;
import X.C1DF;
import X.C2NU;
import X.C36616EYq;
import X.C36922EeM;
import X.C38354F3m;
import X.C3PG;
import X.C51643KOp;
import X.C58323Mul;
import X.C59163NJv;
import X.C62814Ol0;
import X.C65300Pk0;
import X.C66763QId;
import X.C66838QLa;
import X.C66840QLc;
import X.C66842QLe;
import X.E18;
import X.EF7;
import X.F7B;
import X.F9J;
import X.HandlerThreadC36423ERf;
import X.InterfaceC1294656g;
import X.InterfaceC39244Fai;
import X.InterfaceC66739QHf;
import X.InterfaceC66755QHv;
import X.InterfaceC66783QIx;
import X.InterfaceC66829QKr;
import X.InterfaceC66830QKs;
import X.InterfaceC66832QKu;
import X.InterfaceC66839QLb;
import X.N3D;
import X.N3H;
import X.PCI;
import X.POA;
import X.PPC;
import X.PPD;
import X.PY7;
import X.QHL;
import X.QI8;
import X.QIL;
import X.QIU;
import X.QIV;
import X.QJ5;
import X.QJG;
import X.QJH;
import X.QJL;
import X.QJN;
import X.QJY;
import X.QJZ;
import X.QK9;
import X.QKG;
import X.QKO;
import X.QL6;
import X.QL7;
import X.QL8;
import X.QLA;
import X.QLD;
import X.QLF;
import X.QLI;
import X.QLJ;
import X.QLK;
import X.QLN;
import X.QLP;
import X.QLQ;
import X.QLT;
import X.QLW;
import X.QLZ;
import X.QO4;
import X.V1B;
import Y.ARunnableS18S0000000_11;
import Y.ARunnableS47S0100000_11;
import Y.ARunnableS7S1100100_11;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.applog.IBDAccountCallback;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.legoImp.task.InitModules;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AppLog {
    public static volatile boolean isMainProcess = true;
    public static volatile InterfaceC66739QHf logCompressor = null;
    public static volatile boolean mCollectFreeSpace = false;
    public static boolean mHasHandledCache = false;
    public static volatile long mLastGetAppConfigTime = 0;
    public static int mLaunchFrom = 0;
    public static volatile String sAbSDKVersion = null;
    public static volatile boolean sAbortPackMiscIfException = false;
    public static boolean sActiveOnce = false;
    public static volatile boolean sAdjustTerminate = false;
    public static boolean sAnonymous = false;
    public static InterfaceC66783QIx sAppContext = null;
    public static long sBatchEventInterval = 0;
    public static volatile boolean sChildMode = false;
    public static final SimpleDateFormat sCompatDateTimeFormat;
    public static volatile long sConfigStartTime = 0;
    public static WeakReference<QJG> sConfigUpdateListener = null;
    public static final SimpleDateFormat sDateCompatFormat;
    public static final SimpleDateFormat sDateFormat;
    public static final SimpleDateFormat sDateTimeFormat;
    public static volatile Integer sDisablePersonalization = null;
    public static volatile boolean sEnableEventInTouristMode = true;
    public static volatile boolean sEnableEventSampling = false;
    public static volatile boolean sEnableEventUserId = false;
    public static volatile boolean sEnableKeepUserId = false;
    public static volatile boolean sEnableListenNetChange = false;
    public static volatile AbstractC36814Ecc sEventFilter = null;
    public static volatile int sEventFilterEnable = 0;
    public static volatile AbstractC36814Ecc sEventFilterFromClient = null;
    public static volatile N3D sEventSampling = null;
    public static volatile boolean sExtendCursorWindowIfOverflow = false;
    public static long sFetchActiveTime = 0;
    public static volatile boolean sFixSessionLost = false;
    public static volatile InterfaceC66829QKr sGlobalEventCallback = null;
    public static volatile boolean sHasLoadDid = false;
    public static volatile IBDAccountCallback sIBDAccountCallback = null;
    public static volatile InterfaceC1294656g sIHeaderCustomTimelyCallback = null;
    public static volatile boolean sInitGuard = false;
    public static volatile AppLog sInstance = null;
    public static volatile boolean sInterceptAppLog = false;
    public static volatile boolean sInterceptLogSetting = false;
    public static final ThreadLocal<Boolean> sIsConfigThread;
    public static volatile boolean sIsTouristMode = false;
    public static String sLastCreateActivityName = null;
    public static String sLastCreateActivityNameAndTime = null;
    public static String sLastResumeActivityName = null;
    public static String sLastResumeActivityNameAndTime = null;
    public static final Object sLogConfigLock;
    public static QJH sLogEncryptCfg = null;
    public static volatile long sLogExpireTime = 432000000;
    public static volatile int sLogRetryMaxCount = 10;
    public static volatile boolean sPendingActiveUser = false;
    public static volatile E18 sSendLogCallback = null;
    public static long sStartLogReaperDelay = 0;
    public static volatile int sSwitchToBdtracker = -1;
    public static boolean sTerminateImmediately = false;
    public static volatile InterfaceC66755QHv sUserIdIsolateCallback = null;
    public static volatile boolean sUserIdIsolateEnabled = false;
    public static String sUserUniqueId = null;
    public static long sWaitDid = -1;
    public static volatile String tempAbSDKVersion;
    public static C66763QId urlConfig;
    public QLZ mActivityRecord;
    public final Context mContext;
    public boolean mForbidReportPhoneDetailInfo;
    public boolean mHasUpdateConfig;
    public final JSONObject mHeader;
    public volatile boolean mInitOk;
    public int mLastConfigVersion;
    public final F7B mNetWorkMonitor;
    public QLP mSession;
    public volatile long mStartWaitSendTimely;
    public static QLA sAppLogApi = new QL8();
    public static boolean sMiPushInclude = true;
    public static boolean sMyPushInclude = true;
    public static boolean sHwPushInclude = true;
    public static boolean sMzPushInclude = true;
    public static boolean sAliyunPushInclude = true;
    public static boolean sHasManualInvokeActiveUser = false;
    public static final String[] BASE_HEADER_KEYS = {"appkey", "openudid", "sdk_version", "package", "channel", "display_name", "app_version", "version_code", "timezone", "access", "os", "os_version", "os_api", "device_model", "device_brand", "device_manufacturer", "language", "resolution", "display_density", "density_dpi", "carrier", "mcc_mnc", "clientudid", "install_id", "device_id", "sig_hash", "aid", "push_sdk", "rom", "release_build", "update_version_code", "manifest_version_code", "app_version_minor", "cpu_abi", "app_track", "not_request_sender", "rom_version", "region", "tz_name", "tz_offset", "sim_region", "custom", "google_aid", "app_language", "app_region", "device_category", "ab_sdk_version", "user_unique_id", "platform", "harmony_os_api", "harmony_os_version", "harmony_release_type", "cdid", "sys_region", "carrier_region", "timezone_offset", "timezone_name"};
    public static final Object sLock = new Object();
    public static volatile boolean sStopped = false;
    public static AtomicLong sUserId = new AtomicLong();
    public static volatile long sUidFromResp = 0;
    public static volatile int sUserTypeFromResp = 0;
    public static volatile int sUserIsLoginFromResp = 0;
    public static volatile int sUserIsAuthFromResp = 0;
    public static String sSessionKey = "";
    public static final List<QJ5> sSessionHookList = new ArrayList(2);
    public static String sRomInfo = null;
    public static volatile JSONObject sHeaderCopy = null;
    public static boolean sInitWithActivity = false;
    public static int sAppCount = 0;
    public static final ConcurrentHashMap<String, String> sLogHttpHeader = new ConcurrentHashMap<>();
    public static final Bundle sCustomBundle = new Bundle();
    public int mVersionCode = 1;
    public final LinkedList<QLQ> mQueue = new LinkedList<>();
    public final LinkedList<AbstractC66846QLi> mLogQueue = new LinkedList<>();
    public volatile QL7 mLogReaper = null;
    public long mActivityTime = 0;
    public boolean mSetupOk = false;
    public boolean mHasSetup = false;
    public boolean mHasTryResendConfig = false;
    public final HashSet<Integer> mAllowPushSet = new HashSet<>();
    public String mAllowPushListJsonStr = "";
    public volatile boolean mAllowOldImageSample = false;
    public final AtomicBoolean mStopFlag = new AtomicBoolean();
    public long mSessionInterval = 30000;
    public long mBatchEventInterval = 60000;
    public volatile long mLogSettingInterval = 21600000;
    public int mSendLaunchTimely = 1;
    public int mHttpMonitorPort = 0;
    public JSONObject mTimeSync = null;
    public AtomicInteger mImageSuccessCount = new AtomicInteger();
    public AtomicInteger mImageFailureCount = new AtomicInteger();
    public LinkedList<QLW> mSamples = new LinkedList<>();
    public long mHeartbeatTime = System.currentTimeMillis();
    public volatile long mUpdateConfigTime = 0;
    public volatile long mTryUpdateConfigTime = 0;
    public volatile boolean mLoadingOnlineConfig = false;
    public final ConcurrentHashMap<String, String> mBlockV1 = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> mBlockV3 = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> mEventTimely = new ConcurrentHashMap<>();
    public final AtomicLong mGlobalEventIndexMatrix = new AtomicLong();
    public final AtomicLong mGlobalEventIndexMatrixV1 = new AtomicLong();

    public static boolean checkValidInterval(long j) {
        return j >= 10000 && j <= LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
    }

    public static InterfaceC66832QKu getBDInstallInitHook() {
        return null;
    }

    public static String getInstallId() {
        return com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
    }

    public static String getServerDeviceId() {
        return com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(context, str, str2, str3, j, j2, z, jSONObject);
    }

    public static void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_recordMiscLog(context, str, jSONObject);
    }

    public synchronized void ensureHeaderCopy() {
        try {
            sHeaderCopy = new JSONObject(this.mHeader, QJL.LIZ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public boolean setupLogReaper() {
        boolean z;
        try {
            try {
                Context context = this.mContext;
                boolean z2 = this.mForbidReportPhoneDetailInfo;
                C66838QLa c66838QLa = new C66838QLa();
                boolean z3 = sAnonymous;
                boolean z4 = sInitWithActivity;
                boolean z5 = sChildMode;
                if (!sHasManualInvokeActiveUser) {
                    z = true;
                } else {
                    z = false;
                }
                DeviceRegisterManager.setForbidReportPhoneDetailInfo(z2);
                DeviceRegisterManager.setILogDepend(c66838QLa);
                DeviceRegisterManager.setAnonymous(z3);
                DeviceRegisterManager.setInitWithActivity(z4);
                DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_init(context, z5, z);
                C62814Ol0.LJLILLLLZI = true;
            } catch (Exception e) {
                if (e instanceof SQLiteException) {
                    QIV.LIZ(QIU.database, QIL.f_exception);
                }
                QHL.LIZIZ("failed to start LogReaper", e);
                return false;
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
            if (Logger.debug()) {
                throw e2;
            }
        }
        this.mInitOk = initHeader(this.mHeader, this.mContext);
        QL6 LIZLLL = QL6.LIZLLL(this.mContext);
        QLP LJFF = LIZLLL.LJFF(0L);
        this.mSession = LJFF;
        loadStats(LJFF);
        notifyConfigUpdate();
        if (this.mSession != null) {
            C66840QLc c66840QLc = new C66840QLc();
            c66840QLc.LIZ = this.mSession.LIZ;
            enqueue(c66840QLc);
        }
        try {
            Bundle bundle = new Bundle();
            Bundle bundle2 = sCustomBundle;
            synchronized (bundle2) {
                bundle.putAll(bundle2);
            }
            if (bundle.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, C16880lQ.LLJJIII(bundle, str));
                }
                this.mHeader.put("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
        this.mLogReaper = new QL7(this.mContext, new JSONObject(this.mHeader, QJL.LIZ), this.mLogQueue, this.mStopFlag, sSessionHookList, this.mSession, this.mBlockV1, this.mBlockV3);
        QL7 ql7 = this.mLogReaper;
        long j = this.mBatchEventInterval;
        ql7.LJLLILLLL = j;
        ql7.LJLLI.set(j);
        this.mLogReaper.LJLLJ = this.mSendLaunchTimely;
        if (sStartLogReaperDelay > 0) {
            HandlerThreadC36423ERf LIZJ = HandlerThreadC36423ERf.LIZJ();
            LIZJ.LIZLLL().postDelayed(new ARunnableS47S0100000_11(this, 34), sStartLogReaperDelay);
        } else {
            this.mLogReaper.start();
        }
        if (sEventFilterEnable > 0) {
            if (this.mLastConfigVersion == this.mVersionCode) {
                sEventFilter = AbstractC36814Ecc.LIZLLL(this.mContext);
            } else {
                this.mUpdateConfigTime = 0L;
                sEventFilter = AbstractC36814Ecc.LJ(this.mContext, null);
            }
        }
        File databasePath = LIZLLL.LIZIZ.getDatabasePath("ss_app_log.db");
        if (databasePath != null) {
            QIV.LJ(QIU.database, QIL.init, databasePath.length());
        }
        return true;
    }

    static {
        Locale locale = Locale.US;
        sDateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Z"));
        sCompatDateTimeFormat = simpleDateFormat;
        sDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", locale);
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("Z"));
        sDateCompatFormat = simpleDateFormat2;
        sLogConfigLock = new Object();
        sIsConfigThread = new ThreadLocal<>();
        sConfigUpdateListener = null;
        sHasLoadDid = false;
        sPendingActiveUser = false;
        sFetchActiveTime = 0L;
        sBatchEventInterval = -1L;
        sInterceptLogSetting = false;
        sInterceptAppLog = false;
        sEnableEventUserId = false;
        sEnableKeepUserId = false;
    }

    public static String[] ACTIVE_USER_URL() {
        return urlConfig.LIZLLL;
    }

    public static String APPLOG_CONFIG_URL() {
        return urlConfig.LIZIZ;
    }

    public static String APPLOG_CONFIG_URL_FALLBACK() {
        return urlConfig.LJI;
    }

    public static String[] APPLOG_TIMELY_URL() {
        return urlConfig.LIZJ;
    }

    public static String[] APPLOG_URL() {
        return urlConfig.LIZ;
    }

    public static void addAppCount() {
        sAppLogApi.LJJJJJL();
    }

    public static String com_ss_android_common_applog_AppLog__getInstallId$___twin___() {
        return sAppLogApi.LIZJ();
    }

    public static String com_ss_android_common_applog_AppLog__getServerDeviceId$___twin___() {
        return sAppLogApi.getServerDeviceId();
    }

    public static String com_ss_android_common_applog_AppLog__getUserId$___twin___() {
        return sAppLogApi.getUserId();
    }

    public static String com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId() {
        if (!C51643KOp.LIZJ) {
            return F9J.LIZIZ(EF7.LIZIZ(), 0, "applog_stats").getString("install_id", "");
        }
        return com_ss_android_common_applog_AppLog__getInstallId$___twin___();
    }

    public static String com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId() {
        if (!C51643KOp.LIZJ) {
            return F9J.LIZIZ(EF7.LIZIZ(), 0, "applog_stats").getString("device_id", "");
        }
        return com_ss_android_common_applog_AppLog__getServerDeviceId$___twin___();
    }

    public static void flush() {
        sAppLogApi.flush();
    }

    private void forceFlushEvent() {
        if (this.mSession != null) {
            QLT qlt = new QLT();
            qlt.LIZ = this.mSession;
            qlt.LJ = true;
            enqueue(qlt);
        }
    }

    public static long genEventIndex() {
        AppLog appLog = sInstance;
        if (appLog != null) {
            return appLog.mGlobalEventIndexMatrix.getAndIncrement();
        }
        return -1L;
    }

    public static String getAbSDKVersion() {
        return sAppLogApi.LJIIIZ();
    }

    public static String getAppVersionMinor() {
        return sAppLogApi.LJJJI();
    }

    public static String getClientId() {
        return sAppLogApi.LJJIFFI();
    }

    public static String getCurrentSessionId() {
        return sAppLogApi.LIZLLL();
    }

    public static int getEncodeType() {
        return sAppLogApi.LJJJJLI();
    }

    public static boolean getEventV3Switch() {
        QJH qjh = sLogEncryptCfg;
        if (qjh != null) {
            qjh.LIZIZ();
            return true;
        }
        return true;
    }

    public static JSONObject getHeaderCopy() {
        return sAppLogApi.LJJIJ();
    }

    public static int getHttpMonitorPort() {
        return sAppLogApi.LJJIIJZLJL();
    }

    public static InterfaceC1294656g getIHeaderCustomTimelyCallback() {
        return sAppLogApi.LJJIJL();
    }

    public static long getLastActiveTime() {
        return sAppLogApi.LJJIZ();
    }

    public static InterfaceC66739QHf getLogCompressor() {
        return sAppLogApi.LJIIJJI();
    }

    public static boolean getLogEncryptSwitch() {
        QJH qjh = sLogEncryptCfg;
        if (qjh != null) {
            return qjh.LIZ();
        }
        return true;
    }

    public static boolean getLogRecoverySwitch() {
        QJH qjh = sLogEncryptCfg;
        if (qjh != null) {
            return qjh.LIZJ();
        }
        return true;
    }

    public static String getSessionKey() {
        return sAppLogApi.getSessionKey();
    }

    public static boolean getSwitchToBdtracker() {
        if (sSwitchToBdtracker > 0) {
            return true;
        }
        return false;
    }

    public static String getUserUniqueId() {
        return sAppLogApi.LJJIJIL();
    }

    public static boolean isEnableNetCommOpt() {
        return sAppLogApi.LJJIJLIJ();
    }

    private void loadGlobalEventIndex() {
        this.mGlobalEventIndexMatrix.set(0L);
        this.mGlobalEventIndexMatrixV1.set(0L);
    }

    public static void resetEventIndex() {
        AppLog appLog = sInstance;
        if (appLog != null) {
            appLog.mGlobalEventIndexMatrix.set(0L);
            appLog.mGlobalEventIndexMatrixV1.set(0L);
        }
    }

    public N3H buildSamplingUser() {
        N3H n3h = new N3H(String.valueOf(DeviceRegisterManager.getAppId()), getServerDeviceId(), getUserUniqueId());
        IBDAccountCallback iBDAccountCallback = sIBDAccountCallback;
        if (iBDAccountCallback != null) {
            Pair<Integer, Long> odinUserInfo = iBDAccountCallback.getOdinUserInfo();
            if (((Long) odinUserInfo.second).longValue() > 0) {
                n3h.LIZJ = String.valueOf(odinUserInfo.second);
                n3h.LIZLLL = String.valueOf(odinUserInfo.first);
            } else if (sUserIsLoginFromResp == 0) {
                n3h.LIZJ = String.valueOf(sUidFromResp);
                n3h.LIZLLL = String.valueOf(sUserTypeFromResp);
            }
        } else {
            n3h.LIZJ = String.valueOf(sUserId.get());
        }
        return n3h;
    }

    public void checkSessionEnd() {
        QLP qlp = this.mSession;
        if (qlp == null || qlp.LJII) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        QLP qlp2 = this.mSession;
        if (qlp2.LJIIIZ || currentTimeMillis - qlp2.LJI < getTerminateSessionInterval()) {
            return;
        }
        QLP qlp3 = this.mSession;
        onSessionEnd();
        this.mSession = null;
        QLT qlt = new QLT();
        qlt.LIZ = qlp3;
        enqueue(qlt);
    }

    public long doGetLastActivteTime() {
        if (this.mActivityRecord != null) {
            return System.currentTimeMillis();
        }
        return this.mActivityTime;
    }

    public long getTerminateSessionInterval() {
        if (sTerminateImmediately) {
            return 500L;
        }
        return this.mSessionInterval;
    }

    public JSONObject getTimeSync() {
        return sAppLogApi.LJJIIJ();
    }

    public void loadSSIDs() {
        try {
            InterfaceC66783QIx interfaceC66783QIx = sAppContext;
            if (interfaceC66783QIx != null) {
                this.mVersionCode = interfaceC66783QIx.getVersionCode();
            }
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences LIZIZ = F9J.LIZIZ(this.mContext, 0, "applog_stats");
            int i = LIZIZ.getInt("app_log_last_config_version", 0);
            this.mLastConfigVersion = i;
            if (i == this.mVersionCode) {
                long j = LIZIZ.getLong("app_log_last_config_time", 0L);
                if (j <= currentTimeMillis) {
                    currentTimeMillis = j;
                }
                this.mUpdateConfigTime = currentTimeMillis;
            }
            try {
                String string = LIZIZ.getString("allow_push_list", null);
                this.mAllowPushListJsonStr = string;
                if (string != null) {
                    synchronized (sLock) {
                        parseIntSet(this.mAllowPushSet, new JSONArray(string));
                    }
                }
            } catch (Exception unused) {
            }
            this.mAllowOldImageSample = LIZIZ.getBoolean("allow_old_image_sample", false);
            String string2 = LIZIZ.getString("real_time_events", null);
            if (!C38354F3m.LJ(string2)) {
                JSONArray jSONArray = new JSONArray(string2);
                if (jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string3 = JSONArrayProtectorUtils.getString(jSONArray, i2);
                        if (!C38354F3m.LJ(string3)) {
                            this.mEventTimely.put(string3, "timely");
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public void notifyConfigUpdate() {
        QJG qjg;
        WeakReference<QJG> weakReference = sConfigUpdateListener;
        if (weakReference != null && (qjg = weakReference.get()) != null) {
            try {
                qjg.LIZ();
            } catch (Exception unused) {
            }
        }
    }

    public void onSessionEnd() {
        QLP qlp = this.mSession;
        if (qlp == null) {
            return;
        }
        QL6 LIZLLL = QL6.LIZLLL(this.mContext);
        int i = 0;
        int andSet = this.mImageSuccessCount.getAndSet(0);
        int andSet2 = this.mImageFailureCount.getAndSet(0);
        if (qlp.LIZ > 0) {
            if (andSet > 0 || andSet2 > 0) {
                QLJ qlj = new QLJ();
                qlj.LIZ = "image";
                qlj.LIZIZ = "stats";
                qlj.LIZLLL = andSet;
                qlj.LJ = andSet2;
                qlj.LJIIJJI = qlp.LJI;
                qlj.LJIIL = qlp.LIZ;
                LIZLLL.LJI(qlj);
            }
            if (!this.mAllowOldImageSample) {
                this.mSamples.clear();
            }
            Iterator<QLW> it = this.mSamples.iterator();
            while (it.hasNext()) {
                QLW next = it.next();
                QLJ qlj2 = new QLJ();
                qlj2.LIZ = "image";
                qlj2.LIZIZ = "sample";
                qlj2.LIZJ = next.LIZ;
                qlj2.LIZLLL = next.LIZIZ;
                qlj2.LJ = next.LIZJ;
                qlj2.LJIIJJI = next.LIZLLL;
                qlj2.LJIIL = qlp.LIZ;
                LIZLLL.LJI(qlj2);
                i++;
                if (i >= 5) {
                    break;
                }
            }
        }
        this.mSamples.clear();
    }

    public static String com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId() {
        InitModules.LIZLLL();
        return com_ss_android_common_applog_AppLog__getUserId$___twin___();
    }

    public static String genSession() {
        return UUID.randomUUID().toString();
    }

    public void sendHeartbeat() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.mHeartbeatTime > 60000) {
            this.mHeartbeatTime = currentTimeMillis;
            synchronized (this.mLogQueue) {
                this.mLogQueue.notify();
            }
        }
    }

    public static boolean getAbortPackMiscIfException() {
        return sAbortPackMiscIfException;
    }

    public static boolean getAdjustTerminate() {
        return sAdjustTerminate;
    }

    public static SimpleDateFormat getDateFormat() {
        return sDateCompatFormat;
    }

    public static boolean getEnableEventUserId() {
        return sEnableEventUserId;
    }

    public static boolean getExtendCursorWindowIfOverflow() {
        return sExtendCursorWindowIfOverflow;
    }

    public static Map<String, String> getLogHttpHeader() {
        return sLogHttpHeader;
    }

    public static long getWaitDid() {
        return sWaitDid;
    }

    public static boolean isEnableEventInTouristMode() {
        return sEnableEventInTouristMode;
    }

    public static boolean isEnableEventSampling() {
        return sEnableEventSampling;
    }

    public static boolean isEnableListenNetChange() {
        return sEnableListenNetChange;
    }

    public static boolean isFixSessionLost() {
        return sFixSessionLost;
    }

    public static boolean isTouristMode() {
        return sIsTouristMode;
    }

    public AppLog(Context context) {
        DeviceRegisterManager.setSDKVersion("2.14.0");
        Context LLLLL = C16880lQ.LLLLL(context);
        this.mContext = LLLLL;
        DeviceRegisterManager.setContext(LLLLL);
        this.mHeader = new JSONObject();
        initDataFromSp(context);
        this.mInitOk = true;
        new QLD(this).start();
        this.mNetWorkMonitor = new F7B(LLLLL);
    }

    public static boolean INVOKESTATIC_com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void activeUser(Context context) {
        sAppLogApi.LJI(context);
    }

    public static void activeUserInvokeInternal(Context context) {
        if (!sHasLoadDid) {
            synchronized (AppLog.class) {
                if (!sHasLoadDid) {
                    sPendingActiveUser = true;
                    return;
                }
            }
        }
        sPendingActiveUser = false;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sFetchActiveTime < 900000 || !INVOKESTATIC_com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(context)) {
            return;
        }
        sFetchActiveTime = currentTimeMillis;
        QKG.LIZIZ(context, ACTIVE_USER_URL(), sChildMode, sActiveOnce);
    }

    public static void addSessionHook(QJ5 qj5) {
        if (qj5 == null) {
            return;
        }
        sAppLogApi.LJJJJ(qj5);
    }

    public static void appendParamsToEvent(JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.has("ab_sdk_version")) {
            String abSDKVersion = getAbSDKVersion();
            if (!TextUtils.isEmpty(abSDKVersion)) {
                try {
                    jSONObject.put("ab_sdk_version", abSDKVersion);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    public static void clearWhenSwitchChildMode(boolean z) {
        sAppLogApi.LJ(z);
    }

    public static void com_ss_android_common_applog_AppLog__getSSIDs$___twin___(Map<String, String> map) {
        sAppLogApi.LJIJJ(map);
    }

    public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getSSIDs(Map map) {
        InitModules.LIZLLL();
        com_ss_android_common_applog_AppLog__getSSIDs$___twin___(map);
    }

    private void doClearWhenSwitchChildMode(boolean z) {
        boolean z2;
        DeviceRegisterManager.clearWhenSwitchChildMode(z);
        if (z) {
            this.mHeader.remove("openudid");
            this.mHeader.remove("google_aid");
            this.mHeader.remove("device_id");
            this.mHeader.remove("install_id");
        }
        updateHeader(this.mContext, z);
        QL6 LIZLLL = QL6.LIZLLL(this.mContext);
        synchronized (LIZLLL) {
            SQLiteDatabase sQLiteDatabase = LIZLLL.LIZ;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                for (String str : QL6.LJ) {
                    try {
                        LIZLLL.LIZ.delete(str, null, null);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        QLP qlp = this.mSession;
        if (qlp != null) {
            z2 = qlp.LJII;
        } else {
            z2 = true;
        }
        this.mSession = null;
        tryExtendSession(System.currentTimeMillis(), z2);
    }

    public static String formatDate(long j) {
        return sDateTimeFormat.format(new Date(j));
    }

    public static AppLog getInstance(Context context) {
        return sAppLogApi.LJIJI(context);
    }

    private void handleConfigUpdate(JSONObject jSONObject) {
        WeakReference<QJG> weakReference = sConfigUpdateListener;
        if (weakReference != null) {
            QJG qjg = weakReference.get();
            if (qjg instanceof InterfaceC66839QLb) {
                try {
                    ((InterfaceC66839QLb) qjg).LIZJ();
                } catch (Exception unused) {
                }
            }
        }
    }

    private boolean handleEventTimely(QLJ qlj) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (qlj != null && !qlj.LJIILL && currentTimeMillis - this.mStartWaitSendTimely >= 900000 && "event_v3".equalsIgnoreCase(qlj.LIZ) && (concurrentHashMap = this.mEventTimely) != null && concurrentHashMap.size() > 0 && !C38354F3m.LJ(qlj.LIZIZ) && this.mEventTimely.containsKey(qlj.LIZIZ) && !C38354F3m.LJ(qlj.LJIILIIL)) {
                JSONObject jSONObject = new JSONObject(qlj.LJIILIIL);
                if (jSONObject.optInt("_event_v3", 0) == 1) {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    if (jSONObject.has("nt")) {
                        jSONObject3.put("nt", jSONObject.optInt("nt"));
                    }
                    long j = qlj.LJI;
                    if (j > 0) {
                        jSONObject3.put("user_id", j);
                        jSONObject3.put("user_is_login", qlj.LJIIIIZZ);
                        jSONObject3.put("user_type", qlj.LJFF);
                        jSONObject3.put("user_is_auth", qlj.LJIIIZ);
                    }
                    jSONObject.remove("nt");
                    jSONObject.remove("_event_v3");
                    jSONObject3.put("event", qlj.LIZIZ);
                    jSONObject3.put("params", jSONObject);
                    jSONObject3.put("session_id", qlj.LJIIL);
                    jSONObject3.put("datetime", formatDate(qlj.LJIIJJI));
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject3);
                    jSONObject2.put("event_v3", jSONArray);
                    JSONObject jSONObject4 = this.mTimeSync;
                    if (jSONObject4 != null) {
                        jSONObject2.put("time_sync", jSONObject4);
                    }
                    jSONObject2.put("magic_tag", "ss_app_log");
                    JSONObject jSONObject5 = this.mHeader;
                    String optString = jSONObject5.optString("device_id");
                    jSONObject2.put("header", jSONObject5);
                    jSONObject2.put("_gen_time", System.currentTimeMillis());
                    new QLF(this, jSONObject2.toString(), qlj, optString).LIZ();
                    QIV.LIZ(QIU.real_event, QIL.init);
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private void initDataFromSp(Context context) {
        loadSSIDs();
        loadGlobalEventIndex();
        boolean z = false;
        if (F9J.LIZIZ(this.mContext, 0, "applog_stats").getInt("forbid_report_phone_detail_info", 0) > 0) {
            z = true;
        }
        this.mForbidReportPhoneDetailInfo = z;
        if (isEnableEventSampling()) {
            sEventSampling = C59163NJv.LIZJ(this.mContext, null);
        }
    }

    public static boolean isBadDeviceId(String str) {
        return sAppLogApi.LJJ(str);
    }

    private void loadHarmonyInfo(JSONObject jSONObject) {
        String str;
        boolean LIZLLL = PCI.LIZLLL();
        if (LIZLLL) {
            str = "Harmony";
        } else {
            str = "Android";
        }
        try {
            jSONObject.put("platform", str);
        } catch (JSONException unused) {
        }
        if (!LIZLLL) {
            return;
        }
        try {
            jSONObject.put("harmony_os_api", C58323Mul.LIZ("hw_sc.build.os.apiversion"));
            jSONObject.put("harmony_os_version", C58323Mul.LIZ("hw_sc.build.platform.version"));
            jSONObject.put("harmony_release_type", C58323Mul.LIZ("hw_sc.build.os.releasetype"));
        } catch (Throwable unused2) {
        }
    }

    private void notifyOnEvent(QLJ qlj) {
        if (sGlobalEventCallback != null) {
            sGlobalEventCallback.onEvent(qlj.LIZIZ, qlj.LJIILIIL);
        }
    }

    private void notifyRemoteConfigUpdate(boolean z) {
        QJG qjg;
        WeakReference<QJG> weakReference = sConfigUpdateListener;
        if (weakReference != null && (qjg = weakReference.get()) != null) {
            try {
                qjg.LIZIZ();
            } catch (Exception unused) {
            }
        }
    }

    private void notifySessionStart(long j) {
        List<QJ5> list = sSessionHookList;
        if (list == null) {
            return;
        }
        synchronized (list) {
            Iterator<QJ5> it = list.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ(j);
            }
        }
    }

    public static void onActivityCreate(Context context) {
        sAppLogApi.LJJIIZI(context);
    }

    public static void onPause(Context context) {
        sAppLogApi.LJJIIZ(context);
    }

    public static void onResume(Context context) {
        sAppLogApi.LJJJJI(context);
    }

    public static void registerGlobalEventCallback(InterfaceC66829QKr interfaceC66829QKr) {
        sAppLogApi.LJJI(interfaceC66829QKr);
    }

    public static void registerHeaderCustomCallback(InterfaceC1294656g interfaceC1294656g) {
        sAppLogApi.registerHeaderCustomCallback(interfaceC1294656g);
    }

    public static void registerLogRequestCallback(QLN qln) {
        sAppLogApi.LJJII(qln);
    }

    public static void setAbSDKVersion(String str) {
        tempAbSDKVersion = str;
        sAppLogApi.LJII(str);
    }

    public static void setAdjustTerminate(boolean z) {
        sAppLogApi.LJIILJJIL(z);
    }

    public static void setAliYunHanlder(InterfaceC66830QKs interfaceC66830QKs) {
        sAppLogApi.LJJJJL(interfaceC66830QKs);
    }

    public static void setAppContext(InterfaceC66783QIx interfaceC66783QIx) {
        sAppLogApi.LJFF(interfaceC66783QIx);
    }

    public static void setAppTrack(JSONObject jSONObject) {
        sAppLogApi.LJIIIIZZ(jSONObject);
    }

    public static void setChannel(String str) {
        if (!sInitGuard) {
            DeviceRegisterManager.setChannel(str);
            return;
        }
        throw new IllegalStateException("please call before init");
    }

    public static void setChildModeBeforeInit(boolean z) {
        sAppLogApi.LIZIZ(z);
        DeviceRegisterManager.setChildModeBeforeInit(z);
    }

    public static void setConfigUpdateListener(QJG qjg) {
        sAppLogApi.LJJIJIIJIL(qjg);
    }

    public static void setCustomerHeader(Bundle bundle) {
        sAppLogApi.LJIJ(bundle);
    }

    public static void setEnableNetCommOpt(boolean z) {
        sAppLogApi.LJIL(z);
    }

    public static void setEventSamplingEnable(boolean z) {
        sAppLogApi.LJIILLIIL(z);
    }

    public static void setGoogleAId(String str) {
        if (C38354F3m.LJ(str)) {
            return;
        }
        if (!C38354F3m.LJ(str) && !str.equals(V1B.LJLILLLLZI)) {
            V1B.LJLILLLLZI = str;
        }
        AppLog appLog = sInstance;
        if (appLog != null) {
            QLQ qlq = new QLQ(QLI.UPDATE_GOOGLE_AID);
            qlq.LIZIZ = str;
            appLog.enqueue(qlq);
        }
    }

    public static void setIsNotRequestSender(boolean z) {
        QK9.LJIIIZ = z;
    }

    public static void setLogEncryptConfig(QJH qjh) {
        sAppLogApi.LJJJJJ(qjh);
    }

    public static void setSendLogCallback(E18 e18) {
        if (new C03880Dg(2).LIZJ(400400, "com/ss/android/common/applog/AppLog", "setSendLogCallback", AppLog.class, new Object[]{e18}, "void", new C65300Pk0(false, "(Lcom/ss/android/common/applog/SendLogCallback;)V", "5396129535681143500")).LIZ) {
            return;
        }
        sSendLogCallback = e18;
    }

    public static void setSensitiveApiCallback(InterfaceC39244Fai interfaceC39244Fai) {
        sAppLogApi.LJJJJLL(interfaceC39244Fai);
    }

    public static void setSessionKey(String str) {
        sAppLogApi.LJIILL(str);
    }

    public static void setStartLogReaperDelay(long j) {
        sAppLogApi.LJIIJ(j);
    }

    public static void setSwitchToBdtracker(boolean z) {
        sSwitchToBdtracker = z ? 1 : 0;
        DeviceRegisterManager.setSwitchToBdtracker(z);
        if (z) {
            sAppLogApi = new QI8();
        }
    }

    public static void setTerminateImmediately(boolean z) {
        sAppLogApi.LJIIZILJ(z);
    }

    public static void setUseGoogleAdId(boolean z) {
        sAppLogApi.LJIIL(z);
    }

    public static void setUserId(long j) {
        sAppLogApi.LJJIII(j);
    }

    public static void setUserIdIsolateCallback(InterfaceC66755QHv interfaceC66755QHv) {
        sAppLogApi.LJJIJIIJI(interfaceC66755QHv);
    }

    public static void setUserIdIsolateEnabled(boolean z) {
        sAppLogApi.LJIILIIL(z);
    }

    public static void tryPutEventIndex(JSONObject jSONObject) {
        AppLog appLog = sInstance;
        if (appLog != null) {
            try {
                jSONObject.put("tea_event_index", appLog.mGlobalEventIndexMatrix.getAndIncrement());
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    private boolean updateAppLanguage(String str) {
        if (C38354F3m.LJ(str)) {
            return false;
        }
        try {
            if (!str.equals(this.mHeader.optString("app_language", null))) {
                this.mHeader.put("app_language", str);
                if (this.mLogReaper != null) {
                    this.mLogReaper.LJIILL(new JSONObject(this.mHeader, QJL.LIZ));
                }
                F9J.LIZIZ(this.mContext, 0, "applog_stats").edit().putString("app_language", str).commit();
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private void updateAppLanguageAndRegion(JSONObject jSONObject) {
        String optString = jSONObject.optString("app_language", null);
        String optString2 = jSONObject.optString("app_region", null);
        if (updateAppLanguage(optString) || updateAppRegion(optString2)) {
            DeviceRegisterManager.updateDeviceInfo();
        }
    }

    private boolean updateAppRegion(String str) {
        if (C38354F3m.LJ(str)) {
            return false;
        }
        try {
            if (!str.equals(this.mHeader.optString("app_region", null))) {
                this.mHeader.put("app_region", str);
                if (this.mLogReaper != null) {
                    this.mLogReaper.LJIILL(new JSONObject(this.mHeader, QJL.LIZ));
                }
                F9J.LIZIZ(this.mContext, 0, "applog_stats").edit().putString("app_region", str).commit();
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private void updateCustomerHeader(Bundle bundle) {
        if (bundle == null || bundle.size() <= 0 || this.mLogReaper == null) {
            return;
        }
        try {
            JSONObject optJSONObject = this.mHeader.optJSONObject("custom");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            for (String str : bundle.keySet()) {
                optJSONObject.put(str, C16880lQ.LLJJIII(bundle, str));
            }
            this.mHeader.put("custom", optJSONObject);
            if (this.mLogReaper != null) {
                this.mLogReaper.LJIILL(new JSONObject(this.mHeader, QJL.LIZ));
            }
            ensureHeaderCopy();
        } catch (Throwable unused) {
        }
    }

    private void updateDid(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        boolean isBadDeviceId = isBadDeviceId(this.mHeader.optString("device_id", null));
        String optString = jSONObject.optString("device_id", null);
        String optString2 = jSONObject.optString("install_id", null);
        if (!C38354F3m.LJ(optString)) {
            try {
                this.mHeader.put("device_id", optString);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (!C38354F3m.LJ(optString2)) {
            try {
                this.mHeader.put("install_id", optString2);
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        if (this.mLogReaper != null) {
            try {
                this.mLogReaper.LJIILL(new JSONObject(this.mHeader, QJL.LIZ));
            } catch (JSONException e3) {
                C16880lQ.LLLLIIL(e3);
            }
        }
        ensureHeaderCopy();
        tryUpdateConfig(true, true, isBadDeviceId);
    }

    private void updateGoogleAID(String str) {
        if (!C38354F3m.LJ(str) && this.mLogReaper != null) {
            try {
                if (!str.equals(this.mHeader.optString("google_aid", null))) {
                    if (!sChildMode) {
                        this.mHeader.put("google_aid", str);
                        if (this.mLogReaper != null) {
                            this.mLogReaper.LJIILL(new JSONObject(this.mHeader, QJL.LIZ));
                        }
                    }
                    F9J.LIZIZ(this.mContext, 0, "applog_stats").edit().putString("google_aid", str).commit();
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void updateUserUniqueId(String str) {
        if (this.mLogReaper != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    this.mHeader.put("user_unique_id", str);
                } else {
                    this.mHeader.remove("user_unique_id");
                }
                this.mLogReaper.LJIILL(new JSONObject(this.mHeader, QJL.LIZ));
            } catch (Exception unused) {
            }
        }
    }

    public void addCustomerHeader(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putAll(bundle);
            QLQ qlq = new QLQ(QLI.CUSTOMER_HEADER_UPDATE);
            qlq.LIZIZ = bundle2;
            enqueue(qlq);
        } catch (Throwable unused) {
        }
    }

    public void doSaveDnsReportTime(long j) {
        SharedPreferences.Editor edit = F9J.LIZIZ(this.mContext, 0, "applog_stats").edit();
        edit.putLong("dns_report_time", j);
        edit.commit();
    }

    public void enqueue(QLQ qlq) {
        if (qlq == null) {
            return;
        }
        synchronized (this.mQueue) {
            if (sStopped) {
                monitorActionQueue(qlq, QIL.f_stop);
                return;
            }
            if (this.mQueue.size() >= 2000) {
                monitorActionQueue(this.mQueue.poll(), QIL.f_overflow);
            }
            this.mQueue.add(qlq);
            this.mQueue.notify();
        }
    }

    public void handleEvent(QLJ qlj) {
        notifyOnEvent(qlj);
        tryExtendSession(qlj.LJIIJJI, true);
        if (this.mSession == null) {
            QLK.LIZ(1, 4, null);
            QIV.LIZIZ(qlj.LIZ, QIL.f_no_session);
            return;
        }
        if ("event_v3".equalsIgnoreCase(qlj.LIZ)) {
            qlj.LJIILLIIL = this.mGlobalEventIndexMatrix.getAndIncrement();
        } else {
            qlj.LJIILLIIL = this.mGlobalEventIndexMatrixV1.getAndIncrement();
        }
        qlj.LJIIL = this.mSession.LIZ;
        if (handleEventTimely(qlj)) {
            return;
        }
        long LJI = QL6.LIZLLL(this.mContext).LJI(qlj);
        if (LJI > 0) {
            sendHeartbeat();
        } else {
            if (LJI >= 0) {
                return;
            }
            QIV.LIZIZ(qlj.LIZ, QIL.f_db_insert);
        }
    }

    public void handleImageSample(QLW qlw) {
        if (this.mSamples.size() >= 5) {
            this.mSamples.removeFirst();
        }
        this.mSamples.add(qlw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        if (0 >= r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadStats(X.QLP r13) {
        /*
            r12 = this;
            java.lang.String r6 = "samples"
            java.util.LinkedList<X.QLW> r0 = r12.mSamples     // Catch: java.lang.Exception -> Lef
            r0.clear()     // Catch: java.lang.Exception -> Lef
            android.content.Context r1 = r12.mContext     // Catch: java.lang.Exception -> Lef
            java.lang.String r0 = "applog_stats"
            r3 = 0
            android.content.SharedPreferences r7 = X.F9J.LIZIZ(r1, r3, r0)     // Catch: java.lang.Exception -> Lef
            java.lang.String r2 = "session_interval"
            r0 = 30000(0x7530, double:1.4822E-319)
            long r0 = r7.getLong(r2, r0)     // Catch: java.lang.Exception -> Lef
            r4 = 15000(0x3a98, double:7.411E-320)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L27
            r4 = 300000(0x493e0, double:1.482197E-318)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L27
            r12.mSessionInterval = r0     // Catch: java.lang.Exception -> Lef
        L27:
            java.lang.String r2 = "batch_event_interval"
            r0 = 60000(0xea60, double:2.9644E-319)
            long r0 = r7.getLong(r2, r0)     // Catch: java.lang.Exception -> Lef
            r12.mBatchEventInterval = r0     // Catch: java.lang.Exception -> Lef
            long r0 = com.ss.android.common.applog.AppLog.sBatchEventInterval     // Catch: java.lang.Exception -> Lef
            boolean r0 = checkValidInterval(r0)     // Catch: java.lang.Exception -> Lef
            if (r0 == 0) goto L44
            long r4 = r12.mBatchEventInterval     // Catch: java.lang.Exception -> Lef
            long r0 = com.ss.android.common.applog.AppLog.sBatchEventInterval     // Catch: java.lang.Exception -> Lef
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L44
            r12.mBatchEventInterval = r0     // Catch: java.lang.Exception -> Lef
        L44:
            java.lang.String r1 = "send_launch_timely"
            r0 = 1
            int r0 = r7.getInt(r1, r0)     // Catch: java.lang.Exception -> Lef
            r12.mSendLaunchTimely = r0     // Catch: java.lang.Exception -> Lef
            java.lang.String r2 = "fetch_interval"
            r0 = 21600000(0x1499700, double:1.0671818E-316)
            long r0 = r7.getLong(r2, r0)     // Catch: java.lang.Exception -> Lef
            r12.mLogSettingInterval = r0     // Catch: java.lang.Exception -> Lef
            java.lang.String r0 = "http_monitor_port"
            int r0 = r7.getInt(r0, r3)     // Catch: java.lang.Exception -> Lef
            r12.mHttpMonitorPort = r0     // Catch: java.lang.Exception -> Lef
            java.lang.String r0 = "device_register_throttle"
            boolean r0 = r7.getBoolean(r0, r3)     // Catch: java.lang.Exception -> Lef
            X.QKD.LJIL = r0     // Catch: java.lang.Exception -> Lef
            if (r13 != 0) goto L6b
            return
        L6b:
            java.lang.String r0 = "stats_value"
            r2 = 0
            java.lang.String r1 = r7.getString(r0, r2)     // Catch: java.lang.Exception -> Lef
            boolean r0 = X.C38354F3m.LJ(r1)     // Catch: java.lang.Exception -> Lef
            if (r0 == 0) goto L79
            return
        L79:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lef
            r5.<init>(r1)     // Catch: java.lang.Exception -> Lef
            java.lang.String r0 = "session_id"
            java.lang.String r1 = r5.optString(r0, r2)     // Catch: java.lang.Exception -> Lef
            if (r1 == 0) goto Lef
            java.lang.String r0 = r13.LIZIZ     // Catch: java.lang.Exception -> Lef
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> Lef
            if (r0 != 0) goto L8f
            goto Lef
        L8f:
            java.lang.String r0 = "cnt_success"
            int r4 = r5.optInt(r0, r3)     // Catch: java.lang.Exception -> Lef
            java.lang.String r0 = "cnt_failure"
            int r1 = r5.optInt(r0, r3)     // Catch: java.lang.Exception -> Lef
            if (r4 <= 0) goto La2
            java.util.concurrent.atomic.AtomicInteger r0 = r12.mImageSuccessCount     // Catch: java.lang.Exception -> Lef
            r0.addAndGet(r4)     // Catch: java.lang.Exception -> Lef
        La2:
            if (r1 <= 0) goto La9
            java.util.concurrent.atomic.AtomicInteger r0 = r12.mImageFailureCount     // Catch: java.lang.Exception -> Lef
            r0.addAndGet(r1)     // Catch: java.lang.Exception -> Lef
        La9:
            boolean r0 = r5.isNull(r6)     // Catch: java.lang.Exception -> Lef
            if (r0 == 0) goto Lb0
            return
        Lb0:
            org.json.JSONArray r4 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONArray(r5, r6)     // Catch: java.lang.Exception -> Lef
            int r1 = r4.length()     // Catch: java.lang.Exception -> Lef
            r0 = 5
            if (r1 <= r0) goto Lbd
            r1 = 5
            goto Lbf
        Lbd:
            if (r3 >= r1) goto Lef
        Lbf:
            org.json.JSONObject r5 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getJSONObject(r4, r3)     // Catch: java.lang.Exception -> Lef
            java.lang.String r0 = "url"
            java.lang.String r11 = r5.optString(r0, r2)     // Catch: java.lang.Exception -> Lef
            java.lang.String r0 = "networktype"
            int r6 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getInt(r5, r0)     // Catch: java.lang.Exception -> Lef
            java.lang.String r0 = "time"
            long r7 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getLong(r5, r0)     // Catch: java.lang.Exception -> Lef
            java.lang.String r0 = "timestamp"
            long r9 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getLong(r5, r0)     // Catch: java.lang.Exception -> Lef
            boolean r0 = X.C38354F3m.LJ(r11)     // Catch: java.lang.Exception -> Lef
            if (r0 == 0) goto Le2
            goto Lec
        Le2:
            X.QLW r5 = new X.QLW     // Catch: java.lang.Exception -> Lef
            r5.<init>(r6, r7, r9, r11)     // Catch: java.lang.Exception -> Lef
            java.util.LinkedList<X.QLW> r0 = r12.mSamples     // Catch: java.lang.Exception -> Lef
            r0.add(r5)     // Catch: java.lang.Exception -> Lef
        Lec:
            int r3 = r3 + 1
            goto Lbd
        Lef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.loadStats(X.QLP):void");
    }

    public void onActivityPause(QLZ qlz) {
        if (!this.mInitOk || qlz == null) {
            return;
        }
        String str = qlz.LIZIZ;
        long currentTimeMillis = System.currentTimeMillis();
        QLZ qlz2 = this.mActivityRecord;
        if (qlz2 == null || qlz2.LIZ != qlz.LIZ) {
            this.mActivityTime = currentTimeMillis - 1010;
        }
        this.mActivityRecord = null;
        int i = (int) ((currentTimeMillis - this.mActivityTime) / 1000);
        if (i <= 0) {
            i = 1;
        }
        this.mActivityTime = currentTimeMillis;
        Logger.debug();
        C66842QLe c66842QLe = new C66842QLe();
        c66842QLe.LIZ = str;
        c66842QLe.LIZIZ = i;
        QLQ qlq = new QLQ(QLI.PAGE_END);
        qlq.LIZIZ = c66842QLe;
        qlq.LIZJ = currentTimeMillis;
        enqueue(qlq);
    }

    public void onActivityResume(QLZ qlz) {
        if (!this.mInitOk || qlz == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.mActivityTime = currentTimeMillis;
        this.mActivityRecord = qlz;
        Logger.debug();
        QLQ qlq = new QLQ(QLI.PAGE_START);
        qlq.LIZJ = currentTimeMillis;
        enqueue(qlq);
    }

    public void processItem(QLQ qlq) {
        QJN qjn;
        long j;
        QLJ qlj;
        QLJ qlj2;
        if (sIsTouristMode && !sEnableEventInTouristMode) {
            QLI qli = QLI.PAGE_START;
            QLI qli2 = qlq.LIZ;
            if (qli == qli2 || QLI.PAGE_END == qli2 || QLI.EVENT == qli2 || QLI.SAVE_MISC_LOG == qli2) {
                return;
            }
        }
        if (!this.mInitOk) {
            if (qlq != null) {
                Object obj = qlq.LIZIZ;
                if ((obj instanceof QLJ) && (qlj2 = (QLJ) obj) != null) {
                    QIV.LIZIZ(qlj2.LIZ, QIL.f_not_init);
                    return;
                }
                return;
            }
            return;
        }
        if (sStopped) {
            if (qlq != null) {
                Object obj2 = qlq.LIZIZ;
                if ((obj2 instanceof QLJ) && (qlj = (QLJ) obj2) != null) {
                    QIV.LIZIZ(qlj.LIZ, QIL.f_stop);
                    return;
                }
                return;
            }
            return;
        }
        BlockHelper.tryBlock();
        String str = "";
        boolean z = true;
        boolean z2 = false;
        switch (qlq.LIZ.ordinal()) {
            case 0:
                tryExtendSession(qlq.LIZJ, false);
                long j2 = qlq.LIZJ;
                QLP qlp = this.mSession;
                if (qlp != null) {
                    str = qlp.LIZIZ;
                }
                QO4 LIZIZ = QO4.LIZIZ(this.mContext);
                LIZIZ.getClass();
                HandlerThreadC36423ERf.LIZJ().LIZ(new ARunnableS7S1100100_11(LIZIZ, str, j2, 2));
                sendHeartbeat();
                return;
            case 1:
                long j3 = qlq.LIZJ;
                QLP qlp2 = this.mSession;
                if (qlp2 != null) {
                    str = qlp2.LIZIZ;
                }
                QO4 LIZIZ2 = QO4.LIZIZ(this.mContext);
                LIZIZ2.getClass();
                HandlerThreadC36423ERf.LIZJ().LIZ(new ARunnableS7S1100100_11(LIZIZ2, str, j3, 3));
                Object obj3 = qlq.LIZIZ;
                if (obj3 instanceof C66842QLe) {
                    handlePageEnd((C66842QLe) obj3, qlq.LIZJ);
                }
                sendHeartbeat();
                return;
            case 2:
                Object obj4 = qlq.LIZIZ;
                if (!(obj4 instanceof QLJ)) {
                    return;
                }
                handleEvent((QLJ) obj4);
                return;
            case 3:
                Object obj5 = qlq.LIZIZ;
                if (!(obj5 instanceof QLW)) {
                    return;
                }
                handleImageSample((QLW) obj5);
                return;
            case 4:
                if (qlq.LIZIZ instanceof JSONObject) {
                    try {
                        z2 = Boolean.valueOf(qlq.LIZLLL).booleanValue();
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    handleConfigUpdate((JSONObject) qlq.LIZIZ, z2);
                }
                notifyRemoteConfigUpdate(true);
                return;
            case 5:
            case 7:
            default:
                return;
            case 6:
                Object obj6 = qlq.LIZIZ;
                if (!(obj6 instanceof String)) {
                    return;
                }
                updateUserAgentString((String) obj6);
                return;
            case 8:
                long j4 = qlq.LIZJ;
                if (j4 <= 0) {
                    return;
                }
                doSaveDnsReportTime(j4);
                return;
            case 9:
                if (C38354F3m.LJ(qlq.LIZLLL)) {
                    return;
                }
                Object obj7 = qlq.LIZIZ;
                if (!(obj7 instanceof JSONObject)) {
                    return;
                }
                doRecordMiscLog(qlq.LIZLLL, (JSONObject) obj7);
                return;
            case 10:
                Object obj8 = qlq.LIZIZ;
                if (!(obj8 instanceof JSONObject)) {
                    return;
                }
                updateDid((JSONObject) obj8);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                Object obj9 = qlq.LIZIZ;
                if (!(obj9 instanceof Bundle)) {
                    return;
                }
                updateCustomerHeader((Bundle) obj9);
                return;
            case 12:
                Object obj10 = qlq.LIZIZ;
                if (!(obj10 instanceof String)) {
                    return;
                }
                updateGoogleAID((String) obj10);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                Object obj11 = qlq.LIZIZ;
                if (!(obj11 instanceof JSONObject)) {
                    return;
                }
                updateAppLanguageAndRegion((JSONObject) obj11);
                return;
            case 14:
                if (qlq.LIZJ <= 0) {
                    z = false;
                }
                doClearWhenSwitchChildMode(z);
                CountDownLatch countDownLatch = qlq.LJ;
                if (countDownLatch == null) {
                    return;
                }
                countDownLatch.countDown();
                return;
            case 15:
                Object obj12 = qlq.LIZIZ;
                if (obj12 instanceof Pair) {
                    qjn = (QJN) ((Pair) obj12).first;
                    j = ((Long) ((Pair) obj12).second).longValue();
                } else {
                    qjn = null;
                    j = 0;
                }
                if (qlq.LIZJ <= 0) {
                    z = false;
                }
                doResetWhenSwitchChildMode(z, j, qjn);
                CountDownLatch countDownLatch2 = qlq.LJ;
                if (countDownLatch2 == null) {
                    return;
                }
                countDownLatch2.countDown();
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                forceFlushEvent();
                return;
            case 17:
                updateUserUniqueId((String) qlq.LIZIZ);
                return;
            case 18:
                if (this.mLogReaper == null || this.mLogReaper.isAlive()) {
                    return;
                }
                try {
                    this.mLogReaper.start();
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }

    public void saveAppTrack(JSONObject jSONObject) {
        DeviceRegisterManager.saveAppTrack(this.mContext, jSONObject);
    }

    public boolean sendTimelyEvent(String str) {
        int responseCode;
        String LJ;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (APPLOG_TIMELY_URL() != null && APPLOG_TIMELY_URL().length != 0) {
                for (String str2 : APPLOG_TIMELY_URL()) {
                    String LJ2 = QJZ.LJ(QJY.LIZIZ(str2, true), QJZ.LIZJ);
                    byte[] bArr = (byte[]) bytes.clone();
                    Map<String, String> logHttpHeader = getLogHttpHeader();
                    if (this.mContext != null && getLogEncryptSwitch()) {
                        try {
                            LJ = QJY.LJIIIIZZ(getLogCompressor(), LJ2, bArr, this.mContext, false, null, logHttpHeader, str, false, true);
                        } catch (RuntimeException unused) {
                            QIV.LIZ(QIU.real_event, QIL.f_to_bytes);
                            LJ = QJY.LJ(LJ2, bytes, true, "application/octet-stream;tt-data=b", logHttpHeader, false, true);
                        }
                    } else {
                        LJ = QJY.LJ(LJ2, bytes, true, "application/octet-stream;tt-data=b", logHttpHeader, false, true);
                    }
                    if (LJ != null && LJ.length() != 0) {
                        JSONObject jSONObject = new JSONObject(LJ);
                        if (!"ss_app_log".equals(jSONObject.optString("magic_tag"))) {
                            return false;
                        }
                        if (!"success".equals(jSONObject.optString("message"))) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            if ((th instanceof C36616EYq) && (responseCode = th.getResponseCode()) >= 500 && responseCode < 600) {
                this.mStartWaitSendTimely = System.currentTimeMillis();
            }
        }
        return false;
    }

    public void updateUserAgentString(String str) {
        DeviceRegisterManager.updateUserAgentString(this.mContext, str);
    }

    public void enqueue(AbstractC66846QLi abstractC66846QLi) {
        if (abstractC66846QLi == null) {
            return;
        }
        this.mHeartbeatTime = System.currentTimeMillis();
        synchronized (this.mLogQueue) {
            if (this.mLogQueue.size() >= 2000 && this.mLogQueue.poll() != null) {
                QIV.LIZ(QIU.pack, QIL.f_log_overflow);
            }
            this.mLogQueue.add(abstractC66846QLi);
            this.mLogQueue.notify();
        }
    }

    public AppLog(Context context, boolean z) {
        Context LLLLL = C16880lQ.LLLLL(context);
        this.mContext = LLLLL;
        this.mNetWorkMonitor = new F7B(LLLLL);
        this.mHeader = null;
    }

    public static void appendCommonParams(StringBuilder sb, boolean z) {
        QJY.LIZLLL(sb, z, QKO.L0);
    }

    public static void clearDidAndIid(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DeviceRegisterManager.clearDidAndIid(context, str);
    }

    public static String[] fillKeyIvForEncryptResp(JSONObject jSONObject, boolean z) {
        boolean z2;
        JSONObject optJSONObject;
        String[] strArr = null;
        try {
            if (z) {
                if (sEnableEventUserId) {
                    jSONObject.put("uid_enable", 1);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (isEnableEventSampling()) {
                    jSONObject.put("event_sampling", 1);
                    N3D n3d = sEventSampling;
                    if (n3d != null && (optJSONObject = jSONObject.optJSONObject("header")) != null) {
                        optJSONObject.put("event_sampling_version", n3d.LIZ);
                        jSONObject.put("header", optJSONObject);
                    }
                }
            } else if (sEventFilterEnable > 0) {
                jSONObject.put("event_filter", sEventFilterEnable);
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && getLogEncryptSwitch()) {
                strArr = C1DF.LJIILJJIL();
                if (C1DF.LJJIIJ(strArr)) {
                    jSONObject.put("key", strArr[0]);
                    jSONObject.put("iv", strArr[1]);
                }
            }
        } catch (JSONException unused) {
        }
        return strArr;
    }

    public static AppLog getInstance(Context context, boolean z) {
        synchronized (sLock) {
            if (sStopped) {
                return null;
            }
            if (sInstance == null) {
                sInstance = new AppLog(context, z);
                Logger.debug();
            }
            return sInstance;
        }
    }

    private boolean initHeader(JSONObject jSONObject, Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (sMiPushInclude) {
                jSONArray.put(1);
            }
            if (sMyPushInclude) {
                jSONArray.put(2);
            }
            if (sHwPushInclude) {
                jSONArray.put(7);
            }
            if (sMzPushInclude) {
                jSONArray.put(8);
            }
            if (sAliyunPushInclude) {
                jSONArray.put(9);
            }
            jSONObject.put("push_sdk", jSONArray);
            String userUniqueId = getUserUniqueId();
            if (!TextUtils.isEmpty(userUniqueId)) {
                jSONObject.put("user_unique_id", userUniqueId);
            }
            loadHarmonyInfo(jSONObject);
        } catch (Exception unused) {
        }
        return DeviceRegisterManager.getHeader(context, jSONObject, sChildMode);
    }

    private void monitorActionQueue(QLQ qlq, QIL qil) {
        QLJ qlj;
        if (qlq != null) {
            int ordinal = qlq.LIZ.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 9) {
                            return;
                        }
                        QIV.LIZ(QIU.log_data, qil);
                        return;
                    } else {
                        Object obj = qlq.LIZIZ;
                        if (!(obj instanceof QLJ) || (qlj = (QLJ) obj) == null) {
                            return;
                        }
                        QIV.LIZIZ(qlj.LIZ, qil);
                        return;
                    }
                }
                QIV.LIZ(QIU.terminate, qil);
                return;
            }
            QIV.LIZ(QIU.launch, qil);
        }
    }

    public static void onEvent(Context context, String str) {
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(context, "event_v1", str, null, 0L, 0L, false, null);
    }

    public static void setEventFilterByClient(List<String> list, boolean z) {
        sAppLogApi.LJJJIL(list, z);
    }

    private void updateHeader(Context context, boolean z) {
        QK9.LIZJ(context, this.mHeader, z);
        if (this.mLogReaper != null) {
            try {
                this.mLogReaper.LJIILL(new JSONObject(this.mHeader, QJL.LIZ));
            } catch (JSONException unused) {
            }
        }
    }

    public void doRecordMiscLog(String str, JSONObject jSONObject) {
        long j;
        try {
            QLP qlp = this.mSession;
            if (qlp != null) {
                j = qlp.LIZ;
            } else {
                j = 0;
            }
            if (this.mInitOk && j > 0 && !C38354F3m.LJ(str) && jSONObject != null) {
                String jSONObject2 = jSONObject.toString();
                long LJIIIZ = QL6.LIZLLL(this.mContext).LJIIIZ(j, str, jSONObject2);
                if (jSONObject2 != null && jSONObject2.length() > 50000) {
                    QLK.LIZ(5, 0, new Object[]{"misc", str, "", Integer.valueOf(jSONObject2.length())});
                    QIV.LIZ(QIU.log_data, QIL.f_log_size_limit);
                }
                if (LJIIIZ < 0) {
                    QIV.LIZ(QIU.log_data, QIL.f_db_insert);
                    return;
                }
                return;
            }
            if (!this.mInitOk) {
                QIV.LIZ(QIU.log_data, QIL.f_not_init);
            } else {
                QIV.LIZ(QIU.log_data, QIL.f_block);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x008a, code lost:
    
        if (r9 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008c, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append(r6);
        r1.append("&config_retry=b");
        r6 = X.X1D.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009a, code lost:
    
        r2 = X.QJY.LJ(r6, r15, true, "application/octet-stream;tt-data=b", null, false, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.common.applog.AppLog] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean doUpdateConfig(java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.doUpdateConfig(java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(43:5|(3:6|7|(2:9|(1:11)))|13|(1:15)|16|(3:17|18|(3:20|55|25))|30|(1:32)(1:129)|33|(2:37|(30:39|40|(3:44|(3:46|(1:48)(1:50)|49)|51)|52|(1:127)|56|(1:58)|59|(3:61|(1:63)|64)|65|(1:126)(1:69)|70|(1:72)(1:125)|73|(1:75)(1:124)|76|(1:78)|79|(4:81|(1:83)(1:87)|84|(1:86))|(1:89)|(1:91)|(1:93)|(1:95)|(1:97)|98|99|100|(1:122)(4:104|(3:106|(2:108|109)(1:111)|110)|112|113)|114|(1:120)(2:118|119)))|128|40|(4:42|44|(0)|51)|52|(1:54)|127|56|(0)|59|(0)|65|(1:67)|126|70|(0)(0)|73|(0)(0)|76|(0)|79|(0)|(0)|(0)|(0)|(0)|(0)|98|99|100|(1:102)|122|114|(2:116|120)(1:121)) */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleConfigUpdate(org.json.JSONObject r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.handleConfigUpdate(org.json.JSONObject, boolean):void");
    }

    public void handlePageEnd(C66842QLe c66842QLe, long j) {
        QLP qlp = this.mSession;
        if (qlp == null || qlp.LJII) {
            return;
        }
        qlp.LJIIIZ = false;
        qlp.LJI = j;
        c66842QLe.LIZJ = qlp.LIZ;
        QL6 LIZLLL = QL6.LIZLLL(this.mContext);
        synchronized (LIZLLL) {
            SQLiteDatabase sQLiteDatabase = LIZLLL.LIZ;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("pausetime", Long.valueOf(j));
                    LIZLLL.LIZ.update("session", contentValues, "_id = ?", new String[]{String.valueOf(c66842QLe.LIZJ)});
                } catch (Exception unused) {
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("name", c66842QLe.LIZ);
                    contentValues2.put("duration", Integer.valueOf(c66842QLe.LIZIZ));
                    contentValues2.put("session_id", Long.valueOf(c66842QLe.LIZJ));
                    LIZLLL.LIZ.insert("page", null, contentValues2);
                } catch (Exception unused2) {
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            int i = this.mImageSuccessCount.get();
            int i2 = this.mImageFailureCount.get();
            jSONObject.put("session_id", this.mSession.LIZIZ);
            jSONObject.put("cnt_success", i);
            jSONObject.put("cnt_failure", i2);
            JSONArray jSONArray = new JSONArray();
            Iterator<QLW> it = this.mSamples.iterator();
            while (it.hasNext()) {
                QLW next = it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", next.LIZ);
                jSONObject2.put("networktype", next.LIZIZ);
                jSONObject2.put("time", next.LIZJ);
                jSONObject2.put("timestamp", next.LIZLLL);
                jSONArray.put(jSONObject2);
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("samples", jSONArray);
            }
            SharedPreferences.Editor edit = F9J.LIZIZ(this.mContext, 0, "applog_stats").edit();
            edit.putString("stats_value", jSONObject.toString());
            edit.commit();
        } catch (Exception unused3) {
        }
    }

    public void parseIntSet(HashSet<Integer> hashSet, JSONArray jSONArray) {
        if (hashSet == null || jSONArray == null) {
            return;
        }
        hashSet.clear();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            int i2 = JSONArrayProtectorUtils.getInt(jSONArray, i);
            if (i2 > 0) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tryExtendSession(long r11, boolean r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.tryExtendSession(long, boolean):void");
    }

    public void tryUpdateConfig(boolean z, boolean z2) {
        tryUpdateConfig(z, false, z2);
    }

    public static void com_ss_android_common_applog_AppLog__recordMiscLog$___twin___(Context context, String str, JSONObject jSONObject) {
        sAppLogApi.LJIJJLI(str, jSONObject);
    }

    public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_recordMiscLog(Context context, String str, JSONObject jSONObject) {
        if (AV1.LJIIJJI()) {
            return;
        }
        com_ss_android_common_applog_AppLog__recordMiscLog$___twin___(context, str, jSONObject);
        try {
            HandlerThreadC36423ERf.LIZJ().LIZ(new ARunnableS18S0000000_11(2));
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
    }

    private void doResetWhenSwitchChildMode(boolean z, long j, QJN qjn) {
        QKG.LIZIZ(this.mContext, ACTIVE_USER_URL(), z, false);
        DeviceRegisterManager.resetDidWhenSwitchChildMode(z, j, qjn);
        updateHeader(this.mContext, z);
    }

    public static void init(Context context, boolean z, C66763QId c66763QId) {
        sAppLogApi.LJJJ(context, z, c66763QId);
    }

    public static void onEvent(Context context, String str, String str2) {
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(context, "event_v1", str, str2, 0L, 0L, false, null);
    }

    public static boolean optBoolean(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return z;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt >= 1) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0058, code lost:
    
        if (r8 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tryUpdateConfig(boolean r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.tryUpdateConfig(boolean, boolean, boolean):void");
    }

    public boolean updateConfig(String str, boolean z, long j) {
        sIsConfigThread.set(Boolean.TRUE);
        boolean doUpdateConfig = doUpdateConfig(str, z);
        if (doUpdateConfig) {
            long currentTimeMillis = System.currentTimeMillis();
            if (sConfigStartTime > 0) {
                QIV.LJ(QIU.config, QIL.total_success, currentTimeMillis - sConfigStartTime);
                sConfigStartTime = 0L;
            }
            QIV.LJ(QIU.config, QIL.success, currentTimeMillis - j);
        }
        Object obj = sLogConfigLock;
        synchronized (obj) {
            this.mLoadingOnlineConfig = false;
            try {
                obj.notifyAll();
            } catch (Exception unused) {
            }
        }
        sIsConfigThread.remove();
        if (!doUpdateConfig) {
            notifyRemoteConfigUpdate(false);
        }
        return doUpdateConfig;
    }

    public static void clearOrResetWhenSwitchChildMode(boolean z, QLI qli, long j, QJN qjn) {
        long j2;
        sChildMode = z;
        AppLog appLog = sInstance;
        if (appLog != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            QLQ qlq = new QLQ(qli);
            if (z) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            qlq.LIZJ = j2;
            qlq.LIZIZ = new Pair(qjn, Long.valueOf(j));
            qlq.LJ = countDownLatch;
            appLog.enqueue(qlq);
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public static void resetDidWhenSwitchChildMode(Context context, boolean z, long j, QJN qjn) {
        sAppLogApi.LJJIL(context, z, j, qjn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(8:77|78|79|80|(1:82)(1:134)|83|84|(14:86|87|88|89|(4:91|(1:113)(1:95)|96|97)|114|(1:118)|119|(1:122)|123|124|(1:126)|128|129))|136|89|(0)|114|(2:116|118)|119|(1:122)|123|124|(0)|128|129) */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0163, code lost:
    
        if (r4 != null) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0235 A[Catch: Exception -> 0x0250, TRY_LEAVE, TryCatch #0 {Exception -> 0x0250, blocks: (B:124:0x0229, B:126:0x0235), top: B:123:0x0229 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEvent(java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, long r34, boolean r36, org.json.JSONObject r37) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.onEvent(java.lang.String, java.lang.String, java.lang.String, long, long, boolean, org.json.JSONObject):void");
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(context, str, str2, str3, j, j2, false, jSONObject);
    }

    public static void com_ss_android_common_applog_AppLog__onEvent$___twin___(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        appendParamsToEvent(jSONObject);
        sAppLogApi.LJJJJIZL(str, str2, str3, j, j2, z, jSONObject);
    }

    public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        if ("event_v1".equalsIgnoreCase(str) && str2 != null && ((HashSet) C51643KOp.LIZ).contains(str2)) {
            return;
        }
        if ("event_v3".equalsIgnoreCase(str) && jSONObject != null && jSONObject.has("_staging_flag")) {
            jSONObject.remove("_staging_flag");
        }
        if (C3PG.LIZIZ.LIZIZ(str2, jSONObject)) {
            return;
        }
        com_ss_android_common_applog_AppLog__onEvent$___twin___(context, str, str2, str3, j, j2, z, jSONObject);
    }

    public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        InitModules.LIZLLL();
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_onEvent(context, str, str2, str3, j, j2, z, jSONObject);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q, X.POA] */
    public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        if (jSONObject == null) {
            com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_onEvent(context, str, str2, str3, j, j2, z, jSONObject);
            return;
        }
        PPC<POA, Boolean> ppc = new PPC<>();
        ppc.LIZ = new POA(str, str2, str3, jSONObject);
        PY7.LIZLLL.LJIILJJIL(ppc);
        if (ppc.LJFF == PPD.INTERCEPT) {
            return;
        }
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_onEvent(context, str, str2, str3, j, j2, z, jSONObject);
    }
}

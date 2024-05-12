package com.ss.android.deviceregister;

import X.C16880lQ;
import X.C48841JEv;
import X.C51643KOp;
import X.C58318Mug;
import X.C62814Ol0;
import X.C66843QLf;
import X.EF7;
import X.EnumC86803Y4x;
import X.F9J;
import X.InterfaceC39244Fai;
import X.InterfaceC66783QIx;
import X.InterfaceC66844QLg;
import X.InterfaceC66847QLj;
import X.InterfaceC66848QLk;
import X.InterfaceC66849QLl;
import X.QHL;
import X.QI9;
import X.QJ8;
import X.QJN;
import X.QJY;
import X.QJZ;
import X.QK9;
import X.QKB;
import X.QKS;
import X.QL0;
import X.QL2;
import X.QL3;
import X.QL9;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class DeviceRegisterManager {
    public static volatile boolean enableNetCommOpt = false;
    public static volatile InterfaceC66844QLg sAdIdConfig = null;
    public static volatile QL0 sAppTraitCallback = null;
    public static volatile String sAppVersionMinor = "";
    public static boolean sCheckPermissionBeforeCallSensitiveApi = false;
    public static Context sContext = null;
    public static volatile boolean sDeleteSharedStorage = true;
    public static volatile boolean sInitGuard = false;
    public static volatile DeviceRegisterManager sInstance = null;
    public static volatile boolean sIsTouristMode = false;
    public static volatile InterfaceC66848QLk sMacAddressApiCallback = null;
    public static volatile boolean sNeedSharedStorage = false;
    public static volatile boolean sOpenBpea = false;
    public static int sRetryCount = -1;
    public static volatile InterfaceC39244Fai sSensitiveApiCallback = null;
    public static volatile int sSwitchToBdtracker = -1;
    public static QL9 api = new QKB();
    public static QL9 mBdtrackerApi = new QI9();
    public static boolean sIsBoe = false;

    public static QL0 getAppTraitCallback() {
        return null;
    }

    public static String getDeviceId() {
        return com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
    }

    public static String getInstallId() {
        return com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId();
    }

    public static InterfaceC66848QLk getMacAddressApiCallback() {
        return null;
    }

    public static void getSSIDs(Map map) {
        com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getSSIDs(map);
    }

    public static void init(Context context, boolean z, boolean z2) {
        com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_init(context, z, z2);
    }

    public static void setAppTraitCallback(QL0 ql0) {
    }

    public static void setMacAddressApiCallback(InterfaceC66848QLk interfaceC66848QLk) {
    }

    public static void setUseGoogleAdId(boolean z) {
    }

    public static String com_ss_android_deviceregister_DeviceRegisterManager__getDeviceId$___twin___() {
        return api.getDeviceId();
    }

    public static String com_ss_android_deviceregister_DeviceRegisterManager__getInstallId$___twin___() {
        return api.LIZJ();
    }

    public static String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId() {
        if (!C51643KOp.LIZJ) {
            return F9J.LIZIZ(EF7.LIZIZ(), 0, "applog_stats").getString("device_id", "");
        }
        return com_ss_android_deviceregister_DeviceRegisterManager__getDeviceId$___twin___();
    }

    public static String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId() {
        if (!C62814Ol0.LJLILLLLZI) {
            return F9J.LIZIZ(EF7.LIZIZ(), 0, "applog_stats").getString("install_id", "");
        }
        return com_ss_android_deviceregister_DeviceRegisterManager__getInstallId$___twin___();
    }

    public static InterfaceC66844QLg getAdIdConfig() {
        if (sAdIdConfig == null) {
            sAdIdConfig = new C66843QLf();
        }
        return sAdIdConfig;
    }

    public static int getAppId() {
        return api.getAppId();
    }

    public static String getClientUDID() {
        return api.A3();
    }

    public static String getClientUDIDWithBackup() {
        return api.T3(sContext);
    }

    public static String getCustomVersion() {
        return api.b4();
    }

    public static String getDeviceIdWithBackup() {
        return api.t4(sContext);
    }

    public static String getFakePackage() {
        return api.v4();
    }

    public static String getInstallIdWithBackup() {
        return api.r4(sContext);
    }

    public static String getOpenIdWithBackup() {
        return api.C3(sContext);
    }

    public static String getOpenUdId() {
        return api.x4();
    }

    public static Map<String, String> getRequestHeader() {
        return api.g4(sContext);
    }

    public static String getRequestId() {
        return api.getRequestId();
    }

    public static boolean getSwitchToBdtracker() {
        if (sSwitchToBdtracker > 0) {
            return true;
        }
        return false;
    }

    public static int getVersionCode() {
        return api.getVersionCode();
    }

    public static String getVersionName() {
        return api.getVersionName();
    }

    public static boolean isChildMode() {
        return api.z3();
    }

    public static boolean isLocalTest() {
        return api.isLocalTest();
    }

    public static void tryWaitDeviceIdInit() {
        api.Z3(sContext);
    }

    public static void updateDeviceInfo() {
        api.L3();
    }

    public static void updateDidAndIid() {
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (!hasInit() || deviceRegisterManager == null) {
            return;
        }
        api.X3();
        QHL.LIZ("updateDidAndIid call  device_register");
    }

    public static boolean checkPermissionBeforeCallSensitiveApi() {
        return sCheckPermissionBeforeCallSensitiveApi;
    }

    public static String getAppVersionMinor() {
        return sAppVersionMinor;
    }

    public static QL9 getBdtrackerImpl() {
        return mBdtrackerApi;
    }

    public static InterfaceC39244Fai getBpeaApiCallback() {
        return sSensitiveApiCallback;
    }

    public static int getRetryCount() {
        return sRetryCount;
    }

    public static boolean hasInit() {
        return sInitGuard;
    }

    public static boolean isDeleteSharedStorage() {
        return sDeleteSharedStorage;
    }

    public static boolean isEnableNetCommOpt() {
        return enableNetCommOpt;
    }

    public static boolean isNeedSharedStorage() {
        return sNeedSharedStorage;
    }

    public static boolean isOpenBpe() {
        return sOpenBpea;
    }

    public static boolean isTouristMode() {
        return sIsTouristMode;
    }

    public static void addCustomerHeaser(Bundle bundle) {
        api.W3(bundle);
    }

    public static void addOnDeviceConfigUpdateListener(QJ8 qj8) {
        api.p4(qj8);
    }

    public static void checkPermissionBeforeCallSensitiveApi(boolean z) {
        sCheckPermissionBeforeCallSensitiveApi = z;
    }

    public static boolean clearWhenSwitchChildMode(boolean z) {
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (!hasInit() || deviceRegisterManager == null) {
            api.LIZIZ(z);
            return false;
        }
        return api.LJ(z);
    }

    public static void com_ss_android_deviceregister_DeviceRegisterManager__getSSIDs$___twin___(Map<String, String> map) {
        api.M3(sContext, map);
    }

    public static void com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getSSIDs(Map map) {
        if (!C51643KOp.LIZJ) {
            Context LIZIZ = EF7.LIZIZ();
            SharedPreferences LIZIZ2 = F9J.LIZIZ(LIZIZ, 0, "applog_stats");
            String string = LIZIZ2.getString("device_id", "");
            if (!TextUtils.isEmpty(string)) {
                map.put("device_id", string);
            }
            String string2 = LIZIZ2.getString("install_id", "");
            if (!TextUtils.isEmpty(string2)) {
                map.put("install_id", string2);
            }
            String string3 = F9J.LIZIZ(LIZIZ, 0, C48841JEv.LJIIJJI()).getString("openudid", null);
            if (!TextUtils.isEmpty(string3)) {
                map.put("openudid", string3);
            }
        }
        com_ss_android_deviceregister_DeviceRegisterManager__getSSIDs$___twin___(map);
    }

    public static void filterHeader(JSONObject jSONObject) {
        api.H3();
    }

    public static String getCdid(Context context) {
        return api.O3(context);
    }

    public static String getChannel(Context context) {
        return api.e4(context);
    }

    public static String getSigHash(Context context) {
        return QK9.LIZLLL(context);
    }

    public static String getUserAgent(Context context) {
        return api.c4(context);
    }

    public static boolean isNewUserMode(Context context) {
        return api.V3(context);
    }

    private void onCreate(Context context) {
        api.E3(context);
    }

    public static void onPause(Context context) {
        api.onPause();
    }

    public static void onResume(Context context) {
        api.onResume();
    }

    public static void setAdIdConfig(InterfaceC66844QLg interfaceC66844QLg) {
        if (interfaceC66844QLg == null) {
            return;
        }
        sAdIdConfig = interfaceC66844QLg;
    }

    public static void setAnonymous(boolean z) {
        api.h4(z);
    }

    public static void setAntiCheatingSwitch(boolean z) {
        api.j4(z);
    }

    public static void setAppContext(InterfaceC66783QIx interfaceC66783QIx) {
        api.LJFF(interfaceC66783QIx);
        QJY.LIZ = interfaceC66783QIx;
        if (getSwitchToBdtracker()) {
            getBdtrackerImpl().LJFF(interfaceC66783QIx);
        } else {
            QJZ.LIZLLL = interfaceC66783QIx;
        }
    }

    public static void setAppId(int i) {
        api.Y3(i);
    }

    public static void setAppLanguage(String str) {
        api.i4(str);
    }

    public static void setAppRegion(String str) {
        api.R3(str);
    }

    public static void setAppVersionMinor(String str) {
        sAppVersionMinor = str;
        api.u4();
    }

    public static void setChannel(String str) {
        api.n4(str);
    }

    public static void setChildModeBeforeInit(boolean z) {
        api.LIZIZ(z);
    }

    public static void setContext(Context context) {
        sContext = C16880lQ.LLLLL(context);
    }

    public static void setCustomMonitor(InterfaceC66847QLj interfaceC66847QLj) {
        api.l4();
    }

    public static void setCustomVersion(String str) {
        api.P3(str);
    }

    public static void setDeviceCategory(EnumC86803Y4x enumC86803Y4x) {
        api.I3(enumC86803Y4x);
    }

    public static void setEnableMigrate(boolean z) {
        api.U3(z);
    }

    public static void setEnableNetCommOpt(boolean z) {
        enableNetCommOpt = z;
    }

    public static void setFakePackage(String str) {
        api.m4(str);
    }

    public static void setForbidReportPhoneDetailInfo(boolean z) {
        api.s4(z);
    }

    public static void setILogDepend(QL3 ql3) {
        api.D3(ql3);
    }

    public static void setInitWithActivity(boolean z) {
        api.N3(z);
    }

    public static void setIsBoe(boolean z) {
        sIsBoe = z;
        QI9.LJIIIZ = z;
    }

    public static void setLocalTest(boolean z) {
        api.w4(z);
    }

    public static void setOpenBpea(boolean z) {
        sOpenBpea = z;
    }

    public static void setPreInstallChannelCallback(InterfaceC66849QLl interfaceC66849QLl) {
        api.F3();
    }

    public static void setReleaseBuild(String str) {
        api.a4(str);
    }

    public static void setRetryCount(int i) {
        sRetryCount = i;
    }

    public static void setSDKVersion(String str) {
        api.J3(str);
    }

    public static void setSensitiveApiCallback(InterfaceC39244Fai interfaceC39244Fai) {
        sSensitiveApiCallback = interfaceC39244Fai;
    }

    public static void setSwitchToBdtracker(boolean z) {
        sSwitchToBdtracker = z ? 1 : 0;
        if (z) {
            api = mBdtrackerApi;
        }
    }

    public static void setTouristMode(boolean z) {
        sIsTouristMode = z;
    }

    public DeviceRegisterManager(boolean z, boolean z2) {
        try {
            api.B3(sContext, z);
        } catch (Throwable unused) {
        }
    }

    public static void addCustomHeader(String str, Object obj) {
        api.k4(str, obj);
    }

    public static void clearDidAndIid(Context context, String str) {
        api.o4(context, str);
    }

    public static void enableEarlyRegisterNewUserModeService(Context context, String str) {
        try {
            if (TextUtils.equals(str, "local_test")) {
                synchronized (QKS.class) {
                    if (C58318Mug.LIZ(QKS.class) == null) {
                        QKS qks = (QKS) Class.forName("com.ss.android.deviceregister.newuser.NewUserModeManager").getConstructor(Context.class).newInstance(context);
                        ConcurrentHashMap<Class, Object> concurrentHashMap = C58318Mug.LIZ;
                        if (!concurrentHashMap.containsKey(QKS.class)) {
                            concurrentHashMap.put(QKS.class, qks);
                        }
                    }
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void saveAppTrack(Context context, JSONObject jSONObject) {
        api.Q3(context, jSONObject);
    }

    public static void setAccount(Context context, Account account) {
        api.LIZ(account);
    }

    public static void setContextAndUploader(Context context, QL2 ql2) {
        api.S3(context, ql2);
    }

    public static void setDeviceRegisterURL(String[] strArr, String[] strArr2) {
        api.q4(strArr, strArr2);
    }

    public static void setNewUserMode(Context context, boolean z) {
        api.K3(context, z);
    }

    public static void setSharedStorageConfig(boolean z, boolean z2) {
        sNeedSharedStorage = z;
        sDeleteSharedStorage = z2;
    }

    public static void updateUserAgentString(Context context, String str) {
        api.d4(context, str);
    }

    public static void activeUser(Context context, String str, String str2) {
        api.f4();
    }

    public static void com_ss_android_deviceregister_DeviceRegisterManager__init$___twin___(Context context, boolean z, boolean z2) {
        if (context != null) {
            sInitGuard = true;
            if (context instanceof Activity) {
                setInitWithActivity(true);
            }
            sContext = C16880lQ.LLLLL(context);
            if (sInstance == null) {
                synchronized (DeviceRegisterManager.class) {
                    if (sInstance == null) {
                        sInstance = new DeviceRegisterManager(z, z2);
                        sInstance.onCreate(context);
                    }
                }
            }
            Logger.debug();
            return;
        }
        throw new IllegalArgumentException("context = null");
    }

    public static void com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_init(Context context, boolean z, boolean z2) {
        com_ss_android_deviceregister_DeviceRegisterManager__init$___twin___(context, z, z2);
        C51643KOp.LIZJ = true;
    }

    public static boolean getHeader(Context context, JSONObject jSONObject, boolean z) {
        return api.G3(context, jSONObject, z);
    }

    public static void resetDidWhenSwitchChildMode(boolean z, long j, QJN qjn) {
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (!hasInit() || deviceRegisterManager == null) {
            api.LIZIZ(z);
        } else {
            api.y4(z, j, qjn);
        }
    }
}

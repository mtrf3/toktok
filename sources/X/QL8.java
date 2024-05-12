package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.ApplogServiceImpl;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QL8 implements QLA {
    public SharedPreferences LIZ;

    @Override // X.QLA
    public final String LIZJ() {
        if (AppLog.sInstance != null) {
            return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId();
        }
        return null;
    }

    @Override // X.QLA
    public final String LIZLLL() {
        QLP qlp;
        AppLog appLog = AppLog.sInstance;
        if (appLog != null && (qlp = appLog.mSession) != null) {
            return qlp.LIZIZ;
        }
        return null;
    }

    @Override // X.QLA
    public final String LJJIFFI() {
        if (AppLog.sInstance != null) {
            return DeviceRegisterManager.getClientUDID();
        }
        return null;
    }

    @Override // X.QLA
    public final JSONObject LJJIIJ() {
        AppLog appLog = AppLog.sInstance;
        if (appLog != null) {
            return appLog.mTimeSync;
        }
        return null;
    }

    @Override // X.QLA
    public final int LJJIIJZLJL() {
        AppLog appLog = AppLog.sInstance;
        if (appLog != null) {
            return appLog.mHttpMonitorPort;
        }
        return 0;
    }

    @Override // X.QLA
    public final long LJJIZ() {
        AppLog appLog = AppLog.sInstance;
        if (appLog != null) {
            return appLog.doGetLastActivteTime();
        }
        return 0L;
    }

    @Override // X.QLA
    public final void LJJJJJL() {
        AppLog.sAppCount++;
    }

    @Override // X.QLA
    public final int LJJJJLI() {
        SharedPreferences sharedPreferences = this.LIZ;
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getInt("content_encode_method", 0);
    }

    @Override // X.QLA
    public final void flush() {
        AppLog appLog = AppLog.sInstance;
        if (appLog != null) {
            appLog.enqueue(new QLQ(QLI.FLUSH_EVENT));
        }
    }

    @Override // X.QLA
    public final String getServerDeviceId() {
        if (AppLog.sInstance != null) {
            return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        }
        return null;
    }

    @Override // X.QLA
    public final String getUserId() {
        return String.valueOf(AppLog.sUserId.get());
    }

    @Override // X.QLA
    public final boolean LJJIJLIJ() {
        return DeviceRegisterManager.isEnableNetCommOpt();
    }

    @Override // X.QLA
    public final String LJJJI() {
        return DeviceRegisterManager.getAppVersionMinor();
    }

    @Override // X.QLA
    public final String LJIIIZ() {
        return AppLog.sAbSDKVersion;
    }

    @Override // X.QLA
    public final InterfaceC66739QHf LJIIJJI() {
        return AppLog.logCompressor;
    }

    @Override // X.QLA
    public final JSONObject LJJIJ() {
        return AppLog.sHeaderCopy;
    }

    @Override // X.QLA
    public final String LJJIJIL() {
        return AppLog.sUserUniqueId;
    }

    @Override // X.QLA
    public final InterfaceC1294656g LJJIJL() {
        return AppLog.sIHeaderCustomTimelyCallback;
    }

    @Override // X.QLA
    public final String getSessionKey() {
        return AppLog.sSessionKey;
    }

    @Override // X.QLA
    public final void LIZIZ(boolean z) {
        AppLog.sChildMode = z;
    }

    @Override // X.QLA
    public final void LJ(boolean z) {
        AppLog.clearOrResetWhenSwitchChildMode(z, QLI.CLEAR_WHEN_SWITCH_CHILD_MODE, 0L, null);
    }

    @Override // X.QLA
    public final void LJFF(InterfaceC66783QIx interfaceC66783QIx) {
        AppLog.sAppContext = interfaceC66783QIx;
        DeviceRegisterManager.setAppContext(interfaceC66783QIx);
    }

    @Override // X.QLA
    public final void LJI(Context context) {
        AppLog.sHasManualInvokeActiveUser = true;
        AppLog.activeUserInvokeInternal(C16880lQ.LLLLL(context));
    }

    @Override // X.QLA
    public final void LJII(String str) {
        AppLog.sAbSDKVersion = str;
    }

    @Override // X.QLA
    public final void LJIIIIZZ(JSONObject jSONObject) {
        AppLog appLog = AppLog.sInstance;
        if (appLog != null) {
            synchronized (AppLog.sLock) {
                if (jSONObject == null) {
                    return;
                }
                try {
                    JSONObject jSONObject2 = appLog.mHeader;
                    if (jSONObject2 != null) {
                        jSONObject2.put("app_track", jSONObject);
                    }
                    appLog.saveAppTrack(jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.QLA
    public final void LJIIJ(long j) {
        AppLog.sStartLogReaperDelay = j;
    }

    @Override // X.QLA
    public final void LJIIL(boolean z) {
        if (!AppLog.sInitGuard) {
            DeviceRegisterManager.setUseGoogleAdId(z);
            return;
        }
        throw new IllegalStateException("please call before init");
    }

    @Override // X.QLA
    public final void LJIILIIL(boolean z) {
        AppLog.sUserIdIsolateEnabled = z;
    }

    @Override // X.QLA
    public final void LJIILJJIL(boolean z) {
        AppLog.sAdjustTerminate = z;
    }

    @Override // X.QLA
    public final void LJIILL(String str) {
        AppLog.sSessionKey = str;
    }

    @Override // X.QLA
    public final void LJIILLIIL(boolean z) {
        AppLog.sEnableEventSampling = z;
    }

    @Override // X.QLA
    public final void LJIIZILJ(boolean z) {
        AppLog.sTerminateImmediately = z;
    }

    @Override // X.QLA
    public final void LJIJ(Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.size() > 0) {
                    AppLog appLog = AppLog.sInstance;
                    if (appLog != null) {
                        appLog.addCustomerHeader(bundle);
                    } else {
                        Bundle bundle2 = AppLog.sCustomBundle;
                        synchronized (bundle2) {
                            bundle2.putAll(bundle);
                        }
                    }
                    DeviceRegisterManager.addCustomerHeaser(bundle);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.QLA
    public final AppLog LJIJI(Context context) {
        DeviceRegisterManager.enableEarlyRegisterNewUserModeService(context, QK9.LIZ);
        synchronized (AppLog.sLock) {
            if (AppLog.sStopped) {
                return null;
            }
            if (AppLog.sInstance == null) {
                AppLog.sInstance = new AppLog(context);
                Logger.debug();
            }
            return AppLog.sInstance;
        }
    }

    @Override // X.QLA
    public final void LJIJJ(java.util.Map<String, String> map) {
        AppLog appLog;
        synchronized (AppLog.sLock) {
            if (!AppLog.sStopped) {
                appLog = AppLog.sInstance;
            } else {
                appLog = null;
            }
        }
        if (appLog == null) {
            return;
        }
        DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getSSIDs(map);
        String valueOf = String.valueOf(AppLog.sUserId.get());
        if (valueOf != null) {
            map.put("user_id", valueOf);
        }
    }

    @Override // X.QLA
    public final void LJIL(boolean z) {
        DeviceRegisterManager.setEnableNetCommOpt(z);
    }

    @Override // X.QLA
    public final boolean LJJ(String str) {
        return QJY.LJFF(str);
    }

    @Override // X.QLA
    public final void LJJI(InterfaceC66829QKr interfaceC66829QKr) {
        AppLog.sGlobalEventCallback = interfaceC66829QKr;
    }

    @Override // X.QLA
    public final void LJJII(QLN qln) {
        QLK.LIZ = qln;
    }

    @Override // X.QLA
    public final void LJJIII(long j) {
        AppLog.sUserId.set(j);
        AppLog appLog = AppLog.sInstance;
        if (appLog != null) {
            appLog.notifyConfigUpdate();
        }
    }

    @Override // X.QLA
    public final void LJJIIZ(Context context) {
        if (context instanceof Activity) {
            String name = context.getClass().getName();
            int hashCode = context.hashCode();
            if (TextUtils.isEmpty(name)) {
                return;
            }
            QLZ qlz = new QLZ(name, hashCode);
            AppLog LJIJI = LJIJI(context);
            if (LJIJI != null) {
                LJIJI.onActivityPause(qlz);
            }
            DeviceRegisterManager.onPause(context);
        }
    }

    @Override // X.QLA
    public final void LJJIIZI(Context context) {
        if (context instanceof Activity) {
            AppLog.sLastCreateActivityName = context.getClass().getName();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(AppLog.sLastCreateActivityName);
            LIZ.append("(");
            LIZ.append(String.valueOf(System.currentTimeMillis()));
            LIZ.append(")");
            AppLog.sLastCreateActivityNameAndTime = X1D.LIZIZ(LIZ);
        }
    }

    @Override // X.QLA
    public final void LJJIJIIJI(InterfaceC66755QHv interfaceC66755QHv) {
        AppLog.sUserIdIsolateCallback = interfaceC66755QHv;
    }

    @Override // X.QLA
    public final void LJJIJIIJIL(QJG qjg) {
        if (qjg == null) {
            AppLog.sConfigUpdateListener = null;
        } else {
            AppLog.sConfigUpdateListener = new WeakReference<>(qjg);
        }
    }

    @Override // X.QLA
    public final void LJJJJ(QJ5 qj5) {
        List<QJ5> list = AppLog.sSessionHookList;
        synchronized (list) {
            if (list.contains(qj5)) {
                return;
            }
            list.add(qj5);
        }
    }

    @Override // X.QLA
    public final void LJJJJI(Context context) {
        if (context instanceof Activity) {
            String name = context.getClass().getName();
            int hashCode = context.hashCode();
            if (!TextUtils.isEmpty(name)) {
                AppLog.sLastResumeActivityName = name;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(AppLog.sLastResumeActivityName);
                LIZ.append("(");
                LIZ.append(String.valueOf(System.currentTimeMillis()));
                LIZ.append(")");
                AppLog.sLastResumeActivityNameAndTime = X1D.LIZIZ(LIZ);
                QLZ qlz = new QLZ(name, hashCode);
                AppLog LJIJI = LJIJI(context);
                if (LJIJI != null) {
                    LJIJI.onActivityResume(qlz);
                }
                DeviceRegisterManager.onResume(context);
            }
        }
        if (!AppLog.sHasManualInvokeActiveUser) {
            AppLog.activeUserInvokeInternal(C16880lQ.LLLLL(context));
        }
    }

    @Override // X.QLA
    public final void LJJJJJ(QJH qjh) {
        AppLog.sLogEncryptCfg = qjh;
    }

    @Override // X.QLA
    public final void LJJJJL(InterfaceC66830QKs interfaceC66830QKs) {
        QJZ.LJIIL = interfaceC66830QKs;
    }

    @Override // X.QLA
    public final void LJJJJLL(InterfaceC39244Fai interfaceC39244Fai) {
        DeviceRegisterManager.setSensitiveApiCallback(interfaceC39244Fai);
    }

    @Override // X.QLA
    public final void registerHeaderCustomCallback(InterfaceC1294656g interfaceC1294656g) {
        AppLog.sIHeaderCustomTimelyCallback = interfaceC1294656g;
    }

    @Override // X.QLA
    public final void LJIJJLI(String str, JSONObject jSONObject) {
        N3D n3d;
        QIU qiu = QIU.log_data;
        QIV.LIZ(qiu, QIL.init);
        if (AppLog.sStopped || C38354F3m.LJ(str) || jSONObject == null || jSONObject.length() <= 0) {
            QIV.LIZ(qiu, QIL.f_block);
            return;
        }
        AppLog appLog = AppLog.sInstance;
        if (appLog != null) {
            if (AppLog.sEnableEventSampling && (n3d = AppLog.sEventSampling) != null && n3d.LIZ(appLog.buildSamplingUser(), "log_data", jSONObject)) {
                QIV.LIZ(qiu, QIL.f_sampling);
                return;
            }
            if (C66744QHk.LIZ().LIZ.isEnable()) {
                jSONObject.put("log_type", str);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                C66744QHk.LIZ().LIZJ("log_data", jSONArray);
            }
            QLQ qlq = new QLQ(QLI.SAVE_MISC_LOG);
            qlq.LIZLLL = str;
            qlq.LIZIZ = jSONObject;
            appLog.enqueue(qlq);
            return;
        }
        QIV.LIZ(qiu, QIL.f_not_init);
    }

    @Override // X.QLA
    public final void LJJJIL(List<String> list, boolean z) {
        AbstractC36814Ecc c36816Ece;
        AbstractC36814Ecc abstractC36814Ecc = null;
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                if (z) {
                    c36816Ece = new C36815Ecd(hashSet, null);
                } else {
                    c36816Ece = new C36816Ece(hashSet, null);
                }
                abstractC36814Ecc = c36816Ece;
            }
        }
        AppLog.sEventFilterFromClient = abstractC36814Ecc;
    }

    @Override // X.QLA
    public final void LJJJ(Context context, boolean z, C66763QId c66763QId) {
        if (AppLog.isMainProcess) {
            if (c66763QId != null) {
                AppLog.urlConfig = c66763QId;
                DeviceRegisterManager.setDeviceRegisterURL(c66763QId.LJ, c66763QId.LIZLLL);
                AppLog.sInitGuard = true;
                if (context instanceof Activity) {
                    AppLog.sInitWithActivity = true;
                }
                if (AppLog.logCompressor == null) {
                    try {
                        Class.forName("com.bytedance.applog.compress.CompressManager");
                        AppLog.logCompressor = new QHH(context);
                    } catch (Throwable unused) {
                    }
                }
                LJIJI(context);
                if (!AppLog.mHasHandledCache) {
                    AppLog.mHasHandledCache = true;
                    QLV LIZ = QLV.LIZ();
                    LIZ.getClass();
                    new QLH(LIZ).LIZ();
                }
                AppLog.sHasManualInvokeActiveUser = !z;
                AppLog.mLaunchFrom = 1;
                this.LIZ = F9J.LIZIZ(context, 0, "applog_stats");
                if (AppLog.isEnableNetCommOpt()) {
                    if (C48305IxZ.LIZJ == null) {
                        synchronized (C48305IxZ.class) {
                            if (C48305IxZ.LIZJ == null) {
                                C48305IxZ.LIZJ = new C48305IxZ(context);
                            }
                        }
                    }
                    QJZ.LJIIJJI = C48305IxZ.LIZJ;
                }
                ApplogServiceImpl.isServicePrepared = true;
                ApplogServiceImpl.handleCachedData();
                return;
            }
            throw new IllegalArgumentException("urlConfig must not be null");
        }
        throw new IllegalArgumentException("Only support main process init!");
    }

    @Override // X.QLA
    public final void LJJIL(Context context, boolean z, long j, QJN qjn) {
        AppLog.clearOrResetWhenSwitchChildMode(z, QLI.RESET_WHEN_SWITCH_CHILD_MODE, j, qjn);
    }

    @Override // X.QLA
    public final void LJJJJIZL(String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        QIV.LIZIZ(str, QIL.init);
        AppLog appLog = AppLog.sInstance;
        if (appLog == null) {
            QLV LIZ = QLV.LIZ();
            synchronized (LIZ.LIZ) {
                if (LIZ.LIZ.size() > 200) {
                    QLO poll = LIZ.LIZ.poll();
                    QLK.LIZ(1, 1, null);
                    if (poll != null) {
                        QIV.LIZIZ(poll.LIZ, QIL.f_cache);
                    }
                }
                LIZ.LIZ.add(new QLO(str, str2, str3, j, j2, z, jSONObject));
            }
            return;
        }
        if (C38354F3m.LJ(str) || C38354F3m.LJ(str2)) {
            QLK.LIZ(1, 0, null);
            QIV.LIZIZ(str, QIL.f_block);
        } else {
            appLog.onEvent(str, str2, str3, j, j2, z, jSONObject);
        }
    }
}

package X;

import Y.ARunnableS47S0100000_11;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.AppLog;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.ApplogServiceImpl;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QI8 implements QLA {
    public static volatile boolean LIZ = false;
    public static volatile QIN LIZIZ = null;
    public static volatile InterfaceC66783QIx LIZJ = null;
    public static volatile QJH LIZLLL = null;
    public static volatile String LJ = null;
    public static volatile InterfaceC1294656g LJFF = null;
    public static volatile String LJI = "";
    public static volatile InterfaceC66830QKs LJII;
    public static WeakReference<QJG> LJIIIIZZ;
    public static volatile boolean LJIIIZ;
    public static volatile boolean LJIIJ;
    public static volatile C39245Faj LJIIJJI;
    public static long LJIIL;
    public static InterfaceC66829QKr LJIILIIL;
    public static final Bundle LJIILJJIL = new Bundle();
    public static final ConcurrentHashMap<QJ5, QJC> LJIILL = new ConcurrentHashMap<>();

    @Override // X.QLA
    public final void LJIIL(boolean z) {
    }

    @Override // X.QLA
    public final void LJJII(QLN qln) {
    }

    @Override // X.QLA
    public final void LJJIIZI(Context context) {
    }

    @Override // X.QLA
    public final String LJJIJIL() {
        return null;
    }

    @Override // X.QLA
    public final long LJJIZ() {
        return 0L;
    }

    @Override // X.QLA
    public final String LJJJI() {
        return "";
    }

    @Override // X.QLA
    public final void LJJJJJL() {
    }

    @Override // X.QLA
    public final int LJJJJLI() {
        return 0;
    }

    public static void LIZ() {
        Bundle bundle = LJIILJJIL;
        if (bundle.size() > 0) {
            Bundle bundle2 = new Bundle();
            synchronized (bundle) {
                bundle2.putAll(bundle);
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                hashMap.put(str, C16880lQ.LLJJIII(bundle2, str));
            }
            AppLog.LJII(hashMap);
        }
    }

    @Override // X.QLA
    public final String LJIIIZ() {
        String LIZIZ2 = AppLog.LIZ.LIZIZ();
        if (!TextUtils.isEmpty(LIZIZ2)) {
            return LIZIZ2;
        }
        return LJ;
    }

    @Override // X.QLA
    public final InterfaceC66739QHf LJIIJJI() {
        return AppLog.LIZ.LJJIJIIJIL;
    }

    @Override // X.QLA
    public final JSONObject LJJIIJ() {
        return AppLog.LIZ.LJFF.LIZ;
    }

    @Override // X.QLA
    public final int LJJIIJZLJL() {
        QI3 qi3 = AppLog.LIZ;
        if (qi3.LJIIJJI == null) {
            return 0;
        }
        return qi3.LJIIJJI.LJ.getInt("http_monitor_port", 0);
    }

    @Override // X.QLA
    public final JSONObject LJJIJ() {
        JSONObject LIZLLL2 = AppLog.LIZ.LIZLLL();
        if (LIZLLL2 != null) {
            try {
                return new JSONObject(LIZLLL2, QJL.LIZ);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // X.QLA
    public final void flush() {
        QI3 qi3 = AppLog.LIZ;
        if (qi3.LJIILIIL != null) {
            qi3.LJIILIIL.LJIIIIZZ(null, true);
        }
    }

    @Override // X.QLA
    public final String getServerDeviceId() {
        return AppLog.LIZ.LIZJ();
    }

    public QI8() {
        new ArrayList();
    }

    @Override // X.QLA
    public final String LIZJ() {
        return AppLog.LIZJ();
    }

    @Override // X.QLA
    public final String LIZLLL() {
        return AppLog.getSessionId();
    }

    @Override // X.QLA
    public final String LJJIFFI() {
        return AppLog.LIZIZ();
    }

    @Override // X.QLA
    public final String getUserId() {
        return AppLog.LJ();
    }

    @Override // X.QLA
    public final InterfaceC1294656g LJJIJL() {
        return LJFF;
    }

    @Override // X.QLA
    public final boolean LJJIJLIJ() {
        return LJIIJ;
    }

    @Override // X.QLA
    public final String getSessionKey() {
        return LJI;
    }

    @Override // X.QLA
    public final void LIZIZ(boolean z) {
        LJIIIZ = z;
    }

    @Override // X.QLA
    public final void LJ(boolean z) {
        QI3 qi3 = AppLog.LIZ;
        if (qi3.LJIILIIL != null) {
            qi3.LJIILIIL.LIZ(z, 18, 0L, null);
        }
    }

    @Override // X.QLA
    public final void LJFF(InterfaceC66783QIx interfaceC66783QIx) {
        LIZJ = interfaceC66783QIx;
        C66795QJj.LIZIZ.LIZIZ = new C66784QIy(interfaceC66783QIx);
        DeviceRegisterManager.setAppContext(interfaceC66783QIx);
    }

    @Override // X.QLA
    public final void LJI(Context context) {
        C66765QIf c66765QIf = (C66765QIf) AppLog.LIZ.LJIJJ.LIZ();
        Context LIZLLL2 = c66765QIf.LIZLLL();
        if (LIZLLL2 == null) {
            return;
        }
        c66765QIf.LIZLLL.LIZIZ(LIZLLL2).LIZIZ();
    }

    @Override // X.QLA
    public final void LJII(String str) {
        LJ = str;
        AppLog.LJI(str);
    }

    @Override // X.QLA
    public final void LJIIIIZZ(JSONObject jSONObject) {
        QI3 qi3 = AppLog.LIZ;
        if (jSONObject == null) {
            qi3.getClass();
            return;
        }
        C66760QIa c66760QIa = qi3.LJIJJ;
        if (c66760QIa == null) {
            qi3.LJJIZ.LJIIJJI("Init first please to set app track", new Object[0]);
            return;
        }
        Application application = qi3.LJIIJ;
        synchronized (C66760QIa.class) {
            if (c66760QIa.LIZ != null) {
                c66760QIa.LIZ.LJJI = jSONObject;
            } else {
                C66765QIf c66765QIf = (C66765QIf) c66760QIa.LIZ();
                c66765QIf.getClass();
                if (application != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("app_track", jSONObject.toString());
                    c66765QIf.LIZLLL.LIZIZ(application).LJFF(application, hashMap, false);
                }
            }
        }
    }

    @Override // X.QLA
    public final void LJIIJ(long j) {
        LJIIL = j;
    }

    @Override // X.QLA
    public final void LJIILIIL(boolean z) {
        QI3 qi3 = AppLog.LIZ;
        qi3.LJJIJL = z;
        qi3.LJJIJLIJ = EnumC66752QHs.USER_ID;
    }

    @Override // X.QLA
    public final void LJIILJJIL(boolean z) {
        QI3 qi3 = AppLog.LIZ;
        qi3.LJIL = z;
        qi3.LJIIL(Boolean.valueOf(z), "Dau Fix");
    }

    @Override // X.QLA
    public final void LJIILL(String str) {
        LJI = str;
    }

    @Override // X.QLA
    public final void LJIILLIIL(boolean z) {
        QI3 qi3 = AppLog.LIZ;
        qi3.LJJ = z;
        qi3.LJIIL(Boolean.valueOf(z), "Event Sampling");
    }

    @Override // X.QLA
    public final void LJIIZILJ(boolean z) {
        AppLog.LIZ.LJJIIZI = z;
    }

    @Override // X.QLA
    public final void LJIJ(Bundle bundle) {
        if (bundle == null || bundle.size() <= 0) {
            return;
        }
        try {
            if (AppLog.LIZ.LJIILL) {
                HashMap hashMap = new HashMap();
                for (String str : bundle.keySet()) {
                    hashMap.put(str, C16880lQ.LLJJIII(bundle, str));
                }
                AppLog.LJII(hashMap);
                return;
            }
            Bundle bundle2 = LJIILJJIL;
            synchronized (bundle2) {
                bundle2.putAll(bundle);
            }
        } catch (Throwable th) {
            QHL.LIZIZ("NewAppLogBdtrackerImpl setCustomerHeader", th);
        }
    }

    @Override // X.QLA
    public final com.ss.android.common.applog.AppLog LJIJI(Context context) {
        return com.ss.android.common.applog.AppLog.getInstance(context, true);
    }

    @Override // X.QLA
    public final void LJIJJ(java.util.Map<String, String> map) {
        if (map != null) {
            AppLog.LIZLLL(map);
            String LJ2 = AppLog.LJ();
            if (LJ2 != null) {
                map.put("user_id", LJ2);
            }
        }
    }

    @Override // X.QLA
    public final void LJIL(boolean z) {
        LJIIJ = z;
    }

    @Override // X.QLA
    public final boolean LJJ(String str) {
        return !C66735QHb.LIZ(str);
    }

    @Override // X.QLA
    public final void LJJI(InterfaceC66829QKr interfaceC66829QKr) {
        if (interfaceC66829QKr == null) {
            return;
        }
        LJIILIIL = interfaceC66829QKr;
        C66781QIv c66781QIv = new C66781QIv();
        QIY qiy = AppLog.LIZ.LIZIZ;
        if (qiy.LIZ(0)) {
            ((ConcurrentHashMap) qiy.LIZ).put(0, new CopyOnWriteArraySet());
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) qiy.LIZ).get(0);
        if (copyOnWriteArraySet != null) {
            copyOnWriteArraySet.add(c66781QIv);
        }
    }

    @Override // X.QLA
    public final void LJJIII(long j) {
        QJG qjg;
        AppLog.LIZ.LJIILIIL(j);
        WeakReference<QJG> weakReference = LJIIIIZZ;
        if (weakReference != null && (qjg = weakReference.get()) != null) {
            try {
                qjg.LIZ();
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.QLA
    public final void LJJIIZ(Context context) {
        String name;
        QI3 qi3 = AppLog.LIZ;
        qi3.getClass();
        if (context instanceof Activity) {
            qi3.LJIILJJIL.onActivityPaused(null);
            return;
        }
        QIX qix = qi3.LJJIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPause context: ");
        if (context == null) {
            name = "null";
        } else {
            name = context.getClass().getName();
        }
        LIZ2.append(name);
        qix.LJIILL(null, X1D.LIZIZ(LIZ2), null, new Object[0]);
    }

    @Override // X.QLA
    public final void LJJIJIIJI(InterfaceC66755QHv interfaceC66755QHv) {
        AppLog.LIZ.LJJIL = new C66754QHu(interfaceC66755QHv);
    }

    @Override // X.QLA
    public final void LJJIJIIJIL(QJG qjg) {
        if (qjg == null) {
            LJIIIIZZ = null;
        } else {
            LJIIIIZZ = new WeakReference<>(qjg);
            AppLog.LIZ(new C66785QIz(qjg));
        }
    }

    @Override // X.QLA
    public final void LJJJJ(QJ5 qj5) {
        if (qj5 == null) {
            return;
        }
        QJ2 qj2 = new QJ2(qj5);
        LJIILL.put(qj5, qj2);
        AppLog.LIZ.LIZ.LIZ.add(qj2);
    }

    @Override // X.QLA
    public final void LJJJJI(Context context) {
        String name;
        QI3 qi3 = AppLog.LIZ;
        qi3.getClass();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            context.hashCode();
            if (activity != null) {
                qi3.LJIILJJIL.onActivityResumed(activity);
                return;
            }
            return;
        }
        QIX qix = qi3.LJJIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onResume context: ");
        if (context == null) {
            name = "null";
        } else {
            name = context.getClass().getName();
        }
        LIZ2.append(name);
        qix.LJIILL(null, X1D.LIZIZ(LIZ2), null, new Object[0]);
    }

    @Override // X.QLA
    public final void LJJJJJ(QJH qjh) {
        if (LIZ) {
            return;
        }
        LIZLLL = qjh;
    }

    @Override // X.QLA
    public final void LJJJJL(InterfaceC66830QKs interfaceC66830QKs) {
        if (LIZ) {
            return;
        }
        LJII = interfaceC66830QKs;
    }

    @Override // X.QLA
    public final void LJJJJLL(InterfaceC39244Fai interfaceC39244Fai) {
        if (interfaceC39244Fai == null) {
            LJIIJJI = null;
        } else {
            LJIIJJI = new C39245Faj(interfaceC39244Fai);
        }
    }

    @Override // X.QLA
    public final void registerHeaderCustomCallback(InterfaceC1294656g interfaceC1294656g) {
        LJFF = interfaceC1294656g;
        AppLog.LIZ.LJIILLIIL = new QJ6();
    }

    @Override // X.QLA
    public final void LJIJJLI(String str, JSONObject jSONObject) {
        AppLog.onMiscEvent(str, jSONObject);
    }

    @Override // X.QLA
    public final void LJJJIL(List<String> list, boolean z) {
        AbstractC66736QHc c66737QHd;
        QI3 qi3 = AppLog.LIZ;
        AbstractC66736QHc abstractC66736QHc = null;
        if (list != null) {
            qi3.getClass();
            if (!list.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (String str : list) {
                    if (!TextUtils.isEmpty(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    if (z) {
                        c66737QHd = new C66738QHe(qi3, hashSet, null);
                    } else {
                        c66737QHd = new C66737QHd(qi3, hashSet, null);
                    }
                    abstractC66736QHc = c66737QHd;
                }
            }
        }
        qi3.LJIIZILJ = abstractC66736QHc;
    }

    @Override // X.QLA
    public final void LJJJ(Context context, boolean z, C66763QId c66763QId) {
        boolean z2;
        String str;
        String[] strArr;
        boolean z3;
        boolean z4;
        if (LIZJ != null) {
            QI3 qi3 = AppLog.LIZ;
            qi3.LJJIFFI = false;
            long j = com.ss.android.common.applog.AppLog.sUserId.get();
            if (j > 0 && AppLog.LJ() == null) {
                qi3.LJIILIIL(j);
            }
            LIZIZ = new QIN(String.valueOf(DeviceRegisterManager.getAppId()), DeviceRegisterManager.getChannel(context));
            QIN qin = LIZIZ;
            if (LJIIL <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            qin.LIZIZ = z2;
            QIN qin2 = LIZIZ;
            if (c66763QId == null) {
                qin2.LJIIJ = null;
            } else {
                C66779QIt c66779QIt = new C66779QIt();
                String[] strArr2 = QI9.LJII;
                if (strArr2 != null && strArr2.length > 0) {
                    int length = strArr2.length;
                    for (int i = 0; i < length; i++) {
                        str = strArr2[i];
                        if (!TextUtils.isEmpty(str)) {
                            break;
                        }
                    }
                }
                str = null;
                if (TextUtils.isEmpty(str) && (strArr = c66763QId.LJ) != null && strArr.length > 0) {
                    int length2 = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr[i2];
                        if (!TextUtils.isEmpty(str2)) {
                            str = str2;
                            break;
                        }
                        i2++;
                    }
                }
                String str3 = QI9.LJIIIIZZ;
                if (TextUtils.isEmpty(str3)) {
                    str3 = c66763QId.LIZLLL[0];
                }
                c66779QIt.LIZLLL = new C48852JFg(new C48306Ixa(str, str3), true, QI9.LJIIIZ, LJIIIZ);
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = c66763QId.LIZ;
                if (strArr3 != null && strArr3.length > 0) {
                    for (String str4 : strArr3) {
                        if (!TextUtils.isEmpty(str4)) {
                            arrayList.add(str4);
                        }
                    }
                }
                String[] strArr4 = c66763QId.LJFF;
                if (strArr4 != null && strArr4.length > 0) {
                    for (String str5 : strArr4) {
                        if (!TextUtils.isEmpty(str5)) {
                            arrayList.add(str5);
                        }
                    }
                }
                c66779QIt.LIZ = (String[]) arrayList.toArray(new String[arrayList.size()]);
                c66779QIt.LIZIZ = c66763QId.LIZJ;
                if (!TextUtils.isEmpty(c66763QId.LIZIZ)) {
                    c66779QIt.LIZJ = c66763QId.LIZIZ;
                } else {
                    c66779QIt.LIZJ = c66763QId.LJI;
                }
                qin2.LJIIJ = new C66770QIk(c66779QIt);
            }
            LIZIZ.LJIJJ = z;
            if (LIZLLL != null) {
                try {
                    z3 = LIZLLL.LIZ();
                } catch (Throwable th) {
                    QHL.LIZIZ("NewAppLogBdtrackerImpl getEncryptSwitch", th);
                    z3 = true;
                }
                try {
                    z4 = LIZLLL.LIZJ();
                } catch (Throwable th2) {
                    QHL.LIZIZ("NewAppLogBdtrackerImpl getRecoverySwitch", th2);
                    z4 = true;
                }
            } else {
                z4 = true;
                z3 = true;
            }
            QI3 qi32 = AppLog.LIZ;
            qi32.LJIJI = z3;
            LIZIZ.LJIJJLI = z4;
            LIZIZ.LJFF = QI9.LJI;
            LIZIZ.getClass();
            String fakePackage = DeviceRegisterManager.getFakePackage();
            if (!TextUtils.isEmpty(fakePackage)) {
                LIZIZ.LJIIZILJ = fakePackage;
            }
            LIZIZ.getClass();
            LIZIZ.LJIILLIIL = "";
            if (!TextUtils.isEmpty(null)) {
                QIN qin3 = LIZIZ;
                qin3.getClass();
                if (!TextUtils.isEmpty(null)) {
                    qin3.LJIL = null;
                }
            }
            if (!TextUtils.isEmpty(null)) {
                QIN qin4 = LIZIZ;
                qin4.getClass();
                if (!TextUtils.isEmpty(null)) {
                    qin4.LJJ = null;
                }
            }
            String customVersion = DeviceRegisterManager.getCustomVersion();
            if (!TextUtils.isEmpty(customVersion)) {
                LIZIZ.LJIIJJI = customVersion;
            } else if (!TextUtils.isEmpty(LIZJ.getVersion())) {
                LIZIZ.LJIIJJI = LIZJ.getVersion();
            }
            if (!TextUtils.isEmpty(null)) {
                LIZIZ.LIZLLL = null;
            }
            if (!TextUtils.isEmpty(null)) {
                LIZIZ.LJ = null;
            }
            String str6 = QI9.LJIIJ;
            if (!TextUtils.isEmpty(str6)) {
                LIZIZ.LJIIIIZZ = str6;
            }
            if (LJII != null && !TextUtils.isEmpty(LJII.LIZ())) {
                LIZIZ.getClass();
            }
            QIN qin5 = LIZIZ;
            com.ss.android.common.applog.AppLog.getBDInstallInitHook();
            qin5.getClass();
            LIZIZ.LJI = DeviceRegisterManager.isLocalTest();
            if (!TextUtils.isEmpty(LIZJ.getAppName())) {
                LIZIZ.LJIIIZ = LIZJ.getAppName();
            }
            if (LIZJ.getVersionCode() != 0) {
                LIZIZ.LJIILIIL = LIZJ.getVersionCode();
            }
            if (LIZJ.getUpdateVersionCode() != 0) {
                LIZIZ.LJIILJJIL = LIZJ.getUpdateVersionCode();
            }
            if (!TextUtils.isEmpty(LIZJ.LIZIZ())) {
                LIZIZ.LJIIL = LIZJ.LIZIZ();
            }
            if (LIZJ.getManifestVersionCode() != 0) {
                LIZIZ.LJIILL = LIZJ.getManifestVersionCode();
            }
            if (!TextUtils.isEmpty(LIZJ.LIZJ())) {
                QIN qin6 = LIZIZ;
                LIZJ.LIZJ();
                qin6.getClass();
            }
            LIZIZ.LJJI = new C66782QIw();
            LIZIZ.LJIJ = new C66801QJp();
            LIZIZ.LJJIII = false;
            QIN qin7 = LIZIZ;
            qi32.getClass();
            qin7.LJJIFFI = false;
            QIN qin8 = LIZIZ;
            DeviceRegisterManager.getAppTraitCallback();
            qin8.getClass();
            LIZIZ.LJIJI = com.ss.android.common.applog.AppLog.isEnableListenNetChange();
            QIN qin9 = LIZIZ;
            qin9.getClass();
            qin9.LJII = 1;
            LIZIZ.getClass();
            LIZIZ.LJJIIJ = true;
            LIZIZ.LJJIIJZLJL = LJIIJJI;
            LIZIZ.LJJII = false;
            QIN qin10 = LIZIZ;
            synchronized (AppLog.class) {
                if (!AppLog.LIZIZ) {
                    AppLog.LIZIZ = true;
                    if (TextUtils.isEmpty(qin10.LJJ) && !TextUtils.isEmpty("applog_stats")) {
                        qin10.LJJ = "applog_stats";
                    }
                    qi32.LJII(context, qin10);
                } else {
                    throw new RuntimeException("Default AppLog is initialized, please new a instance by `AppLog.newInstance()`.");
                }
            }
            C51643KOp.LIZJ = true;
            C62814Ol0.LJLILLLLZI = true;
            if (!TextUtils.isEmpty(LJ)) {
                AppLog.LJI(LJ);
            } else if (!TextUtils.isEmpty(com.ss.android.common.applog.AppLog.tempAbSDKVersion)) {
                LJII(com.ss.android.common.applog.AppLog.tempAbSDKVersion);
            }
            if (LJFF == null && com.ss.android.common.applog.AppLog.sIHeaderCustomTimelyCallback != null) {
                registerHeaderCustomCallback(com.ss.android.common.applog.AppLog.sIHeaderCustomTimelyCallback);
            }
            if (LJIILIIL == null && com.ss.android.common.applog.AppLog.sGlobalEventCallback != null) {
                LJJI(com.ss.android.common.applog.AppLog.sGlobalEventCallback);
            }
            qi32.getClass();
            if (!TextUtils.isEmpty("_debug_flag")) {
                C66760QIa c66760QIa = qi32.LJIJJ;
                QIP qip = c66760QIa.LIZJ;
                if (qip != null) {
                    InterfaceC66835QKx LIZ2 = c66760QIa.LIZ();
                    JSONObject LIZ3 = qip.LIZ(qip.LIZ.LJIIJ);
                    if (LIZ3 != null && LIZ3.has("_debug_flag")) {
                        LIZ3.remove("_debug_flag");
                        JSONObject jSONObject = new JSONObject();
                        C66735QHb.LIZJ(jSONObject, LIZ3);
                        qip.LIZIZ(jSONObject, LIZ2);
                    }
                } else {
                    c66760QIa.LIZLLL.LJJIZ.LJIIIIZZ(1, null, "headerAdapter is null when removeHeaderInfo. maybe not init?", new Object[0]);
                }
            }
            if (!TextUtils.isEmpty(null) && qi32.LJIILIIL != null) {
                QI4 qi4 = qi32.LJIILIIL;
                QI6 qi6 = qi4.LJLJLJ;
                String str7 = "";
                if (qi6.LIZIZ) {
                    str7 = qi6.LIZLLL.optString("user_unique_id", "");
                } else {
                    QH9 qh9 = qi6.LIZJ;
                    if (qh9 != null) {
                        str7 = qh9.LIZJ.getString("user_unique_id", null);
                    }
                }
                if ((TextUtils.isEmpty(null) && !TextUtils.isEmpty(str7)) || (!TextUtils.isEmpty(null) && !TextUtils.equals(null, str7))) {
                    qi4.LIZIZ(null);
                }
            }
            LIZ = true;
            if (LJIIL > 0) {
                HandlerThreadC36423ERf.LIZJ().LIZLLL().postDelayed(new ARunnableS47S0100000_11(this, 35), LJIIL);
            } else {
                LIZ();
            }
            ApplogServiceImpl.isServicePrepared = true;
            ApplogServiceImpl.handleCachedData();
            try {
                if (AbstractC66014PvW.LIZ != null) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("AppLog", "wrapper bdtracker init!");
                    return;
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        throw new IllegalStateException("wrapper AppContext should be set before init!");
    }

    @Override // X.QLA
    public final void LJJIL(Context context, boolean z, long j, QJN qjn) {
        C66776QIq c66776QIq = new C66776QIq(qjn);
        QI3 qi3 = AppLog.LIZ;
        if (qi3.LJIILIIL != null) {
            qi3.LJIILIIL.LIZ(z, 19, j, c66776QIq);
        }
    }

    @Override // X.QLA
    public final void LJJJJIZL(String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        String str4 = null;
        if (jSONObject != null) {
            try {
                if (jSONObject.optInt("_event_v3") == 1) {
                    jSONObject.remove("_event_v3");
                    jSONObject.remove("event_v3_reserved_field_time_stamp");
                    jSONObject.remove("ab_sdk_version");
                    try {
                        try {
                            str4 = jSONObject.toString();
                        } catch (ConcurrentModificationException unused) {
                            str4 = AppLogNewUtils.LIZIZ(jSONObject).toString();
                        }
                    } catch (Throwable unused2) {
                    }
                    AppLog.LIZ.LJIIJ(str2, str4);
                    return;
                }
                try {
                    str4 = jSONObject.toString();
                } catch (ConcurrentModificationException unused3) {
                    str4 = AppLogNewUtils.LIZIZ(jSONObject).toString();
                }
            } catch (Throwable unused4) {
            }
        }
        QI3 qi3 = AppLog.LIZ;
        QIB qib = qi3.LIZLLL;
        QIQ qiq = QIQ.event;
        qib.LJ(qiq, QIK.init);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            qi3.LJJIZ.LJIIJJI("category or tag is empty", new Object[0]);
            qi3.LIZLLL.LJ(qiq, QIK.f_block);
        } else {
            qi3.LJIIJJI(new QIA(j, j2, qi3.LJIIIZ, str, str2, str3, str4));
        }
    }
}

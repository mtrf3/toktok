package X;

import Y.ARunnableS44S0100000_8;
import Y.ARunnableS47S0100000_11;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.applog.monitor.Monitor;
import com.bytedance.common.utility.Logger;
import com.ss.android.deviceregister.DeviceRegisterManager;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QKB implements QL9 {
    public static String LJ;
    public C66816QKe LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public static final Object LIZLLL = new Object();
    public static volatile boolean LJFF = false;

    @Override // X.QL9
    public final void f4() {
    }

    @Override // X.QL9
    public final void h4(boolean z) {
    }

    @Override // X.QL9
    public final void j4(boolean z) {
    }

    @Override // X.QL9
    public final void onPause() {
        QKD.LJJ = System.currentTimeMillis();
    }

    @Override // X.QL9
    public final void onResume() {
        QKD.LJJ = System.currentTimeMillis();
    }

    @Override // X.QL9
    public final void u4() {
    }

    @Override // X.QL9
    public final String A3() {
        String str;
        C66816QKe c66816QKe = this.LIZ;
        if (c66816QKe != null) {
            str = ((JFK) c66816QKe.LJ).LIZIZ();
        } else {
            str = "";
        }
        Logger.debug();
        return str;
    }

    @Override // X.QL9
    public final void L3() {
        C66816QKe c66816QKe = this.LIZ;
        if (c66816QKe != null) {
            QKA qka = c66816QKe.LJIIL;
            if (qka != null) {
                qka.LJFF();
            }
            Logger.debug();
        }
    }

    @Override // X.QL9
    public final String LIZJ() {
        C66816QKe c66816QKe = this.LIZ;
        if (c66816QKe != null) {
            String str = c66816QKe.LJIIJ;
            Logger.debug();
            return str;
        }
        return "";
    }

    @Override // X.QL9
    public final void X3() {
        C66816QKe c66816QKe = this.LIZ;
        if (c66816QKe == null) {
            return;
        }
        c66816QKe.LIZJ();
    }

    @Override // X.QL9
    public final int getAppId() {
        InterfaceC66783QIx interfaceC66783QIx;
        if (QK9.LJFF <= 0 && (interfaceC66783QIx = QK9.LIZIZ) != null) {
            interfaceC66783QIx.getAid();
        }
        return QK9.LJFF;
    }

    @Override // X.QL9
    public final String getDeviceId() {
        String str;
        C66816QKe c66816QKe = this.LIZ;
        if (c66816QKe != null) {
            str = ((JFK) c66816QKe.LJ).LIZJ();
        } else {
            str = "";
        }
        Logger.debug();
        return str;
    }

    @Override // X.QL9
    public final String getRequestId() {
        if (TextUtils.isEmpty(LJ)) {
            synchronized (LIZLLL) {
                if (TextUtils.isEmpty(LJ)) {
                    LJ = UUID.randomUUID().toString();
                }
            }
        }
        return LJ;
    }

    @Override // X.QL9
    public final String x4() {
        C66816QKe c66816QKe = this.LIZ;
        String str = "";
        if (c66816QKe != null && !c66816QKe.LIZIZ) {
            str = ((JFK) c66816QKe.LJ).LIZLLL();
        }
        Logger.debug();
        return str;
    }

    @Override // X.QL9
    public final int getVersionCode() {
        return QK9.LJFF();
    }

    @Override // X.QL9
    public final void F3() {
    }

    @Override // X.QL9
    public final void H3() {
    }

    @Override // X.QL9
    public final String b4() {
        return QK9.LIZLLL;
    }

    @Override // X.QL9
    public final String getVersionName() {
        return QK9.LIZJ;
    }

    @Override // X.QL9
    public final boolean isLocalTest() {
        return this.LIZJ;
    }

    @Override // X.QL9
    public final void l4() {
    }

    @Override // X.QL9
    public final String v4() {
        return QK9.LJIJI;
    }

    @Override // X.QL9
    public final boolean z3() {
        return LJFF;
    }

    @Override // X.QL9
    public final String C3(Context context) {
        if (this.LIZ == null && context != null) {
            return F9J.LIZIZ(context, 0, "applog_stats").getString("openudid", null);
        }
        return x4();
    }

    @Override // X.QL9
    public final void D3(QL3 ql3) {
        QKD.LJIJ = ql3;
        QK9.LJIILLIIL = ql3;
    }

    @Override // X.QL9
    public final void E3(Context context) {
        C66816QKe c66816QKe = this.LIZ;
        c66816QKe.getClass();
        c66816QKe.LJII = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences LJIIJ = C48841JEv.LJIIJ(c66816QKe.LJFF);
        c66816QKe.LIZJ = LJIIJ.getInt("last_config_version", 0);
        c66816QKe.LJIIJ = LJIIJ.getString("install_id", "");
        boolean equals = TextUtils.equals(QK9.LIZIZ(c66816QKe.LJFF), LJIIJ.getString("dr_channel", null));
        if (c66816QKe.LIZJ == QK9.LJFF() && equals) {
            long j = LJIIJ.getLong("last_config_time", 0L);
            if (j <= currentTimeMillis) {
                currentTimeMillis = j;
            }
            boolean LJFF2 = QJY.LJFF(((JFK) c66816QKe.LJ).LIZJ());
            boolean LJFF3 = QJY.LJFF(c66816QKe.LJIIJ);
            if (!LJFF2 && !LJFF3) {
                c66816QKe.LJIIIIZZ = currentTimeMillis;
            }
        }
        if (QK9.LIZJ(c66816QKe.LJFF, c66816QKe.LJII, c66816QKe.LIZIZ) || !Logger.debug()) {
            QKA qka = new QKA(c66816QKe);
            c66816QKe.LJIIL = qka;
            qka.start();
            RunnableC39007FSp.LIZIZ(new ARunnableS44S0100000_8(context, 6));
            return;
        }
        throw new RuntimeException("init header error.");
    }

    @Override // X.QL9
    public final void I3(EnumC86803Y4x enumC86803Y4x) {
        QK9.LJIJ = enumC86803Y4x;
    }

    @Override // X.QL9
    public final void J3(String str) {
        QK9.LJII = str;
    }

    @Override // X.QL9
    public final void LIZ(Account account) {
        JFL jfl = QKE.LIZ;
        if (jfl instanceof JFQ) {
            ((JFK) jfl).LJ(account);
        } else {
            QKE.LIZJ = account;
        }
        QKS qks = (QKS) C58318Mug.LIZ(QKS.class);
        if (qks != null) {
            qks.LIZJ();
        }
    }

    @Override // X.QL9
    public final void LIZIZ(boolean z) {
        LJFF = z;
    }

    @Override // X.QL9
    public final boolean LJ(boolean z) {
        LJFF = z;
        C66816QKe c66816QKe = this.LIZ;
        if (c66816QKe == null) {
            return false;
        }
        LJ = null;
        c66816QKe.LJIIJ = null;
        c66816QKe.LIZIZ = z;
        ((JFK) c66816QKe.LJ).LIZ("device_id");
        ((JFK) c66816QKe.LJ).LIZ("install_id");
        ((JFK) c66816QKe.LJ).LIZ("clientudid");
        C48841JEv.LJIIJ(c66816QKe.LJFF).edit().remove("install_id").apply();
        Context context = c66816QKe.LJFF;
        QIF qif = C66795QJj.LIZIZ.LIZ;
        if (qif != null) {
            JGC.LIZ(context, qif);
        } else {
            F9J.LIZIZ(context, 0, C48857JFl.LIZJ()).edit().putString("cdid", null).apply();
            QK5.LIZ = new C48858JFm();
        }
        JSONObject jSONObject = new JSONObject();
        QK9.LJIIJ = null;
        QK9.LIZJ(c66816QKe.LJFF, jSONObject, z);
        c66816QKe.LJII = jSONObject;
        return true;
    }

    @Override // X.QL9
    public final void LJFF(InterfaceC66783QIx interfaceC66783QIx) {
        QK9.LIZIZ = interfaceC66783QIx;
    }

    @Override // X.QL9
    public final void N3(boolean z) {
        this.LIZIZ = z;
    }

    @Override // X.QL9
    public final String O3(Context context) {
        return QK5.LIZ(context);
    }

    @Override // X.QL9
    public final void P3(String str) {
        QK9.LIZLLL = str;
    }

    @Override // X.QL9
    public final void R3(String str) {
        if (C38354F3m.LJ(str) || str.equals(V1B.LJLJJI)) {
            return;
        }
        V1B.LJLJJI = str;
    }

    @Override // X.QL9
    public final String T3(Context context) {
        if (this.LIZ == null && context != null) {
            return F9J.LIZIZ(context, 0, "applog_stats").getString("clientudid", null);
        }
        return A3();
    }

    @Override // X.QL9
    public final void U3(boolean z) {
        QK9.LJIJJLI = z;
    }

    @Override // X.QL9
    public final boolean V3(Context context) {
        QKS qks;
        if (context != null) {
            if (TextUtils.isEmpty(QKE.LIZIZ)) {
                QKE.LIZIZ = QK9.LIZ;
            }
            if ("local_test".equals(QKE.LIZIZ) && (qks = (QKS) C58318Mug.LIZ(QKS.class)) != null) {
                return qks.LIZIZ();
            }
        }
        return false;
    }

    @Override // X.QL9
    public final void W3(Bundle bundle) {
        if (bundle == null || bundle.size() <= 0 || bundle.size() <= 0) {
            return;
        }
        Bundle bundle2 = QKD.LJIJI;
        synchronized (bundle2) {
            bundle2.putAll(bundle);
        }
    }

    @Override // X.QL9
    public final void Y3(int i) {
        QK9.LJFF = i;
    }

    @Override // X.QL9
    public final void Z3(Context context) {
        QKD.LIZLLL(-1L, context);
    }

    @Override // X.QL9
    public final void a4(String str) {
        QK9.LJI = str;
    }

    @Override // X.QL9
    public final String c4(Context context) {
        return QK9.LJ(context);
    }

    @Override // X.QL9
    public final String e4(Context context) {
        return QK9.LIZIZ(context);
    }

    @Override // X.QL9
    public final java.util.Map<String, String> g4(Context context) {
        if (context == null) {
            return Collections.emptyMap();
        }
        return C03660Ck.LIZJ("x-tt-dt", C48841JEv.LJIIJ(context).getString("device_token", ""));
    }

    @Override // X.QL9
    public final void i4(String str) {
        if (C38354F3m.LJ(str) || str.equals(V1B.LJLJI)) {
            return;
        }
        V1B.LJLJI = str;
    }

    @Override // X.QL9
    public final void m4(String str) {
        QK9.LJIJI = str;
    }

    @Override // X.QL9
    public final void n4(String str) {
        QK9.LIZ = str;
    }

    @Override // X.QL9
    public final void p4(QJ8 qj8) {
        if (qj8 == null) {
            return;
        }
        QKD.LJJIFFI.add(new WeakReference<>(qj8));
    }

    @Override // X.QL9
    public final String r4(Context context) {
        if (this.LIZ == null && context != null) {
            return F9J.LIZIZ(context, 0, "applog_stats").getString("install_id", null);
        }
        return LIZJ();
    }

    @Override // X.QL9
    public final void s4(boolean z) {
        if (QK9.LJIIJ != null) {
            synchronized (QK9.LJIILJJIL) {
            }
        }
    }

    @Override // X.QL9
    public final String t4(Context context) {
        if (this.LIZ == null && context != null) {
            return F9J.LIZIZ(context, 0, "applog_stats").getString("device_id", "");
        }
        return getDeviceId();
    }

    @Override // X.QL9
    public final void w4(boolean z) {
        this.LIZJ = z;
    }

    @Override // X.QL9
    public final void B3(Context context, boolean z) {
        if (QK9.LJIJJLI) {
            C66807QJv c66807QJv = new C66807QJv(context);
            if (c66807QJv.LIZLLL) {
                C48841JEv.LJIIJ(context).edit().remove("google_aid").remove("gaid_limited").apply();
                JFK jfk = (JFK) QKE.LIZ(context);
                QK9.LJIIZILJ = jfk.LIZJ();
                jfk.LIZ("openudid");
                jfk.LIZ("clientudid");
                jfk.LIZ("udid");
                jfk.LIZ("udid_list");
                jfk.LIZ("device_id");
                DeviceRegisterManager.clearDidAndIid(context, "clearMigrationInfo");
            }
            c66807QJv.LIZIZ.setComponentEnabledSetting(c66807QJv.LIZJ, 2, 1);
            c66807QJv.LIZ.edit().putInt("component_state", 2).apply();
        }
        C66816QKe c66816QKe = new C66816QKe(context, z);
        this.LIZ = c66816QKe;
        C73340SqO.LJLILLLLZI = this.LIZIZ;
        QK9.LJIILL = c66816QKe;
    }

    @Override // X.QL9
    public final void K3(Context context, boolean z) {
        QKS qks;
        if (context != null) {
            if (TextUtils.isEmpty(QKE.LIZIZ)) {
                QKE.LIZIZ = QK9.LIZ;
            }
            if (!"local_test".equals(QKE.LIZIZ) || (qks = (QKS) C58318Mug.LIZ(QKS.class)) == null) {
                return;
            }
            qks.LJFF();
        }
    }

    @Override // X.QL9
    public final void M3(Context context, java.util.Map map) {
        if (map == null || this.LIZ == null) {
            if (this.LIZ == null && context != null) {
                SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "applog_stats");
                String string = LIZIZ.getString("device_id", "");
                if (!TextUtils.isEmpty(string)) {
                    map.put("device_id", string);
                }
                String string2 = LIZIZ.getString("install_id", "");
                if (!TextUtils.isEmpty(string2)) {
                    map.put("install_id", string2);
                }
                String string3 = F9J.LIZIZ(context, 0, C48841JEv.LJIIJJI()).getString("openudid", null);
                if (!TextUtils.isEmpty(string3)) {
                    map.put("openudid", string3);
                    return;
                }
                return;
            }
            return;
        }
        String x4 = x4();
        if (x4 != null) {
            map.put("openudid", x4);
        }
        String A3 = A3();
        if (A3 != null) {
            map.put("clientudid", A3);
        }
        String LIZJ = LIZJ();
        if (LIZJ != null) {
            map.put("install_id", LIZJ);
        }
        String deviceId = getDeviceId();
        if (deviceId != null) {
            map.put("device_id", deviceId);
        }
    }

    @Override // X.QL9
    public final void Q3(Context context, JSONObject jSONObject) {
        C66816QKe c66816QKe = this.LIZ;
        if (c66816QKe != null) {
            c66816QKe.getClass();
            if (jSONObject != null) {
                try {
                    c66816QKe.LJIIJJI = jSONObject.toString();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                String str = c66816QKe.LJIIJJI;
                try {
                    SharedPreferences.Editor edit = C48841JEv.LJIIJ(context).edit();
                    edit.putString("app_track", str);
                    edit.commit();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.QL9
    public final void S3(Context context, QL2 ql2) {
        Monitor monitor = QIV.LIZ;
        if (monitor != null) {
            if (C16880lQ.LLLLL(context) != null) {
                context = C16880lQ.LLLLL(context);
            }
            monitor.setContext(context);
            monitor.setMonitorUploader(ql2);
        }
    }

    @Override // X.QL9
    public final void d4(Context context, String str) {
        if (!C38354F3m.LJ(str) && !str.equals(QK9.LJIIL)) {
            QK9.LJIIL = str;
            SharedPreferences.Editor edit = C48841JEv.LJIIJ(context).edit();
            edit.putString("user_agent", str);
            edit.commit();
        }
    }

    @Override // X.QL9
    public final void k4(String str, Object obj) {
        QK9.LJIIIIZZ.put(str, obj);
    }

    @Override // X.QL9
    public final void o4(Context context, String str) {
        JFL jfq;
        if (this.LIZ != null) {
            jfq = QKE.LIZ(context);
        } else {
            jfq = new JFQ(context, DeviceRegisterManager.isLocalTest());
        }
        if (jfq instanceof JFQ) {
            JFK jfk = (JFK) jfq;
            jfk.getClass();
            if (!TextUtils.isEmpty(str)) {
                JFK.LJI = null;
                String LJFF2 = i0.LJFF("clear_key_prefix", str);
                SharedPreferences LJIIJ = C48841JEv.LJIIJ(context);
                if (!LJIIJ.getBoolean(LJFF2, false)) {
                    SharedPreferences.Editor edit = LJIIJ.edit();
                    edit.putBoolean(LJFF2, true);
                    if (LJIIJ.contains("device_id")) {
                        edit.remove("device_id");
                    }
                    if (LJIIJ.contains("install_id")) {
                        edit.remove("install_id");
                    }
                    edit.commit();
                    jfk.LIZIZ.LIZIZ("device_id");
                    Logger.debug();
                } else {
                    Logger.debug();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DeviceParamsProvider#clear mCacheHandler.loadDeviceId()=");
                LIZ.append(jfk.LIZIZ.LIZLLL("", ""));
                X1D.LIZIZ(LIZ);
            }
        }
        C48841JEv.LJIIJ(context).edit().remove("device_token").commit();
    }

    @Override // X.QL9
    public final void q4(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr.length > 0 && !C38354F3m.LJ(strArr[0])) {
            C73340SqO.LJLIL = strArr;
        }
        if (strArr2 != null) {
            int length = strArr2.length;
        }
    }

    @Override // X.QL9
    public final boolean G3(Context context, JSONObject jSONObject, boolean z) {
        return QK9.LIZJ(context, jSONObject, z);
    }

    @Override // X.QL9
    public final void y4(boolean z, long j, QJN qjn) {
        LJFF = z;
        C66816QKe c66816QKe = this.LIZ;
        if (c66816QKe == null) {
            return;
        }
        synchronized (c66816QKe) {
            c66816QKe.LIZIZ = z;
            c66816QKe.LJIIIIZZ = 0L;
            QKA qka = c66816QKe.LJIIL;
            if (qka != null) {
                qka.LJLIL = 0;
            }
            QK9.LJIIJ = null;
            JSONObject jSONObject = new JSONObject();
            QK9.LIZJ(c66816QKe.LJFF, jSONObject, c66816QKe.LIZIZ);
            c66816QKe.LJII = jSONObject;
            c66816QKe.LJIILIIL = qjn;
            c66816QKe.LIZJ();
        }
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS47S0100000_11(c66816QKe, 7), j);
    }
}

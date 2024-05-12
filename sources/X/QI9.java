package X;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.AppLog;
import com.bytedance.applog.monitor.Monitor;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QI9 implements QL9 {
    public static volatile boolean LJI;
    public static volatile String[] LJII;
    public static volatile String LJIIIIZZ;
    public static volatile boolean LJIIIZ;
    public static volatile String LJIIJ;
    public volatile InterfaceC66783QIx LIZ;
    public volatile int LIZIZ;
    public volatile String LIZJ;
    public volatile String LIZLLL;
    public volatile String LJ;
    public volatile boolean LJFF;

    @Override // X.QL9
    public final void B3(Context context, boolean z) {
    }

    @Override // X.QL9
    public final void D3(QL3 ql3) {
    }

    @Override // X.QL9
    public final void E3(Context context) {
    }

    @Override // X.QL9
    public final void F3() {
    }

    @Override // X.QL9
    public final void H3() {
    }

    @Override // X.QL9
    public final void I3(EnumC86803Y4x enumC86803Y4x) {
    }

    @Override // X.QL9
    public final void J3(String str) {
    }

    @Override // X.QL9
    public final void L3() {
    }

    @Override // X.QL9
    public final void LIZIZ(boolean z) {
    }

    @Override // X.QL9
    public final void N3(boolean z) {
    }

    @Override // X.QL9
    public final void Q3(Context context, JSONObject jSONObject) {
    }

    @Override // X.QL9
    public final void U3(boolean z) {
    }

    @Override // X.QL9
    public final void W3(Bundle bundle) {
    }

    @Override // X.QL9
    public final void X3() {
    }

    @Override // X.QL9
    public final String c4(Context context) {
        return null;
    }

    @Override // X.QL9
    public final void f4() {
    }

    @Override // X.QL9
    public final void j4(boolean z) {
    }

    @Override // X.QL9
    public final void l4() {
    }

    @Override // X.QL9
    public final void o4(Context context, String str) {
    }

    @Override // X.QL9
    public final void onPause() {
    }

    @Override // X.QL9
    public final void onResume() {
    }

    @Override // X.QL9
    public final void s4(boolean z) {
    }

    @Override // X.QL9
    public final void u4() {
    }

    @Override // X.QL9
    public final int getAppId() {
        int i = this.LIZIZ;
        if (i <= 0 && this.LIZ != null) {
            return this.LIZ.getAid();
        }
        return i;
    }

    @Override // X.QL9
    public final String getDeviceId() {
        String LIZJ = AppLog.LIZ.LIZJ();
        if (!TextUtils.isEmpty(LIZJ)) {
            return LIZJ;
        }
        return "";
    }

    @Override // X.QL9
    public final String getRequestId() {
        return QJJ.LIZ.LIZIZ(new Object[0]);
    }

    @Override // X.QL9
    public final int getVersionCode() {
        if (this.LIZ != null) {
            return this.LIZ.getVersionCode();
        }
        return 0;
    }

    @Override // X.QL9
    public final String getVersionName() {
        Object obj;
        QI3 qi3 = AppLog.LIZ;
        if (qi3.LJIIL != null) {
            QI6 qi6 = qi3.LJIIL;
            obj = qi6.LJFF.LJ.LIZJ(qi6.LIZLLL, "app_version", String.class);
        } else {
            obj = null;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str) && this.LIZ != null) {
            str = this.LIZ.getVersion();
        }
        if (!TextUtils.equals(str, this.LIZLLL) && !TextUtils.isEmpty(this.LIZLLL)) {
            return this.LIZLLL;
        }
        return str;
    }

    @Override // X.QL9
    public final String x4() {
        C66799QJn LJ;
        C66760QIa c66760QIa = AppLog.LIZ.LJIJJ;
        if (c66760QIa == null || (LJ = ((C66765QIf) c66760QIa.LIZ()).LJ()) == null) {
            return "";
        }
        return LJ.LJLJI;
    }

    @Override // X.QL9
    public final String A3() {
        return AppLog.LIZIZ();
    }

    @Override // X.QL9
    public final String LIZJ() {
        return AppLog.LIZJ();
    }

    @Override // X.QL9
    public final boolean z3() {
        if (C66795QJj.LIZIZ() == null) {
            return false;
        }
        return C66795QJj.LIZIZ().LJLIL;
    }

    @Override // X.QL9
    public final String b4() {
        return this.LIZLLL;
    }

    @Override // X.QL9
    public final boolean isLocalTest() {
        return this.LJFF;
    }

    @Override // X.QL9
    public final String v4() {
        return this.LJ;
    }

    @Override // X.QL9
    public final String C3(Context context) {
        C66799QJn LJ;
        C66760QIa c66760QIa = AppLog.LIZ.LJIJJ;
        if (c66760QIa == null || (LJ = ((C66765QIf) c66760QIa.LIZ()).LJ()) == null) {
            return "";
        }
        return LJ.LJLJI;
    }

    @Override // X.QL9
    public final void LIZ(Account account) {
        QI3 qi3 = AppLog.LIZ;
        if (qi3.LJIILL) {
            C66760QIa c66760QIa = qi3.LJIJJ;
            if (c66760QIa == null) {
                qi3.LJJIZ.LJIIJJI("Init first please before set account", new Object[0]);
                return;
            }
            synchronized (C66760QIa.class) {
                if (c66760QIa.LIZ != null) {
                    c66760QIa.LIZ.LJJII = account;
                } else {
                    C66765QIf c66765QIf = (C66765QIf) c66760QIa.LIZ();
                    Context LIZLLL = c66765QIf.LIZLLL();
                    if (LIZLLL != null) {
                        c66765QIf.LIZLLL.LIZIZ(LIZLLL).LIZ(account);
                    }
                }
            }
        }
    }

    @Override // X.QL9
    public final boolean LJ(boolean z) {
        QI3 qi3 = AppLog.LIZ;
        if (qi3.LJIILIIL != null) {
            qi3.LJIILIIL.LIZ(z, 18, 0L, null);
            return true;
        }
        return true;
    }

    @Override // X.QL9
    public final void LJFF(InterfaceC66783QIx interfaceC66783QIx) {
        this.LIZ = interfaceC66783QIx;
    }

    @Override // X.QL9
    public final String O3(Context context) {
        return QK5.LIZ(context);
    }

    @Override // X.QL9
    public final void P3(String str) {
        this.LIZLLL = str;
    }

    @Override // X.QL9
    public final void R3(String str) {
        Object obj;
        QI3 qi3 = AppLog.LIZ;
        if (qi3.LJIIL != null) {
            QI6 qi6 = qi3.LJIIL;
            obj = qi6.LJFF.LJ.LIZJ(qi6.LIZLLL, "app_region", String.class);
        } else {
            obj = null;
        }
        AppLog.LJFF((String) obj, str);
    }

    @Override // X.QL9
    public final String T3(Context context) {
        return AppLog.LIZIZ();
    }

    @Override // X.QL9
    public final boolean V3(Context context) {
        QJI qji;
        QI3 qi3 = AppLog.LIZ;
        C66760QIa c66760QIa = qi3.LJIJJ;
        if (c66760QIa == null) {
            qi3.LJJIZ.LJIIJJI("Init first please to get new user mode", new Object[0]);
            return false;
        }
        Integer LIZJ = ((C66765QIf) c66760QIa.LIZ()).LIZJ();
        if (LIZJ == null || (qji = (QJI) JFZ.LIZ(QJI.class, String.valueOf(LIZJ))) == null) {
            return false;
        }
        return qji.LIZIZ();
    }

    @Override // X.QL9
    public final void Y3(int i) {
        this.LIZIZ = i;
    }

    @Override // X.QL9
    public final void Z3(Context context) {
        try {
            C66795QJj.LIZLLL();
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.QL9
    public final void a4(String str) {
        LJIIJ = str;
    }

    @Override // X.QL9
    public final String e4(Context context) {
        String str = this.LIZJ;
        if (TextUtils.isEmpty(str) && this.LIZ != null) {
            str = this.LIZ.LIZIZ();
        }
        if (TextUtils.isEmpty(str)) {
            try {
                str = C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData.getString("UMENG_CHANNEL");
                this.LIZJ = str;
                return str;
            } catch (Throwable unused) {
                return str;
            }
        }
        return str;
    }

    @Override // X.QL9
    public final java.util.Map<String, String> g4(Context context) {
        Integer LIZJ;
        JGH jgh;
        C66760QIa c66760QIa = AppLog.LIZ.LJIJJ;
        if (c66760QIa != null) {
            C66765QIf c66765QIf = (C66765QIf) c66760QIa.LIZ();
            if (c66765QIf.LIZIZ() && (LIZJ = c66765QIf.LIZJ()) != null && (jgh = (JGH) JFZ.LIZ(JGH.class, String.valueOf(LIZJ))) != null) {
                return jgh.LIZ();
            }
        }
        return null;
    }

    @Override // X.QL9
    public final void h4(boolean z) {
        LJI = z;
    }

    @Override // X.QL9
    public final void i4(String str) {
        Object obj;
        QI3 qi3 = AppLog.LIZ;
        if (qi3.LJIIL != null) {
            QI6 qi6 = qi3.LJIIL;
            obj = qi6.LJFF.LJ.LIZJ(qi6.LIZLLL, "app_region", String.class);
        } else {
            obj = null;
        }
        AppLog.LJFF(str, (String) obj);
    }

    @Override // X.QL9
    public final void m4(String str) {
        this.LJ = str;
    }

    @Override // X.QL9
    public final void n4(String str) {
        this.LIZJ = str;
    }

    @Override // X.QL9
    public final void p4(QJ8 qj8) {
        if (qj8 == null) {
            return;
        }
        AppLog.LIZ(new C66775QIp(qj8));
    }

    @Override // X.QL9
    public final String r4(Context context) {
        return AppLog.LIZJ();
    }

    @Override // X.QL9
    public final String t4(Context context) {
        return AppLog.LIZ.LIZJ();
    }

    @Override // X.QL9
    public final void w4(boolean z) {
        this.LJFF = z;
    }

    @Override // X.QL9
    public final void K3(Context context, boolean z) {
        QJI qji;
        QI3 qi3 = AppLog.LIZ;
        C66760QIa c66760QIa = qi3.LJIJJ;
        if (c66760QIa == null) {
            qi3.LJJIZ.LJIIJJI("Init first please before set new user mode", new Object[0]);
            return;
        }
        Integer LIZJ = ((C66765QIf) c66760QIa.LIZ()).LIZJ();
        if (LIZJ != null && (qji = (QJI) JFZ.LIZ(QJI.class, String.valueOf(LIZJ))) != null) {
            qji.LIZLLL();
        }
        qi3.LJIIL(Boolean.valueOf(z), "New User Mode");
    }

    @Override // X.QL9
    public final void M3(Context context, java.util.Map map) {
        if (map != null) {
            AppLog.LIZLLL(map);
            String LJ = AppLog.LJ();
            if (LJ != null) {
                map.put("user_id", LJ);
            }
        }
    }

    @Override // X.QL9
    public final void S3(Context context, QL2 ql2) {
        String LIZIZ;
        QI3 qi3 = AppLog.LIZ;
        if (qi3.LJJIIZ) {
            QIB qib = qi3.LIZLLL;
            synchronized (qib) {
                qib.LIZIZ.LJJIZ.LJIJI(8, null, "[init applog monitor with uploader] context: {}", context);
                if (qib.LIZ != null) {
                    qib.LIZIZ.LJJIZ.LJIIIIZZ(8, null, "[init applog monitor with uploader] monitor is already init.", new Object[0]);
                    return;
                }
                if (qi3 == qib.LIZIZ) {
                    LIZIZ = "";
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(qib.LIZIZ.LJIIIZ);
                    LIZ.append("@");
                    LIZIZ = X1D.LIZIZ(LIZ);
                }
                Monitor monitor = new Monitor(null, ql2, LIZIZ);
                qib.LIZ = monitor;
                monitor.setContext(context);
                qib.LIZ.setLogger(qib.LIZIZ.LJJIZ);
            }
        }
    }

    @Override // X.QL9
    public final void d4(Context context, String str) {
        QI3 qi3 = AppLog.LIZ;
        C66760QIa c66760QIa = qi3.LJIJJ;
        Application application = qi3.LJIIJ;
        c66760QIa.getClass();
        synchronized (C66760QIa.class) {
            if (c66760QIa.LIZ != null) {
                c66760QIa.LIZ.LJIJJLI = str;
            } else {
                C66765QIf c66765QIf = (C66765QIf) c66760QIa.LIZ();
                c66765QIf.getClass();
                if (application != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("user_agent", str);
                    c66765QIf.LIZLLL.LIZIZ(application).LJFF(application, hashMap, false);
                }
            }
        }
    }

    @Override // X.QL9
    public final void k4(String str, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, obj);
        AppLog.LJII(hashMap);
    }

    @Override // X.QL9
    public final void q4(String[] strArr, String[] strArr2) {
        LJII = strArr;
        LJIIIIZZ = strArr2[0];
    }

    @Override // X.QL9
    public final boolean G3(Context context, JSONObject jSONObject, boolean z) {
        JSONObject LIZLLL = AppLog.LIZ.LIZLLL();
        if (LIZLLL != null) {
            C36860EdM.LIZJ(jSONObject, LIZLLL);
            return true;
        }
        return false;
    }

    @Override // X.QL9
    public final void y4(boolean z, long j, QJN qjn) {
        QI3 qi3 = AppLog.LIZ;
        C66777QIr c66777QIr = new C66777QIr(qjn);
        if (qi3.LJIILIIL != null) {
            qi3.LJIILIIL.LIZ(z, 19, j, c66777QIr);
        }
    }
}

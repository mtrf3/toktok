package X;

import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QJf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66791QJf {
    public static final QKI LJIILLIIL;
    public C48852JFg LIZLLL;
    public final Context LJ;
    public final QIF LJFF;
    public final C66788QJc LJI;
    public InterfaceC66819QKh LJIIIZ;
    public boolean LJIIJ;
    public C66811QJz LJIIL;
    public final C66774QIo LJIILIIL;
    public C66798QJm LJIILJJIL;
    public final java.util.Map<Class<?>, QKR> LIZ = new LinkedHashMap(32);
    public final Object LIZIZ = new Object();
    public boolean LIZJ = false;
    public volatile boolean LJII = false;
    public final AtomicBoolean LJIIJJI = new AtomicBoolean(false);
    public int LJIILL = 0;
    public JSONObject LJIIIIZZ = new JSONObject();

    static {
        new AtomicBoolean(true);
        LJIILLIIL = new QKI();
    }

    public final C66799QJn LIZJ() {
        String LIZIZ;
        synchronized (this.LIZIZ) {
            while (!this.LJII) {
                try {
                    this.LIZIZ.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        this.LJFF.getClass();
        QKU qku = (QKU) JFZ.LIZ(QKU.class, this.LJFF.LIZ());
        if (qku != null) {
            LIZIZ = qku.getDeviceId();
        } else {
            LIZIZ = this.LJIIIZ.LIZIZ("", "");
        }
        this.LJFF.getClass();
        String LIZ = this.LJIIIZ.LIZ("install_id");
        this.LJFF.getClass();
        String string = C48847JFb.LIZ(this.LJ, this.LJFF).getString("openudid", null);
        this.LJFF.getClass();
        String string2 = C48847JFb.LIZ(this.LJ, this.LJFF).getString("clientudid", null);
        String LIZ2 = this.LJIIIZ.LIZ("ssid");
        C66799QJn c66799QJn = new C66799QJn();
        if (TextUtils.isEmpty(LIZIZ)) {
            LIZIZ = "";
        }
        c66799QJn.LJLIL = LIZIZ;
        if (TextUtils.isEmpty(LIZ)) {
            LIZ = "";
        }
        c66799QJn.LJLILLLLZI = LIZ;
        c66799QJn.LJLJJI = string2;
        c66799QJn.LJLJI = string;
        c66799QJn.LJLJJL = LIZ2;
        return c66799QJn;
    }

    public final int LIZLLL() {
        String optString = this.LJIIIIZZ.optString("device_id", "");
        String optString2 = this.LJIIIIZZ.optString("install_id", "");
        String optString3 = this.LJIIIIZZ.optString("bd_did", "");
        if ((C36860EdM.LIZ(optString) || C36860EdM.LIZ(optString3)) && C36860EdM.LIZ(optString2)) {
            if (C48847JFb.LIZ(this.LJ, this.LJFF).getLong("dr_install_vc", 0L) == this.LJIIIIZZ.optLong("version_code", -1L)) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x011e, code lost:
    
        if (r0 != false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66791QJf.LJ():boolean");
    }

    public final void LJI() {
        C66811QJz c66811QJz;
        C66799QJn LIZJ = LIZJ();
        if (TextUtils.isEmpty(LIZJ.LJLIL) || TextUtils.isEmpty(LIZJ.LJLILLLLZI) || (c66811QJz = this.LJIIL) == null) {
            return;
        }
        c66811QJz.LIZ(new QJV(LIZJ));
    }

    public final InterfaceC66819QKh LIZ(Context context, C48852JFg c48852JFg) {
        QJI qji = (QJI) JFZ.LIZ(QJI.class, String.valueOf(this.LJFF.LIZ));
        JFI jfi = new JFI(context, c48852JFg.LIZ(this.LJFF), this.LJFF);
        if (qji != null) {
            return (InterfaceC66819QKh) qji.LIZJ();
        }
        return jfi;
    }

    public final boolean LIZIZ(Context context, C48852JFg c48852JFg) {
        String LIZIZ;
        C66798QJm c66798QJm = new C66798QJm(context, this.LJFF);
        this.LJIILJJIL = c66798QJm;
        boolean z = c66798QJm.LIZJ;
        C07670Rv.LIZLLL("is one key migrate：", z);
        if (z) {
            QIF qif = this.LJFF;
            qif.getClass();
            QKU qku = (QKU) JFZ.LIZ(QKU.class, this.LJFF.LIZ());
            if (qku != null) {
                LIZIZ = qku.getDeviceId();
            } else {
                LIZIZ = this.LJIIIZ.LIZIZ("", "");
            }
            C66798QJm.LIZ(context, qif, LIZIZ, true);
            QIF qif2 = this.LJFF;
            C48847JFb.LIZ(context, qif2).edit().remove("google_aid").remove("gaid_limited").apply();
            C36860EdM.LJI(qif2.LIZJ(), new String[]{"device_id", "bd_did", "install_id", "device_token"});
            C36860EdM.LJI(c48852JFg.LJLJJL.LIZIZ(context), new String[]{"device_id", "bd_did", "install_id", "device_token"});
            C36860EdM.LJI(F9J.LIZIZ(context, 0, "snssdk_openudid"), new String[]{"clientudid", "openudid"});
            C36860EdM.LJI(C48847JFb.LIZ(context, qif2), new String[]{"clientudid", "openudid"});
            JGC.LIZ(context, qif2);
        }
        C66798QJm c66798QJm2 = this.LJIILJJIL;
        c66798QJm2.getClass();
        try {
            c66798QJm2.LIZ.setComponentEnabledSetting(c66798QJm2.LIZIZ, 2, 1);
            c66798QJm2.LIZLLL.edit().putInt("component_state", 2).apply();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return z;
    }

    public final boolean LJII(Object obj, String str) {
        Object opt = this.LJIIIIZZ.opt(str);
        if (obj == null ? opt == null : obj.equals(opt)) {
            return false;
        }
        synchronized (C66791QJf.class) {
            try {
                JSONObject jSONObject = this.LJIIIIZZ;
                JSONObject jSONObject2 = new JSONObject();
                C36860EdM.LIZJ(jSONObject2, jSONObject);
                jSONObject2.put(str, obj);
                this.LJIIIIZZ = jSONObject2;
            } catch (JSONException unused) {
            }
        }
        return true;
    }

    public C66791QJf(Context context, C48852JFg c48852JFg, QIF qif) {
        this.LJIILIIL = null;
        this.LJ = context;
        this.LIZLLL = c48852JFg;
        this.LJFF = qif;
        this.LJI = new C66788QJc(qif);
        this.LJIIIZ = LIZ(context, c48852JFg);
        this.LJIILIIL = C66765QIf.LJFF(String.valueOf(qif.LIZ)).LJFF;
        JFV.LIZLLL(new ARunnableS47S0100000_11((QKW) this, 114), qif.LIZ());
    }

    public final void LJFF(QKU qku, String str, String str2) {
        String A3 = qku.A3();
        JSONObject LJ = C47135Ieh.LJ("old_id", str2, "new_id", str);
        if (!this.LIZLLL.LJLIL) {
            LJ.put("openudid", qku.getOpenUdid());
        }
        LJ.put("clientudid", A3);
        InterfaceC66833QKv interfaceC66833QKv = this.LJFF.LJJIII;
        if (interfaceC66833QKv != null) {
            ((QJD) interfaceC66833QKv).LIZ.getClass();
        }
    }
}

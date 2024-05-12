package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QJe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66790QJe extends AbstractC48869JFx {
    public static final long[] LJIILIIL = {10000, 30000, 60000, 120000, 120000, 120000, 180000, 180000};
    public static final long[] LJIILJJIL = {180000, 360000, 540000, 540000, 900000, 1800000};
    public static final long[] LJIILL = {100, LivePlayEnforceIntervalSetting.DEFAULT, 20000, 20000, 60000, 60000, 180000, 180000, 540000, 540000};
    public final InterfaceC66823QKl LJII;
    public final C48852JFg LJIIIIZZ;
    public final C66791QJf LJIIIZ;
    public final QKU LJIIJ;
    public final C66791QJf LJIIJJI;
    public final QIF LJIIL;

    @Override // X.AbstractC48869JFx
    public final String LIZJ() {
        return "r";
    }

    @Override // X.AbstractC48869JFx
    public final void LJ() {
    }

    @Override // X.AbstractC48869JFx
    public final void LJFF() {
    }

    @Override // X.AbstractC48869JFx
    public final boolean LIZIZ() {
        boolean z;
        JSONObject jSONObject;
        boolean z2;
        String LIZIZ;
        boolean z3;
        boolean z4;
        String string;
        String string2;
        boolean z5;
        boolean z6;
        boolean z7;
        C66811QJz c66811QJz;
        JSONObject jSONObject2 = this.LJIIJJI.LJIIIIZZ;
        JSONObject jSONObject3 = new JSONObject();
        C36860EdM.LIZJ(jSONObject3, jSONObject2);
        C66791QJf c66791QJf = this.LJIIJJI;
        C48852JFg c48852JFg = this.LJIIIIZZ;
        c66791QJf.getClass();
        try {
            c66791QJf.LJI.LIZ(jSONObject3, c48852JFg);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            jSONObject3.put("version_code", C51029K0z.LJJIFFI());
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("header", jSONObject3);
        jSONObject4.put("magic_tag", "ss_app_log");
        jSONObject4.put("_gen_time", System.currentTimeMillis());
        String uri = UriProtector.parse(this.LJIIIIZZ.LJLILLLLZI.LJLIL).buildUpon().appendQueryParameter("req_id", QJJ.LIZ.LIZIZ(new Object[0])).build().toString();
        this.LJ.LIZJ.LIZIZ(true);
        if (!TextUtils.isEmpty(jSONObject3.optString("device_id")) && !TextUtils.isEmpty(jSONObject3.optString("install_id"))) {
            z = true;
        } else {
            z = false;
        }
        try {
            C66808QJw LIZLLL = C66789QJd.LIZIZ().LIZLLL(this.LJIIL.LIZ);
            if (LIZLLL != null) {
                try {
                    if (LIZLLL.LJLIL <= 0) {
                        LIZLLL.LJLIL = System.currentTimeMillis();
                    }
                } catch (Throwable th) {
                    th = th;
                    jSONObject = null;
                    this.LJ.LIZJ.LIZIZ(false);
                    C66789QJd.LJ(this.LJIIL, jSONObject3, jSONObject);
                    throw th;
                }
            }
            QIF qif = this.LJIIL;
            PA0 pa0 = qif.LIZIZ;
            if (qif.LJIIZILJ) {
                z2 = qif.LJJI;
            } else {
                z2 = true;
            }
            jSONObject = C64001P9x.LIZLLL(pa0, uri, jSONObject4, z2, qif.LJIJ, z);
            if (LIZLLL != null) {
                try {
                    if (LIZLLL.LJLILLLLZI <= 0) {
                        LIZLLL.LJLILLLLZI = System.currentTimeMillis();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.LJ.LIZJ.LIZIZ(false);
                    C66789QJd.LJ(this.LJIIL, jSONObject3, jSONObject);
                    throw th;
                }
            }
            this.LJ.LIZJ.LIZIZ(false);
            C66789QJd.LJ(this.LJIIL, jSONObject3, jSONObject);
            if (jSONObject == null) {
                return false;
            }
            C66791QJf c66791QJf2 = this.LJIIIZ;
            C48852JFg c48852JFg2 = this.LJIIIIZZ;
            QKU qku = this.LJIIJ;
            c66791QJf2.getClass();
            String optString = jSONObject.optString("device_id_str", "");
            String optString2 = jSONObject.optString("install_id_str", "");
            String optString3 = jSONObject.optString("device_token", "");
            String optString4 = jSONObject.optString("ssid", "");
            String optString5 = jSONObject.optString("cd", "");
            jSONObject.optInt("new_user", 0);
            boolean LIZ = C36860EdM.LIZ(optString);
            boolean LIZ2 = C36860EdM.LIZ(optString2);
            C36860EdM.LIZ(optString5);
            SharedPreferences.Editor edit = c66791QJf2.LJFF.LIZJ().edit();
            SharedPreferences LIZ3 = C48847JFb.LIZ(c66791QJf2.LJ, c66791QJf2.LJFF);
            SharedPreferences.Editor edit2 = LIZ3.edit();
            try {
                boolean LIZ4 = C36860EdM.LIZ(optString4);
                long j = LIZ3.getLong("dr_install_vc", 0L);
                long optLong = c66791QJf2.LJIIIIZZ.optLong("version_code", 0L);
                if (j != optLong) {
                    edit2.putLong("dr_install_vc", optLong);
                }
                edit2.putString("dr_channel", c66791QJf2.LJFF.LJI);
                edit2.putString("dr_aid", String.valueOf(c66791QJf2.LJFF.LIZ));
                if (!LIZ) {
                    try {
                        new JSONObject().put("response", jSONObject);
                        InterfaceC66833QKv interfaceC66833QKv = c66791QJf2.LJFF.LJJIII;
                        if (interfaceC66833QKv != null) {
                            ((QJD) interfaceC66833QKv).LIZ.getClass();
                        }
                    } catch (JSONException unused) {
                    }
                }
                c66791QJf2.LJFF.getClass();
                QKU qku2 = (QKU) JFZ.LIZ(QKU.class, c66791QJf2.LJFF.LIZ());
                if (qku2 != null) {
                    LIZIZ = qku2.getDeviceId();
                } else {
                    LIZIZ = c66791QJf2.LJIIIZ.LIZIZ("", "");
                }
                if (LIZ) {
                    if (!optString.equals(c66791QJf2.LJIIIIZZ.optString("device_id"))) {
                        synchronized (C66791QJf.class) {
                            JSONObject jSONObject5 = c66791QJf2.LJIIIIZZ;
                            JSONObject jSONObject6 = new JSONObject();
                            C36860EdM.LIZJ(jSONObject6, jSONObject5);
                            jSONObject6.put("device_id", optString);
                            c66791QJf2.LJIIIIZZ = jSONObject6;
                        }
                        qku.LIZIZ(optString);
                        z3 = true;
                        z4 = true;
                    } else {
                        z3 = false;
                        z4 = false;
                    }
                    if (!optString.equals(LIZIZ)) {
                        if (!TextUtils.isEmpty(LIZIZ)) {
                            c66791QJf2.LJFF(qku, optString, LIZIZ);
                        }
                        z3 = true;
                    }
                } else {
                    z3 = false;
                    z4 = false;
                }
                String optString6 = c66791QJf2.LJIIIIZZ.optString("install_id", "");
                if (LIZ2 && c66791QJf2.LJII(optString2, "install_id")) {
                    c66791QJf2.LJIIIZ.LIZJ("install_id", optString2);
                    if (!TextUtils.isEmpty(optString6)) {
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("old_id", optString6);
                        jSONObject7.put("new_id", optString2);
                        InterfaceC66833QKv interfaceC66833QKv2 = c66791QJf2.LJFF.LJJIII;
                        if (interfaceC66833QKv2 != null) {
                            ((QJD) interfaceC66833QKv2).LIZ.getClass();
                        }
                    }
                    z3 = true;
                    z4 = true;
                }
                edit.putString("device_id", optString);
                edit.putString("install_id", optString2);
                String optString7 = c66791QJf2.LJIIIIZZ.optString("ssid", "");
                if (LIZ4 && c66791QJf2.LJII(optString4, "ssid")) {
                    c66791QJf2.LJIIIZ.LIZJ("ssid", optString4);
                    z4 = true;
                    z3 = true;
                }
                QIF qif2 = c66791QJf2.LJFF;
                if (!TextUtils.isEmpty(qif2.LJIIJJI)) {
                    string = qif2.LJIIJJI;
                } else {
                    string = C48847JFb.LIZ(qif2.LIZJ, qif2).getString("app_language", null);
                }
                if (!TextUtils.isEmpty(qif2.LJIIL)) {
                    string2 = qif2.LJIIL;
                } else {
                    string2 = C48847JFb.LIZ(qif2.LIZJ, qif2).getString("app_region", null);
                }
                if (!TextUtils.isEmpty(string)) {
                    edit2.putString("app_language", string);
                }
                if (!TextUtils.isEmpty(string2)) {
                    edit2.putString("app_region", string2);
                }
                edit2.apply();
                edit.apply();
                ((JGH) JFZ.LIZ(JGH.class, String.valueOf(c66791QJf2.LJFF.LIZ))).LIZJ(optString3, c48852JFg2);
                if (!TextUtils.equals(optString, LIZIZ) && !TextUtils.isEmpty(optString)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!TextUtils.equals(optString2, optString6) && !TextUtils.isEmpty(optString2)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z4 && (c66811QJz = c66791QJf2.LJIIL) != null) {
                    c66811QJz.LIZ(new QJT(c66791QJf2.LJIIIIZZ));
                }
                if (z5 || z6) {
                    c66791QJf2.LJI();
                    C66798QJm.LIZ(c66791QJf2.LJ, c66791QJf2.LJFF, null, false);
                }
                C66774QIo c66774QIo = c66791QJf2.LJIILIIL;
                if (c66774QIo != null) {
                    c66774QIo.LIZ(LIZIZ, optString, optString6, optString2, z3, optString7, optString4);
                }
                C66808QJw LIZLLL2 = C66789QJd.LIZIZ().LIZLLL(c66791QJf2.LJFF.LIZ);
                if (LIZLLL2 != null) {
                    if (z5 && !c66791QJf2.LJIIIIZZ.optBoolean("new_user_mode")) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    LIZLLL2.LJLJJI = z7;
                }
            } catch (JSONException unused2) {
                LIZ = false;
            }
            if (LIZ && LIZ2) {
                C66811QJz c66811QJz2 = c66791QJf2.LJIIL;
                if (c66811QJz2 != null) {
                    c66811QJz2.LIZ(new C56330M8w(jSONObject));
                }
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences LIZ5 = this.LJIIIIZZ.LIZ(this.LJIIL);
                if (LIZ5 == null) {
                    return true;
                }
                LIZ5.edit().putLong("register_time", currentTimeMillis).apply();
                return true;
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            jSONObject = null;
        }
    }

    @Override // X.AbstractC48869JFx
    public final long[] LIZLLL() {
        int LIZLLL = this.LJIIJJI.LIZLLL();
        if (LIZLLL != 0) {
            long[] jArr = LJIILJJIL;
            if (LIZLLL == 1 || LIZLLL != 2) {
                return jArr;
            }
            return LJIILIIL;
        }
        return LJIILL;
    }

    @Override // X.AbstractC48869JFx
    public final long LJI() {
        if (((QK3) this.LJII).LJLILLLLZI) {
            return 21600000L;
        }
        return 43200000L;
    }

    @Override // X.AbstractC48869JFx
    public final void LIZ() {
        C66808QJw LIZLLL = C66789QJd.LIZIZ().LIZLLL(this.LJIIL.LIZ);
        QIF qif = this.LJIIL;
        SharedPreferences LIZ = C48847JFb.LIZ(qif.LIZJ, qif);
        SharedPreferences.Editor edit = LIZ.edit();
        if (!LIZ.getBoolean("is_first_register_for_app", false) && edit != null) {
            edit.putBoolean("is_first_register_for_app", true);
            edit.apply();
            LIZLLL.LJLJJL = true;
        }
        QIF qif2 = this.LJIIL;
        C66789QJd.LIZIZ().LIZLLL(qif2.LIZ).LLJZ(qif2, "dr_register_result");
    }

    @Override // X.AbstractC48869JFx
    public final void LJII(boolean z) {
        C66789QJd.LIZIZ().LIZLLL(this.LJIIL.LIZ).LJLJLJ = z;
    }

    @Override // X.AbstractC48869JFx
    public final void LJIIIIZZ(int i) {
        C66808QJw LIZLLL = C66789QJd.LIZIZ().LIZLLL(this.LIZIZ.LIZ);
        if (LIZLLL != null) {
            LIZLLL.LJLJI = i;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66790QJe(X.C48852JFg r10, X.QIF r11, X.InterfaceC66823QKl r12, X.C66791QJf r13) {
        /*
            r9 = this;
            android.content.Context r4 = r11.LIZJ
            r0 = 0
            if (r10 != 0) goto L24
        L6:
            r9.<init>(r4, r11, r0)
            r9.LJIIJJI = r13
            r9.LJIIL = r11
            r9.LJII = r12
            r9.LJIIIIZZ = r10
            r9.LJIIIZ = r13
            java.lang.Class<X.QKU> r1 = X.QKU.class
            int r0 = r11.LIZ
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r0 = X.JFZ.LIZ(r1, r0)
            X.QKU r0 = (X.QKU) r0
            r9.LJIIJ = r0
            return
        L24:
            android.content.SharedPreferences r6 = r10.LIZ(r11)
            if (r6 != 0) goto L2b
            goto L6
        L2b:
            java.lang.String r5 = "register_time"
            long r7 = r6.getLong(r5, r0)
            X.QJn r3 = r13.LIZJ()
            java.lang.String r2 = r3.LJLIL
            boolean r2 = X.C36860EdM.LIZ(r2)
            if (r2 == 0) goto L45
            java.lang.String r2 = r3.LJLILLLLZI
            boolean r2 = X.C36860EdM.LIZ(r2)
            if (r2 != 0) goto L55
        L45:
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L55
            android.content.SharedPreferences$Editor r2 = r6.edit()
            android.content.SharedPreferences$Editor r2 = r2.putLong(r5, r0)
            r2.apply()
            goto L6
        L55:
            r0 = r7
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66790QJe.<init>(X.JFg, X.QIF, X.QKl, X.QJf):void");
    }
}

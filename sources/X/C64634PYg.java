package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import kotlin.jvm.internal.o;

/* renamed from: X.PYg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64634PYg<T> extends C64632PYe<T> {
    public boolean LIZIZ;
    public boolean LIZJ;
    public final Object LIZLLL = new Object();

    @Override // X.InterfaceC64633PYf
    public T LIZ() {
        InterfaceC64633PYf<RES> interfaceC64633PYf = this.LIZ;
        if (interfaceC64633PYf == 0) {
            return null;
        }
        o.LJI(interfaceC64633PYf);
        return (T) interfaceC64633PYf.LIZ();
    }

    @Override // X.InterfaceC64633PYf
    public T LIZIZ() {
        InterfaceC64633PYf<RES> interfaceC64633PYf = this.LIZ;
        if (interfaceC64633PYf == 0) {
            return null;
        }
        o.LJI(interfaceC64633PYf);
        return (T) interfaceC64633PYf.LIZIZ();
    }

    public final boolean LIZLLL(int i) {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && SecApiImpl.LIZ().needVerifyImage(i)) {
            SecApiImpl.LIZ().popCaptcha(LJIIIIZZ, i, new C64635PYh(this));
            synchronized (this.LIZLLL) {
                int i2 = 4;
                while (!this.LIZJ) {
                    int i3 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    this.LIZLLL.wait(50000L);
                    i2 = i3;
                }
                this.LIZLLL.notifyAll();
            }
            return true;
        }
        return false;
    }

    public final boolean LJFF(String str) {
        Activity LJIIIIZZ;
        if (TextUtils.isEmpty(str) || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null) {
            return false;
        }
        ISecApi LIZ = SecApiImpl.LIZ();
        o.LJI(str);
        LIZ.popCaptchaV2(LJIIIIZZ, str, new C64636PYi(this));
        synchronized (this.LIZLLL) {
            int i = 4;
            while (!this.LIZJ) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                this.LIZLLL.wait(50000L);
                i = i2;
            }
            this.LIZLLL.notifyAll();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(java.lang.String r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            java.lang.String r5 = "status_code"
            boolean r0 = r8.has(r5)
            java.lang.String r2 = "message"
            r4 = 0
            if (r0 == 0) goto L11
            int r0 = r8.optInt(r5)
            if (r0 == 0) goto L23
        L11:
            boolean r0 = r8.has(r2)
            if (r0 == 0) goto L24
            java.lang.String r1 = "success"
            java.lang.String r0 = r8.optString(r2)
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L24
        L23:
            return r4
        L24:
            java.lang.String r3 = "error_code"
            boolean r0 = r8.has(r3)
            if (r0 == 0) goto L35
            int r1 = r8.optInt(r3)
        L30:
            boolean r0 = r6.LIZLLL(r1)
            return r0
        L35:
            boolean r0 = r8.has(r5)
            if (r0 == 0) goto L40
            int r1 = r8.optInt(r5)
            goto L30
        L40:
            com.ss.android.ugc.aweme.secapi.ISecApi r0 = com.ss.android.ugc.aweme.sec.SecApiImpl.LIZ()
            kotlin.jvm.internal.o.LJI(r7)
            boolean r0 = r0.isCaptchaUrl(r7)
            if (r0 == 0) goto Lbe
            com.ss.android.ugc.aweme.secapi.ISecApi r0 = com.ss.android.ugc.aweme.sec.SecApiImpl.LIZ()
            boolean r0 = r0.isCaptchaUrl(r7)
            if (r0 == 0) goto Lbc
            boolean r0 = r8.has(r2)
            if (r0 == 0) goto Lb9
            java.lang.String r1 = r8.optString(r2)
        L61:
            java.lang.String r0 = "error"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lbc
            java.lang.String r0 = "data"
            java.lang.String r0 = r8.optString(r0)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r0)
            int r4 = r2.optInt(r3)
            java.lang.String r0 = "verify_center_decision_conf"
            java.lang.String r1 = r2.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8c
            java.lang.String r0 = "verify_center_secondary_decision_conf"
            java.lang.String r1 = r2.optString(r0)
        L8c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            android.util.Pair r2 = android.util.Pair.create(r0, r1)
            java.lang.String r0 = "create(errorCode, verifyConfig)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.Object r1 = r2.first
            java.lang.String r0 = "node.first"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r2.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L30
            java.lang.Object r0 = r2.second
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r6.LJFF(r0)
            return r0
        Lb9:
            java.lang.String r1 = ""
            goto L61
        Lbc:
            r1 = 0
            goto L8c
        Lbe:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64634PYg.LJ(java.lang.String, org.json.JSONObject):boolean");
    }
}

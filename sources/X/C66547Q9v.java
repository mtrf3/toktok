package X;

import android.text.TextUtils;
import android.util.Patterns;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.Q9v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66547Q9v implements QAD {
    public C66540Q9o LIZ;
    public final String LIZIZ;

    public C66547Q9v(String str, String str2) {
        try {
            this.LIZIZ = str2;
            if (!TextUtils.isEmpty(str) && Patterns.WEB_URL.matcher(str2).matches()) {
                C66540Q9o.LIZ(UriProtector.parse(str), new QAM(this));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public C66547Q9v(String str, String str2, String str3) {
        try {
            this.LIZIZ = str3;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Patterns.WEB_URL.matcher(str).matches() && Patterns.WEB_URL.matcher(str2).matches()) {
                this.LIZ = new C66540Q9o(UriProtector.parse(str), UriProtector.parse(str2), null);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        if (r7.LIZJ.equals("id_token") != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    @Override // X.QAD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.QA3 LIZ(android.app.Activity r6, X.C24070x1 r7, X.InterfaceC66566QAo r8) {
        /*
            r5 = this;
            java.lang.Object r4 = r7.LJ
            android.net.Uri r4 = (android.net.Uri) r4
            r3 = 0
            if (r4 == 0) goto L16
        L7:
            X.Q9o r0 = r5.LIZ
            if (r0 == 0) goto L15
            java.lang.String r0 = r5.LIZIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L15
            if (r4 != 0) goto L45
        L15:
            return r3
        L16:
            if (r6 == 0) goto L41
            android.content.Context r0 = X.C16880lQ.LLLLJ(r6)
            if (r0 == 0) goto L41
            android.content.Context r0 = X.C16880lQ.LLLLJ(r6)
            java.lang.String r2 = r0.getPackageName()
        L26:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L43
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r2)
            java.lang.String r0 = ":/oauth2callback"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            android.net.Uri r4 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            goto L7
        L41:
            r2 = r3
            goto L26
        L43:
            r4 = r3
            goto L7
        L45:
            java.lang.String r0 = r7.LIZJ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La9
            java.lang.String r0 = r7.LIZJ
            java.lang.String r3 = "code"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L9e
        L57:
            X.Q9x r2 = new X.Q9x
            X.Q9o r1 = r5.LIZ
            java.lang.String r0 = r5.LIZIZ
            r2.<init>(r1, r0, r3, r4)
            java.lang.Object r0 = r7.LIZLLL
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r0 = X.C78999UzT.LJIILJJIL(r0)
            r2.LJII = r0
            java.lang.String r1 = r7.LIZIZ
            if (r1 == 0) goto L73
            java.lang.String r0 = "state cannot be empty if defined"
            X.T2R.LJIILL(r0, r1)
        L73:
            r2.LJIIIIZZ = r1
            X.Q9s r3 = r2.LIZ()
            X.Q9h r2 = new X.Q9h
            r2.<init>(r6)
            r0 = 0
            android.net.Uri[] r1 = new android.net.Uri[r0]
            boolean r0 = r2.LJ
            if (r0 != 0) goto Lac
            X.Q6S r0 = r2.LIZJ
            X.004 r0 = r0.LIZ(r1)
            X.005 r0 = r0.LIZ()
            android.content.Intent r1 = r2.LIZ(r3, r0)
            r0 = 100
            X.C16880lQ.LJFF(r6, r0, r1)
            X.QA3 r0 = new X.QA3
            r0.<init>(r6, r2, r8)
            return r0
        L9e:
            java.lang.String r0 = r7.LIZJ
            java.lang.String r3 = "id_token"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto La9
            goto L57
        La9:
            java.lang.String r3 = "token"
            goto L57
        Lac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Service has been disposed and rendered inoperable"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66547Q9v.LIZ(android.app.Activity, X.0x1, X.QAo):X.QA3");
    }
}

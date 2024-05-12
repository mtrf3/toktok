package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class X57 implements X52 {
    public final boolean LIZ;
    public boolean LIZIZ;
    public int LIZJ = -1;
    public final /* synthetic */ X53 LIZLLL;

    @Override // X.X52
    public final boolean LIZIZ() {
        return true;
    }

    public X57(X53 x53) {
        this.LIZLLL = x53;
        if (x53.LJIIJ > 0 && !x53.LJIIIIZZ.isEmpty()) {
            this.LIZ = true;
        }
    }

    @Override // X.X52
    public final void LIZ(List<HttpHeader> list) {
        int i;
        if (this.LIZ && this.LIZIZ && (i = this.LIZJ) >= 0) {
            X53 x53 = this.LIZLLL;
            if (i >= x53.LJIIJ) {
                return;
            }
            this.LIZIZ = false;
            List<String> list2 = x53.LJIIIIZZ;
            String str = (String) ListProtector.get(list2, i % ((ArrayList) list2).size());
            if (C65210PiY.LIZ()) {
                int i2 = this.LIZLLL.LJIIL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Add BackHost Header: ");
                LIZ.append(str);
                C65210PiY.LIZLLL(i2, "NetworkFailoverStrategy", "handleBackHostHeader", X1D.LIZIZ(LIZ));
            }
            ((ArrayList) list).add(new HttpHeader("extra_ttnet_back_host", str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    @Override // X.X52
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(com.ss.android.socialbase.downloader.exception.BaseException r9) {
        /*
            r8 = this;
            boolean r0 = r8.LIZ
            r5 = 0
            if (r0 == 0) goto Ld
            int r2 = r8.LIZJ
            X.X53 r1 = r8.LIZLLL
            int r0 = r1.LJIIJ
            if (r2 < r0) goto L10
        Ld:
            r8.LIZIZ = r5
            return r5
        L10:
            java.util.Set<java.lang.Integer> r0 = r1.LJIIIZ
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2e
            X.X53 r0 = r8.LIZLLL
            java.util.Set<java.lang.Integer> r1 = r0.LJIIIZ
            int r0 = r9.getErrorCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashSet r1 = (java.util.HashSet) r1
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L79
        L2e:
            r7 = 1
        L2f:
            java.lang.String r6 = " errorCode:"
            java.lang.String r4 = "handleBackHostError"
            java.lang.String r3 = "NetworkFailoverStrategy"
            if (r7 == 0) goto L7d
            int r0 = r8.LIZJ
            int r1 = r0 + 1
            r8.LIZJ = r1
            X.X53 r0 = r8.LIZLLL
            int r0 = r0.LJIIJ
            if (r1 != r0) goto L7b
            boolean r0 = X.C65210PiY.LIZ()
            if (r0 == 0) goto Ld
            X.X53 r0 = r8.LIZLLL
            int r2 = r0.LJIIL
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "BackHostCountLimit"
            r1.append(r0)
            X.X53 r0 = r8.LIZLLL
            int r0 = r0.LJIIJ
            r1.append(r0)
            java.lang.String r0 = " currentBackHostCount:"
            r1.append(r0)
            int r0 = r8.LIZJ
            r1.append(r0)
            r1.append(r6)
            int r0 = r9.getErrorCode()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C65210PiY.LIZLLL(r2, r3, r4, r0)
            goto Ld
        L79:
            r7 = 0
            goto L2f
        L7b:
            r5 = 1
            goto Ld
        L7d:
            boolean r0 = X.C65210PiY.LIZ()
            if (r0 == 0) goto Ld
            X.X53 r0 = r8.LIZLLL
            int r2 = r0.LJIIL
            java.lang.String r1 = "IsMatch"
            java.lang.String r0 = " BackHostCountLimit:"
            java.lang.StringBuilder r1 = X.JBR.LJI(r1, r7, r0)
            X.X53 r0 = r8.LIZLLL
            int r0 = r0.LJIIJ
            r1.append(r0)
            r1.append(r6)
            int r0 = r9.getErrorCode()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C65210PiY.LIZLLL(r2, r3, r4, r0)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X57.LIZJ(com.ss.android.socialbase.downloader.exception.BaseException):boolean");
    }
}

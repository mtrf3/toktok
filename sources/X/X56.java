package X;

import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class X56 extends X54 {
    public final boolean LJFF;
    public boolean LJI;
    public int LJII;
    public final /* synthetic */ X53 LJIIIIZZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X56(X53 x53) {
        super(x53);
        this.LJIIIIZZ = x53;
        this.LJII = -1;
        if (x53.LIZIZ > 0 && !x53.LIZ.isEmpty()) {
            this.LJFF = true;
        }
    }

    @Override // X.X54, X.X52
    public final void LIZ(List<HttpHeader> list) {
        int i;
        if (!this.LJFF || !this.LJI || (i = this.LJII) < 0 || i >= this.LJIIIIZZ.LIZIZ) {
            return;
        }
        this.LJI = false;
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZLLL(this.LJIIIIZZ.LJIIL, "NetworkFailoverStrategy", "handleIsolationHeader", "Add handleIsolationHeader: https://dl");
        }
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new HttpHeader("x-ttnet-isolation-info", "https://dl"));
        if (this.LJIIIIZZ.LIZJ > 0) {
            if (C65210PiY.LIZ()) {
                int i2 = this.LJIIIIZZ.LJIIL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Add x-ttnet-http-proto-type: ");
                C0FS.LIZJ(LIZ, this.LJIIIIZZ.LIZJ, LIZ, i2, "NetworkFailoverStrategy", "handleIsolationHeader");
            }
            arrayList.add(new HttpHeader("x-ttnet-http-proto-type", String.valueOf(this.LJIIIIZZ.LIZJ)));
        }
        super.LIZ(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    @Override // X.X54, X.X52
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(com.ss.android.socialbase.downloader.exception.BaseException r8) {
        /*
            r7 = this;
            boolean r0 = r7.LJFF
            if (r0 == 0) goto Lc
            int r2 = r7.LJII
            X.X53 r1 = r7.LJIIIIZZ
            int r0 = r1.LIZIZ
            if (r2 < r0) goto L17
        Lc:
            r2 = 0
        Ld:
            r7.LJI = r2
            if (r2 == 0) goto L14
            super.LIZJ(r8)
        L14:
            boolean r0 = r7.LJI
            return r0
        L17:
            java.util.Set<java.lang.Integer> r1 = r1.LIZ
            int r0 = r8.getErrorCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashSet r1 = (java.util.HashSet) r1
            boolean r1 = r1.contains(r0)
            java.lang.String r5 = " errorCode:"
            java.lang.String r6 = " ttnetIsolationIndex:"
            java.lang.String r4 = "handleIsolationError"
            java.lang.String r3 = "NetworkFailoverStrategy"
            if (r1 == 0) goto L72
            int r0 = r7.LJII
            r2 = 1
            int r1 = r0 + 1
            r7.LJII = r1
            X.X53 r0 = r7.LJIIIIZZ
            int r0 = r0.LIZIZ
            if (r1 != r0) goto Ld
            boolean r0 = X.C65210PiY.LIZ()
            if (r0 == 0) goto Lc
            X.X53 r0 = r7.LJIIIIZZ
            int r2 = r0.LJIIL
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "IsolationCount"
            r1.append(r0)
            X.X53 r0 = r7.LJIIIIZZ
            int r0 = r0.LIZIZ
            r1.append(r0)
            r1.append(r6)
            int r0 = r7.LJII
            r1.append(r0)
            r1.append(r5)
            int r0 = r8.getErrorCode()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C65210PiY.LIZLLL(r2, r3, r4, r0)
            goto Lc
        L72:
            boolean r0 = X.C65210PiY.LIZ()
            if (r0 == 0) goto Lc
            X.X53 r0 = r7.LJIIIIZZ
            int r2 = r0.LJIIL
            java.lang.String r0 = "IsMatch"
            java.lang.StringBuilder r1 = X.JBR.LJI(r0, r1, r6)
            int r0 = r7.LJII
            r1.append(r0)
            r1.append(r5)
            int r0 = r8.getErrorCode()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C65210PiY.LIZLLL(r2, r3, r4, r0)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X56.LIZJ(com.ss.android.socialbase.downloader.exception.BaseException):boolean");
    }
}

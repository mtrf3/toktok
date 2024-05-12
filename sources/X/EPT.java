package X;

/* loaded from: classes7.dex */
public final class EPT extends RuntimeException {
    public final int LJLIL;
    public final transient C64797Pbt<?> LJLILLLLZI;

    public int code() {
        return this.LJLIL;
    }

    public C64797Pbt<?> response() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EPT(X.C64797Pbt<?> r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L22
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "HTTP "
            r1.append(r0)
            X.EeA r0 = r3.LIZ
            int r0 = r0.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            X.EeA r0 = r3.LIZ
            int r0 = r0.LIZIZ
            r2.LJLIL = r0
            r2.LJLILLLLZI = r3
            return
        L22:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "response == null"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EPT.<init>(X.Pbt):void");
    }
}

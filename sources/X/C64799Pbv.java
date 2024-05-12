package X;

/* renamed from: X.Pbv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64799Pbv extends C64800Pbw {
    public final C64668PZo LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    public String getRequestLog() {
        return this.LJLIL.LJIL;
    }

    public int getCronetInternalErrorCode() {
        return this.LJLJI;
    }

    public C64668PZo getRequestInfo() {
        return this.LJLIL;
    }

    public int getStatusCode() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C64799Pbv(java.lang.Exception r3, X.C64668PZo r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            java.lang.String r1 = r3.getMessage()
            java.lang.Throwable r0 = r3.getCause()
            if (r0 != 0) goto L29
            r0 = r3
        Lb:
            r2.<init>(r1, r0)
            r1 = 1
            r2.needReport = r1
            r0 = 0
            r2.reportMonitorOk = r0
            r2.reportMonitorError = r1
            r2.LJLIL = r4
            r2.traceCode = r5
            boolean r0 = r3 instanceof X.C64802Pby
            if (r0 == 0) goto L26
            X.Pby r3 = (X.C64802Pby) r3
            int r0 = r3.getStatusCode()
            r2.LJLILLLLZI = r0
        L26:
            r2.LJLJI = r6
            return
        L29:
            java.lang.Throwable r0 = r3.getCause()
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64799Pbv.<init>(java.lang.Exception, X.PZo, java.lang.String, int):void");
    }
}

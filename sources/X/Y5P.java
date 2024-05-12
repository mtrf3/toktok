package X;

import com.bytedance.pipo.ocr.bean.PipoOcrResult;

/* loaded from: classes16.dex */
public final class Y5P implements Runnable {
    public final /* synthetic */ Y5K LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ PipoOcrResult LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    public Y5P(Y5K y5k, int i, int i2, String str, PipoOcrResult pipoOcrResult, String str2) {
        this.LJLIL = y5k;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = str;
        this.LJLJJL = pipoOcrResult;
        this.LJLJJLL = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        r10.LJLIL.LJLJJL = X.Y6L.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r10.LJLJJLL, "local") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0058, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r10.LJLJJLL, "local") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        r10.LJLIL.LJLJJL = X.Y6M.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0060, code lost:
    
        r10.LJLIL.LLILZ(java.lang.Integer.valueOf(r10.LJLILLLLZI), java.lang.Integer.valueOf(r10.LJLJI));
        r0 = r10.LJLIL;
        r0.LJLJJLL = true;
        r0.finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0078, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r10 = this;
            java.lang.String r1 = "local"
            r3 = 1
            ij2.a r4 = ij2.a.LJIJ     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L42
            int r5 = r10.LJLILLLLZI     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L42
            int r6 = r10.LJLJI     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L42
            java.lang.String r7 = r10.LJLJJI     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L42
            com.bytedance.pipo.ocr.bean.PipoOcrResult r8 = r10.LJLJJL     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L42
            java.lang.String r9 = r10.LJLJJLL     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L42
            r4.LIZ(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L42
            goto L52
        L13:
            r4 = move-exception
            java.lang.String r0 = r10.LJLJJLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L3b
            X.Y5K r1 = r10.LJLIL
            X.Y6L r0 = X.Y6L.LIZIZ
            r1.LJLJJL = r0
        L22:
            X.Y5K r2 = r10.LJLIL
            int r0 = r10.LJLILLLLZI
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r10.LJLJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LLILZ(r1, r0)
            X.Y5K r0 = r10.LJLIL
            r0.LJLJJLL = r3
            r0.finish()
            throw r4
        L3b:
            X.Y5K r1 = r10.LJLIL
            X.Y6M r0 = X.Y6M.LIZIZ
            r1.LJLJJL = r0
            goto L22
        L42:
            java.lang.String r0 = r10.LJLJJLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L4b
            goto L5a
        L4b:
            X.Y5K r1 = r10.LJLIL
            X.Y6M r0 = X.Y6M.LIZIZ
            r1.LJLJJL = r0
            goto L60
        L52:
            java.lang.String r0 = r10.LJLJJLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L4b
        L5a:
            X.Y5K r1 = r10.LJLIL
            X.Y6L r0 = X.Y6L.LIZIZ
            r1.LJLJJL = r0
        L60:
            X.Y5K r2 = r10.LJLIL
            int r0 = r10.LJLILLLLZI
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r10.LJLJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LLILZ(r1, r0)
            X.Y5K r0 = r10.LJLIL
            r0.LJLJJLL = r3
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y5P.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}

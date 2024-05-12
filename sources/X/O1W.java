package X;

import java.io.InputStream;

/* loaded from: classes11.dex */
public final class O1W extends O1I {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public boolean LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public boolean LJJ;

    @Override // X.O1I
    public final InputStream LIZIZ() {
        InputStream LIZIZ = super.LIZIZ();
        if (LIZIZ != null) {
            if (LIZIZ instanceof O1X) {
                return LIZIZ;
            }
            return new O1X(this, LIZIZ);
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public O1W(android.net.Uri r17, long r18, int r20) {
        /*
            r16 = this;
            r14 = r18
            r4 = 0
            r7 = 0
            r8 = 0
            r2 = r20
            r0 = r2 & 64
            if (r0 == 0) goto L3a
            r10 = 1
        Ld:
            r0 = r2 & 512(0x200, float:7.17E-43)
            java.lang.String r1 = ""
            if (r0 == 0) goto L38
            r13 = r1
        L14:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L1a
            r14 = 0
        L1a:
            java.lang.String r0 = "srcUri"
            r3 = r17
            kotlin.jvm.internal.o.LJIIJ(r3, r0)
            java.lang.String r0 = "successLoader"
            kotlin.jvm.internal.o.LJIIJ(r13, r0)
            r2 = r16
            r5 = r4
            r6 = r4
            r11 = r4
            r12 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14)
            r2.LJIJI = r1
            r2.LJIJJ = r1
            r2.LJIJJLI = r1
            r2.LJIL = r1
            return
        L38:
            r13 = r4
            goto L14
        L3a:
            r10 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O1W.<init>(android.net.Uri, long, int):void");
    }
}

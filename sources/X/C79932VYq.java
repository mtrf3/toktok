package X;

import android.content.Context;

/* renamed from: X.VYq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79932VYq extends VZ4<C79932VYq> {
    public final C79935VYt LIZ;
    public String LIZIZ = ":";
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r2 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ() {
        /*
            r7 = this;
            X.VYt r0 = r7.LIZ
            boolean[] r2 = r0.LJIILIIL
            java.lang.String r6 = "mm"
            java.lang.String r5 = "HH"
            if (r2 == 0) goto Le
            int r1 = r2.length
            r0 = 3
            if (r1 == r0) goto L1c
        Le:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r5)
            java.lang.String r0 = r7.LIZIZ
            java.lang.String r0 = X.JBR.LJFF(r1, r0, r6, r1)
            return r0
        L1c:
            r0 = 0
            boolean r4 = r2[r0]
            r0 = 1
            boolean r3 = r2[r0]
            r0 = 2
            boolean r2 = r2[r0]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r4 == 0) goto L38
            r1.append(r5)
            if (r3 != 0) goto L33
            if (r2 == 0) goto L49
        L33:
            java.lang.String r0 = r7.LIZIZ
            r1.append(r0)
        L38:
            if (r3 == 0) goto L4e
            r1.append(r6)
            if (r2 == 0) goto L49
            java.lang.String r0 = r7.LIZIZ
            r1.append(r0)
        L44:
            java.lang.String r0 = "ss"
            r1.append(r0)
        L49:
            java.lang.String r0 = r1.toString()
            return r0
        L4e:
            if (r2 == 0) goto L49
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79932VYq.LIZ():java.lang.String");
    }

    public final C79924VYi LIZIZ() {
        return this.LIZ;
    }

    public C79932VYq(Context context) {
        C79935VYt c79935VYt = new C79935VYt();
        this.LIZ = c79935VYt;
        c79935VYt.LIZJ = context;
    }
}

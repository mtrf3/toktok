package X;

import android.content.Context;

/* renamed from: X.VYp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79931VYp extends VZ4<C79931VYp> {
    public final C79935VYt LIZ;
    public String LIZIZ = "-";
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r2 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ() {
        /*
            r8 = this;
            X.VYt r0 = r8.LIZ
            boolean[] r2 = r0.LJIIL
            java.lang.String r5 = "dd"
            java.lang.String r7 = "MM"
            java.lang.String r6 = "yyyy"
            if (r2 == 0) goto L10
            int r1 = r2.length
            r0 = 3
            if (r1 == r0) goto L26
        L10:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r6)
            java.lang.String r0 = r8.LIZIZ
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r8.LIZIZ
            java.lang.String r0 = X.JBR.LJFF(r1, r0, r5, r1)
            return r0
        L26:
            r0 = 0
            boolean r4 = r2[r0]
            r0 = 1
            boolean r3 = r2[r0]
            r0 = 2
            boolean r2 = r2[r0]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r4 == 0) goto L42
            r1.append(r6)
            if (r3 != 0) goto L3d
            if (r2 == 0) goto L51
        L3d:
            java.lang.String r0 = r8.LIZIZ
            r1.append(r0)
        L42:
            if (r3 == 0) goto L56
            r1.append(r7)
            if (r2 == 0) goto L51
            java.lang.String r0 = r8.LIZIZ
            r1.append(r0)
        L4e:
            r1.append(r5)
        L51:
            java.lang.String r0 = r1.toString()
            return r0
        L56:
            if (r2 == 0) goto L51
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79931VYp.LIZ():java.lang.String");
    }

    public final C79924VYi LIZIZ() {
        return this.LIZ;
    }

    public C79931VYp(Context context) {
        C79935VYt c79935VYt = new C79935VYt();
        this.LIZ = c79935VYt;
        c79935VYt.LIZJ = context;
    }
}

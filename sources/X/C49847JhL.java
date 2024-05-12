package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JhL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49847JhL {
    public C49849JhN LIZ;
    public C49849JhN LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public C49848JhM LJ;
    public C49863Jhb LJFF;
    public C49854JhS LJI;
    public boolean LJII;

    public C49847JhL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49847JhL)) {
            return false;
        }
        C49847JhL c49847JhL = (C49847JhL) obj;
        return o.LJ(this.LIZ, c49847JhL.LIZ) && o.LJ(this.LIZIZ, c49847JhL.LIZIZ) && o.LJ(this.LIZJ, c49847JhL.LIZJ) && o.LJ(this.LIZLLL, c49847JhL.LIZLLL) && o.LJ(this.LJ, c49847JhL.LJ);
    }

    public final int hashCode() {
        C49849JhN c49849JhN = this.LIZ;
        int hashCode = (c49849JhN == null ? 0 : c49849JhN.hashCode()) * 31;
        C49849JhN c49849JhN2 = this.LIZIZ;
        int hashCode2 = (hashCode + (c49849JhN2 == null ? 0 : c49849JhN2.hashCode())) * 31;
        String str = this.LIZJ;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C49848JhM c49848JhM = this.LJ;
        return hashCode4 + (c49848JhM != null ? c49848JhM.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StreamRoot(headCursor=");
        LIZ.append(this.LIZ);
        LIZ.append(", tailCursor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", entryId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", entryOutId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", backCursor=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0.LJIIIIZZ, r4.LIZLLL) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C49848JhM LIZ() {
        /*
            r4 = this;
            X.JhN r1 = r4.LIZ
        L2:
            r3 = 0
            if (r1 == 0) goto L39
            r1.LJIL()
            java.util.List<X.JhM> r0 = r1.LJIIJ
            java.lang.Object r2 = X.ORZ.LJLLLL(r0)
            X.JhM r2 = (X.C49848JhM) r2
            if (r2 == 0) goto L36
        L12:
            java.lang.String r1 = r2.LIZ
            java.lang.String r0 = r4.LIZJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1f
            if (r3 != 0) goto L26
        L1e:
            r3 = r2
        L1f:
            X.JhM r2 = r2.LJIILLIIL()
            if (r2 == 0) goto L39
            goto L12
        L26:
            X.JhN r0 = r2.LIZJ
            r0.LJIL()
            java.lang.String r1 = r0.LJIIIIZZ
            java.lang.String r0 = r4.LIZLLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1f
            goto L1e
        L36:
            X.JhN r1 = r1.LIZLLL
            goto L2
        L39:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49847JhL.LIZ():X.JhM");
    }

    public final C49848JhM LIZIZ() {
        C49848JhM c49848JhM = this.LJ;
        if (c49848JhM != null) {
            return c49848JhM.LJIJI();
        }
        return null;
    }

    public C49847JhL(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = new C49863Jhb();
        boolean z = false;
        this.LJI = new C49854JhS(z, z, z, z, z, z, z, 4095);
    }
}

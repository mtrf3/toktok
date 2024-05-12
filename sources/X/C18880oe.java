package X;

/* renamed from: X.0oe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18880oe {
    public static final C18880oe LJ = new C18880oe(0, 0, 15);
    public final int LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final int hashCode() {
        return ((C07250Qf.LIZ(this.LIZIZ, this.LIZ * 31, 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KeyboardOptions(capitalization=");
        LIZ.append((Object) C14910iF.LIZ(this.LIZ));
        LIZ.append(", autoCorrect=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", keyboardType=");
        LIZ.append((Object) C14930iH.LIZ(this.LIZJ));
        LIZ.append(", imeAction=");
        LIZ.append((Object) C14850i9.LIZ(this.LIZLLL));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18880oe)) {
            return false;
        }
        C18880oe c18880oe = (C18880oe) obj;
        if (this.LIZ == c18880oe.LIZ && this.LIZIZ == c18880oe.LIZIZ && this.LIZJ == c18880oe.LIZJ && this.LIZLLL == c18880oe.LIZLLL) {
            return true;
        }
        return false;
    }

    public static C18880oe LIZ(C18880oe c18880oe, int i) {
        int i2 = c18880oe.LIZ;
        boolean z = c18880oe.LIZIZ;
        int i3 = c18880oe.LIZJ;
        c18880oe.getClass();
        return new C18880oe(i2, z, i3, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C18880oe(int r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 1
            r0 = r6 & 2
            r2 = 0
            if (r0 == 0) goto L16
            r1 = 1
        L8:
            r0 = r6 & 4
            if (r0 == 0) goto Ld
            r4 = 1
        Ld:
            r0 = r6 & 8
            if (r0 == 0) goto L12
            r5 = 1
        L12:
            r3.<init>(r2, r1, r4, r5)
            return
        L16:
            r1 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18880oe.<init>(int, int, int):void");
    }

    public C18880oe(int i, boolean z, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}

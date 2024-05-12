package X;

/* renamed from: X.7gF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192037gF implements InterfaceC87283bg {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C192037gF() {
        /*
            r2 = this;
            r1 = 0
            r0 = 7
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192037gF.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C192037gF)) {
            return false;
        }
        C192037gF c192037gF = (C192037gF) obj;
        return this.LJLIL == c192037gF.LJLIL && this.LJLILLLLZI == c192037gF.LJLILLLLZI && this.LJLJI == c192037gF.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = ((this.LJLIL * 31) + this.LJLILLLLZI) * 31;
        boolean z = this.LJLJI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(type=");
        LIZ.append(this.LJLIL);
        LIZ.append(", maxEnableSelectCount=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isOwnerOfCollection=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C192037gF(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2, false);
    }

    public C192037gF(int i, int i2, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = z;
    }
}

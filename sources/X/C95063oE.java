package X;

import defpackage.b0;

/* renamed from: X.3oE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95063oE {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C95063oE)) {
            return false;
        }
        C95063oE c95063oE = (C95063oE) obj;
        return this.LIZ == c95063oE.LIZ && this.LIZIZ == c95063oE.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TuxRawWithDesc(rawRes=");
        LIZ.append(this.LIZ);
        LIZ.append(", descStringRes=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C95063oE(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}

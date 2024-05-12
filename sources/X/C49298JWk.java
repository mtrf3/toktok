package X;

import defpackage.b0;

/* renamed from: X.JWk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49298JWk {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49298JWk)) {
            return false;
        }
        C49298JWk c49298JWk = (C49298JWk) obj;
        return this.LIZ == c49298JWk.LIZ && this.LIZIZ == c49298JWk.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Result(position=");
        LIZ.append(this.LIZ);
        LIZ.append(", productMissPos=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C49298JWk(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}

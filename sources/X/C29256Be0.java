package X;

import defpackage.b0;

/* renamed from: X.Be0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29256Be0 {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29256Be0)) {
            return false;
        }
        C29256Be0 c29256Be0 = (C29256Be0) obj;
        return this.LIZ == c29256Be0.LIZ && this.LIZIZ == c29256Be0.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public C29256Be0() {
        this(0, 30);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnityAnimationConfigItem(priority=");
        LIZ.append(this.LIZ);
        LIZ.append(", timeOut=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C29256Be0(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}

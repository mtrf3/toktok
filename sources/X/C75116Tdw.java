package X;

import defpackage.b0;

/* renamed from: X.Tdw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75116Tdw {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75116Tdw)) {
            return false;
        }
        C75116Tdw c75116Tdw = (C75116Tdw) obj;
        return this.LIZ == c75116Tdw.LIZ && this.LIZIZ == c75116Tdw.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ItemStatus(linkStatus=");
        LIZ.append(this.LIZ);
        LIZ.append(", roleType=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C75116Tdw(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}

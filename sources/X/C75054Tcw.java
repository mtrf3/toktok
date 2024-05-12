package X;

import defpackage.b0;

/* renamed from: X.Tcw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75054Tcw {
    public final int LIZ;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75054Tcw)) {
            return false;
        }
        C75054Tcw c75054Tcw = (C75054Tcw) obj;
        return this.LIZ == c75054Tcw.LIZ && this.LIZIZ == c75054Tcw.LIZIZ && this.LIZJ == c75054Tcw.LIZJ && this.LIZLLL == c75054Tcw.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ItemStatus(linkStatus=");
        LIZ.append(this.LIZ);
        LIZ.append(", audioStatus=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", videoStatus=");
        LIZ.append(this.LIZJ);
        LIZ.append(", roleType=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C75054Tcw(int i, int i2) {
        this.LIZ = i;
        this.LIZLLL = i2;
    }
}

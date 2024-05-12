package X;

import kotlin.jvm.internal.o;

/* renamed from: X.37f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C787537f {
    public final C789537z LIZ;
    public final C789337x LIZIZ;
    public final C789437y LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C787537f)) {
            return false;
        }
        C787537f c787537f = (C787537f) obj;
        return o.LJ(this.LIZ, c787537f.LIZ) && o.LJ(this.LIZIZ, c787537f.LIZIZ) && o.LJ(this.LIZJ, c787537f.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        C789337x c789337x = this.LIZIZ;
        int hashCode2 = (hashCode + (c789337x == null ? 0 : c789337x.hashCode())) * 31;
        C789437y c789437y = this.LIZJ;
        return hashCode2 + (c789437y != null ? c789437y.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MafQueryUserEntity(mafInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", userInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", status=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C787537f(C789537z mafInfo, C789337x c789337x, C789437y c789437y) {
        o.LJIIIZ(mafInfo, "mafInfo");
        this.LIZ = mafInfo;
        this.LIZIZ = c789337x;
        this.LIZJ = c789437y;
    }
}

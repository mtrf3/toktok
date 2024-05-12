package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240359bz {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ = 10;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C240359bz)) {
            return false;
        }
        C240359bz c240359bz = (C240359bz) obj;
        return this.LIZ == c240359bz.LIZ && o.LJ(this.LIZIZ, c240359bz.LIZIZ) && o.LJ(this.LIZJ, c240359bz.LIZJ) && this.LIZLLL == c240359bz.LIZLLL && this.LJ == c240359bz.LJ && this.LJFF == c240359bz.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        boolean z = this.LJFF;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CursorData(requestUUID=");
        LIZ.append(this.LIZ);
        LIZ.append(", userId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", secUserId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cursor=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", count=");
        LIZ.append(this.LJ);
        LIZ.append(", requestPinnedList=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C240359bz(String str, int i, boolean z, int i2, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i2;
        this.LJFF = z;
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08840Wi {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08840Wi)) {
            return false;
        }
        C08840Wi c08840Wi = (C08840Wi) obj;
        return this.LIZ == c08840Wi.LIZ && o.LJ(this.LIZIZ, c08840Wi.LIZIZ) && this.LIZJ == c08840Wi.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31);
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveAvatarLogBean(index=");
        LIZ.append(this.LIZ);
        LIZ.append(", id=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isDefaultSelectedAvatar=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C08840Wi(int i, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}

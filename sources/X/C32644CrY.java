package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CrY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32644CrY {
    public final int LIZ;
    public final Long LIZIZ;
    public final boolean LIZJ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32644CrY)) {
            return false;
        }
        C32644CrY c32644CrY = (C32644CrY) obj;
        return this.LIZ == c32644CrY.LIZ && o.LJ(this.LIZIZ, c32644CrY.LIZIZ) && this.LIZJ == c32644CrY.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        Long l = this.LIZIZ;
        int hashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchItemSignature(itemType=");
        LIZ.append(this.LIZ);
        LIZ.append(", itemId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", available=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C32644CrY(int i, Long l) {
        this.LIZ = i;
        this.LIZIZ = l;
    }
}

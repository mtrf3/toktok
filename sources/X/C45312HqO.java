package X;

/* renamed from: X.HqO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45312HqO {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C45312HqO() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45312HqO)) {
            return false;
        }
        C45312HqO c45312HqO = (C45312HqO) obj;
        return this.LIZ == c45312HqO.LIZ && this.LIZIZ == c45312HqO.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + (this.LIZIZ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerLogicConfig(showSearchTab=");
        LIZ.append(this.LIZ);
        LIZ.append(", isSearchPanelOpen=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C45312HqO(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}

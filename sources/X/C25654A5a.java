package X;

/* renamed from: X.A5a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25654A5a {
    public final long LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25654A5a)) {
            return false;
        }
        C25654A5a c25654A5a = (C25654A5a) obj;
        return this.LIZ == c25654A5a.LIZ && this.LIZIZ == c25654A5a.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LLJIJIL + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddOrRemoveResult(collectionId=");
        LIZ.append(this.LIZ);
        LIZ.append(", isAdded=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C25654A5a(long j, boolean z) {
        this.LIZ = j;
        this.LIZIZ = z;
    }
}

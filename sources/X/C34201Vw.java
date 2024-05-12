package X;

/* renamed from: X.1Vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34201Vw extends AbstractC17370mD {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34201Vw) && this.LIZ == ((C34201Vw) obj).LIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReachBottom(albumId=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C34201Vw(long j) {
        this.LIZ = j;
    }
}

package X;

/* renamed from: X.1L7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1L7 extends AbstractC07660Ru {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1L7) && this.LIZ == ((C1L7) obj).LIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShowSongListLoading(tabId=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C1L7(long j) {
        this.LIZ = j;
    }
}

package X;

/* renamed from: X.HXo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44232HXo {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44232HXo) && this.LIZ == ((C44232HXo) obj).LIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public C44232HXo() {
        this(0L);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReuseProp(startTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C44232HXo(long j) {
        this.LIZ = j;
    }
}

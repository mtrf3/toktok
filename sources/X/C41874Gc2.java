package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gc2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41874Gc2 {
    public final C41875Gc3 LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41874Gc2)) {
            return false;
        }
        C41874Gc2 c41874Gc2 = (C41874Gc2) obj;
        return o.LJ(this.LIZ, c41874Gc2.LIZ) && o.LJ(this.LIZIZ, c41874Gc2.LIZIZ);
    }

    public final int hashCode() {
        C41875Gc3 c41875Gc3 = this.LIZ;
        int hashCode = (c41875Gc3 != null ? c41875Gc3.hashCode() : 0) * 31;
        Object obj = this.LIZIZ;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StartInfo(startTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", info=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C41874Gc2(C41875Gc3 startTime, Object obj) {
        o.LJIIIZ(startTime, "startTime");
        this.LIZ = startTime;
        this.LIZIZ = obj;
    }
}

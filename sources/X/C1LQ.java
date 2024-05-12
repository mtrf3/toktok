package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1LQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LQ extends AbstractC07660Ru {
    public final EnumC07630Rr LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1LQ)) {
            return false;
        }
        C1LQ c1lq = (C1LQ) obj;
        return this.LIZ == c1lq.LIZ && this.LIZIZ == c1lq.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayerActionSuccess(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", songId=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C1LQ(EnumC07630Rr type, long j) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = j;
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1LO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LO extends AbstractC07660Ru {
    public final EnumC07630Rr LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1LO)) {
            return false;
        }
        C1LO c1lo = (C1LO) obj;
        return this.LIZ == c1lo.LIZ && this.LIZIZ == c1lo.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayerActionFail(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", songId=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C1LO(EnumC07630Rr type) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = -1L;
    }
}

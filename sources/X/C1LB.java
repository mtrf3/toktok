package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1LB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LB extends AbstractC07660Ru {
    public final EnumC07640Rs LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1LB)) {
            return false;
        }
        C1LB c1lb = (C1LB) obj;
        return this.LIZ == c1lb.LIZ && this.LIZIZ == c1lb.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SongActionFail(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", songId=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C1LB(EnumC07640Rs type, long j) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = j;
    }
}

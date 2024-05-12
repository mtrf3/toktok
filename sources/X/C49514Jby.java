package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jby, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49514Jby {
    public final Long LIZ;
    public final long LIZIZ;

    public C49514Jby() {
        this((Long) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49514Jby)) {
            return false;
        }
        C49514Jby c49514Jby = (C49514Jby) obj;
        return o.LJ(this.LIZ, c49514Jby.LIZ) && this.LIZIZ == c49514Jby.LIZIZ;
    }

    public final int hashCode() {
        Long l = this.LIZ;
        return C16880lQ.LLJIJIL(this.LIZIZ) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CardDurationInfo(startTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", duration=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C49514Jby(Long l, int i) {
        this(0L, (i & 1) != 0 ? null : l);
    }

    public C49514Jby(long j, Long l) {
        this.LIZ = l;
        this.LIZIZ = j;
    }
}

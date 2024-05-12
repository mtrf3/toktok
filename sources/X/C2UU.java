package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2UU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2UU {
    public final Integer LIZ;
    public final Long LIZIZ;

    public C2UU() {
        this(0, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2UU)) {
            return false;
        }
        C2UU c2uu = (C2UU) obj;
        return o.LJ(this.LIZ, c2uu.LIZ) && o.LJ(this.LIZIZ, c2uu.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.LIZIZ;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcomSortReq(session_refresh_index=");
        LIZ.append(this.LIZ);
        LIZ.append(", session_id=");
        return JBR.LJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C2UU(Integer num, Long l) {
        this.LIZ = num;
        this.LIZIZ = l;
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.97I, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C97I {
    public final Integer LIZ;
    public final Long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C97I)) {
            return false;
        }
        C97I c97i = (C97I) obj;
        return o.LJ(this.LIZ, c97i.LIZ) && o.LJ(this.LIZIZ, c97i.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.LIZIZ;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoDiggState(userDigg=");
        LIZ.append(this.LIZ);
        LIZ.append(", diggCount=");
        return JBR.LJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C97I(Integer num, Long l) {
        this.LIZ = num;
        this.LIZIZ = l;
    }
}

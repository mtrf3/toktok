package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RvQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71104RvQ {
    public final int LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71104RvQ)) {
            return false;
        }
        C71104RvQ c71104RvQ = (C71104RvQ) obj;
        return this.LIZ == c71104RvQ.LIZ && o.LJ(this.LIZIZ, c71104RvQ.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Holder(priority=");
        LIZ.append(this.LIZ);
        LIZ.append(", item=");
        return U26.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C71104RvQ(int i, Object item) {
        o.LJIIIZ(item, "item");
        this.LIZ = i;
        this.LIZIZ = item;
    }
}

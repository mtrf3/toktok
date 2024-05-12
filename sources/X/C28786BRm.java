package X;

import kotlin.jvm.internal.o;

/* renamed from: X.BRm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28786BRm {
    public final String LIZ;
    public final long LIZIZ;
    public XKQ LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28786BRm)) {
            return false;
        }
        C28786BRm c28786BRm = (C28786BRm) obj;
        return o.LJ(this.LIZ, c28786BRm.LIZ) && this.LIZIZ == c28786BRm.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventItem(eventName=");
        LIZ.append(this.LIZ);
        LIZ.append(", time=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C28786BRm(String eventName, long j) {
        o.LJIIIZ(eventName, "eventName");
        this.LIZ = eventName;
        this.LIZIZ = j;
    }
}

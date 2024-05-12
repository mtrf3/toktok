package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127754zr {
    public final Integer LIZ;
    public final boolean LIZIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C127754zr)) {
            return false;
        }
        C127754zr c127754zr = (C127754zr) obj;
        return o.LJ(this.LIZ, c127754zr.LIZ) && this.LIZIZ == c127754zr.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SwitchTrackStyle(style=");
        LIZ.append(this.LIZ);
        LIZ.append(", shouldRecordStyle=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C127754zr(Integer num) {
        this.LIZ = num;
    }
}

package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.Y6z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86857Y6z {
    public Integer LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;

    public C86857Y6z() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86857Y6z)) {
            return false;
        }
        C86857Y6z c86857Y6z = (C86857Y6z) obj;
        return o.LJ(this.LIZ, c86857Y6z.LIZ) && o.LJ(this.LIZIZ, c86857Y6z.LIZIZ) && o.LJ(this.LIZJ, c86857Y6z.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LIZJ;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VopRecordingStatus(requiredTextNum=");
        LIZ.append(this.LIZ);
        LIZ.append(", successTextNum=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", usedTextNum=");
        return s0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C86857Y6z(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
    }
}

package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RU7 {
    public final int LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;

    public RU7() {
        this(0, 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RU7)) {
            return false;
        }
        RU7 ru7 = (RU7) obj;
        return this.LIZ == ru7.LIZ && this.LIZIZ == ru7.LIZIZ && o.LJ(this.LIZJ, ru7.LIZJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalIcon(width=");
        LIZ.append(this.LIZ);
        LIZ.append(", height=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", drawable=");
        return s0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public RU7(int i, int i2, Integer num) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = num;
    }
}

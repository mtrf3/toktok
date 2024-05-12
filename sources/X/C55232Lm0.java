package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lm0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55232Lm0 {
    public final EnumC55244LmC LIZ;
    public final boolean LIZIZ;

    public C55232Lm0() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55232Lm0)) {
            return false;
        }
        C55232Lm0 c55232Lm0 = (C55232Lm0) obj;
        return this.LIZ == c55232Lm0.LIZ && this.LIZIZ == c55232Lm0.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AttachOption(attachConfig=");
        LIZ.append(this.LIZ);
        LIZ.append(", nullable=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C55232Lm0(EnumC55244LmC attachConfig, int i) {
        attachConfig = (i & 1) != 0 ? EnumC55244LmC.Single : attachConfig;
        o.LJIIIZ(attachConfig, "attachConfig");
        this.LIZ = attachConfig;
        this.LIZIZ = false;
    }
}

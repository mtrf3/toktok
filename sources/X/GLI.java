package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GLI {
    public final String LIZ;
    public final int LIZIZ;

    public GLI() {
        this(null, 0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GLI)) {
            return false;
        }
        GLI gli = (GLI) obj;
        return o.LJ(this.LIZ, gli.LIZ) && this.LIZIZ == gli.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConvertExtraInfo(owner=");
        LIZ.append(this.LIZ);
        LIZ.append(", from=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public GLI(String owner, int i) {
        o.LJIIIZ(owner, "owner");
        this.LIZ = owner;
        this.LIZIZ = i;
    }

    public /* synthetic */ GLI(String str, int i, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i);
    }
}

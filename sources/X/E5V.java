package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E5V {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E5V)) {
            return false;
        }
        E5V e5v = (E5V) obj;
        return o.LJ(this.LIZ, e5v.LIZ) && this.LIZIZ == e5v.LIZIZ;
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
        LIZ.append("UserInfo(secUid=");
        LIZ.append(this.LIZ);
        LIZ.append(", isNewSignUpUser=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public E5V(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}

package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W2N extends W2O {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W2N) && o.LJ(this.LIZ, ((W2N) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LaunchUserProfile(userId=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public W2N(String str) {
        this.LIZ = str;
    }
}

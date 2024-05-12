package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NBT extends AbstractC58948NBo {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NBT) && o.LJ(this.LIZ, ((NBT) obj).LIZ);
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
        LIZ.append("ShowFailed(failReason=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public NBT(String str) {
        this.LIZ = str;
    }
}

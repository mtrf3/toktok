package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NC1 extends NC2 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NC1) && o.LJ(this.LIZ, ((NC1) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToHide(componentType=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public NC1(String componentType) {
        o.LJIIIZ(componentType, "componentType");
        this.LIZ = componentType;
    }
}

package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NC0 extends NC2 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NC0) && o.LJ(this.LIZ, ((NC0) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToShow(componentType=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public NC0(String componentType) {
        o.LJIIIZ(componentType, "componentType");
        this.LIZ = componentType;
    }
}
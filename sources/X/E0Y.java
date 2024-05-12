package X;

import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E0Y {
    public final E0Z LIZ;
    public final LinkedList<C35716E0a> LIZIZ;

    public E0Y() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0Y)) {
            return false;
        }
        E0Y e0y = (E0Y) obj;
        return o.LJ(this.LIZ, e0y.LIZ) && o.LJ(this.LIZIZ, e0y.LIZIZ);
    }

    public final int hashCode() {
        E0Z e0z = this.LIZ;
        return this.LIZIZ.hashCode() + ((e0z == null ? 0 : e0z.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Data(identifier=");
        LIZ.append(this.LIZ);
        LIZ.append(", history=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public E0Y(MJB mjb) {
        LinkedList<C35716E0a> linkedList = new LinkedList<>();
        this.LIZ = mjb;
        this.LIZIZ = linkedList;
    }
}

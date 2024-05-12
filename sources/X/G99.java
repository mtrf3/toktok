package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G99 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G99)) {
            return false;
        }
        G99 g99 = (G99) obj;
        return o.LJ(this.LIZ, g99.LIZ) && o.LJ(this.LIZIZ, g99.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RowViewModel(code=");
        LIZ.append(this.LIZ);
        LIZ.append(", name=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public G99(String code, String name) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(name, "name");
        this.LIZ = code;
        this.LIZIZ = name;
    }
}

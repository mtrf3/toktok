package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E1D {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E1D)) {
            return false;
        }
        E1D e1d = (E1D) obj;
        return o.LJ(this.LIZ, e1d.LIZ) && o.LJ(this.LIZIZ, e1d.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TitleMessagePair(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", message=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public E1D(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}

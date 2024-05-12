package X;

import java.lang.Exception;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XM8<E extends Exception> extends XM9 {
    public final E LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Failure: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public XM8(E e) {
        this.LIZIZ = e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof XM8) && o.LJ(this.LIZIZ, ((XM8) obj).LIZIZ)) {
            return true;
        }
        return false;
    }
}

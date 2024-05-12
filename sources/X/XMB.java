package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XMB<V> extends XM9 {
    public final V LIZIZ;

    public final int hashCode() {
        V v = this.LIZIZ;
        if (v != null) {
            return v.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Success: ");
        return U26.LIZJ(LIZ, this.LIZIZ, ']', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public XMB(YME yme) {
        this.LIZIZ = yme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof XMB) && o.LJ(this.LIZIZ, ((XMB) obj).LIZIZ)) {
            return true;
        }
        return false;
    }
}

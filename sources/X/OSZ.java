package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OSZ<A, B> implements Serializable {
    public final A LJLIL;
    public final B LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OSZ copy$default(OSZ osz, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = osz.LJLIL;
        }
        if ((i & 2) != 0) {
            obj2 = osz.LJLILLLLZI;
        }
        return osz.copy(obj, obj2);
    }

    public final OSZ<A, B> copy(A a, B b) {
        return new OSZ<>(a, b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OSZ)) {
            return false;
        }
        OSZ osz = (OSZ) obj;
        return o.LJ(this.LJLIL, osz.LJLIL) && o.LJ(this.LJLILLLLZI, osz.LJLILLLLZI);
    }

    public int hashCode() {
        A a = this.LJLIL;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.LJLILLLLZI;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('(');
        LIZ.append(this.LJLIL);
        LIZ.append(", ");
        return U26.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public final A getFirst() {
        return this.LJLIL;
    }

    public final B getSecond() {
        return this.LJLILLLLZI;
    }

    public OSZ(A a, B b) {
        this.LJLIL = a;
        this.LJLILLLLZI = b;
    }
}

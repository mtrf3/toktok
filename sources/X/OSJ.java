package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OSJ<A, B, C> implements Serializable {
    public final A LJLIL;
    public final B LJLILLLLZI;
    public final C LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OSJ copy$default(OSJ osj, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = osj.LJLIL;
        }
        if ((i & 2) != 0) {
            obj2 = osj.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            obj3 = osj.LJLJI;
        }
        return osj.copy(obj, obj2, obj3);
    }

    public final OSJ<A, B, C> copy(A a, B b, C c) {
        return new OSJ<>(a, b, c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OSJ)) {
            return false;
        }
        OSJ osj = (OSJ) obj;
        return o.LJ(this.LJLIL, osj.LJLIL) && o.LJ(this.LJLILLLLZI, osj.LJLILLLLZI) && o.LJ(this.LJLJI, osj.LJLJI);
    }

    public int hashCode() {
        A a = this.LJLIL;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.LJLJI;
        return hashCode2 + (c != null ? c.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('(');
        LIZ.append(this.LJLIL);
        LIZ.append(", ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", ");
        return U26.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public final A getFirst() {
        return this.LJLIL;
    }

    public final B getSecond() {
        return this.LJLILLLLZI;
    }

    public final C getThird() {
        return this.LJLJI;
    }

    public OSJ(A a, B b, C c) {
        this.LJLIL = a;
        this.LJLILLLLZI = b;
        this.LJLJI = c;
    }
}

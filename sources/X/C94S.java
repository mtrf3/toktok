package X;

import kotlin.jvm.internal.o;

/* renamed from: X.94S, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C94S implements C33Q {
    public final C43I<C76800UCe> LJLIL;
    public final C43I<C76800UCe> LJLILLLLZI;
    public final C43I<C97I> LJLJI;

    public C94S() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94S)) {
            return false;
        }
        C94S c94s = (C94S) obj;
        return o.LJ(this.LJLIL, c94s.LJLIL) && o.LJ(this.LJLILLLLZI, c94s.LJLILLLLZI) && o.LJ(this.LJLJI, c94s.LJLJI);
    }

    public final int hashCode() {
        C43I<C76800UCe> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<C76800UCe> c43i2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<C97I> c43i3 = this.LJLJI;
        return hashCode2 + (c43i3 != null ? c43i3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchPhotoState(onPlayMediaEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", onPauseMediaEvent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", onLikeEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C94S(C43I<C76800UCe> c43i, C43I<C76800UCe> c43i2, C43I<C97I> c43i3) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c43i3;
    }
}

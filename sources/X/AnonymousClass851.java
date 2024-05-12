package X;

import kotlin.jvm.internal.o;

/* renamed from: X.851, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass851 implements C33Q {
    public final C43I<C76800UCe> LJLIL;
    public final C85Z LJLILLLLZI;

    public AnonymousClass851() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass851)) {
            return false;
        }
        AnonymousClass851 anonymousClass851 = (AnonymousClass851) obj;
        return o.LJ(this.LJLIL, anonymousClass851.LJLIL) && o.LJ(this.LJLILLLLZI, anonymousClass851.LJLILLLLZI);
    }

    public final int hashCode() {
        C43I<C76800UCe> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C85Z c85z = this.LJLILLLLZI;
        return hashCode + (c85z != null ? c85z.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LandscapeVideoDescState(sync2StateEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", toggleAnimationState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AnonymousClass851(C43I<C76800UCe> c43i, C85Z c85z) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c85z;
    }
}

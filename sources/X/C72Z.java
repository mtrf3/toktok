package X;

import kotlin.jvm.internal.o;

/* renamed from: X.72Z, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C72Z implements C33Q {
    public final C43I<C76800UCe> LJLIL;
    public final C43I<C76800UCe> LJLILLLLZI;

    public C72Z() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72Z)) {
            return false;
        }
        C72Z c72z = (C72Z) obj;
        return o.LJ(this.LJLIL, c72z.LJLIL) && o.LJ(this.LJLILLLLZI, c72z.LJLILLLLZI);
    }

    public final int hashCode() {
        C43I<C76800UCe> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<C76800UCe> c43i2 = this.LJLILLLLZI;
        return hashCode + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserPhotoState(onPlayMediaEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", onPauseMediaEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C72Z(Object obj) {
        this.LJLIL = null;
        this.LJLILLLLZI = null;
    }
}

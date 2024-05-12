package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8E3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8E3 implements C33Q {
    public final C8E0 LJLIL;
    public final C43I<C76800UCe> LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8E3)) {
            return false;
        }
        C8E3 c8e3 = (C8E3) obj;
        return this.LJLIL == c8e3.LJLIL && o.LJ(this.LJLILLLLZI, c8e3.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        C43I<C76800UCe> c43i = this.LJLILLLLZI;
        return hashCode + (c43i == null ? 0 : c43i.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarAndNicknamePopupState(page=");
        LIZ.append(this.LJLIL);
        LIZ.append(", close=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C8E3(C8E0 page, C43I<C76800UCe> c43i) {
        o.LJIIIZ(page, "page");
        this.LJLIL = page;
        this.LJLILLLLZI = c43i;
    }
}

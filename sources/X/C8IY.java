package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8IY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8IY implements C33Q {
    public final C43I<String> LJLIL;
    public final C43I<Integer> LJLILLLLZI;

    public C8IY() {
        this((C43I) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8IY)) {
            return false;
        }
        C8IY c8iy = (C8IY) obj;
        return o.LJ(this.LJLIL, c8iy.LJLIL) && o.LJ(this.LJLILLLLZI, c8iy.LJLILLLLZI);
    }

    public final int hashCode() {
        C43I<String> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<Integer> c43i2 = this.LJLILLLLZI;
        return hashCode + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoFeedMultiTagState(awemeId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", onPageSelectedEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ C8IY(C43I c43i, int i) {
        this((C43I<String>) ((i & 1) != 0 ? null : c43i), (C43I<Integer>) null);
    }

    public C8IY(C43I<String> c43i, C43I<Integer> c43i2) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
    }
}

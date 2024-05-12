package X;

import kotlin.jvm.internal.o;

/* renamed from: X.77k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1807277k implements C33Q {
    public final C43I<OSZ<Integer, Integer>> LJLIL;

    public C1807277k() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1807277k) && o.LJ(this.LJLIL, ((C1807277k) obj).LJLIL);
    }

    public final int hashCode() {
        C43I<OSZ<Integer, Integer>> c43i = this.LJLIL;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicHighlightBackgroundState(highlightBackgroundColor=");
        return C61845OOz.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C1807277k(C43I<OSZ<Integer, Integer>> c43i) {
        this.LJLIL = c43i;
    }
}

package X;

import kotlin.jvm.internal.o;

/* renamed from: X.99K, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C99K implements C33Q {
    public final boolean LJLIL;
    public final C43I<String> LJLILLLLZI;

    public C99K() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C99K)) {
            return false;
        }
        C99K c99k = (C99K) obj;
        return this.LJLIL == c99k.LJLIL && o.LJ(this.LJLILLLLZI, c99k.LJLILLLLZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        C43I<String> c43i = this.LJLILLLLZI;
        return i + (c43i == null ? 0 : c43i.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicCellCollectIconState(isCollect=");
        LIZ.append(this.LJLIL);
        LIZ.append(", toastEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ C99K(int i) {
        this(false, null);
    }

    public C99K(boolean z, C43I<String> c43i) {
        this.LJLIL = z;
        this.LJLILLLLZI = c43i;
    }

    public static C99K LIZ(C99K c99k, boolean z, C43I c43i, int i) {
        if ((i & 1) != 0) {
            z = c99k.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i = c99k.LJLILLLLZI;
        }
        c99k.getClass();
        return new C99K(z, c43i);
    }
}

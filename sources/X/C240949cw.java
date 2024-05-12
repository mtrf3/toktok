package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240949cw implements C33Q {
    public final boolean LJLIL;
    public final EnumC240989d0 LJLILLLLZI;
    public final C43I<String> LJLJI;

    public C240949cw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C240949cw)) {
            return false;
        }
        C240949cw c240949cw = (C240949cw) obj;
        return this.LJLIL == c240949cw.LJLIL && this.LJLILLLLZI == c240949cw.LJLILLLLZI && o.LJ(this.LJLJI, c240949cw.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.LJLILLLLZI.hashCode() + (r0 * 31)) * 31;
        C43I<String> c43i = this.LJLJI;
        return hashCode + (c43i == null ? 0 : c43i.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicCellState(isCollect=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pinnedVideoStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", toastEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C240949cw(int i) {
        this(false, EnumC240989d0.NOT_ALLOWED_SHOWN, null);
    }

    public C240949cw(boolean z, EnumC240989d0 pinnedVideoStatus, C43I<String> c43i) {
        o.LJIIIZ(pinnedVideoStatus, "pinnedVideoStatus");
        this.LJLIL = z;
        this.LJLILLLLZI = pinnedVideoStatus;
        this.LJLJI = c43i;
    }

    public static C240949cw LIZ(C240949cw c240949cw, boolean z, EnumC240989d0 pinnedVideoStatus, C43I c43i, int i) {
        if ((i & 1) != 0) {
            z = c240949cw.LJLIL;
        }
        if ((i & 2) != 0) {
            pinnedVideoStatus = c240949cw.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i = c240949cw.LJLJI;
        }
        c240949cw.getClass();
        o.LJIIIZ(pinnedVideoStatus, "pinnedVideoStatus");
        return new C240949cw(z, pinnedVideoStatus, c43i);
    }
}

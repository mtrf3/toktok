package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189257bl implements InterfaceC208718Hb<C189257bl, Object> {
    public final C8HZ<Object> LJLIL;
    public final C189367bw LJLILLLLZI;
    public final C43I<Long> LJLJI;
    public final boolean LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        C189367bw c189367bw = this.LJLILLLLZI;
        int i = 0;
        if (c189367bw == null) {
            hashCode = 0;
        } else {
            hashCode = c189367bw.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        C43I<Long> c43i = this.LJLJI;
        if (c43i != null) {
            i = c43i.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.LJLJJI;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return i3 + i4;
    }

    @Override // X.InterfaceC2064888m
    public final List<Object> getListItemState() {
        return C208708Ha.LIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadLatestState() {
        return C208708Ha.LIZIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadMoreState() {
        return C208708Ha.LIZJ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getRefreshState() {
        return C208708Ha.LIZLLL(this);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryViewerListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectedStoryInfo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", totalViewerNumEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", shouldQueryViewerList=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<Object> getListState() {
        return this.LJLIL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C189257bl)) {
            return false;
        }
        C189257bl c189257bl = (C189257bl) obj;
        if (o.LJ(this.LJLIL, c189257bl.LJLIL) && o.LJ(this.LJLILLLLZI, c189257bl.LJLILLLLZI) && o.LJ(this.LJLJI, c189257bl.LJLJI) && this.LJLJJI == c189257bl.LJLJJI) {
            return true;
        }
        return false;
    }

    public C189257bl(C8HZ<Object> c8hz, C189367bw c189367bw, C43I<Long> c43i, boolean z) {
        this.LJLIL = c8hz;
        this.LJLILLLLZI = c189367bw;
        this.LJLJI = c43i;
        this.LJLJJI = z;
    }

    public static C189257bl LIZ(C189257bl c189257bl, C8HZ listState, C189367bw c189367bw, C43I c43i, boolean z, int i) {
        if ((i & 1) != 0) {
            listState = c189257bl.LJLIL;
        }
        if ((i & 2) != 0) {
            c189367bw = c189257bl.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i = c189257bl.LJLJI;
        }
        if ((i & 8) != 0) {
            z = c189257bl.LJLJJI;
        }
        c189257bl.getClass();
        o.LJIIIZ(listState, "listState");
        return new C189257bl(listState, c189367bw, c43i, z);
    }
}

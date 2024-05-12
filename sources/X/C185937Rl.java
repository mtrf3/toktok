package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185937Rl implements InterfaceC208718Hb<C185937Rl, C185907Ri> {
    public final C43I<Integer> LJLIL;
    public final C8HZ<C185907Ri> LJLILLLLZI;

    public C185937Rl() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        C43I<Integer> c43i = this.LJLIL;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        return this.LJLILLLLZI.hashCode() + (hashCode * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C185907Ri> getListItemState() {
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
        LIZ.append("MovieVideoListState(scrollToPositionEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C185907Ri> getListState() {
        return this.LJLILLLLZI;
    }

    public /* synthetic */ C185937Rl(int i) {
        this(null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C185937Rl)) {
            return false;
        }
        C185937Rl c185937Rl = (C185937Rl) obj;
        if (o.LJ(this.LJLIL, c185937Rl.LJLIL) && o.LJ(this.LJLILLLLZI, c185937Rl.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C185937Rl(C43I<Integer> c43i, C8HZ<C185907Ri> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = c43i;
        this.LJLILLLLZI = listState;
    }
}

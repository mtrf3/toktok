package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87473bz implements InterfaceC208718Hb<C87473bz, C86883b2> {
    public final C8HZ<C86883b2> LJLIL;

    public C87473bz() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C86883b2> getListItemState() {
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
        LIZ.append("VideoSelectionContentState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C86883b2> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C87473bz(int i) {
        this((C8HZ<C86883b2>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C87473bz) && o.LJ(this.LJLIL, ((C87473bz) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C87473bz(C8HZ<C86883b2> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}

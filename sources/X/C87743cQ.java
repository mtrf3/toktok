package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3cQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87743cQ implements InterfaceC208718Hb<C87743cQ, InterfaceC57784Mm4> {
    public final C8HZ<InterfaceC57784Mm4> LJLIL;

    public C87743cQ() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<InterfaceC57784Mm4> getListItemState() {
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
        LIZ.append("ArtistProfileTuxSheetVMState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C87743cQ(int i) {
        this((C8HZ<InterfaceC57784Mm4>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C87743cQ) && o.LJ(this.LJLIL, ((C87743cQ) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C87743cQ(C8HZ<InterfaceC57784Mm4> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}

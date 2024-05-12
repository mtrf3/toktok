package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242699fl implements InterfaceC208718Hb<C242699fl, InterfaceC57784Mm4> {
    public final C8HZ<InterfaceC57784Mm4> LJLIL;
    public final C43I<Integer> LJLILLLLZI;

    public C242699fl() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
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
        LIZ.append("FollowStorySkylightState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectedCellPosition=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C242699fl(int i) {
        this(new C43I(0), new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C242699fl)) {
            return false;
        }
        C242699fl c242699fl = (C242699fl) obj;
        if (o.LJ(this.LJLIL, c242699fl.LJLIL) && o.LJ(this.LJLILLLLZI, c242699fl.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C242699fl(C43I selectedCellPosition, C8HZ listState) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(selectedCellPosition, "selectedCellPosition");
        this.LJLIL = listState;
        this.LJLILLLLZI = selectedCellPosition;
    }

    public static C242699fl LIZ(C242699fl c242699fl, C8HZ listState, C43I selectedCellPosition, int i) {
        if ((i & 1) != 0) {
            listState = c242699fl.LJLIL;
        }
        if ((i & 2) != 0) {
            selectedCellPosition = c242699fl.LJLILLLLZI;
        }
        c242699fl.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(selectedCellPosition, "selectedCellPosition");
        return new C242699fl(selectedCellPosition, listState);
    }
}

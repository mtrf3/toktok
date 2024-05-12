package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3c2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87503c2 implements InterfaceC208718Hb<C87503c2, C72412sn> {
    public final C8HZ<C72412sn> LJLIL;
    public final InterfaceC86893b3 LJLILLLLZI;

    public C87503c2() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C72412sn> getListItemState() {
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
        LIZ.append("StickerSetContentState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", cellState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C72412sn> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C87503c2(int i) {
        this(new C8HZ(null, null, 15), C86903b4.LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87503c2)) {
            return false;
        }
        C87503c2 c87503c2 = (C87503c2) obj;
        if (o.LJ(this.LJLIL, c87503c2.LJLIL) && o.LJ(this.LJLILLLLZI, c87503c2.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C87503c2(C8HZ<C72412sn> listState, InterfaceC86893b3 cellState) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(cellState, "cellState");
        this.LJLIL = listState;
        this.LJLILLLLZI = cellState;
    }

    public static C87503c2 LIZ(C87503c2 c87503c2, C8HZ listState, InterfaceC86893b3 cellState, int i) {
        if ((i & 1) != 0) {
            listState = c87503c2.LJLIL;
        }
        if ((i & 2) != 0) {
            cellState = c87503c2.LJLILLLLZI;
        }
        c87503c2.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(cellState, "cellState");
        return new C87503c2(listState, cellState);
    }
}

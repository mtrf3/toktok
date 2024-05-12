package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9fn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242719fn implements InterfaceC208718Hb<C242719fn, InterfaceC57784Mm4> {
    public final C8HZ<InterfaceC57784Mm4> LJLIL;
    public final C43I<Integer> LJLILLLLZI;
    public final C43I<InterfaceC57784Mm4> LJLJI;

    public C242719fn() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = C40328FsC.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        C43I<InterfaceC57784Mm4> c43i = this.LJLJI;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        return LIZIZ + hashCode;
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
        LIZ.append("FeedSkylightListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectedCellPosition=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", itemDeleteEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C242719fn(int i) {
        this(new C8HZ(null, null, 15), new C43I(0), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C242719fn)) {
            return false;
        }
        C242719fn c242719fn = (C242719fn) obj;
        if (o.LJ(this.LJLIL, c242719fn.LJLIL) && o.LJ(this.LJLILLLLZI, c242719fn.LJLILLLLZI) && o.LJ(this.LJLJI, c242719fn.LJLJI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C242719fn(C8HZ<InterfaceC57784Mm4> listState, C43I<Integer> selectedCellPosition, C43I<? extends InterfaceC57784Mm4> c43i) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(selectedCellPosition, "selectedCellPosition");
        this.LJLIL = listState;
        this.LJLILLLLZI = selectedCellPosition;
        this.LJLJI = c43i;
    }

    public static C242719fn LIZ(C242719fn c242719fn, C8HZ listState, C43I selectedCellPosition, C43I c43i, int i) {
        if ((i & 1) != 0) {
            listState = c242719fn.LJLIL;
        }
        if ((i & 2) != 0) {
            selectedCellPosition = c242719fn.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i = c242719fn.LJLJI;
        }
        c242719fn.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(selectedCellPosition, "selectedCellPosition");
        return new C242719fn(listState, selectedCellPosition, c43i);
    }
}

package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aLv, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93131aLv implements InterfaceC208718Hb<C93131aLv, C92372a9g> {
    public final C8HZ<C92372a9g> LJLIL;

    public C93131aLv() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C92372a9g> getListItemState() {
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
        LIZ.append("StatementsListViewState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C92372a9g> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C93131aLv(int i) {
        this((C8HZ<C92372a9g>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C93131aLv) && o.LJ(this.LJLIL, ((C93131aLv) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C93131aLv(C8HZ<C92372a9g> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}

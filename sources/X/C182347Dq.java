package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182347Dq implements InterfaceC208718Hb<C182347Dq, C184817Nd> {
    public final C8HZ<C184817Nd> LJLIL;

    public C182347Dq() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C184817Nd> getListItemState() {
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
        LIZ.append("TopicSearchDetailState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C184817Nd> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C182347Dq(int i) {
        this((C8HZ<C184817Nd>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C182347Dq) && o.LJ(this.LJLIL, ((C182347Dq) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C182347Dq(C8HZ<C184817Nd> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}

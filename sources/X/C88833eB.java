package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3eB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88833eB implements InterfaceC208718Hb<C88833eB, C57727Ml9> {
    public final C8HZ<C57727Ml9> LJLIL;

    public C88833eB() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C57727Ml9> getListItemState() {
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
        LIZ.append("FriendNewVideoListState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C57727Ml9> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C88833eB(int i) {
        this((C8HZ<C57727Ml9>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C88833eB) && o.LJ(this.LJLIL, ((C88833eB) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C88833eB(C8HZ<C57727Ml9> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}

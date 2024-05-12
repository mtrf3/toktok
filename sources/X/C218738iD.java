package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8iD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218738iD implements InterfaceC208718Hb<C218738iD, C218768iG> {
    public final C8HZ<C218768iG> LJLIL;

    public C218738iD() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C218768iG> getListItemState() {
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
        LIZ.append("SearchResultState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C218768iG> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C218738iD(int i) {
        this((C8HZ<C218768iG>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C218738iD) && o.LJ(this.LJLIL, ((C218738iD) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C218738iD(C8HZ<C218768iG> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}

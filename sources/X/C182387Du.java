package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182387Du implements InterfaceC208718Hb<C182387Du, C7WZ> {
    public final C8HZ<C7WZ> LJLIL;

    public C182387Du() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C7WZ> getListItemState() {
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
        LIZ.append("PoiCollectListState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C7WZ> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C182387Du(int i) {
        this((C8HZ<C7WZ>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C182387Du) && o.LJ(this.LJLIL, ((C182387Du) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C182387Du(C8HZ<C7WZ> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}

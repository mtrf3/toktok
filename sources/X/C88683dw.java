package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3dw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88683dw implements InterfaceC208718Hb<C88683dw, C88703dy> {
    public final C8HZ<C88703dy> LJLIL;

    public C88683dw() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C88703dy> getListItemState() {
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
        LIZ.append("LandscapeFeedState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C88703dy> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C88683dw(int i) {
        this((C8HZ<C88703dy>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C88683dw) && o.LJ(this.LJLIL, ((C88683dw) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C88683dw(C8HZ<C88703dy> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}

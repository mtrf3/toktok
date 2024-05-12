package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182337Dp implements InterfaceC208718Hb<C182337Dp, C184817Nd> {
    public final C8HZ<C184817Nd> LJLIL;

    public C182337Dp() {
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
        LIZ.append("MovieFavoriteListState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C184817Nd> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C182337Dp(int i) {
        this((C8HZ<C184817Nd>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C182337Dp) && o.LJ(this.LJLIL, ((C182337Dp) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C182337Dp(C8HZ<C184817Nd> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}

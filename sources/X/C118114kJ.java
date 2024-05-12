package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4kJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118114kJ implements InterfaceC208718Hb<C118114kJ, C118084kG> {
    public final C8HZ<C118084kG> LJLIL;

    public C118114kJ() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C118084kG> getListItemState() {
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
        LIZ.append("TrendingBillboardState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C118084kG> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C118114kJ(int i) {
        this((C8HZ<C118084kG>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C118114kJ) && o.LJ(this.LJLIL, ((C118114kJ) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C118114kJ(C8HZ<C118084kG> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}

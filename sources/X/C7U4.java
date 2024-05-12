package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7U4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7U4 implements InterfaceC208718Hb<C7U4, C7UE> {
    public final C43I<Integer> LJLIL;
    public final C8HZ<C7UE> LJLILLLLZI;

    public C7U4() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        C43I<Integer> c43i = this.LJLIL;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        return this.LJLILLLLZI.hashCode() + (hashCode * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C7UE> getListItemState() {
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
        LIZ.append("SubOnlyVideoListVMState(scrollToPositionEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C7UE> getListState() {
        return this.LJLILLLLZI;
    }

    public /* synthetic */ C7U4(int i) {
        this(null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7U4)) {
            return false;
        }
        C7U4 c7u4 = (C7U4) obj;
        if (o.LJ(this.LJLIL, c7u4.LJLIL) && o.LJ(this.LJLILLLLZI, c7u4.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C7U4(C43I<Integer> c43i, C8HZ<C7UE> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = c43i;
        this.LJLILLLLZI = listState;
    }
}

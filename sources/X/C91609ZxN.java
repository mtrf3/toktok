package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZxN, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91609ZxN implements InterfaceC208718Hb<C91609ZxN, InterfaceC57784Mm4> {
    public final C8HZ<InterfaceC57784Mm4> LJLIL;
    public final Boolean LJLILLLLZI;
    public final boolean LJLJI;

    public C91609ZxN() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        Boolean bool = this.LJLILLLLZI;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        boolean z = this.LJLJI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
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
        LIZ.append("MDAudioQueueVMState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", showLoading=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", needDismiss=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C91609ZxN(int i) {
        this(new C8HZ(null, null, 15), null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91609ZxN)) {
            return false;
        }
        C91609ZxN c91609ZxN = (C91609ZxN) obj;
        if (o.LJ(this.LJLIL, c91609ZxN.LJLIL) && o.LJ(this.LJLILLLLZI, c91609ZxN.LJLILLLLZI) && this.LJLJI == c91609ZxN.LJLJI) {
            return true;
        }
        return false;
    }

    public C91609ZxN(C8HZ<InterfaceC57784Mm4> listState, Boolean bool, boolean z) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = bool;
        this.LJLJI = z;
    }

    public static C91609ZxN LIZ(C91609ZxN c91609ZxN, C8HZ listState, Boolean bool, boolean z, int i) {
        if ((i & 1) != 0) {
            listState = c91609ZxN.LJLIL;
        }
        if ((i & 2) != 0) {
            bool = c91609ZxN.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z = c91609ZxN.LJLJI;
        }
        c91609ZxN.getClass();
        o.LJIIIZ(listState, "listState");
        return new C91609ZxN(listState, bool, z);
    }
}

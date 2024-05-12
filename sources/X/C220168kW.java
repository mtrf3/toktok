package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8kW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220168kW implements InterfaceC208718Hb<C220168kW, C219988kE> {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final C8HZ<C219988kE> LJLJI;

    public C220168kW() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.LJLJI.hashCode() + (((r0 * 31) + this.LJLILLLLZI) * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C219988kE> getListItemState() {
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
        LIZ.append("HubTabVMState(isMe=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectedHub=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C219988kE> getListState() {
        return this.LJLJI;
    }

    public /* synthetic */ C220168kW(int i) {
        this(false, -1, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C220168kW)) {
            return false;
        }
        C220168kW c220168kW = (C220168kW) obj;
        if (this.LJLIL == c220168kW.LJLIL && this.LJLILLLLZI == c220168kW.LJLILLLLZI && o.LJ(this.LJLJI, c220168kW.LJLJI)) {
            return true;
        }
        return false;
    }

    public C220168kW(boolean z, int i, C8HZ<C219988kE> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = listState;
    }

    public static C220168kW LIZ(C220168kW c220168kW, boolean z, int i, C8HZ listState, int i2) {
        if ((i2 & 1) != 0) {
            z = c220168kW.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i = c220168kW.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            listState = c220168kW.LJLJI;
        }
        c220168kW.getClass();
        o.LJIIIZ(listState, "listState");
        return new C220168kW(z, i, listState);
    }
}

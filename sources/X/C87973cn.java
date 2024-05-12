package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87973cn implements InterfaceC208718Hb<C87973cn, InterfaceC57784Mm4> {
    public final C8HZ<InterfaceC57784Mm4> LJLIL;
    public final List<InterfaceC57784Mm4> LJLILLLLZI;

    public C87973cn() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        List<InterfaceC57784Mm4> list = this.LJLILLLLZI;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
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
        LIZ.append("FriendListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", items=");
        return C1NE.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C87973cn(int i) {
        this(new C8HZ(null, null, 15), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87973cn)) {
            return false;
        }
        C87973cn c87973cn = (C87973cn) obj;
        if (o.LJ(this.LJLIL, c87973cn.LJLIL) && o.LJ(this.LJLILLLLZI, c87973cn.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C87973cn(C8HZ<InterfaceC57784Mm4> listState, List<? extends InterfaceC57784Mm4> list) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = list;
    }
}

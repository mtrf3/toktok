package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8h1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217998h1 implements InterfaceC208718Hb<C217998h1, InterfaceC57784Mm4> {
    public final Y9G LJLIL;
    public final C8HZ<InterfaceC57784Mm4> LJLILLLLZI;

    public C217998h1() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
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
        LIZ.append("VideoCaptionMentionRecommendState(selectedUser=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLILLLLZI;
    }

    public /* synthetic */ C217998h1(int i) {
        this(new Y9G(null, 0, null, null, null, null, null, null, null, 0, null, null, 0, null, null, 1048575), new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C217998h1)) {
            return false;
        }
        C217998h1 c217998h1 = (C217998h1) obj;
        if (o.LJ(this.LJLIL, c217998h1.LJLIL) && o.LJ(this.LJLILLLLZI, c217998h1.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C217998h1(Y9G selectedUser, C8HZ<InterfaceC57784Mm4> listState) {
        o.LJIIIZ(selectedUser, "selectedUser");
        o.LJIIIZ(listState, "listState");
        this.LJLIL = selectedUser;
        this.LJLILLLLZI = listState;
    }

    public static C217998h1 LIZ(C217998h1 c217998h1, Y9G selectedUser, C8HZ listState, int i) {
        if ((i & 1) != 0) {
            selectedUser = c217998h1.LJLIL;
        }
        if ((i & 2) != 0) {
            listState = c217998h1.LJLILLLLZI;
        }
        c217998h1.getClass();
        o.LJIIIZ(selectedUser, "selectedUser");
        o.LJIIIZ(listState, "listState");
        return new C217998h1(selectedUser, listState);
    }
}

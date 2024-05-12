package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87453bx implements InterfaceC208718Hb<C87453bx, C87063bK> {
    public final C8HZ<C87063bK> LJLIL;
    public final List<String> LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;

    public C87453bx() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZIZ = (AnonymousClass391.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31) + this.LJLJI) * 31;
        boolean z = this.LJLJJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LIZIZ + i;
    }

    @Override // X.InterfaceC2064888m
    public final List<C87063bK> getListItemState() {
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
        LIZ.append("RecommendUserListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectedList=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", activeUserCnt=");
        LIZ.append(this.LJLJI);
        LIZ.append(", hasClickedCreate=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C87063bK> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C87453bx(int i) {
        this(new C8HZ(null, null, 15), new ArrayList(), 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87453bx)) {
            return false;
        }
        C87453bx c87453bx = (C87453bx) obj;
        if (o.LJ(this.LJLIL, c87453bx.LJLIL) && o.LJ(this.LJLILLLLZI, c87453bx.LJLILLLLZI) && this.LJLJI == c87453bx.LJLJI && this.LJLJJI == c87453bx.LJLJJI) {
            return true;
        }
        return false;
    }

    public C87453bx(C8HZ<C87063bK> listState, List<String> selectedList, int i, boolean z) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(selectedList, "selectedList");
        this.LJLIL = listState;
        this.LJLILLLLZI = selectedList;
        this.LJLJI = i;
        this.LJLJJI = z;
    }

    public static C87453bx LIZ(C87453bx c87453bx, C8HZ listState, List selectedList, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            listState = c87453bx.LJLIL;
        }
        if ((i2 & 2) != 0) {
            selectedList = c87453bx.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            i = c87453bx.LJLJI;
        }
        if ((i2 & 8) != 0) {
            z = c87453bx.LJLJJI;
        }
        c87453bx.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(selectedList, "selectedList");
        return new C87453bx(listState, selectedList, i, z);
    }
}

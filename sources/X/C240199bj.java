package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240199bj implements InterfaceC208718Hb<C240199bj, InterfaceC57784Mm4> {
    public final OSZ<List<IMUser>, String> LJLIL;
    public final C8HZ<InterfaceC57784Mm4> LJLILLLLZI;

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
        LIZ.append("SearchState(searchResult=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLILLLLZI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C240199bj)) {
            return false;
        }
        C240199bj c240199bj = (C240199bj) obj;
        if (o.LJ(this.LJLIL, c240199bj.LJLIL) && o.LJ(this.LJLILLLLZI, c240199bj.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C240199bj(OSZ<? extends List<? extends IMUser>, String> osz, C8HZ<InterfaceC57784Mm4> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = osz;
        this.LJLILLLLZI = listState;
    }

    public static C240199bj LIZ(C240199bj c240199bj, OSZ searchResult, C8HZ listState, int i) {
        if ((i & 1) != 0) {
            searchResult = c240199bj.LJLIL;
        }
        if ((i & 2) != 0) {
            listState = c240199bj.LJLILLLLZI;
        }
        c240199bj.getClass();
        o.LJIIIZ(searchResult, "searchResult");
        o.LJIIIZ(listState, "listState");
        return new C240199bj(searchResult, listState);
    }
}

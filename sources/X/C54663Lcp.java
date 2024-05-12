package X;

import com.ss.android.ugc.aweme.placediscovery.model.POICategoryApiState;
import com.ss.android.ugc.aweme.placediscovery.model.PoiCategory;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lcp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54663Lcp implements InterfaceC208718Hb<C54663Lcp, PoiCategory> {
    public final InterfaceC54598Lbm<POICategoryApiState> LJLIL;
    public final C8HZ<PoiCategory> LJLILLLLZI;

    public C54663Lcp() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        InterfaceC54598Lbm<POICategoryApiState> interfaceC54598Lbm = this.LJLIL;
        if (interfaceC54598Lbm == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC54598Lbm.hashCode();
        }
        return this.LJLILLLLZI.hashCode() + (hashCode * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<PoiCategory> getListItemState() {
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
        LIZ.append("CategoryTabListState(poiCategoryApiState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<PoiCategory> getListState() {
        return this.LJLILLLLZI;
    }

    public /* synthetic */ C54663Lcp(int i) {
        this(null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54663Lcp)) {
            return false;
        }
        C54663Lcp c54663Lcp = (C54663Lcp) obj;
        if (o.LJ(this.LJLIL, c54663Lcp.LJLIL) && o.LJ(this.LJLILLLLZI, c54663Lcp.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C54663Lcp(InterfaceC54598Lbm<POICategoryApiState> interfaceC54598Lbm, C8HZ<PoiCategory> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = interfaceC54598Lbm;
        this.LJLILLLLZI = listState;
    }

    public static C54663Lcp LIZ(C54663Lcp c54663Lcp, InterfaceC54598Lbm interfaceC54598Lbm) {
        C8HZ<PoiCategory> listState = c54663Lcp.LJLILLLLZI;
        c54663Lcp.getClass();
        o.LJIIIZ(listState, "listState");
        return new C54663Lcp(interfaceC54598Lbm, listState);
    }
}

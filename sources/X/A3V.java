package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A3V implements InterfaceC208718Hb<A3V, A3U> {
    public final C25615A3n LJLIL;
    public final AbstractC72932td<CollectionDetailModel> LJLILLLLZI;
    public final C43I<Aweme> LJLJI;
    public final C8HZ<A3U> LJLJJI;
    public final C25621A3t LJLJJL;

    public A3V() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int LIZ = C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        C43I<Aweme> c43i = this.LJLJI;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        return this.LJLJJL.hashCode() + ((this.LJLJJI.hashCode() + ((LIZ + hashCode) * 31)) * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<A3U> getListItemState() {
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
        LIZ.append("PaidContentDetailVideoListState(statusViewLoadingState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", collectionDetailModel=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", clickVideoToPurchaseEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", listState=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", footerViewState=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<A3U> getListState() {
        return this.LJLJJI;
    }

    public /* synthetic */ A3V(int i) {
        this(new C25615A3n(false, false, false, 15, 0), C33X.LIZ, null, new C8HZ(null, null, 15), new C25621A3t(false, false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A3V)) {
            return false;
        }
        A3V a3v = (A3V) obj;
        if (o.LJ(this.LJLIL, a3v.LJLIL) && o.LJ(this.LJLILLLLZI, a3v.LJLILLLLZI) && o.LJ(this.LJLJI, a3v.LJLJI) && o.LJ(this.LJLJJI, a3v.LJLJJI) && o.LJ(this.LJLJJL, a3v.LJLJJL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A3V(C25615A3n statusViewLoadingState, AbstractC72932td<CollectionDetailModel> collectionDetailModel, C43I<? extends Aweme> c43i, C8HZ<A3U> listState, C25621A3t footerViewState) {
        o.LJIIIZ(statusViewLoadingState, "statusViewLoadingState");
        o.LJIIIZ(collectionDetailModel, "collectionDetailModel");
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(footerViewState, "footerViewState");
        this.LJLIL = statusViewLoadingState;
        this.LJLILLLLZI = collectionDetailModel;
        this.LJLJI = c43i;
        this.LJLJJI = listState;
        this.LJLJJL = footerViewState;
    }

    public static A3V LIZ(A3V a3v, C25615A3n c25615A3n, AbstractC72932td abstractC72932td, C43I c43i, C8HZ c8hz, C25621A3t c25621A3t, int i) {
        C25621A3t footerViewState = c25621A3t;
        C8HZ listState = c8hz;
        C43I c43i2 = c43i;
        C25615A3n statusViewLoadingState = c25615A3n;
        AbstractC72932td collectionDetailModel = abstractC72932td;
        if ((i & 1) != 0) {
            statusViewLoadingState = a3v.LJLIL;
        }
        if ((i & 2) != 0) {
            collectionDetailModel = a3v.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i2 = a3v.LJLJI;
        }
        if ((i & 8) != 0) {
            listState = a3v.LJLJJI;
        }
        if ((i & 16) != 0) {
            footerViewState = a3v.LJLJJL;
        }
        a3v.getClass();
        o.LJIIIZ(statusViewLoadingState, "statusViewLoadingState");
        o.LJIIIZ(collectionDetailModel, "collectionDetailModel");
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(footerViewState, "footerViewState");
        return new A3V(statusViewLoadingState, collectionDetailModel, c43i2, listState, footerViewState);
    }
}

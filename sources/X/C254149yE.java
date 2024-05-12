package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9yE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254149yE implements InterfaceC208718Hb<C254149yE, C254559yt> {
    public final PaidCollectionListResponse LJLIL;
    public final C8HZ<C254559yt> LJLILLLLZI;
    public final java.util.Map<Long, CollectionDetailModel> LJLJI;
    public final C43I<C76800UCe> LJLJJI;
    public final Boolean LJLJJL;

    public C254149yE() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        PaidCollectionListResponse paidCollectionListResponse = this.LJLIL;
        int i = 0;
        if (paidCollectionListResponse == null) {
            hashCode = 0;
        } else {
            hashCode = paidCollectionListResponse.hashCode();
        }
        int LIZ = C12400eC.LIZ(this.LJLJI, (this.LJLILLLLZI.hashCode() + (hashCode * 31)) * 31, 31);
        C43I<C76800UCe> c43i = this.LJLJJI;
        if (c43i == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c43i.hashCode();
        }
        int i2 = (LIZ + hashCode2) * 31;
        Boolean bool = this.LJLJJL;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    @Override // X.InterfaceC2064888m
    public final List<C254559yt> getListItemState() {
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
        LIZ.append("PaidContentCollectionListState(response=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", multiSelectPromoteMap=");
        LIZ.append(this.LJLJI);
        LIZ.append(", showToast=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", addButtonEnabled=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C254559yt> getListState() {
        return this.LJLILLLLZI;
    }

    public /* synthetic */ C254149yE(int i) {
        this(null, new C8HZ(null, null, 15), C113554cx.LJJJLIIL(), null, Boolean.FALSE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C254149yE)) {
            return false;
        }
        C254149yE c254149yE = (C254149yE) obj;
        if (o.LJ(this.LJLIL, c254149yE.LJLIL) && o.LJ(this.LJLILLLLZI, c254149yE.LJLILLLLZI) && o.LJ(this.LJLJI, c254149yE.LJLJI) && o.LJ(this.LJLJJI, c254149yE.LJLJJI) && o.LJ(this.LJLJJL, c254149yE.LJLJJL)) {
            return true;
        }
        return false;
    }

    public C254149yE(PaidCollectionListResponse paidCollectionListResponse, C8HZ<C254559yt> listState, java.util.Map<Long, CollectionDetailModel> multiSelectPromoteMap, C43I<C76800UCe> c43i, Boolean bool) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(multiSelectPromoteMap, "multiSelectPromoteMap");
        this.LJLIL = paidCollectionListResponse;
        this.LJLILLLLZI = listState;
        this.LJLJI = multiSelectPromoteMap;
        this.LJLJJI = c43i;
        this.LJLJJL = bool;
    }

    public static C254149yE LIZ(C254149yE c254149yE, PaidCollectionListResponse paidCollectionListResponse, C8HZ c8hz, java.util.Map map, C43I c43i, Boolean bool, int i) {
        Boolean bool2 = bool;
        C43I c43i2 = c43i;
        java.util.Map multiSelectPromoteMap = map;
        PaidCollectionListResponse paidCollectionListResponse2 = paidCollectionListResponse;
        C8HZ listState = c8hz;
        if ((i & 1) != 0) {
            paidCollectionListResponse2 = c254149yE.LJLIL;
        }
        if ((i & 2) != 0) {
            listState = c254149yE.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            multiSelectPromoteMap = c254149yE.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i2 = c254149yE.LJLJJI;
        }
        if ((i & 16) != 0) {
            bool2 = c254149yE.LJLJJL;
        }
        c254149yE.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(multiSelectPromoteMap, "multiSelectPromoteMap");
        return new C254149yE(paidCollectionListResponse2, listState, multiSelectPromoteMap, c43i2, bool2);
    }
}

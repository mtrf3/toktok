package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7VC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7VC implements InterfaceC208718Hb<C7VC, PoiReviewsApi.PoiReviewModel> {
    public final PoiReviewsApi.PoiReviewSummaryModel LJLIL;
    public final String LJLILLLLZI;
    public final PoiReviewsApi.PoiReviewEligibleResponse LJLJI;
    public final boolean LJLJJI;
    public final C8HZ<PoiReviewsApi.PoiReviewModel> LJLJJL;

    public C7VC() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = this.LJLIL;
        int i = 0;
        if (poiReviewSummaryModel == null) {
            hashCode = 0;
        } else {
            hashCode = poiReviewSummaryModel.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.LJLILLLLZI;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse = this.LJLJI;
        if (poiReviewEligibleResponse != null) {
            i = poiReviewEligibleResponse.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z = this.LJLJJI;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return this.LJLJJL.hashCode() + ((i4 + i5) * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<PoiReviewsApi.PoiReviewModel> getListItemState() {
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
        LIZ.append("PoiReviewListState(summary=");
        LIZ.append(this.LJLIL);
        LIZ.append(", collectInfo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", eligibleResponse=");
        LIZ.append(this.LJLJI);
        LIZ.append(", showFoledTipsInFooter=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<PoiReviewsApi.PoiReviewModel> getListState() {
        return this.LJLJJL;
    }

    public /* synthetic */ C7VC(int i) {
        this(null, null, null, false, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7VC)) {
            return false;
        }
        C7VC c7vc = (C7VC) obj;
        if (o.LJ(this.LJLIL, c7vc.LJLIL) && o.LJ(this.LJLILLLLZI, c7vc.LJLILLLLZI) && o.LJ(this.LJLJI, c7vc.LJLJI) && this.LJLJJI == c7vc.LJLJJI && o.LJ(this.LJLJJL, c7vc.LJLJJL)) {
            return true;
        }
        return false;
    }

    public C7VC(PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, String str, PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse, boolean z, C8HZ<PoiReviewsApi.PoiReviewModel> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = poiReviewSummaryModel;
        this.LJLILLLLZI = str;
        this.LJLJI = poiReviewEligibleResponse;
        this.LJLJJI = z;
        this.LJLJJL = listState;
    }

    public static C7VC LIZ(C7VC c7vc, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, String str, PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse, boolean z, C8HZ c8hz, int i) {
        C8HZ listState = c8hz;
        boolean z2 = z;
        PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse2 = poiReviewEligibleResponse;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2 = poiReviewSummaryModel;
        String str2 = str;
        if ((i & 1) != 0) {
            poiReviewSummaryModel2 = c7vc.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c7vc.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            poiReviewEligibleResponse2 = c7vc.LJLJI;
        }
        if ((i & 8) != 0) {
            z2 = c7vc.LJLJJI;
        }
        if ((i & 16) != 0) {
            listState = c7vc.LJLJJL;
        }
        c7vc.getClass();
        o.LJIIIZ(listState, "listState");
        return new C7VC(poiReviewSummaryModel2, str2, poiReviewEligibleResponse2, z2, listState);
    }
}

package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7rA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198807rA implements C33Q {
    public final C8HZ<PoiReviewsApi.PoiReviewModel> LJLIL;
    public final List<PoiReviewsApi.PoiReviewModel> LJLILLLLZI;
    public final Boolean LJLJI;
    public final String LJLJJI;
    public final PoiReviewsApi.PoiReviewSummaryModel LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C198807rA)) {
            return false;
        }
        C198807rA c198807rA = (C198807rA) obj;
        return o.LJ(this.LJLIL, c198807rA.LJLIL) && o.LJ(this.LJLILLLLZI, c198807rA.LJLILLLLZI) && o.LJ(this.LJLJI, c198807rA.LJLJI) && o.LJ(this.LJLJJI, c198807rA.LJLJJI) && o.LJ(this.LJLJJL, c198807rA.LJLJJL);
    }

    public final int hashCode() {
        C8HZ<PoiReviewsApi.PoiReviewModel> c8hz = this.LJLIL;
        int hashCode = (c8hz == null ? 0 : c8hz.hashCode()) * 31;
        List<PoiReviewsApi.PoiReviewModel> list = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.LJLJI;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = this.LJLJJL;
        return hashCode4 + (poiReviewSummaryModel != null ? poiReviewSummaryModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiDetailReviewsState(listStateInState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", reviews=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", eligible=");
        LIZ.append(this.LJLJI);
        LIZ.append(", collectInfo=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", summary=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C198807rA(C8HZ<PoiReviewsApi.PoiReviewModel> c8hz, List<PoiReviewsApi.PoiReviewModel> list, Boolean bool, String str, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel) {
        this.LJLIL = c8hz;
        this.LJLILLLLZI = list;
        this.LJLJI = bool;
        this.LJLJJI = str;
        this.LJLJJL = poiReviewSummaryModel;
    }

    public static C198807rA LIZ(C198807rA c198807rA, C8HZ c8hz, List list, Boolean bool, String str, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, int i) {
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2 = poiReviewSummaryModel;
        String str2 = str;
        Boolean bool2 = bool;
        C8HZ c8hz2 = c8hz;
        List list2 = list;
        if ((i & 1) != 0) {
            c8hz2 = c198807rA.LJLIL;
        }
        if ((i & 2) != 0) {
            list2 = c198807rA.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            bool2 = c198807rA.LJLJI;
        }
        if ((i & 8) != 0) {
            str2 = c198807rA.LJLJJI;
        }
        if ((i & 16) != 0) {
            poiReviewSummaryModel2 = c198807rA.LJLJJL;
        }
        c198807rA.getClass();
        return new C198807rA(c8hz2, list2, bool2, str2, poiReviewSummaryModel2);
    }
}

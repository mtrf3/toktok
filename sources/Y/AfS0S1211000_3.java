package Y;

import X.C78685UuP;
import X.InterfaceC64592gB;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;

/* loaded from: classes4.dex */
public class AfS0S1211000_3 implements InterfaceC64592gB {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S1211000_3 afS0S1211000_3, Object obj) {
        Integer num;
        PoiReviewsApi.TranslationResponse translationResponse = (PoiReviewsApi.TranslationResponse) obj;
        if (translationResponse == null || (num = translationResponse.statusCode) == null || num.intValue() != 0) {
            return;
        }
        String str = translationResponse.translatedContent;
        if (!C78685UuP.LJJJZ(str)) {
            return;
        }
        ((PoiDetailReviewsViewModel) afS0S1211000_3.l1).LJLJI.put(afS0S1211000_3.s0, str);
        ((PoiDetailReviewsViewModel) afS0S1211000_3.l1).hv0(afS0S1211000_3.i4, PoiReviewsApi.PoiReviewModel.LIZ((PoiReviewsApi.PoiReviewModel) afS0S1211000_3.l2, null, null, false, afS0S1211000_3.z3, str, 1023));
    }

    public static final void accept$1(AfS0S1211000_3 afS0S1211000_3, Object obj) {
        Integer num;
        PoiReviewsApi.TranslationResponse translationResponse = (PoiReviewsApi.TranslationResponse) obj;
        if (translationResponse == null || (num = translationResponse.statusCode) == null || num.intValue() != 0) {
            return;
        }
        String str = translationResponse.translatedContent;
        if (!C78685UuP.LJJJZ(str)) {
            return;
        }
        ((PoiReviewListViewModel) afS0S1211000_3.l1).LJLLILLLL.put(afS0S1211000_3.s0, str);
        ((PoiReviewListViewModel) afS0S1211000_3.l1).listSetItemAt(afS0S1211000_3.i4, (int) PoiReviewsApi.PoiReviewModel.LIZ((PoiReviewsApi.PoiReviewModel) afS0S1211000_3.l2, null, null, false, afS0S1211000_3.z3, str, 1023));
    }

    public AfS0S1211000_3(Object obj, String str, int i, Object obj2, boolean z, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i4 = i;
        this.l2 = obj2;
        this.z3 = z;
    }
}

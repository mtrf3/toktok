package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Roz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70705Roz extends AbstractC68899R2h<ReviewApi.ListShopReviewRequest, ListShopReviewData> {
    public final HashMap<ReviewApi.ListShopReviewRequest, ListShopReviewData> LIZJ = new HashMap<>();

    @Override // X.AbstractC68899R2h
    public final List<OSZ<ReviewApi.ListShopReviewRequest, ListShopReviewData>> LJII() {
        return C5UN.LJJLJLI(this.LIZJ);
    }

    public final void LJIIIZ() {
        this.LIZJ.clear();
    }

    @Override // X.AbstractC68899R2h
    public final ListShopReviewData LIZIZ(ReviewApi.ListShopReviewRequest k) {
        o.LJIIIZ(k, "k");
        return this.LIZJ.get(k);
    }

    @Override // X.AbstractC68899R2h
    public final void LJIIIIZZ(ReviewApi.ListShopReviewRequest k, ListShopReviewData listShopReviewData) {
        ListShopReviewData listShopReviewData2 = listShopReviewData;
        o.LJIIIZ(k, "k");
        if (listShopReviewData2 != null && listShopReviewData2.reviewItems != null) {
            this.LIZJ.put(k, listShopReviewData2);
        }
    }
}

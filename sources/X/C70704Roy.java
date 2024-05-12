package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Roy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70704Roy extends AbstractC68899R2h<ReviewApi.ReviewRequest, ListReviewData> {
    public final HashMap<ReviewApi.ReviewRequest, ListReviewData> LIZJ = new HashMap<>();

    @Override // X.AbstractC68899R2h
    public final List<OSZ<ReviewApi.ReviewRequest, ListReviewData>> LJII() {
        return C5UN.LJJLJLI(this.LIZJ);
    }

    public final void LJIIIZ() {
        this.LIZJ.clear();
    }

    @Override // X.AbstractC68899R2h
    public final ListReviewData LIZIZ(ReviewApi.ReviewRequest k) {
        o.LJIIIZ(k, "k");
        return this.LIZJ.get(k);
    }

    @Override // X.AbstractC68899R2h
    public final void LJIIIIZZ(ReviewApi.ReviewRequest k, ListReviewData listReviewData) {
        ListReviewData listReviewData2 = listReviewData;
        o.LJIIIZ(k, "k");
        if (listReviewData2 != null && listReviewData2.reviewItems != null) {
            this.LIZJ.put(k, listReviewData2);
        }
    }
}

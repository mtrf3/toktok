package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import kotlin.jvm.internal.o;

/* renamed from: X.Row, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70702Row extends R30<ReviewApi.ReviewRequest, ListReviewData, ReviewApi.ReviewRequest, ListReviewData> {
    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return req;
    }

    @Override // X.R30
    public final AbstractC73672Svk<ListReviewData> LJII(ReviewApi.ReviewRequest reviewRequest) {
        ReviewApi.ReviewRequest req = reviewRequest;
        o.LJIIIZ(req, "req");
        ReviewApi.LIZ.getClass();
        return ((ReviewApi) C70708Rp2.LIZIZ.create(ReviewApi.class)).getReviewInfo(req).LJJL(T16.LIZ()).LJJIJL(RYG.LJLIL);
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object resp) {
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp;
    }
}

package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import kotlin.jvm.internal.o;

/* renamed from: X.Rox, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70703Rox extends R30<ReviewApi.ListShopReviewRequest, ListShopReviewData, ReviewApi.ListShopReviewRequest, ListShopReviewData> {
    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return req;
    }

    @Override // X.R30
    public final AbstractC73672Svk<ListShopReviewData> LJII(ReviewApi.ListShopReviewRequest listShopReviewRequest) {
        ReviewApi.ListShopReviewRequest req = listShopReviewRequest;
        o.LJIIIZ(req, "req");
        ReviewApi.LIZ.getClass();
        return ((ReviewApi) C70708Rp2.LIZIZ.create(ReviewApi.class)).getShopReviewInfo(req).LJJL(T16.LIZ()).LJJIJL(C73340SqO.LJLJJI);
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object resp) {
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp;
    }
}

package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import kotlin.jvm.internal.o;

/* renamed from: X.Rp0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70706Rp0 extends RuntimeException {
    public final Response<ListShopReviewData> LJLIL;

    public final Response<ListShopReviewData> getResponse() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70706Rp0(Response<ListShopReviewData> response, String str) {
        super(str);
        o.LJIIIZ(response, "response");
        this.LJLIL = response;
    }
}

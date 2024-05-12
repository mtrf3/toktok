package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import kotlin.jvm.internal.o;

/* renamed from: X.Rbn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69887Rbn extends RuntimeException {
    public final Response<ListReviewData> LJLIL;

    public final Response<ListReviewData> getResponse() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69887Rbn(Response<ListReviewData> response, String str) {
        super(str);
        o.LJIIIZ(response, "response");
        this.LJLIL = response;
    }
}

package com.ss.android.ugc.aweme.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RatingUpdateResponse extends BaseResponse {

    @InterfaceC65349Pkn("updated_review")
    public final PaidContentReview updatedReview;

    public final int hashCode() {
        return Objects.hash(this.updatedReview);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("RatingUpdateResponse:%s", this.updatedReview);
    }

    public RatingUpdateResponse(PaidContentReview updatedReview) {
        o.LJIIIZ(updatedReview, "updatedReview");
        this.updatedReview = updatedReview;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingUpdateResponse)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((RatingUpdateResponse) obj).updatedReview}, new Object[]{this.updatedReview});
    }
}

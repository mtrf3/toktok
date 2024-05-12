package com.ss.android.ugc.aweme.paidcontent.api;

import X.A4Q;
import X.A4R;
import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.model.RatingUpdateResponse;

/* loaded from: classes5.dex */
public interface RatingApi {
    public static final A4R LIZ = A4R.LIZ;

    @E4T("/tiktok/v1/paid_content/product/review_edit")
    AbstractC73672Svk<RatingUpdateResponse> editRating(@InterfaceC64989Pez("collection_id") long j, @InterfaceC64989Pez("review_id") String str, @InterfaceC64989Pez("rating") int i, @InterfaceC64989Pez("text") String str2);

    @E4T("/tiktok/v1/paid_content/product/submit_review")
    AbstractC73672Svk<RatingUpdateResponse> publishRating(@InterfaceC64989Pez("product_id") long j, @InterfaceC64989Pez("business_type") A4Q a4q, @InterfaceC64989Pez("rating") int i, @InterfaceC64989Pez("review_text") String str, @InterfaceC64989Pez("order_id") Long l, @InterfaceC64989Pez("reply_ref_id") String str2);
}

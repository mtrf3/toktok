package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewProductCard;
import kotlin.jvm.internal.o;

/* renamed from: X.RVs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69664RVs implements Parcelable.Creator<ShopReviewItemStruct> {
    @Override // android.os.Parcelable.Creator
    public final ShopReviewItemStruct createFromParcel(Parcel parcel) {
        ReviewItemStruct createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        ShopReviewProductCard shopReviewProductCard = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ReviewItemStruct.CREATOR.createFromParcel(parcel);
        }
        ReviewItemStruct reviewItemStruct = createFromParcel;
        if (parcel.readInt() != 0) {
            shopReviewProductCard = ShopReviewProductCard.CREATOR.createFromParcel(parcel);
        }
        return new ShopReviewItemStruct(reviewItemStruct, shopReviewProductCard, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ShopReviewItemStruct[] newArray(int i) {
        return new ShopReviewItemStruct[i];
    }
}

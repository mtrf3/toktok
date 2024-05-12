package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewProductCard;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RUe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69624RUe implements Parcelable.Creator<ShopReviewProductCard> {
    @Override // android.os.Parcelable.Creator
    public final ShopReviewProductCard createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        Image image = (Image) parcel.readParcelable(ShopReviewProductCard.class.getClassLoader());
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new ShopReviewProductCard(readString, image, valueOf, parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ShopReviewProductCard[] newArray(int i) {
        return new ShopReviewProductCard[i];
    }
}

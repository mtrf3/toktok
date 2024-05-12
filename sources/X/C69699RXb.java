package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.RXb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69699RXb implements Parcelable.Creator<ReviewItemStruct.DisplayReviewText> {
    @Override // android.os.Parcelable.Creator
    public final ReviewItemStruct.DisplayReviewText createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new ReviewItemStruct.DisplayReviewText(valueOf, parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewItemStruct.DisplayReviewText[] newArray(int i) {
        return new ReviewItemStruct.DisplayReviewText[i];
    }
}

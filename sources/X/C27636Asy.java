package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Asy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27636Asy implements Parcelable.Creator<ReviewAspectPercentageItem> {
    @Override // android.os.Parcelable.Creator
    public final ReviewAspectPercentageItem createFromParcel(Parcel parcel) {
        ReviewFilterStruct createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ReviewFilterStruct.CREATOR.createFromParcel(parcel);
        }
        ReviewFilterStruct reviewFilterStruct = createFromParcel;
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new ReviewAspectPercentageItem(readString, readString2, reviewFilterStruct, num, parcel.readString(), parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewAspectPercentageItem[] newArray(int i) {
        return new ReviewAspectPercentageItem[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectOption;
import kotlin.jvm.internal.o;

/* renamed from: X.RXf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69703RXf implements Parcelable.Creator<ReviewAspectItem> {
    @Override // android.os.Parcelable.Creator
    public final ReviewAspectItem createFromParcel(Parcel parcel) {
        ReviewAspectOption createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ReviewAspectOption.CREATOR.createFromParcel(parcel);
        }
        return new ReviewAspectItem(readString, readString2, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewAspectItem[] newArray(int i) {
        return new ReviewAspectItem[i];
    }
}

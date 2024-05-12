package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageItem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Age, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26872Age implements Parcelable.Creator<ReviewAspectPercentageCard> {
    @Override // android.os.Parcelable.Creator
    public final ReviewAspectPercentageCard createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(ReviewAspectPercentageItem.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new ReviewAspectPercentageCard(readString, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewAspectPercentageCard[] newArray(int i) {
        return new ReviewAspectPercentageCard[i];
    }
}

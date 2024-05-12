package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.RXe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69702RXe implements Parcelable.Creator<ReviewItemStruct.AppendReview> {
    @Override // android.os.Parcelable.Creator
    public final ReviewItemStruct.AppendReview createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(ReviewMedia.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new ReviewItemStruct.AppendReview(readString, readString2, readString3, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewItemStruct.AppendReview[] newArray(int i) {
        return new ReviewItemStruct.AppendReview[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.RXd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69701RXd implements Parcelable.Creator<ReviewItemStruct.MainReview> {
    @Override // android.os.Parcelable.Creator
    public final ReviewItemStruct.MainReview createFromParcel(Parcel parcel) {
        ReviewItemStruct.AppendReview createFromParcel;
        boolean z;
        Boolean valueOf;
        ArrayList arrayList;
        ArrayList arrayList2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        ArrayList arrayList3 = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ReviewItemStruct.AppendReview.CREATOR.createFromParcel(parcel);
        }
        ReviewItemStruct.AppendReview appendReview = createFromParcel;
        String readString5 = parcel.readString();
        int i = 0;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(ReviewItemStruct.DisplayReviewText.CREATOR, parcel, arrayList, i2, 1);
            }
        }
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = C279117r.LIZIZ(ReviewAspectItem.CREATOR, parcel, arrayList2, i3, 1);
            }
        }
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            arrayList3 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = C279117r.LIZIZ(ReviewMedia.CREATOR, parcel, arrayList3, i, 1);
            }
        }
        return new ReviewItemStruct.MainReview(readString, readString2, readString3, readString4, appendReview, readString5, valueOf, arrayList, arrayList2, arrayList3, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewItemStruct.MainReview[] newArray(int i) {
        return new ReviewItemStruct.MainReview[i];
    }
}

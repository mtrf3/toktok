package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.At1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27639At1 implements Parcelable.Creator<ListReviewData> {
    @Override // android.os.Parcelable.Creator
    public final ListReviewData createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        boolean z;
        Boolean valueOf;
        Integer valueOf2;
        ArrayList arrayList2;
        Boolean valueOf3;
        Float valueOf4;
        ArrayList arrayList3;
        Integer valueOf5;
        o.LJIIIZ(parcel, "parcel");
        int i = 0;
        ArrayList arrayList4 = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(ReviewItemStruct.CREATOR, parcel, arrayList, i2, 1);
            }
        }
        boolean z2 = true;
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
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = C279117r.LIZIZ(ReviewFilterStruct.CREATOR, parcel, arrayList2, i3, 1);
            }
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            valueOf3 = Boolean.valueOf(z2);
        }
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            valueOf4 = Float.valueOf(parcel.readFloat());
        }
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList3 = null;
        } else {
            int readInt3 = parcel.readInt();
            arrayList3 = new ArrayList(readInt3);
            int i4 = 0;
            while (i4 != readInt3) {
                i4 = C279117r.LIZIZ(ReviewAspectPercentageCard.CREATOR, parcel, arrayList3, i4, 1);
            }
        }
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            valueOf5 = Integer.valueOf(parcel.readInt());
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt4 = parcel.readInt();
            arrayList4 = new ArrayList(readInt4);
            while (i != readInt4) {
                i = C279117r.LIZIZ(ReviewFilterStruct.CREATOR, parcel, arrayList4, i, 1);
            }
        }
        return new ListReviewData(arrayList, valueOf, valueOf2, arrayList2, valueOf3, valueOf4, readString, arrayList3, valueOf5, readString2, readString3, arrayList4, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ListReviewData[] newArray(int i) {
        return new ListReviewData[i];
    }
}

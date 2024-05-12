package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Asw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27634Asw implements Parcelable.Creator<ProductDetailReview> {
    @Override // android.os.Parcelable.Creator
    public final ProductDetailReview createFromParcel(Parcel parcel) {
        Float valueOf;
        Integer valueOf2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        o.LJIIIZ(parcel, "parcel");
        ArrayList arrayList4 = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        int i = 0;
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
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = C279117r.LIZIZ(ReviewImageItem.CREATOR, parcel, arrayList2, i3, 1);
            }
        }
        if (parcel.readInt() == 0) {
            arrayList3 = null;
        } else {
            int readInt3 = parcel.readInt();
            arrayList3 = new ArrayList(readInt3);
            int i4 = 0;
            while (i4 != readInt3) {
                i4 = C279117r.LIZIZ(ReviewFilterStruct.CREATOR, parcel, arrayList3, i4, 1);
            }
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt4 = parcel.readInt();
            arrayList4 = new ArrayList(readInt4);
            while (i != readInt4) {
                i = C279117r.LIZIZ(ReviewAspectPercentageCard.CREATOR, parcel, arrayList4, i, 1);
            }
        }
        return new ProductDetailReview(valueOf, valueOf2, arrayList, arrayList2, arrayList3, readString, readString2, arrayList4);
    }

    @Override // android.os.Parcelable.Creator
    public final ProductDetailReview[] newArray(int i) {
        return new ProductDetailReview[i];
    }
}

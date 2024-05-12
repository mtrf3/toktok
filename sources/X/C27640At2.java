package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewItemStruct;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.At2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27640At2 implements Parcelable.Creator<ListShopReviewData> {
    @Override // android.os.Parcelable.Creator
    public final ListShopReviewData createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        boolean z;
        Boolean valueOf;
        Integer valueOf2;
        ArrayList arrayList2;
        Integer valueOf3;
        o.LJIIIZ(parcel, "parcel");
        int i = 0;
        ArrayList arrayList3 = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(ShopReviewItemStruct.CREATOR, parcel, arrayList, i2, 1);
            }
        }
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
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            arrayList3 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = C279117r.LIZIZ(ReviewFilterStruct.CREATOR, parcel, arrayList3, i, 1);
            }
        }
        return new ListShopReviewData(arrayList, valueOf, valueOf2, arrayList2, readString, valueOf3, readString2, readString3, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final ListShopReviewData[] newArray(int i) {
        return new ListShopReviewData[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Asx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27635Asx implements Parcelable.Creator<ShopReviewEntry> {
    @Override // android.os.Parcelable.Creator
    public final ShopReviewEntry createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(ReviewFilterStruct.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new ShopReviewEntry(valueOf, readString, arrayList, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ShopReviewEntry[] newArray(int i) {
        return new ShopReviewEntry[i];
    }
}

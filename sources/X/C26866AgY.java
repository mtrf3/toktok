package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AgY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26866AgY implements Parcelable.Creator<ReviewImageItem> {
    @Override // android.os.Parcelable.Creator
    public final ReviewImageItem createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        boolean z;
        Boolean valueOf;
        Integer valueOf2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        int i = 0;
        ArrayList arrayList2 = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C5YW.LIZ(ReviewImageItem.class, parcel, arrayList, i2, 1);
            }
        }
        String readString2 = parcel.readString();
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
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = C279117r.LIZIZ(ReviewMedia.CREATOR, parcel, arrayList2, i, 1);
            }
        }
        return new ReviewImageItem(readString, arrayList, readString2, valueOf, valueOf2, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewImageItem[] newArray(int i) {
        return new ReviewImageItem[i];
    }
}

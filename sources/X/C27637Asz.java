package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Asz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27637Asz implements Parcelable.Creator<ReviewFilterStruct> {
    @Override // android.os.Parcelable.Creator
    public final ReviewFilterStruct createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new ReviewFilterStruct(readString, readString2, readString3, valueOf, readString4, num, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewFilterStruct[] newArray(int i) {
        return new ReviewFilterStruct[i];
    }
}

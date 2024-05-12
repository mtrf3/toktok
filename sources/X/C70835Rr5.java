package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Rr5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70835Rr5 implements Parcelable.Creator<OptionV1> {
    @Override // android.os.Parcelable.Creator
    public final OptionV1 createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIIZ(parcel, "parcel");
        ReviewFilterStruct createFromParcel = ReviewFilterStruct.CREATOR.createFromParcel(parcel);
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new OptionV1(createFromParcel, readInt, readString, z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final OptionV1[] newArray(int i) {
        return new OptionV1[i];
    }
}

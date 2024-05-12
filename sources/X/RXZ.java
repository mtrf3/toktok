package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.ReviewItemVO;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXZ implements Parcelable.Creator<ReviewItemVO> {
    @Override // android.os.Parcelable.Creator
    public final ReviewItemVO createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        ReviewItemStruct createFromParcel = ReviewItemStruct.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new ReviewItemVO(createFromParcel, z);
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewItemVO[] newArray(int i) {
        return new ReviewItemVO[i];
    }
}

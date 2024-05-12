package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreGoodReviewTag;
import kotlin.jvm.internal.o;

/* renamed from: X.PSd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64475PSd implements Parcelable.Creator<StoreGoodReviewTag> {
    @Override // android.os.Parcelable.Creator
    public final StoreGoodReviewTag createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new StoreGoodReviewTag(valueOf, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final StoreGoodReviewTag[] newArray(int i) {
        return new StoreGoodReviewTag[i];
    }
}

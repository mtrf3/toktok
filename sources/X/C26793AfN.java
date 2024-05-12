package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewTags;
import kotlin.jvm.internal.o;

/* renamed from: X.AfN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26793AfN implements Parcelable.Creator<ReviewTags> {
    @Override // android.os.Parcelable.Creator
    public final ReviewTags createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new ReviewTags(readString, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewTags[] newArray(int i) {
        return new ReviewTags[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectOption;
import kotlin.jvm.internal.o;

/* renamed from: X.RXg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69704RXg implements Parcelable.Creator<ReviewAspectOption> {
    @Override // android.os.Parcelable.Creator
    public final ReviewAspectOption createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ReviewAspectOption(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ReviewAspectOption[] newArray(int i) {
        return new ReviewAspectOption[i];
    }
}

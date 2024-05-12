package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.RefreshShortTouchResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.RxU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71232RxU implements Parcelable.Creator<RefreshShortTouchResponse> {
    @Override // android.os.Parcelable.Creator
    public final RefreshShortTouchResponse createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new RefreshShortTouchResponse();
    }

    @Override // android.os.Parcelable.Creator
    public final RefreshShortTouchResponse[] newArray(int i) {
        return new RefreshShortTouchResponse[i];
    }
}

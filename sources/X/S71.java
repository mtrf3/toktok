package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DisplayResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S71 implements Parcelable.Creator<DisplayResponse> {
    @Override // android.os.Parcelable.Creator
    public final DisplayResponse createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DisplayResponse(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DisplayResponse[] newArray(int i) {
        return new DisplayResponse[i];
    }
}

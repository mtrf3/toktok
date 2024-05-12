package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SaveTemplateResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S4Z implements Parcelable.Creator<SaveTemplateResponse> {
    @Override // android.os.Parcelable.Creator
    public final SaveTemplateResponse createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SaveTemplateResponse(parcel.readString(), parcel.readInt(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SaveTemplateResponse[] newArray(int i) {
        return new SaveTemplateResponse[i];
    }
}

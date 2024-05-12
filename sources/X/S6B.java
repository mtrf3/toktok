package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.UploadConfigData;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S6B implements Parcelable.Creator<UploadConfigData> {
    @Override // android.os.Parcelable.Creator
    public final UploadConfigData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new UploadConfigData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final UploadConfigData[] newArray(int i) {
        return new UploadConfigData[i];
    }
}

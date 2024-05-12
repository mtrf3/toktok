package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.UploadImageResponseData;
import kotlin.jvm.internal.o;

/* renamed from: X.S5i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71526S5i implements Parcelable.Creator<UploadImageResponseData> {
    @Override // android.os.Parcelable.Creator
    public final UploadImageResponseData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new UploadImageResponseData(parcel.readString(), parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final UploadImageResponseData[] newArray(int i) {
        return new UploadImageResponseData[i];
    }
}

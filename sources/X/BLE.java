package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.session.deeplink.DeepLinkData;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BLE implements Parcelable.Creator<DeepLinkData> {
    @Override // android.os.Parcelable.Creator
    public final DeepLinkData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DeepLinkData(parcel.readString(), parcel.readLong(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DeepLinkData[] newArray(int i) {
        return new DeepLinkData[i];
    }
}

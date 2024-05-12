package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXC implements Parcelable.Creator<CommonData> {
    @Override // android.os.Parcelable.Creator
    public final CommonData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CommonData(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CommonData[] newArray(int i) {
        return new CommonData[i];
    }
}

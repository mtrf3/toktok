package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.LocationInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.PSh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64479PSh implements Parcelable.Creator<ButtonActionInfo> {
    @Override // android.os.Parcelable.Creator
    public final ButtonActionInfo createFromParcel(Parcel parcel) {
        FetchInfo createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        LocationInfo locationInfo = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = FetchInfo.CREATOR.createFromParcel(parcel);
        }
        FetchInfo fetchInfo = createFromParcel;
        if (parcel.readInt() != 0) {
            locationInfo = LocationInfo.CREATOR.createFromParcel(parcel);
        }
        return new ButtonActionInfo(readString, fetchInfo, locationInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final ButtonActionInfo[] newArray(int i) {
        return new ButtonActionInfo[i];
    }
}

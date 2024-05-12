package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.TrackParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Alp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27193Alp implements Parcelable.Creator<MapLocateData> {
    @Override // android.os.Parcelable.Creator
    public final MapLocateData createFromParcel(Parcel parcel) {
        Address createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        TrackParams trackParams = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Address.CREATOR.createFromParcel(parcel);
        }
        Address address = createFromParcel;
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            trackParams = TrackParams.CREATOR.createFromParcel(parcel);
        }
        return new MapLocateData(readString, readString2, address, readString3, readString4, trackParams, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final MapLocateData[] newArray(int i) {
        return new MapLocateData[i];
    }
}

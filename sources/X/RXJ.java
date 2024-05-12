package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.PdpInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.PdpResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXJ implements Parcelable.Creator<PdpResponse> {
    @Override // android.os.Parcelable.Creator
    public final PdpResponse createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        PdpInfoData pdpInfoData = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            pdpInfoData = PdpInfoData.CREATOR.createFromParcel(parcel);
        }
        return new PdpResponse(valueOf, readString, pdpInfoData);
    }

    @Override // android.os.Parcelable.Creator
    public final PdpResponse[] newArray(int i) {
        return new PdpResponse[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicPage;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.PdpInfoData;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXI implements Parcelable.Creator<PdpInfoData> {
    @Override // android.os.Parcelable.Creator
    public final PdpInfoData createFromParcel(Parcel parcel) {
        DynamicPage createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        Integer num = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = DynamicPage.CREATOR.createFromParcel(parcel);
        }
        DynamicPage dynamicPage = createFromParcel;
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new PdpInfoData(dynamicPage, num);
    }

    @Override // android.os.Parcelable.Creator
    public final PdpInfoData[] newArray(int i) {
        return new PdpInfoData[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVM implements Parcelable.Creator<PdpPaymentModule> {
    @Override // android.os.Parcelable.Creator
    public final PdpPaymentModule createFromParcel(Parcel parcel) {
        BnplInfo createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = BnplInfo.CREATOR.createFromParcel(parcel);
        }
        return new PdpPaymentModule(createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final PdpPaymentModule[] newArray(int i) {
        return new PdpPaymentModule[i];
    }
}

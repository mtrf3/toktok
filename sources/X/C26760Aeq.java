package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressRequest;
import kotlin.jvm.internal.o;

/* renamed from: X.Aeq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26760Aeq implements Parcelable.Creator<ChangeOrderShippingAddressRequest> {
    @Override // android.os.Parcelable.Creator
    public final ChangeOrderShippingAddressRequest createFromParcel(Parcel parcel) {
        Integer valueOf;
        boolean z;
        Boolean valueOf2;
        o.LJIIIZ(parcel, "parcel");
        Address address = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf2 = Boolean.valueOf(z);
        }
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            address = Address.CREATOR.createFromParcel(parcel);
        }
        return new ChangeOrderShippingAddressRequest(valueOf, readString, readString2, valueOf2, readString3, address);
    }

    @Override // android.os.Parcelable.Creator
    public final ChangeOrderShippingAddressRequest[] newArray(int i) {
        return new ChangeOrderShippingAddressRequest[i];
    }
}

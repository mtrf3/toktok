package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Aij, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27001Aij implements Parcelable.Creator<ShippingTOAddressInfo> {
    @Override // android.os.Parcelable.Creator
    public final ShippingTOAddressInfo createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        return new ShippingTOAddressInfo(valueOf, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ShippingTOAddressInfo[] newArray(int i) {
        return new ShippingTOAddressInfo[i];
    }
}

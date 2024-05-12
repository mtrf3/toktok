package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import kotlin.jvm.internal.o;

/* renamed from: X.Aem, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26756Aem implements Parcelable.Creator<AddressPageStarter.AddressListEnterParams> {
    @Override // android.os.Parcelable.Creator
    public final AddressPageStarter.AddressListEnterParams createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        Integer valueOf;
        Integer valueOf2;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new AddressPageStarter.AddressListEnterParams(z, readString, z2, readString2, readString3, valueOf, valueOf2, readString4, num, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AddressPageStarter.AddressListEnterParams[] newArray(int i) {
        return new AddressPageStarter.AddressListEnterParams[i];
    }
}

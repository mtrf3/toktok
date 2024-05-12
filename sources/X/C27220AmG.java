package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import kotlin.jvm.internal.o;

/* renamed from: X.AmG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27220AmG implements Parcelable.Creator<AddressLocation> {
    @Override // android.os.Parcelable.Creator
    public final AddressLocation createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AddressLocation(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AddressLocation[] newArray(int i) {
        return new AddressLocation[i];
    }
}

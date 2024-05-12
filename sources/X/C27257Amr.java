package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DraftAddress;
import kotlin.jvm.internal.o;

/* renamed from: X.Amr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27257Amr implements Parcelable.Creator<DraftAddress> {
    @Override // android.os.Parcelable.Creator
    public final DraftAddress createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DraftAddress(Address.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DraftAddress[] newArray(int i) {
        return new DraftAddress[i];
    }
}

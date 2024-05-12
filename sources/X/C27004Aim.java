package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import kotlin.jvm.internal.o;

/* renamed from: X.Aim, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27004Aim implements Parcelable.Creator<AddressItem> {
    @Override // android.os.Parcelable.Creator
    public final AddressItem createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AddressItem(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AddressItem[] newArray(int i) {
        return new AddressItem[i];
    }
}

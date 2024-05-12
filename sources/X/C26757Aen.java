package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressSku;
import kotlin.jvm.internal.o;

/* renamed from: X.Aen, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26757Aen implements Parcelable.Creator<AddressSku> {
    @Override // android.os.Parcelable.Creator
    public final AddressSku createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AddressSku(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AddressSku[] newArray(int i) {
        return new AddressSku[i];
    }
}

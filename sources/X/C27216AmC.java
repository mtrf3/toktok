package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionSku;
import kotlin.jvm.internal.o;

/* renamed from: X.AmC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27216AmC implements Parcelable.Creator<AddressPromotionSku> {
    @Override // android.os.Parcelable.Creator
    public final AddressPromotionSku createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AddressPromotionSku(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AddressPromotionSku[] newArray(int i) {
        return new AddressPromotionSku[i];
    }
}

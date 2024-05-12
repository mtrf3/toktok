package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.ShippingDialogDto;
import kotlin.jvm.internal.o;

/* renamed from: X.Akr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27133Akr implements Parcelable.Creator<ShippingDialogDto> {
    @Override // android.os.Parcelable.Creator
    public final ShippingDialogDto createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ShippingDialogDto(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ShippingDialogDto[] newArray(int i) {
        return new ShippingDialogDto[i];
    }
}

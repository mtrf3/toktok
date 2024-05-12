package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingTextInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.ShippingDialogDto;
import kotlin.jvm.internal.o;

/* renamed from: X.Akq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27132Akq implements Parcelable.Creator<ShippingTextInfo> {
    @Override // android.os.Parcelable.Creator
    public final ShippingTextInfo createFromParcel(Parcel parcel) {
        ShippingDialogDto createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ShippingDialogDto.CREATOR.createFromParcel(parcel);
        }
        return new ShippingTextInfo(readString, readString2, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ShippingTextInfo[] newArray(int i) {
        return new ShippingTextInfo[i];
    }
}

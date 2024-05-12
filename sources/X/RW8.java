package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RW8 implements Parcelable.Creator<AddToCartButton> {
    @Override // android.os.Parcelable.Creator
    public final AddToCartButton createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        o.LJIIIZ(parcel, "parcel");
        Integer num = null;
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
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new AddToCartButton(valueOf, readString, readString2, valueOf2, num);
    }

    @Override // android.os.Parcelable.Creator
    public final AddToCartButton[] newArray(int i) {
        return new AddToCartButton[i];
    }
}

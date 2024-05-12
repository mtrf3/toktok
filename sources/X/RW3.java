package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductPriceEpt;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RW3 implements Parcelable.Creator<ProductPriceEpt> {
    @Override // android.os.Parcelable.Creator
    public final ProductPriceEpt createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
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
        return new ProductPriceEpt(readString, readString2, readString3, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final ProductPriceEpt[] newArray(int i) {
        return new ProductPriceEpt[i];
    }
}

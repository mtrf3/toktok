package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductBaseEpt;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductPriceEpt;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RW2 implements Parcelable.Creator<ProductBaseEpt> {
    @Override // android.os.Parcelable.Creator
    public final ProductBaseEpt createFromParcel(Parcel parcel) {
        ProductPriceEpt createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ProductPriceEpt.CREATOR.createFromParcel(parcel);
        }
        return new ProductBaseEpt(readString, readString2, readString3, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ProductBaseEpt[] newArray(int i) {
        return new ProductBaseEpt[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuUnavailableInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVV implements Parcelable.Creator<SkuUnavailableInfo> {
    @Override // android.os.Parcelable.Creator
    public final SkuUnavailableInfo createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        ProductUnavailableInfo productUnavailableInfo = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            productUnavailableInfo = ProductUnavailableInfo.CREATOR.createFromParcel(parcel);
        }
        return new SkuUnavailableInfo(valueOf, productUnavailableInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final SkuUnavailableInfo[] newArray(int i) {
        return new SkuUnavailableInfo[i];
    }
}

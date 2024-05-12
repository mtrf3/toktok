package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.AgX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26865AgX implements Parcelable.Creator<ProductBannerLabel> {
    @Override // android.os.Parcelable.Creator
    public final ProductBannerLabel createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new ProductBannerLabel(readString, valueOf, (Image) parcel.readParcelable(ProductBannerLabel.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final ProductBannerLabel[] newArray(int i) {
        return new ProductBannerLabel[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RUh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69627RUh implements Parcelable.Creator<ProductLogo> {
    @Override // android.os.Parcelable.Creator
    public final ProductLogo createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        Image image = (Image) parcel.readParcelable(ProductLogo.class.getClassLoader());
        Image image2 = (Image) parcel.readParcelable(ProductLogo.class.getClassLoader());
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new ProductLogo(image, image2, valueOf, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ProductLogo[] newArray(int i) {
        return new ProductLogo[i];
    }
}

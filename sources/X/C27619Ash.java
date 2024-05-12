package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetails;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.Ash, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27619Ash implements Parcelable.Creator<ProductDetails> {
    @Override // android.os.Parcelable.Creator
    public final ProductDetails createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ProductDetails(parcel.readString(), (Image) parcel.readParcelable(ProductDetails.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final ProductDetails[] newArray(int i) {
        return new ProductDetails[i];
    }
}

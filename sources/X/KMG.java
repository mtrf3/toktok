package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KMG implements Parcelable.Creator<ECommerceService.WishListFragmentData> {
    @Override // android.os.Parcelable.Creator
    public final ECommerceService.WishListFragmentData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ECommerceService.WishListFragmentData(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ECommerceService.WishListFragmentData[] newArray(int i) {
        return new ECommerceService.WishListFragmentData[i];
    }
}

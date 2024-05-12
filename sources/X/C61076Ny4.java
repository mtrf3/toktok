package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Ny4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61076Ny4 implements Parcelable.Creator<ShoppingAdsServiceImpl.WishListFragmentData> {
    @Override // android.os.Parcelable.Creator
    public final ShoppingAdsServiceImpl.WishListFragmentData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ShoppingAdsServiceImpl.WishListFragmentData(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ShoppingAdsServiceImpl.WishListFragmentData[] newArray(int i) {
        return new ShoppingAdsServiceImpl.WishListFragmentData[i];
    }
}

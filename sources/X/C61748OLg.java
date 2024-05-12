package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommercebase.view.coupon.FlashSaleModel;
import kotlin.jvm.internal.o;

/* renamed from: X.OLg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61748OLg implements Parcelable.Creator<FlashSaleModel> {
    @Override // android.os.Parcelable.Creator
    public final FlashSaleModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new FlashSaleModel(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final FlashSaleModel[] newArray(int i) {
        return new FlashSaleModel[i];
    }
}

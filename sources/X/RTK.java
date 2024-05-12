package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SellerInfoBizExtra;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RTK implements Parcelable.Creator<SellerInfoBizExtra> {
    @Override // android.os.Parcelable.Creator
    public final SellerInfoBizExtra createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SellerInfoBizExtra(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SellerInfoBizExtra[] newArray(int i) {
        return new SellerInfoBizExtra[i];
    }
}

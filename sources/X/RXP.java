package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SkuBizExtra;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXP implements Parcelable.Creator<SkuBizExtra> {
    @Override // android.os.Parcelable.Creator
    public final SkuBizExtra createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SkuBizExtra(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SkuBizExtra[] newArray(int i) {
        return new SkuBizExtra[i];
    }
}

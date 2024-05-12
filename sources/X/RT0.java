package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RT0 implements Parcelable.Creator<SkuVoucher> {
    @Override // android.os.Parcelable.Creator
    public final SkuVoucher createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SkuVoucher(parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final SkuVoucher[] newArray(int i) {
        return new SkuVoucher[i];
    }
}

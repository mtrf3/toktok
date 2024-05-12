package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.DiscountView;
import kotlin.jvm.internal.o;

/* renamed from: X.RUn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69633RUn implements Parcelable.Creator<DiscountView> {
    @Override // android.os.Parcelable.Creator
    public final DiscountView createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DiscountView(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DiscountView[] newArray(int i) {
        return new DiscountView[i];
    }
}

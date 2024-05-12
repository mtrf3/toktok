package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherLabel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.RUa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69620RUa implements Parcelable.Creator<VoucherLabel> {
    @Override // android.os.Parcelable.Creator
    public final VoucherLabel createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new VoucherLabel(valueOf, parcel.readString(), (Image) parcel.readParcelable(VoucherLabel.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final VoucherLabel[] newArray(int i) {
        return new VoucherLabel[i];
    }
}

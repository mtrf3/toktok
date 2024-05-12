package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import kotlin.jvm.internal.o;

/* renamed from: X.RUt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69639RUt implements Parcelable.Creator<ClaimVoucherResponseData> {
    @Override // android.os.Parcelable.Creator
    public final ClaimVoucherResponseData createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        Voucher voucher = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        if (parcel.readInt() != 0) {
            voucher = Voucher.CREATOR.createFromParcel(parcel);
        }
        return new ClaimVoucherResponseData(valueOf, voucher, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ClaimVoucherResponseData[] newArray(int i) {
        return new ClaimVoucherResponseData[i];
    }
}

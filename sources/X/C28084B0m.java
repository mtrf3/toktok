package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.B0m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28084B0m implements Parcelable.Creator<VoucherInfo> {
    @Override // android.os.Parcelable.Creator
    public final VoucherInfo createFromParcel(Parcel parcel) {
        Price createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Price.CREATOR.createFromParcel(parcel);
        }
        Price price = createFromParcel;
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(Voucher.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new VoucherInfo(price, arrayList, parcel.createStringArrayList(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final VoucherInfo[] newArray(int i) {
        return new VoucherInfo[i];
    }
}

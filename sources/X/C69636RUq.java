package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionDiscount;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.RUq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69636RUq implements Parcelable.Creator<PromotionDiscount> {
    @Override // android.os.Parcelable.Creator
    public final PromotionDiscount createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(Voucher.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new PromotionDiscount(readString, readString2, readString3, arrayList, valueOf, num, parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final PromotionDiscount[] newArray(int i) {
        return new PromotionDiscount[i];
    }
}

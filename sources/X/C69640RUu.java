package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlatformPromotionItem;
import kotlin.jvm.internal.o;

/* renamed from: X.RUu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69640RUu implements Parcelable.Creator<PlatformPromotionItem> {
    @Override // android.os.Parcelable.Creator
    public final PlatformPromotionItem createFromParcel(Parcel parcel) {
        Voucher createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Voucher.CREATOR.createFromParcel(parcel);
        }
        Voucher voucher = createFromParcel;
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new PlatformPromotionItem(readString, readString2, readString3, readString4, readString5, voucher, num, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PlatformPromotionItem[] newArray(int i) {
        return new PlatformPromotionItem[i];
    }
}

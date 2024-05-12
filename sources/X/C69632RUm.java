package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.DiscountView;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInteractiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherLabel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.RUm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69632RUm implements Parcelable.Creator<Voucher> {
    @Override // android.os.Parcelable.Creator
    public final Voucher createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Long valueOf7;
        Long valueOf8;
        Long valueOf9;
        boolean z;
        Boolean valueOf10;
        Boolean valueOf11;
        Integer valueOf12;
        ArrayList arrayList;
        Integer valueOf13;
        Integer valueOf14;
        VoucherInteractiveInfo createFromParcel;
        ArrayList arrayList2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            valueOf4 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            valueOf5 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf6 = null;
        } else {
            valueOf6 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf7 = null;
        } else {
            valueOf7 = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            valueOf8 = null;
        } else {
            valueOf8 = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            valueOf9 = null;
        } else {
            valueOf9 = Long.valueOf(parcel.readLong());
        }
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        boolean z2 = true;
        if (parcel.readInt() == 0) {
            valueOf10 = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf10 = Boolean.valueOf(z);
        }
        String readString5 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf11 = null;
        } else {
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            valueOf11 = Boolean.valueOf(z2);
        }
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        String readString11 = parcel.readString();
        String readString12 = parcel.readString();
        String readString13 = parcel.readString();
        String readString14 = parcel.readString();
        String readString15 = parcel.readString();
        String readString16 = parcel.readString();
        String readString17 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf12 = null;
        } else {
            valueOf12 = Integer.valueOf(parcel.readInt());
        }
        String readString18 = parcel.readString();
        String readString19 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(DiscountView.CREATOR, parcel, arrayList, i, 1);
            }
        }
        String readString20 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf13 = null;
        } else {
            valueOf13 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf14 = null;
        } else {
            valueOf14 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = VoucherInteractiveInfo.CREATOR.createFromParcel(parcel);
        }
        VoucherInteractiveInfo voucherInteractiveInfo = createFromParcel;
        String readString21 = parcel.readString();
        String readString22 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = C279117r.LIZIZ(VoucherLabel.CREATOR, parcel, arrayList2, i2, 1);
            }
        }
        return new Voucher(readString, readString2, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, readString3, readString4, valueOf10, readString5, valueOf11, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, valueOf12, readString18, readString19, arrayList, readString20, valueOf13, valueOf14, voucherInteractiveInfo, readString21, readString22, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final Voucher[] newArray(int i) {
        return new Voucher[i];
    }
}

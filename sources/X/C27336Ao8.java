package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.FeeTag;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Promotion;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ao8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27336Ao8 implements Parcelable.Creator<Price> {
    @Override // android.os.Parcelable.Creator
    public final Price createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Integer valueOf;
        ArrayList arrayList2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        int i = 0;
        ArrayList arrayList3 = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(Promotion.CREATOR, parcel, arrayList, i2, 1);
            }
        }
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = C279117r.LIZIZ(FeeTag.CREATOR, parcel, arrayList2, i3, 1);
            }
        }
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            arrayList3 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = C279117r.LIZIZ(PaymentPromotion.CREATOR, parcel, arrayList3, i, 1);
            }
        }
        return new Price(readString, readString2, readString3, arrayList, valueOf, arrayList2, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final Price[] newArray(int i) {
        return new Price[i];
    }
}

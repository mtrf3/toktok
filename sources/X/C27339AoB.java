package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.PaymentPromotion;
import kotlin.jvm.internal.o;

/* renamed from: X.AoB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27339AoB implements Parcelable.Creator<PaymentPromotion> {
    @Override // android.os.Parcelable.Creator
    public final PaymentPromotion createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new PaymentPromotion(readString, readString2, readString3, valueOf, num);
    }

    @Override // android.os.Parcelable.Creator
    public final PaymentPromotion[] newArray(int i) {
        return new PaymentPromotion[i];
    }
}

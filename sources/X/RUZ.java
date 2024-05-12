package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotionItem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RUZ implements Parcelable.Creator<SellerPromotion> {
    @Override // android.os.Parcelable.Creator
    public final SellerPromotion createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(SellerPromotionItem.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new SellerPromotion(readString, readString2, arrayList, parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final SellerPromotion[] newArray(int i) {
        return new SellerPromotion[i];
    }
}

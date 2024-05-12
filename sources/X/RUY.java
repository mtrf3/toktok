package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PdpPromotion;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RUY implements Parcelable.Creator<PdpPromotion> {
    @Override // android.os.Parcelable.Creator
    public final PdpPromotion createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C5YW.LIZ(PdpPromotion.class, parcel, arrayList, i, 1);
            }
        }
        return new PdpPromotion(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final PdpPromotion[] newArray(int i) {
        return new PdpPromotion[i];
    }
}

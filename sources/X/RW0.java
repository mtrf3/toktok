package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RW0 implements Parcelable.Creator<DynamicSellingPointsBase> {
    @Override // android.os.Parcelable.Creator
    public final DynamicSellingPointsBase createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        Integer num = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(DynamicSellingPoint.CREATOR, parcel, arrayList, i, 1);
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
        return new DynamicSellingPointsBase(arrayList, valueOf, num);
    }

    @Override // android.os.Parcelable.Creator
    public final DynamicSellingPointsBase[] newArray(int i) {
        return new DynamicSellingPointsBase[i];
    }
}

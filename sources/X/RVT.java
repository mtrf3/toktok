package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVT implements Parcelable.Creator<RecommendInfo> {
    @Override // android.os.Parcelable.Creator
    public final RecommendInfo createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        LinkedHashMap linkedHashMap = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(ProductBase.CREATOR, parcel, arrayList, i, 1);
            }
        }
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            linkedHashMap = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
        }
        return new RecommendInfo(arrayList, readString, linkedHashMap, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final RecommendInfo[] newArray(int i) {
        return new RecommendInfo[i];
    }
}

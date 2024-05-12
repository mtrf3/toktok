package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PdpPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonText;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuUnavailableInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVU implements Parcelable.Creator<SkuCommonConfig> {
    @Override // android.os.Parcelable.Creator
    public final SkuCommonConfig createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        boolean z = false;
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(SkuCommonText.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int readInt2 = parcel.readInt();
            linkedHashMap = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap.put(parcel.readString(), PdpPromotion.CREATOR.createFromParcel(parcel));
            }
        }
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt3 = parcel.readInt();
            arrayList2 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = C279117r.LIZIZ(SkuUnavailableInfo.CREATOR, parcel, arrayList2, i3, 1);
            }
        }
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        }
        return new SkuCommonConfig(arrayList, linkedHashMap, arrayList2, valueOf, bool, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SkuCommonConfig[] newArray(int i) {
        return new SkuCommonConfig[i];
    }
}

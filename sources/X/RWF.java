package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RWF implements Parcelable.Creator<SkuInfo> {
    @Override // android.os.Parcelable.Creator
    public final SkuInfo createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        o.LJIIIZ(parcel, "parcel");
        int i = 0;
        SkuCommonConfig skuCommonConfig = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(SkuItem.CREATOR, parcel, arrayList, i2, 1);
            }
        }
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = C279117r.LIZIZ(SaleProp.CREATOR, parcel, arrayList2, i, 1);
            }
        }
        if (parcel.readInt() != 0) {
            skuCommonConfig = SkuCommonConfig.CREATOR.createFromParcel(parcel);
        }
        return new SkuInfo(arrayList, arrayList2, skuCommonConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final SkuInfo[] newArray(int i) {
        return new SkuInfo[i];
    }
}

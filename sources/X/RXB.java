package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomNavigation;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicPage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HeaderNavigation;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXB implements Parcelable.Creator<DynamicPage> {
    @Override // android.os.Parcelable.Creator
    public final DynamicPage createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Integer valueOf;
        ArrayList arrayList2;
        CommonData createFromParcel;
        HeaderNavigation createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        int i = 0;
        BottomNavigation bottomNavigation = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(BrickInfo.CREATOR, parcel, arrayList, i2, 1);
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
            while (i != readInt2) {
                i = C279117r.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab.CREATOR, parcel, arrayList2, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = CommonData.CREATOR.createFromParcel(parcel);
        }
        CommonData commonData = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = HeaderNavigation.CREATOR.createFromParcel(parcel);
        }
        HeaderNavigation headerNavigation = createFromParcel2;
        if (parcel.readInt() != 0) {
            bottomNavigation = BottomNavigation.CREATOR.createFromParcel(parcel);
        }
        return new DynamicPage(readString, arrayList, valueOf, arrayList2, commonData, headerNavigation, bottomNavigation);
    }

    @Override // android.os.Parcelable.Creator
    public final DynamicPage[] newArray(int i) {
        return new DynamicPage[i];
    }
}

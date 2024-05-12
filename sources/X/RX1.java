package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RX1 implements Parcelable.Creator<SaleProp> {
    @Override // android.os.Parcelable.Creator
    public final SaleProp createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int i = 0;
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = C279117r.LIZIZ(SalePropValue.CREATOR, parcel, arrayList, i, 1);
            }
        }
        int readInt2 = parcel.readInt();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new SaleProp(readString, readString2, valueOf, arrayList, readInt2, num);
    }

    @Override // android.os.Parcelable.Creator
    public final SaleProp[] newArray(int i) {
        return new SaleProp[i];
    }
}

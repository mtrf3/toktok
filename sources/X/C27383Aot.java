package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.MatchedAddress;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Aot, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27383Aot implements Parcelable.Creator<DistrictData> {
    @Override // android.os.Parcelable.Creator
    public final DistrictData createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        int i = 0;
        ArrayList arrayList2 = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(District.CREATOR, parcel, arrayList, i2, 1);
            }
        }
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
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = C279117r.LIZIZ(MatchedAddress.CREATOR, parcel, arrayList2, i, 1);
            }
        }
        return new DistrictData(arrayList, valueOf, readString, readString2, readString3, readString4, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final DistrictData[] newArray(int i) {
        return new DistrictData[i];
    }
}

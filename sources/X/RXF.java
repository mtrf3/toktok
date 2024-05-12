package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HeaderNavigation;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NavButton;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXF implements Parcelable.Creator<HeaderNavigation> {
    @Override // android.os.Parcelable.Creator
    public final HeaderNavigation createFromParcel(Parcel parcel) {
        ArrayList arrayList;
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
                i2 = C279117r.LIZIZ(NavButton.CREATOR, parcel, arrayList, i2, 1);
            }
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = C279117r.LIZIZ(NavButton.CREATOR, parcel, arrayList2, i, 1);
            }
        }
        return new HeaderNavigation(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final HeaderNavigation[] newArray(int i) {
        return new HeaderNavigation[i];
    }
}

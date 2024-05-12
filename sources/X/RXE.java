package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomNavigation;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NavButton;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXE implements Parcelable.Creator<BottomNavigation> {
    @Override // android.os.Parcelable.Creator
    public final BottomNavigation createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(NavButton.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new BottomNavigation(arrayList, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final BottomNavigation[] newArray(int i) {
        return new BottomNavigation[i];
    }
}

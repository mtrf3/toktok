package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.MatchedAddress;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Aov, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27385Aov implements Parcelable.Creator<MatchedAddress> {
    @Override // android.os.Parcelable.Creator
    public final MatchedAddress createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(District.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new MatchedAddress(readString, readString2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final MatchedAddress[] newArray(int i) {
        return new MatchedAddress[i];
    }
}

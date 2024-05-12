package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GIB implements Parcelable.Creator<AdFreeTrialPageInfo> {
    @Override // android.os.Parcelable.Creator
    public final AdFreeTrialPageInfo createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readSerializable());
            }
        }
        return new AdFreeTrialPageInfo(readString, readString2, arrayList, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AdFreeTrialPageInfo[] newArray(int i) {
        return new AdFreeTrialPageInfo[i];
    }
}

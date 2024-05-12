package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GIC implements Parcelable.Creator<PickYourAdPlanPage> {
    @Override // android.os.Parcelable.Creator
    public final PickYourAdPlanPage createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        ArrayList arrayList2 = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readSerializable());
            }
        }
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(parcel.readSerializable());
            }
        }
        return new PickYourAdPlanPage(readString, readString2, arrayList, readString3, readString4, readString5, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final PickYourAdPlanPage[] newArray(int i) {
        return new PickYourAdPlanPage[i];
    }
}

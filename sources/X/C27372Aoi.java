package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Aoi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27372Aoi implements Parcelable.Creator<District> {
    @Override // android.os.Parcelable.Creator
    public final District createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        boolean z = false;
        Boolean bool = null;
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
        if (parcel.readInt() != 0) {
            if (parcel.readInt() != 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        }
        return new District(readString, readString2, readString3, readString4, readString5, arrayList, bool, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final District[] newArray(int i) {
        return new District[i];
    }
}

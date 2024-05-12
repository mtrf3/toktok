package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RV0 implements Parcelable.Creator<SkcInfo> {
    @Override // android.os.Parcelable.Creator
    public final SkcInfo createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new SkcInfo(readString, arrayList, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SkcInfo[] newArray(int i) {
        return new SkcInfo[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderRequest;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RV1 implements Parcelable.Creator<ReminderRequest> {
    @Override // android.os.Parcelable.Creator
    public final ReminderRequest createFromParcel(Parcel parcel) {
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
                i = C279117r.LIZIZ(ReminderItem.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new ReminderRequest(readString, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final ReminderRequest[] newArray(int i) {
        return new ReminderRequest[i];
    }
}

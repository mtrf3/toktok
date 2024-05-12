package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceButtonInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AqK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27472AqK implements Parcelable.Creator<EntranceButtonInfo> {
    @Override // android.os.Parcelable.Creator
    public final EntranceButtonInfo createFromParcel(Parcel parcel) {
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
                i = C5YW.LIZ(EntranceButtonInfo.class, parcel, arrayList, i, 1);
            }
        }
        return new EntranceButtonInfo(readString, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final EntranceButtonInfo[] newArray(int i) {
        return new EntranceButtonInfo[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionalInfoItem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Asr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27629Asr implements Parcelable.Creator<AdditionInfo> {
    @Override // android.os.Parcelable.Creator
    public final AdditionInfo createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(AdditionalInfoItem.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new AdditionInfo(valueOf, readString, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final AdditionInfo[] newArray(int i) {
        return new AdditionInfo[i];
    }
}

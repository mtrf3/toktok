package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.PurchaseParams;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A6N implements Parcelable.Creator<PurchaseParams> {
    @Override // android.os.Parcelable.Creator
    public final PurchaseParams createFromParcel(Parcel parcel) {
        Long valueOf;
        Long valueOf2;
        o.LJIIIZ(parcel, "parcel");
        long readLong = parcel.readLong();
        Long l = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() != 0) {
            l = Long.valueOf(parcel.readLong());
        }
        return new PurchaseParams(readLong, valueOf, readString, readString2, valueOf2, l, EnumC25627A3z.valueOf(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final PurchaseParams[] newArray(int i) {
        return new PurchaseParams[i];
    }
}

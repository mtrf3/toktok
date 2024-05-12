package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RT1 implements Parcelable.Creator<PurchaseLimit> {
    @Override // android.os.Parcelable.Creator
    public final PurchaseLimit createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        return new PurchaseLimit(readString, valueOf, parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final PurchaseLimit[] newArray(int i) {
        return new PurchaseLimit[i];
    }
}

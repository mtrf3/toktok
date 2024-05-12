package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVR implements Parcelable.Creator<CartEntry> {
    @Override // android.os.Parcelable.Creator
    public final CartEntry createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new CartEntry(readString, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final CartEntry[] newArray(int i) {
        return new CartEntry[i];
    }
}

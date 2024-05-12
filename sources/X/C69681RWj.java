package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyTogether;
import kotlin.jvm.internal.o;

/* renamed from: X.RWj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69681RWj implements Parcelable.Creator<BuyTogether> {
    @Override // android.os.Parcelable.Creator
    public final BuyTogether createFromParcel(Parcel parcel) {
        boolean z;
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new BuyTogether(z, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final BuyTogether[] newArray(int i) {
        return new BuyTogether[i];
    }
}

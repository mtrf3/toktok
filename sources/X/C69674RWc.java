package X;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* renamed from: X.RWc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69674RWc implements Parcelable.Creator<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab> {
    @Override // android.os.Parcelable.Creator
    public final com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab(valueOf, readString, num);
    }

    @Override // android.os.Parcelable.Creator
    public final com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab[] newArray(int i) {
        return new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab[i];
    }
}

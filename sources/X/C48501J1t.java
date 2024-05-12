package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.BillboardNewUser;
import kotlin.jvm.internal.o;

/* renamed from: X.J1t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48501J1t implements Parcelable.Creator<BillboardNewUser> {
    @Override // android.os.Parcelable.Creator
    public final BillboardNewUser createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
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
        return new BillboardNewUser(valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final BillboardNewUser[] newArray(int i) {
        return new BillboardNewUser[i];
    }
}

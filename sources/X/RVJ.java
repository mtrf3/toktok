package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVJ implements Parcelable.Creator<Amount> {
    @Override // android.os.Parcelable.Creator
    public final Amount createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new Amount(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Amount[] newArray(int i) {
        return new Amount[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ECommerceCreativeVideoParams;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCO implements Parcelable.Creator<ECommerceCreativeVideoParams> {
    @Override // android.os.Parcelable.Creator
    public final ECommerceCreativeVideoParams createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ECommerceCreativeVideoParams(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ECommerceCreativeVideoParams[] newArray(int i) {
        return new ECommerceCreativeVideoParams[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchTo;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import kotlin.jvm.internal.o;

/* renamed from: X.Aev, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26765Aev implements Parcelable.Creator<DispatchTo> {
    @Override // android.os.Parcelable.Creator
    public final DispatchTo createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        return new DispatchTo(createFromParcel, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DispatchTo[] newArray(int i) {
        return new DispatchTo[i];
    }
}

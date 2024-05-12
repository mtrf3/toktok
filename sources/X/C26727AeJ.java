package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingServiceTag;
import kotlin.jvm.internal.o;

/* renamed from: X.AeJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26727AeJ implements Parcelable.Creator<ShippingServiceTag> {
    @Override // android.os.Parcelable.Creator
    public final ShippingServiceTag createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        return new ShippingServiceTag(createFromParcel, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ShippingServiceTag[] newArray(int i) {
        return new ShippingServiceTag[i];
    }
}

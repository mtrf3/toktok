package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingServicePopup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingServiceTag;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AeI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26726AeI implements Parcelable.Creator<ShippingServicePopup> {
    @Override // android.os.Parcelable.Creator
    public final ShippingServicePopup createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(ShippingServiceTag.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new ShippingServicePopup(readString, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final ShippingServicePopup[] newArray(int i) {
        return new ShippingServicePopup[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingServicePopup;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Afq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26822Afq implements Parcelable.Creator<ShippingService> {
    @Override // android.os.Parcelable.Creator
    public final ShippingService createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        ShippingServicePopup createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ShippingServicePopup.CREATOR.createFromParcel(parcel);
        }
        ShippingServicePopup shippingServicePopup = createFromParcel2;
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(LogisticLinkRichText.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new ShippingService(createStringArrayList, icon, shippingServicePopup, readString, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final ShippingService[] newArray(int i) {
        return new ShippingService[i];
    }
}

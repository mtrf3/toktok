package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingTextInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShipFromInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Akm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27128Akm implements Parcelable.Creator<PdpShipping> {
    @Override // android.os.Parcelable.Creator
    public final PdpShipping createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ShippingTOAddressInfo createFromParcel;
        ShippingTextInfo createFromParcel2;
        ShippingService createFromParcel3;
        o.LJIIIZ(parcel, "parcel");
        ShipFromInfo shipFromInfo = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(LogisticDTO.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ShippingTOAddressInfo.CREATOR.createFromParcel(parcel);
        }
        ShippingTOAddressInfo shippingTOAddressInfo = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ShippingTextInfo.CREATOR.createFromParcel(parcel);
        }
        ShippingTextInfo shippingTextInfo = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = ShippingService.CREATOR.createFromParcel(parcel);
        }
        ShippingService shippingService = createFromParcel3;
        if (parcel.readInt() != 0) {
            shipFromInfo = ShipFromInfo.CREATOR.createFromParcel(parcel);
        }
        return new PdpShipping(arrayList, shippingTOAddressInfo, shippingTextInfo, shippingService, shipFromInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final PdpShipping[] newArray(int i) {
        return new PdpShipping[i];
    }
}

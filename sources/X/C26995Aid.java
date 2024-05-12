package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Aid, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26995Aid implements Parcelable.Creator<DeliveryPanelStarter.PackedDeliverySelectResult> {
    @Override // android.os.Parcelable.Creator
    public final DeliveryPanelStarter.PackedDeliverySelectResult createFromParcel(Parcel parcel) {
        LogisticDTO createFromParcel;
        ArrayList arrayList;
        ShippingTOAddressInfo createFromParcel2;
        ArrayList arrayList2;
        o.LJIIIZ(parcel, "parcel");
        PDPLogisticModule pDPLogisticModule = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = LogisticDTO.CREATOR.createFromParcel(parcel);
        }
        LogisticDTO logisticDTO = createFromParcel;
        String readString = parcel.readString();
        int i = 0;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(Region.CREATOR, parcel, arrayList, i2, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ShippingTOAddressInfo.CREATOR.createFromParcel(parcel);
        }
        ShippingTOAddressInfo shippingTOAddressInfo = createFromParcel2;
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = C279117r.LIZIZ(LogisticDTO.CREATOR, parcel, arrayList2, i, 1);
            }
        }
        if (parcel.readInt() != 0) {
            pDPLogisticModule = PDPLogisticModule.CREATOR.createFromParcel(parcel);
        }
        return new DeliveryPanelStarter.PackedDeliverySelectResult(logisticDTO, readString, arrayList, shippingTOAddressInfo, arrayList2, pDPLogisticModule);
    }

    @Override // android.os.Parcelable.Creator
    public final DeliveryPanelStarter.PackedDeliverySelectResult[] newArray(int i) {
        return new DeliveryPanelStarter.PackedDeliverySelectResult[i];
    }
}

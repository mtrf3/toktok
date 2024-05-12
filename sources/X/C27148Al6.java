package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingServiceModule;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Al6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27148Al6 implements Parcelable.Creator<PDPLogisticModule> {
    @Override // android.os.Parcelable.Creator
    public final PDPLogisticModule createFromParcel(Parcel parcel) {
        PDPLogisticMeta createFromParcel;
        PDPShippingModule createFromParcel2;
        PDPShippingServiceModule createFromParcel3;
        PDPReturnPolicyModule createFromParcel4;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        LinkedHashMap linkedHashMap = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = PDPLogisticMeta.CREATOR.createFromParcel(parcel);
        }
        PDPLogisticMeta pDPLogisticMeta = createFromParcel;
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = PDPShippingModule.CREATOR.createFromParcel(parcel);
        }
        PDPShippingModule pDPShippingModule = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = PDPShippingServiceModule.CREATOR.createFromParcel(parcel);
        }
        PDPShippingServiceModule pDPShippingServiceModule = createFromParcel3;
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = PDPReturnPolicyModule.CREATOR.createFromParcel(parcel);
        }
        PDPReturnPolicyModule pDPReturnPolicyModule = createFromParcel4;
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), PDPShippingModule.CREATOR.createFromParcel(parcel));
            }
        }
        return new PDPLogisticModule(readString, pDPLogisticMeta, readString2, pDPShippingModule, pDPShippingServiceModule, pDPReturnPolicyModule, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final PDPLogisticModule[] newArray(int i) {
        return new PDPLogisticModule[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryRequest;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Aik, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27002Aik implements Parcelable.Creator<DeliveryRequest> {
    @Override // android.os.Parcelable.Creator
    public final DeliveryRequest createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        o.LJIIIZ(parcel, "parcel");
        LinkedHashMap linkedHashMap = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(OrderSKUDTO.CREATOR, parcel, arrayList, i, 1);
            }
        }
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = C279117r.LIZIZ(Region.CREATOR, parcel, arrayList2, i2, 1);
            }
        }
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            linkedHashMap = new LinkedHashMap(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                String readString2 = parcel.readString();
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    linkedHashMap2.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
                linkedHashMap.put(readString2, linkedHashMap2);
            }
        }
        return new DeliveryRequest(arrayList, readString, arrayList2, linkedHashMap, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DeliveryRequest[] newArray(int i) {
        return new DeliveryRequest[i];
    }
}

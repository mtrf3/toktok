package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Aie, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26996Aie implements Parcelable.Creator<DeliveryPanelStarter.EnterParamForProductDetailPage> {
    @Override // android.os.Parcelable.Creator
    public final DeliveryPanelStarter.EnterParamForProductDetailPage createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(Region.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new DeliveryPanelStarter.EnterParamForProductDetailPage(readString, readString2, arrayList, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DeliveryPanelStarter.EnterParamForProductDetailPage[] newArray(int i) {
        return new DeliveryPanelStarter.EnterParamForProductDetailPage[i];
    }
}

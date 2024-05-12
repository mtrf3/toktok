package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Aii, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27000Aii implements Parcelable.Creator<DeliveryPanelStarter.EnterParam> {
    @Override // android.os.Parcelable.Creator
    public final DeliveryPanelStarter.EnterParam createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int i = 0;
        Integer num = null;
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
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        int readInt2 = parcel.readInt();
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt3 = parcel.readInt();
            arrayList2 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = C279117r.LIZIZ(LogisticDTO.CREATOR, parcel, arrayList2, i, 1);
            }
        }
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new DeliveryPanelStarter.EnterParam(readString, readString2, arrayList, readString3, readString4, readInt2, arrayList2, readString5, readString6, readString7, num, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DeliveryPanelStarter.EnterParam[] newArray(int i) {
        return new DeliveryPanelStarter.EnterParam[i];
    }
}

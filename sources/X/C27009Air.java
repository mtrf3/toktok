package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Air, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27009Air implements Parcelable.Creator<AddressPageStarter.AddressEditDetailEnterParams> {
    @Override // android.os.Parcelable.Creator
    public final AddressPageStarter.AddressEditDetailEnterParams createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Address createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        InputItemData inputItemData = null;
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
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Address.CREATOR.createFromParcel(parcel);
        }
        Address address = createFromParcel;
        if (parcel.readInt() != 0) {
            inputItemData = InputItemData.CREATOR.createFromParcel(parcel);
        }
        return new AddressPageStarter.AddressEditDetailEnterParams(arrayList, address, inputItemData, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AddressPageStarter.AddressEditDetailEnterParams[] newArray(int i) {
        return new AddressPageStarter.AddressEditDetailEnterParams[i];
    }
}

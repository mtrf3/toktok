package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ail, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27003Ail implements Parcelable.Creator<Address> {
    @Override // android.os.Parcelable.Creator
    public final Address createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Region createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        int i = 0;
        ArrayList arrayList2 = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C279117r.LIZIZ(AddressItem.CREATOR, parcel, arrayList, i2, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Region.CREATOR.createFromParcel(parcel);
        }
        Region region = createFromParcel;
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = C279117r.LIZIZ(Region.CREATOR, parcel, arrayList2, i, 1);
            }
        }
        return new Address(readString, arrayList, region, arrayList2, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Address[] newArray(int i) {
        return new Address[i];
    }
}

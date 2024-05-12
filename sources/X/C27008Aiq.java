package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressPromotionSku;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Aiq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27008Aiq implements Parcelable.Creator<AddressPageStarter.AddressEditEnterParams> {
    @Override // android.os.Parcelable.Creator
    public final AddressPageStarter.AddressEditEnterParams createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Address createFromParcel;
        Integer valueOf;
        Integer valueOf2;
        InputItemData createFromParcel2;
        boolean z;
        ArrayList arrayList2;
        boolean z2;
        Boolean valueOf3;
        Address createFromParcel3;
        o.LJIIIZ(parcel, "parcel");
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
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = InputItemData.CREATOR.createFromParcel(parcel);
        }
        InputItemData inputItemData = createFromParcel2;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        int readInt2 = parcel.readInt();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt3 = parcel.readInt();
            arrayList2 = new ArrayList(readInt3);
            int i2 = 0;
            while (i2 != readInt3) {
                i2 = C279117r.LIZIZ(AddressPromotionSku.CREATOR, parcel, arrayList2, i2, 1);
            }
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf3 = Boolean.valueOf(z2);
        }
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = Address.CREATOR.createFromParcel(parcel);
        }
        return new AddressPageStarter.AddressEditEnterParams(arrayList, address, readString, readString2, valueOf, valueOf2, inputItemData, z, readInt2, readString3, readString4, arrayList2, createStringArrayList, readString5, readString6, valueOf3, createFromParcel3);
    }

    @Override // android.os.Parcelable.Creator
    public final AddressPageStarter.AddressEditEnterParams[] newArray(int i) {
        return new AddressPageStarter.AddressEditEnterParams[i];
    }
}

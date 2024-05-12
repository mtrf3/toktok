package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressRightsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AmE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27218AmE implements Parcelable.Creator<InputItemData> {
    @Override // android.os.Parcelable.Creator
    public final InputItemData createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Region createFromParcel;
        ClientConfig createFromParcel2;
        LinkRichText createFromParcel3;
        AddressLocation createFromParcel4;
        o.LJIIIZ(parcel, "parcel");
        AddressRightsInfo addressRightsInfo = null;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(InputItemDTO.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Region.CREATOR.createFromParcel(parcel);
        }
        Region region = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = ClientConfig.CREATOR.createFromParcel(parcel);
        }
        ClientConfig clientConfig = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        LinkRichText linkRichText = createFromParcel3;
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = AddressLocation.CREATOR.createFromParcel(parcel);
        }
        AddressLocation addressLocation = createFromParcel4;
        if (parcel.readInt() != 0) {
            addressRightsInfo = AddressRightsInfo.CREATOR.createFromParcel(parcel);
        }
        return new InputItemData(arrayList, region, clientConfig, linkRichText, addressLocation, addressRightsInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final InputItemData[] newArray(int i) {
        return new InputItemData[i];
    }
}

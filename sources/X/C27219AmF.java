package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressRightsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import kotlin.jvm.internal.o;

/* renamed from: X.AmF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27219AmF implements Parcelable.Creator<AddressRightsInfo> {
    @Override // android.os.Parcelable.Creator
    public final AddressRightsInfo createFromParcel(Parcel parcel) {
        LinkRichText createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        Icon icon = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        LinkRichText linkRichText = createFromParcel;
        if (parcel.readInt() != 0) {
            icon = Icon.CREATOR.createFromParcel(parcel);
        }
        return new AddressRightsInfo(linkRichText, icon, parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AddressRightsInfo[] newArray(int i) {
        return new AddressRightsInfo[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticAddressInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Akp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27131Akp implements Parcelable.Creator<PDPLogisticAddressInfo> {
    @Override // android.os.Parcelable.Creator
    public final PDPLogisticAddressInfo createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        Icon createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        LinkRichText linkRichText = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon2 = createFromParcel2;
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            linkRichText = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        return new PDPLogisticAddressInfo(icon, readString, icon2, readString2, linkRichText);
    }

    @Override // android.os.Parcelable.Creator
    public final PDPLogisticAddressInfo[] newArray(int i) {
        return new PDPLogisticAddressInfo[i];
    }
}

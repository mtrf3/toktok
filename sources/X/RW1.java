package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPoint;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RW1 implements Parcelable.Creator<DynamicSellingPoint> {
    @Override // android.os.Parcelable.Creator
    public final DynamicSellingPoint createFromParcel(Parcel parcel) {
        LinkRichText createFromParcel;
        CommonColor createFromParcel2;
        o.LJIIIZ(parcel, "parcel");
        Integer num = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
        }
        LinkRichText linkRichText = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = CommonColor.CREATOR.createFromParcel(parcel);
        }
        CommonColor commonColor = createFromParcel2;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        return new DynamicSellingPoint(linkRichText, commonColor, readString, readString2, num);
    }

    @Override // android.os.Parcelable.Creator
    public final DynamicSellingPoint[] newArray(int i) {
        return new DynamicSellingPoint[i];
    }
}

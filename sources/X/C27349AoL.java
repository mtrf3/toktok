package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SelfOperatedSloganInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.AoL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27349AoL implements Parcelable.Creator<SelfOperatedSloganInfo> {
    @Override // android.os.Parcelable.Creator
    public final SelfOperatedSloganInfo createFromParcel(Parcel parcel) {
        Icon createFromParcel;
        CommonColor createFromParcel2;
        LinkText createFromParcel3;
        LinkText createFromParcel4;
        o.LJIIIZ(parcel, "parcel");
        Image image = (Image) parcel.readParcelable(SelfOperatedSloganInfo.class.getClassLoader());
        CommonColor commonColor = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = Icon.CREATOR.createFromParcel(parcel);
        }
        Icon icon = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = CommonColor.CREATOR.createFromParcel(parcel);
        }
        CommonColor commonColor2 = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = LinkText.CREATOR.createFromParcel(parcel);
        }
        LinkText linkText = createFromParcel3;
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = LinkText.CREATOR.createFromParcel(parcel);
        }
        LinkText linkText2 = createFromParcel4;
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            commonColor = CommonColor.CREATOR.createFromParcel(parcel);
        }
        return new SelfOperatedSloganInfo(image, icon, commonColor2, linkText, linkText2, readString, commonColor);
    }

    @Override // android.os.Parcelable.Creator
    public final SelfOperatedSloganInfo[] newArray(int i) {
        return new SelfOperatedSloganInfo[i];
    }
}

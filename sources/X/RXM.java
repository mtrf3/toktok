package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SellerInfoBrickVO;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXM implements Parcelable.Creator<SellerInfoBrickVO> {
    @Override // android.os.Parcelable.Creator
    public final SellerInfoBrickVO createFromParcel(Parcel parcel) {
        CommonData createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        BrickInfo createFromParcel2 = BrickInfo.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = CommonData.CREATOR.createFromParcel(parcel);
        }
        return new SellerInfoBrickVO(createFromParcel2, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final SellerInfoBrickVO[] newArray(int i) {
        return new SellerInfoBrickVO[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.HeaderBrickVO;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXL implements Parcelable.Creator<HeaderBrickVO> {
    @Override // android.os.Parcelable.Creator
    public final HeaderBrickVO createFromParcel(Parcel parcel) {
        CommonData createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        BrickInfo createFromParcel2 = BrickInfo.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = CommonData.CREATOR.createFromParcel(parcel);
        }
        return new HeaderBrickVO(createFromParcel2, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final HeaderBrickVO[] newArray(int i) {
        return new HeaderBrickVO[i];
    }
}

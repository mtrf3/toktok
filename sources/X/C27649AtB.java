package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescBrickVO;
import kotlin.jvm.internal.o;

/* renamed from: X.AtB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27649AtB implements Parcelable.Creator<ProductDescBrickVO> {
    @Override // android.os.Parcelable.Creator
    public final ProductDescBrickVO createFromParcel(Parcel parcel) {
        CommonData createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        BrickInfo createFromParcel2 = BrickInfo.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = CommonData.CREATOR.createFromParcel(parcel);
        }
        return new ProductDescBrickVO(createFromParcel2, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ProductDescBrickVO[] newArray(int i) {
        return new ProductDescBrickVO[i];
    }
}

package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescTextBrickVO;
import kotlin.jvm.internal.o;

/* renamed from: X.AtE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27652AtE implements Parcelable.Creator<ProductDescTextBrickVO> {
    @Override // android.os.Parcelable.Creator
    public final ProductDescTextBrickVO createFromParcel(Parcel parcel) {
        CommonData createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        BrickInfo createFromParcel2 = BrickInfo.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = CommonData.CREATOR.createFromParcel(parcel);
        }
        return new ProductDescTextBrickVO(createFromParcel2, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ProductDescTextBrickVO[] newArray(int i) {
        return new ProductDescTextBrickVO[i];
    }
}
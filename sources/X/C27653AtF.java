package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescVideoBrickVO;
import kotlin.jvm.internal.o;

/* renamed from: X.AtF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27653AtF implements Parcelable.Creator<ProductDescVideoBrickVO> {
    @Override // android.os.Parcelable.Creator
    public final ProductDescVideoBrickVO createFromParcel(Parcel parcel) {
        CommonData createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        BrickInfo createFromParcel2 = BrickInfo.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = CommonData.CREATOR.createFromParcel(parcel);
        }
        return new ProductDescVideoBrickVO(createFromParcel2, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ProductDescVideoBrickVO[] newArray(int i) {
        return new ProductDescVideoBrickVO[i];
    }
}

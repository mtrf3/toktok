package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C27650AtC;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDescImageBrickVO extends ProductDescBrickVO {
    public static final Parcelable.Creator<ProductDescImageBrickVO> CREATOR = new C27650AtC();
    public final BrickInfo brickInfo;
    public final CommonData commonData;
    public Image image;
    public Float realHeight;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescBrickVO, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.brickInfo.writeToParcel(out, i);
        CommonData commonData = this.commonData;
        if (commonData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            commonData.writeToParcel(out, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescBrickVO, X.AbstractC27664AtQ
    public final int hashCode() {
        return super.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescBrickVO, X.AbstractC27664AtQ
    public final BrickInfo LJ() {
        return this.brickInfo;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescBrickVO, X.AbstractC27664AtQ
    public final CommonData LJIIIIZZ() {
        return this.commonData;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescBrickVO, X.AbstractC27664AtQ
    public final boolean equals(Object obj) {
        ProductDescImageBrickVO productDescImageBrickVO;
        if (!(obj instanceof ProductDescImageBrickVO) || (productDescImageBrickVO = (ProductDescImageBrickVO) obj) == null) {
            return super.equals(obj);
        }
        if (super.equals(obj) && o.LJ(productDescImageBrickVO.image, this.image)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDescImageBrickVO(BrickInfo brickInfo, CommonData commonData) {
        super(brickInfo, commonData);
        o.LJIIIZ(brickInfo, "brickInfo");
        this.brickInfo = brickInfo;
        this.commonData = commonData;
        this.image = new Image(null, null, null, null, null, null, null);
    }
}

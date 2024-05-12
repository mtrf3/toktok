package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C27651AtD;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDescSpecBrickVO extends ProductDescBrickVO {
    public static final Parcelable.Creator<ProductDescSpecBrickVO> CREATOR = new C27651AtD();
    public final BrickInfo brickInfo;
    public final CommonData commonData;
    public boolean needShowMore;
    public List<Specification> specifications;
    public int style;

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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescBrickVO
    public final int LJIIL() {
        return this.style;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescBrickVO, X.AbstractC27664AtQ
    public final boolean equals(Object obj) {
        ProductDescSpecBrickVO productDescSpecBrickVO;
        if (!(obj instanceof ProductDescSpecBrickVO) || (productDescSpecBrickVO = (ProductDescSpecBrickVO) obj) == null) {
            return super.equals(obj);
        }
        if (super.equals(obj) && o.LJ(productDescSpecBrickVO.specifications, this.specifications) && productDescSpecBrickVO.needShowMore == this.needShowMore) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDescSpecBrickVO(BrickInfo brickInfo, CommonData commonData) {
        super(brickInfo, commonData);
        o.LJIIIZ(brickInfo, "brickInfo");
        this.brickInfo = brickInfo;
        this.commonData = commonData;
        this.style = 2;
        this.specifications = new ArrayList();
        this.needShowMore = true;
    }
}
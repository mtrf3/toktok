package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C221108m2;
import X.C27652AtE;
import X.C27657AtJ;
import X.C45804HyK;
import X.C5H3;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDescTextBrickVO extends ProductDescBrickVO {
    public static final float SUB_TITLE_PADDING_TOP;
    public static final float TEXT_PADDING_BOTTOM;
    public static final float TEXT_PADDING_TOP;
    public static final float TITLE_PADDING_TOP;
    public final BrickInfo brickInfo;
    public final CommonData commonData;
    public int index;
    public final C5H3 padding$delegate;
    public Float realHeight;
    public String text;
    public final C5H3 textColor$delegate;
    public final C5H3 tuxFont$delegate;
    public static final C27657AtJ Companion = new C27657AtJ();
    public static final Parcelable.Creator<ProductDescTextBrickVO> CREATOR = new C27652AtE();
    public static final float SUB_TITLE_PADDING_BOTTOM = C45804HyK.LJJ(8);

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

    static {
        float f = 16;
        TITLE_PADDING_TOP = C45804HyK.LJJ(f);
        SUB_TITLE_PADDING_TOP = C45804HyK.LJJ(f);
        float f2 = 0;
        TEXT_PADDING_TOP = C45804HyK.LJJ(f2);
        TEXT_PADDING_BOTTOM = C45804HyK.LJJ(f2);
    }

    public final Padding LJIILL() {
        return (Padding) this.padding$delegate.getValue();
    }

    public final int LJIILLIIL() {
        return ((Number) this.textColor$delegate.getValue()).intValue();
    }

    public final int LJIIZILJ() {
        return ((Number) this.tuxFont$delegate.getValue()).intValue();
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
        ProductDescTextBrickVO productDescTextBrickVO;
        if (!(obj instanceof ProductDescTextBrickVO) || (productDescTextBrickVO = (ProductDescTextBrickVO) obj) == null) {
            return super.equals(obj);
        }
        if (super.equals(obj) && o.LJ(productDescTextBrickVO.text, this.text)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDescTextBrickVO(BrickInfo brickInfo, CommonData commonData) {
        super(brickInfo, commonData);
        o.LJIIIZ(brickInfo, "brickInfo");
        this.brickInfo = brickInfo;
        this.commonData = commonData;
        this.text = "";
        this.padding$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 292));
        this.tuxFont$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 294));
        this.textColor$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 293));
    }

    public final void LJIJ(int i, int i2, String text) {
        o.LJIIIZ(text, "text");
        this.text = text;
        this.index = i2;
        LJIILIIL(i);
    }
}

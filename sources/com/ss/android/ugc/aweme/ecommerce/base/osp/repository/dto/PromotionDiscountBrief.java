package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PromotionDiscountBrief {

    @InterfaceC65349Pkn("discount_info")
    public final ExceptionUX discountInfo;

    @InterfaceC65349Pkn("discount_text")
    public final ColorText discountText;

    @InterfaceC65349Pkn("discount_title")
    public final String discountTitle;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionDiscountBrief)) {
            return false;
        }
        PromotionDiscountBrief promotionDiscountBrief = (PromotionDiscountBrief) obj;
        return o.LJ(this.discountTitle, promotionDiscountBrief.discountTitle) && o.LJ(this.discountText, promotionDiscountBrief.discountText) && o.LJ(this.discountInfo, promotionDiscountBrief.discountInfo);
    }

    public final int hashCode() {
        String str = this.discountTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ColorText colorText = this.discountText;
        int hashCode2 = (hashCode + (colorText == null ? 0 : colorText.hashCode())) * 31;
        ExceptionUX exceptionUX = this.discountInfo;
        return hashCode2 + (exceptionUX != null ? exceptionUX.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromotionDiscountBrief(discountTitle=");
        LIZ.append(this.discountTitle);
        LIZ.append(", discountText=");
        LIZ.append(this.discountText);
        LIZ.append(", discountInfo=");
        LIZ.append(this.discountInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PromotionDiscountBrief(String str, ColorText colorText, ExceptionUX exceptionUX) {
        this.discountTitle = str;
        this.discountText = colorText;
        this.discountInfo = exceptionUX;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighLightPromotionInfo {

    @InterfaceC65349Pkn("discount_desc")
    public final String discountDesc;

    @InterfaceC65349Pkn("discount_icon")
    public final Icon discountIcon;

    @InterfaceC65349Pkn("discount_text")
    public final String discountText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighLightPromotionInfo)) {
            return false;
        }
        HighLightPromotionInfo highLightPromotionInfo = (HighLightPromotionInfo) obj;
        return o.LJ(this.discountIcon, highLightPromotionInfo.discountIcon) && o.LJ(this.discountText, highLightPromotionInfo.discountText) && o.LJ(this.discountDesc, highLightPromotionInfo.discountDesc);
    }

    public final int hashCode() {
        Icon icon = this.discountIcon;
        int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.discountText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discountDesc;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighLightPromotionInfo(discountIcon=");
        LIZ.append(this.discountIcon);
        LIZ.append(", discountText=");
        LIZ.append(this.discountText);
        LIZ.append(", discountDesc=");
        return q.LIZIZ(LIZ, this.discountDesc, ')', LIZ);
    }

    public HighLightPromotionInfo(Icon icon, String str, String str2) {
        this.discountIcon = icon;
        this.discountText = str;
        this.discountDesc = str2;
    }
}

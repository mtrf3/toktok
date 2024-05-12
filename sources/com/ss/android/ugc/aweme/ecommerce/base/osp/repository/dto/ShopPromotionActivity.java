package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShopPromotionActivity {

    @InterfaceC65349Pkn("bg_img")
    public final Image bgImg;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("left_icon")
    public final Image leftIcon;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopPromotionActivity)) {
            return false;
        }
        ShopPromotionActivity shopPromotionActivity = (ShopPromotionActivity) obj;
        return o.LJ(this.desc, shopPromotionActivity.desc) && o.LJ(this.leftIcon, shopPromotionActivity.leftIcon) && o.LJ(this.bgImg, shopPromotionActivity.bgImg);
    }

    public final int hashCode() {
        String str = this.desc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.leftIcon;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.bgImg;
        return hashCode2 + (image2 != null ? image2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopPromotionActivity(desc=");
        LIZ.append(this.desc);
        LIZ.append(", leftIcon=");
        LIZ.append(this.leftIcon);
        LIZ.append(", bgImg=");
        LIZ.append(this.bgImg);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ShopPromotionActivity(String str, Image image, Image image2) {
        this.desc = str;
        this.leftIcon = image;
        this.bgImg = image2;
    }
}

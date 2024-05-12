package com.ss.android.ugc.aweme.ecommercelive.common.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PromotionSkin {

    @InterfaceC65349Pkn("image")
    public final GImage image;

    @InterfaceC65349Pkn("promotion_id")
    public final String promotionId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionSkin)) {
            return false;
        }
        PromotionSkin promotionSkin = (PromotionSkin) obj;
        return o.LJ(this.image, promotionSkin.image) && o.LJ(this.promotionId, promotionSkin.promotionId);
    }

    public final int hashCode() {
        GImage gImage = this.image;
        int hashCode = (gImage == null ? 0 : gImage.hashCode()) * 31;
        String str = this.promotionId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromotionSkin(image=");
        LIZ.append(this.image);
        LIZ.append(", promotionId=");
        return q.LIZIZ(LIZ, this.promotionId, ')', LIZ);
    }

    public PromotionSkin(GImage gImage, String str) {
        this.image = gImage;
        this.promotionId = str;
    }
}

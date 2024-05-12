package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RelationProductData {

    @InterfaceC65349Pkn("product_logo")
    public final Image productLogo;

    @InterfaceC65349Pkn("product_id")
    public final String product_id;

    @InterfaceC65349Pkn("video_timestamp")
    public final int videoTimestamp;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelationProductData)) {
            return false;
        }
        RelationProductData relationProductData = (RelationProductData) obj;
        return o.LJ(this.product_id, relationProductData.product_id) && this.videoTimestamp == relationProductData.videoTimestamp && o.LJ(this.productLogo, relationProductData.productLogo);
    }

    public final int hashCode() {
        String str = this.product_id;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.videoTimestamp) * 31;
        Image image = this.productLogo;
        return hashCode + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelationProductData(product_id=");
        LIZ.append(this.product_id);
        LIZ.append(", videoTimestamp=");
        LIZ.append(this.videoTimestamp);
        LIZ.append(", productLogo=");
        LIZ.append(this.productLogo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public RelationProductData(String str, int i, Image image) {
        this.product_id = str;
        this.videoTimestamp = i;
        this.productLogo = image;
    }
}

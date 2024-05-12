package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class AnchorsExtras implements Serializable {

    @InterfaceC65349Pkn("ad_label")
    public AdLabel adLabel;

    @InterfaceC65349Pkn("product_cnt")
    public Integer productCnt;

    @InterfaceC65349Pkn("tips")
    public Tips tips;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorsExtras(tips=");
        LIZ.append(this.tips);
        LIZ.append(", adLabel=");
        LIZ.append(this.adLabel);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final AdLabel getAdLabel() {
        return this.adLabel;
    }

    public final Integer getProductCnt() {
        return this.productCnt;
    }

    public final Tips getTips() {
        return this.tips;
    }

    public final void setAdLabel(AdLabel adLabel) {
        this.adLabel = adLabel;
    }

    public final void setProductCnt(Integer num) {
        this.productCnt = num;
    }

    public final void setTips(Tips tips) {
        this.tips = tips;
    }
}

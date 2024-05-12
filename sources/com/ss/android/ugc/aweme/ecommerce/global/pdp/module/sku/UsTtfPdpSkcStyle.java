package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku;

import X.C7MY;

/* loaded from: classes7.dex */
public final class UsTtfPdpSkcStyle extends UkTtfPdpSkcStyle {
    public final boolean hasLowStockWarnings;
    public final boolean noStockIsEnable = true;
    public final int firstSpecMarginTop = C7MY.LIZIZ(0);

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.UkTtfPdpSkcStyle, com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.ITtfSkcStyle
    public int getFirstSpecMarginTop() {
        return this.firstSpecMarginTop;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.UkTtfPdpSkcStyle, com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.ITtfSkcStyle
    public boolean getHasLowStockWarnings() {
        return this.hasLowStockWarnings;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.UkTtfPdpSkcStyle, com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.ITtfSkcStyle
    public boolean getNoStockIsEnable() {
        return this.noStockIsEnable;
    }
}

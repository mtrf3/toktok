package com.ss.android.ugc.aweme.ecommerce.ttf.sku.uk;

import X.C7MY;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.ITtfSkcStyle;

/* loaded from: classes7.dex */
public final class UkTtfSkcPanelStyle implements ITtfSkcStyle {
    public final boolean hasLowStockWarnings = true;
    public final boolean noStockIsEnable = true;
    public final int firstSpecMarginTop = C7MY.LIZIZ(24);

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.ITtfSkcStyle
    public int getFirstSpecMarginTop() {
        return this.firstSpecMarginTop;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.ITtfSkcStyle
    public boolean getHasLowStockWarnings() {
        return this.hasLowStockWarnings;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.ITtfSkcStyle
    public boolean getNoStockIsEnable() {
        return this.noStockIsEnable;
    }
}

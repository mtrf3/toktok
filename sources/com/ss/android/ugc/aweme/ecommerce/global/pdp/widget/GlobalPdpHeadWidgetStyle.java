package com.ss.android.ugc.aweme.ecommerce.global.pdp.widget;

import X.C45804HyK;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class GlobalPdpHeadWidgetStyle implements IPdpHeaderWidgetStyle {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public boolean getHideTab() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public int getSearchBoxSolidRes() {
        return R.attr.cg;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public boolean isShowShareBtn() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public boolean isShowShopInfo() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public boolean isShowSingleSearchBtn() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public float getSearchBoxRadius() {
        return C45804HyK.LJJ(8);
    }
}

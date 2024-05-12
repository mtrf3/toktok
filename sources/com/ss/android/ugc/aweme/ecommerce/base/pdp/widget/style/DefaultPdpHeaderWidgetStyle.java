package com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style;

import X.C45804HyK;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class DefaultPdpHeaderWidgetStyle implements IPdpHeaderWidgetStyle {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public boolean getHideTab() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public float getSearchBoxRadius() {
        return C45804HyK.LJJ(2);
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
}

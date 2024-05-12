package com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.widget;

import X.C45804HyK;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class UsPdpHeadWidgetStyle implements IPdpHeaderWidgetStyle {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public boolean getHideTab() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public int getSearchBoxSolidRes() {
        return R.attr.cg;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public boolean isShowShareBtn() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public boolean isShowShopInfo() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public boolean isShowSingleSearchBtn() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle
    public float getSearchBoxRadius() {
        return C45804HyK.LJJ(8);
    }
}

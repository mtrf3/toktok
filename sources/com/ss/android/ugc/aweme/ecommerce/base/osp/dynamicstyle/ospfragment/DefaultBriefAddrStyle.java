package com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospfragment;

import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class DefaultBriefAddrStyle implements IOspFragmentStyle {
    public int briefAddrFont = 81;
    public int pageTitle = R.string.r_1;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospfragment.IOspFragmentStyle
    public boolean getShowBriefAddrBar() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospfragment.IOspFragmentStyle
    public int getBriefAddrFont() {
        return this.briefAddrFont;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospfragment.IOspFragmentStyle
    public int getPageTitle() {
        return this.pageTitle;
    }

    public void setBriefAddrFont(int i) {
        this.briefAddrFont = i;
    }

    public void setPageTitle(int i) {
        this.pageTitle = i;
    }
}

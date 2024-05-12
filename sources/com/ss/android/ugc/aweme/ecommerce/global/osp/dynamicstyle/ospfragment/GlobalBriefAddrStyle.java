package com.ss.android.ugc.aweme.ecommerce.global.osp.dynamicstyle.ospfragment;

import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospfragment.IOspFragmentStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class GlobalBriefAddrStyle implements IOspFragmentStyle {
    public int briefAddrFont = 71;
    public int pageTitle = R.string.fcg;

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

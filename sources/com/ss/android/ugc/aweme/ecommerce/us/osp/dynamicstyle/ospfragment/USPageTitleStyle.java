package com.ss.android.ugc.aweme.ecommerce.us.osp.dynamicstyle.ospfragment;

import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospfragment.IOspFragmentStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class USPageTitleStyle implements IOspFragmentStyle {
    public int briefAddrFont = 71;
    public int pageTitle = R.string.fcg;
    public boolean showBriefAddrBar;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospfragment.IOspFragmentStyle
    public int getBriefAddrFont() {
        return this.briefAddrFont;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospfragment.IOspFragmentStyle
    public int getPageTitle() {
        return this.pageTitle;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospfragment.IOspFragmentStyle
    public boolean getShowBriefAddrBar() {
        return this.showBriefAddrBar;
    }

    public void setBriefAddrFont(int i) {
        this.briefAddrFont = i;
    }

    public void setPageTitle(int i) {
        this.pageTitle = i;
    }

    public void setShowBriefAddrBar(boolean z) {
        this.showBriefAddrBar = z;
    }
}

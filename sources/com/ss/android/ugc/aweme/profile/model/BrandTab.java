package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class BrandTab implements Serializable {

    @InterfaceC65349Pkn("industry_type")
    public int industryType;

    @InterfaceC65349Pkn("show_brand_tab")
    public boolean showBrandTab;

    @InterfaceC65349Pkn("title")
    public String title;

    public int getIndustryType() {
        return this.industryType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowBrandTab() {
        return this.showBrandTab;
    }

    public void setIndustryType(int i) {
        this.industryType = i;
    }

    public void setShowBrandTab(boolean z) {
        this.showBrandTab = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}

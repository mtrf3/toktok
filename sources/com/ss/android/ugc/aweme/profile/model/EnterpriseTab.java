package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class EnterpriseTab implements Serializable {

    @InterfaceC65349Pkn("show_tab_settings")
    public boolean showTabSettings;

    @InterfaceC65349Pkn("tab_link")
    public String tabLink;

    @InterfaceC65349Pkn("tab_type")
    public int tabType;

    @InterfaceC65349Pkn("title")
    public String title;

    public String getTabLink() {
        return this.tabLink;
    }

    public int getTabType() {
        return this.tabType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowTabSettings() {
        return this.showTabSettings;
    }

    public void setShowTabSettings(boolean z) {
        this.showTabSettings = z;
    }

    public void setTabLink(String str) {
        this.tabLink = str;
    }

    public void setTabType(int i) {
        this.tabType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}

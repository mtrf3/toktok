package com.bytedance.sdk.xbridge.runtime.depend;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class PageTitleBar extends F9E {
    public final Integer disableNavBarBackButton;
    public final Boolean hideNavBar;
    public final String navBarColor;
    public final String navBtnType;
    public final String title;
    public final String titleColor;

    /* JADX WARN: Multi-variable type inference failed */
    public PageTitleBar() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PageTitleBar copy$default(PageTitleBar pageTitleBar, String str, String str2, String str3, Integer num, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageTitleBar.title;
        }
        if ((i & 2) != 0) {
            str2 = pageTitleBar.titleColor;
        }
        if ((i & 4) != 0) {
            str3 = pageTitleBar.navBarColor;
        }
        if ((i & 8) != 0) {
            num = pageTitleBar.disableNavBarBackButton;
        }
        if ((i & 16) != 0) {
            str4 = pageTitleBar.navBtnType;
        }
        if ((i & 32) != 0) {
            bool = pageTitleBar.hideNavBar;
        }
        return pageTitleBar.copy(str, str2, str3, num, str4, bool);
    }

    public final PageTitleBar copy(String str, String str2, String str3, Integer num, String str4, Boolean bool) {
        return new PageTitleBar(str, str2, str3, num, str4, bool);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.title, this.titleColor, this.navBarColor, this.disableNavBarBackButton, this.navBtnType, this.hideNavBar};
    }

    public final Integer getDisableNavBarBackButton() {
        return this.disableNavBarBackButton;
    }

    public final Boolean getHideNavBar() {
        return this.hideNavBar;
    }

    public final String getNavBarColor() {
        return this.navBarColor;
    }

    public final String getNavBtnType() {
        return this.navBtnType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public PageTitleBar(String str, String str2, String str3, Integer num, String str4, Boolean bool) {
        this.title = str;
        this.titleColor = str2;
        this.navBarColor = str3;
        this.disableNavBarBackButton = num;
        this.navBtnType = str4;
        this.hideNavBar = bool;
    }

    public /* synthetic */ PageTitleBar(String str, String str2, String str3, Integer num, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? bool : null);
    }
}

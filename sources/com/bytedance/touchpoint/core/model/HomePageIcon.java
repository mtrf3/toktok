package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class HomePageIcon extends C95U {

    @InterfaceC65349Pkn("background_color")
    public String bgColor;

    @InterfaceC65349Pkn("display_cash_amount")
    public Title displayCashAmount;

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("jump_link")
    public String jumpLink;

    @InterfaceC65349Pkn("notification_name")
    public final String notificationName;

    public final Object[] LIZIZ() {
        return new Object[]{this.iconUrl, this.jumpLink, this.displayCashAmount, this.bgColor, this.notificationName};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomePageIcon) {
            return C78966Uyw.LJIIIZ(((HomePageIcon) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("HomePageIcon:%s,%s,%s,%s,%s", LIZIZ());
    }

    public HomePageIcon(String str, String str2, Title title, String str3, String str4) {
        this.iconUrl = str;
        this.jumpLink = str2;
        this.displayCashAmount = title;
        this.bgColor = str3;
        this.notificationName = str4;
    }
}

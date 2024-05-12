package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileActivityIcon extends C95U {

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("profile_activity_button_list")
    public List<ProfileActivityButton> profileActivityButtons;

    @InterfaceC65349Pkn("tab_bubble_text")
    public String tabBubbleText;

    public final Object[] LIZIZ() {
        return new Object[]{this.iconUrl, this.tabBubbleText, this.profileActivityButtons};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileActivityIcon) {
            return C78966Uyw.LJIIIZ(((ProfileActivityIcon) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("ProfileActivityIcon:%s,%s,%s", LIZIZ());
    }

    public ProfileActivityIcon(String iconUrl, String tabBubbleText, List<ProfileActivityButton> list) {
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(tabBubbleText, "tabBubbleText");
        this.iconUrl = iconUrl;
        this.tabBubbleText = tabBubbleText;
        this.profileActivityButtons = list;
    }
}

package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InviteBanner extends C95U {

    @InterfaceC65349Pkn("background_color")
    public String bgColor;

    @InterfaceC65349Pkn("background_colors")
    public List<String> bgColors;

    @InterfaceC65349Pkn("bottom_image")
    public final String bottomImage;

    @InterfaceC65349Pkn("button_url")
    public final String buttonUrl;

    @InterfaceC65349Pkn("click_action_type")
    public final int clickActionType;

    @InterfaceC65349Pkn("multi_show_count")
    public final int count;

    @InterfaceC65349Pkn("gradient_type")
    public final int gradientType;

    @InterfaceC65349Pkn("highlight_subtitle")
    public final Title highlightSubTitle;

    @InterfaceC65349Pkn("jump_link")
    public String jumpLink;

    @InterfaceC65349Pkn("left_image")
    public String leftImage;

    @InterfaceC65349Pkn("locations")
    public final List<Float> locations;

    @InterfaceC65349Pkn("need_age_gate")
    public final Boolean needAgeGate;

    @InterfaceC65349Pkn("notification_id")
    public final String notificationId;

    @InterfaceC65349Pkn("notification_name")
    public final String notificationName;

    @InterfaceC65349Pkn("right_image")
    public String rightImage;

    @InterfaceC65349Pkn("share_panel_info")
    public final SharePanelData sharePanelInfo;

    @InterfaceC65349Pkn("subtitle")
    public Title subTitle;

    @InterfaceC65349Pkn("title")
    public Title title;

    public final Object[] LIZIZ() {
        return new Object[]{this.leftImage, this.rightImage, this.jumpLink, this.title, this.subTitle, this.sharePanelInfo, Integer.valueOf(this.gradientType), this.locations, this.buttonUrl, this.needAgeGate, this.bgColors, this.bgColor, this.highlightSubTitle, this.bottomImage, Integer.valueOf(this.count), Integer.valueOf(this.clickActionType), this.notificationId, this.notificationName};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InviteBanner) {
            return C78966Uyw.LJIIIZ(((InviteBanner) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("InviteBanner:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public InviteBanner(String leftImage, String str, String jumpLink, Title title, Title subTitle, SharePanelData sharePanelData, int i, List<Float> list, String buttonUrl, Boolean bool, List<String> bgColors, String bgColor, Title title2, String str2, int i2, int i3, String notificationId, String notificationName) {
        o.LJIIIZ(leftImage, "leftImage");
        o.LJIIIZ(jumpLink, "jumpLink");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(subTitle, "subTitle");
        o.LJIIIZ(buttonUrl, "buttonUrl");
        o.LJIIIZ(bgColors, "bgColors");
        o.LJIIIZ(bgColor, "bgColor");
        o.LJIIIZ(notificationId, "notificationId");
        o.LJIIIZ(notificationName, "notificationName");
        this.leftImage = leftImage;
        this.rightImage = str;
        this.jumpLink = jumpLink;
        this.title = title;
        this.subTitle = subTitle;
        this.sharePanelInfo = sharePanelData;
        this.gradientType = i;
        this.locations = list;
        this.buttonUrl = buttonUrl;
        this.needAgeGate = bool;
        this.bgColors = bgColors;
        this.bgColor = bgColor;
        this.highlightSubTitle = title2;
        this.bottomImage = str2;
        this.count = i2;
        this.clickActionType = i3;
        this.notificationId = notificationId;
        this.notificationName = notificationName;
    }

    public /* synthetic */ InviteBanner(String str, String str2, String str3, Title title, Title title2, SharePanelData sharePanelData, int i, List list, String str4, Boolean bool, List list2, String str5, Title title3, String str6, int i2, int i3, String str7, String str8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2, str3, title, title2, (i4 & 32) != 0 ? null : sharePanelData, (i4 & 64) != 0 ? 0 : i, list, str4, (i4 & 512) != 0 ? null : bool, list2, str5, (i4 & 4096) != 0 ? null : title3, (i4 & FileUtils.BUFFER_SIZE) == 0 ? str6 : null, i2, (i4 & 32768) != 0 ? 0 : i3, str7, str8);
    }
}

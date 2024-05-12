package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class NowTabIcon extends C95U {

    @InterfaceC65349Pkn("bubble_daily_limit")
    public final Integer daily_limit;

    @InterfaceC65349Pkn("bubble")
    public final IconBubble iconBubble;

    @InterfaceC65349Pkn("icon_image")
    public final String iconImage;

    @InterfaceC65349Pkn("icon_lottie")
    public final String iconLottie;

    @InterfaceC65349Pkn("jump_link")
    public final String jumpLink;

    @InterfaceC65349Pkn("need_age_gate")
    public final Boolean needAgeGate;

    @InterfaceC65349Pkn("notification_name")
    public final String notificationName;

    public final Object[] LIZIZ() {
        return new Object[]{this.iconImage, this.iconLottie, this.jumpLink, this.daily_limit, this.iconBubble, this.needAgeGate, this.notificationName};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NowTabIcon) {
            return C78966Uyw.LJIIIZ(((NowTabIcon) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("NowTabIcon:%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public NowTabIcon(String str, String str2, String str3, Integer num, IconBubble iconBubble, Boolean bool, String str4) {
        this.iconImage = str;
        this.iconLottie = str2;
        this.jumpLink = str3;
        this.daily_limit = num;
        this.iconBubble = iconBubble;
        this.needAgeGate = bool;
        this.notificationName = str4;
    }

    public /* synthetic */ NowTabIcon(String str, String str2, String str3, Integer num, IconBubble iconBubble, Boolean bool, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? 0 : num, iconBubble, (i & 32) != 0 ? null : bool, str4);
    }
}

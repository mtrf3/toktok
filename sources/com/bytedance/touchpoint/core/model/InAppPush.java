package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class InAppPush extends C95U {

    @InterfaceC65349Pkn("background_color")
    public String bgColor;

    @InterfaceC65349Pkn("button")
    public Button button;

    @InterfaceC65349Pkn("content")
    public Content content;

    @InterfaceC65349Pkn("control")
    public Control control;

    @InterfaceC65349Pkn("icon")
    public String icon;

    @InterfaceC65349Pkn("inapp_push_id")
    public Integer inAppPushId;

    @InterfaceC65349Pkn("inapp_push_name")
    public String inAppPushName;

    @InterfaceC65349Pkn("jump_link")
    public String jumpLink;

    @InterfaceC65349Pkn("tasks")
    public String taskIds;

    public final Object[] LIZIZ() {
        return new Object[]{this.inAppPushId, this.inAppPushName, this.taskIds, this.bgColor, this.icon, this.jumpLink, this.content, this.button, this.control};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InAppPush) {
            return C78966Uyw.LJIIIZ(((InAppPush) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("InAppPush:%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public InAppPush(Integer num, String str, String str2, String str3, String str4, String str5, Content content, Button button, Control control) {
        this.inAppPushId = num;
        this.inAppPushName = str;
        this.taskIds = str2;
        this.bgColor = str3;
        this.icon = str4;
        this.jumpLink = str5;
        this.content = content;
        this.button = button;
        this.control = control;
    }
}

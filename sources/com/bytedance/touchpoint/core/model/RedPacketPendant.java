package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RedPacketPendant extends C95U {
    public String LJI;

    @InterfaceC65349Pkn("bottom_text")
    public Title bottomText;

    @InterfaceC65349Pkn("bottom_text_bg_color")
    public String bottomTextBgColor;

    @InterfaceC65349Pkn("disappear_countdown")
    public Integer disappearCountDown;

    @InterfaceC65349Pkn("notification_name")
    public String notificationName;

    @InterfaceC65349Pkn("pendant_pic")
    public String pendantPic;

    @InterfaceC65349Pkn("popup_view")
    public DynamicDialog popup;

    public final Object[] LIZIZ() {
        return new Object[]{this.pendantPic, this.bottomText, this.bottomTextBgColor, this.disappearCountDown, this.popup, this.notificationName};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RedPacketPendant) {
            return C78966Uyw.LJIIIZ(((RedPacketPendant) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("RedPacketPendant:%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public RedPacketPendant(String pendantPic, Title title, String str, Integer num, DynamicDialog dynamicDialog, String notificationName) {
        o.LJIIIZ(pendantPic, "pendantPic");
        o.LJIIIZ(notificationName, "notificationName");
        this.pendantPic = pendantPic;
        this.bottomText = title;
        this.bottomTextBgColor = str;
        this.disappearCountDown = num;
        this.popup = dynamicDialog;
        this.notificationName = notificationName;
    }

    public /* synthetic */ RedPacketPendant(String str, Title title, String str2, Integer num, DynamicDialog dynamicDialog, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, title, str2, num, dynamicDialog, (i & 32) == 0 ? str3 : "");
    }
}

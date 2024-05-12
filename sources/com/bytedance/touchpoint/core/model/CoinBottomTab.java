package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class CoinBottomTab extends C95U {

    @InterfaceC65349Pkn("icon_url")
    public String iconURL;

    @InterfaceC65349Pkn("jump_link")
    public String jumpLink;

    @InterfaceC65349Pkn("need_login_gate")
    public boolean needLoginGate;

    @InterfaceC65349Pkn("notification_name")
    public String notificationName;

    @InterfaceC65349Pkn("title")
    public Title title;

    public final Object[] LIZIZ() {
        return new Object[]{this.iconURL, this.jumpLink, this.notificationName, this.title, Boolean.valueOf(this.needLoginGate)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CoinBottomTab) {
            return C78966Uyw.LJIIIZ(((CoinBottomTab) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("CoinBottomTab:%s,%s,%s,%s,%s", LIZIZ());
    }

    public CoinBottomTab(String str, String str2, String str3, Title title, boolean z) {
        HH1.LIZ(str, "iconURL", str2, "jumpLink", str3, "notificationName");
        this.iconURL = str;
        this.jumpLink = str2;
        this.notificationName = str3;
        this.title = title;
        this.needLoginGate = z;
    }

    public /* synthetic */ CoinBottomTab(String str, String str2, String str3, Title title, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", title, (i & 16) != 0 ? false : z);
    }
}

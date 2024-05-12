package com.bytedance.touchpoint.core.model;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public final class ProfileActivityButton extends F9E {

    @InterfaceC65349Pkn("activity_id")
    public String activityId;

    @InterfaceC65349Pkn("icon")
    public String icon;

    @InterfaceC65349Pkn("jump_link")
    public String jumpLink;

    @InterfaceC65349Pkn("name")
    public String name;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.icon, this.activityId, this.name, this.jumpLink};
    }

    public ProfileActivityButton(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "icon", str2, "activityId", str3, "name", str4, "jumpLink");
        this.icon = str;
        this.activityId = str2;
        this.name = str3;
        this.jumpLink = str4;
    }
}

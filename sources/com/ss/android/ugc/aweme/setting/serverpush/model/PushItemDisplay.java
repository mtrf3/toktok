package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;

/* loaded from: classes16.dex */
public final class PushItemDisplay {

    @InterfaceC65349Pkn("display_type")
    public final int displayType = 1;

    @InterfaceC65349Pkn("icon_android")
    public final String icon = "";

    @InterfaceC65349Pkn("title")
    public final String title = "";

    @InterfaceC65349Pkn("description")
    public final String description = "";

    public final boolean LIZ() {
        if (this.icon.length() > 0 && this.displayType >= 6) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushItemDisplay(displayType=");
        LIZ.append(this.displayType);
        LIZ.append(", icon='");
        LIZ.append(this.icon);
        LIZ.append("', title='");
        LIZ.append(this.title);
        LIZ.append("', description='");
        return JBR.LJFF(LIZ, this.description, "')", LIZ);
    }
}

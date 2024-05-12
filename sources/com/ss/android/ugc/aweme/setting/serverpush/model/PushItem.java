package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes16.dex */
public final class PushItem {

    @InterfaceC65349Pkn("client_control_flags")
    public final int clientControlFlags;

    @InterfaceC65349Pkn("sub_page")
    public final PushSettingDynamicUI subPage;

    @InterfaceC65349Pkn("field")
    public final String itemId = "";

    @InterfaceC65349Pkn("dependency_field")
    public final String dependencyFiled = "";

    @InterfaceC65349Pkn("display")
    public final PushItemDisplay display = new PushItemDisplay();

    @InterfaceC65349Pkn("action_type")
    public final int actionType = 1;

    @InterfaceC65349Pkn("schema")
    public final String schema = "";

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushItem(itemId='");
        LIZ.append(this.itemId);
        LIZ.append("', clientControlFlags=");
        LIZ.append(this.clientControlFlags);
        LIZ.append(", dependencyFiled='");
        LIZ.append(this.dependencyFiled);
        LIZ.append("', display=");
        LIZ.append(this.display);
        LIZ.append(", actionType=");
        LIZ.append(this.actionType);
        LIZ.append(", schema='");
        LIZ.append(this.schema);
        LIZ.append("', subPage=");
        LIZ.append(this.subPage);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }
}

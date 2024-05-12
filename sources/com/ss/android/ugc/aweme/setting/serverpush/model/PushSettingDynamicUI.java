package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class PushSettingDynamicUI {

    @InterfaceC65349Pkn("version")
    public final String version = "";

    @InterfaceC65349Pkn("page_title")
    public final String title = "Notifications";

    @InterfaceC65349Pkn("page_label")
    public final String pageLabel = "";

    @InterfaceC65349Pkn("category_list")
    public final List<PushCategory> categoryList = new ArrayList();

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushDynamicUISettings(version='");
        LIZ.append(this.version);
        LIZ.append("', title='");
        LIZ.append(this.title);
        LIZ.append("', pageLabel='");
        LIZ.append(this.pageLabel);
        LIZ.append("', categories=");
        return C1NE.LIZIZ(LIZ, this.categoryList, ')', LIZ);
    }
}

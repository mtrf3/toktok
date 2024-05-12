package com.bytedance.android.livesdk.drawerfeed.tab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawerTabsItem extends F9E {

    @InterfaceC65349Pkn("tab_name")
    public final String tabName;

    @InterfaceC65349Pkn("tab_type")
    public final String tabType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.tabType, this.tabName};
    }

    public DrawerTabsItem(String tabType, String tabName) {
        o.LJIIIZ(tabType, "tabType");
        o.LJIIIZ(tabName, "tabName");
        this.tabType = tabType;
        this.tabName = tabName;
    }
}

package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DebugRoomItem extends F9E implements Serializable {

    @InterfaceC65349Pkn("tab_content")
    public String tabContent;

    @InterfaceC65349Pkn("tab_title")
    public String tabTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public DebugRoomItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DebugRoomItem copy$default(DebugRoomItem debugRoomItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = debugRoomItem.tabTitle;
        }
        if ((i & 2) != 0) {
            str2 = debugRoomItem.tabContent;
        }
        return debugRoomItem.copy(str, str2);
    }

    public final DebugRoomItem copy(String tabTitle, String tabContent) {
        o.LJIIIZ(tabTitle, "tabTitle");
        o.LJIIIZ(tabContent, "tabContent");
        return new DebugRoomItem(tabTitle, tabContent);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.tabTitle, this.tabContent};
    }

    public final String getTabContent() {
        return this.tabContent;
    }

    public final String getTabTitle() {
        return this.tabTitle;
    }

    public final void setTabContent(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.tabContent = str;
    }

    public final void setTabTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.tabTitle = str;
    }

    public DebugRoomItem(String tabTitle, String tabContent) {
        o.LJIIIZ(tabTitle, "tabTitle");
        o.LJIIIZ(tabContent, "tabContent");
        this.tabTitle = tabTitle;
        this.tabContent = tabContent;
    }

    public /* synthetic */ DebugRoomItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}

package com.bytedance.android.live.base.model.emoji;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class BadgeIconTab extends F9E {

    @InterfaceC65349Pkn("icon_list")
    public final List<BadgeIcon> iconList;

    @InterfaceC65349Pkn("tab_id")
    public final long tabId;

    @InterfaceC65349Pkn("tab_preview")
    public final BadgeIcon tabPreview;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.tabId), this.tabPreview, this.iconList};
    }

    public BadgeIconTab(long j, BadgeIcon tabPreview, List<BadgeIcon> iconList) {
        o.LJIIIZ(tabPreview, "tabPreview");
        o.LJIIIZ(iconList, "iconList");
        this.tabId = j;
        this.tabPreview = tabPreview;
        this.iconList = iconList;
    }
}

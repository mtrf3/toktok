package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TopTab extends F9E {

    @InterfaceC65349Pkn("top_tab_list")
    public final List<TopTabItem> topTabList;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.topTabList};
    }

    public TopTab(List<TopTabItem> topTabList) {
        o.LJIIIZ(topTabList, "topTabList");
        this.topTabList = topTabList;
    }
}

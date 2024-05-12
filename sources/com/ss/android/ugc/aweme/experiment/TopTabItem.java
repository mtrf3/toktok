package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopTabItem extends F9E {

    @InterfaceC65349Pkn("top_tab_key")
    public final String topTabKey;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.topTabKey};
    }

    public TopTabItem(String topTabKey) {
        o.LJIIIZ(topTabKey, "topTabKey");
        this.topTabKey = topTabKey;
    }
}

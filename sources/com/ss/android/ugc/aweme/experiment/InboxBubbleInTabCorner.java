package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public final class InboxBubbleInTabCorner extends F9E {

    @InterfaceC65349Pkn("is_enable")
    public final int isEnable;

    @InterfaceC65349Pkn("max_bubble_types")
    public final int maxBubbleTypes;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.isEnable), Integer.valueOf(this.maxBubbleTypes)};
    }

    public InboxBubbleInTabCorner(int i, int i2) {
        this.isEnable = i;
        this.maxBubbleTypes = i2;
    }
}

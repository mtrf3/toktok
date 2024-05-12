package com.ss.android.ugc.aweme.shortvideo.videoquality;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes8.dex */
public final class AIGCInfo extends F9E {

    @InterfaceC65349Pkn("aigc_label_type")
    public final int aigcLabelType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.aigcLabelType)};
    }

    public AIGCInfo(int i) {
        this.aigcLabelType = i;
    }
}

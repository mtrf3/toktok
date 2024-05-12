package com.bytedance.android.livesdk.model.message;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class InviteTopHostInfo extends F9E {

    @InterfaceC65349Pkn("rank_type")
    public String rankType;

    @InterfaceC65349Pkn("top_index")
    public Long topIndex;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.rankType;
        Long l = this.topIndex;
        return new Object[]{str, str, l, l};
    }
}

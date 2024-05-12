package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class RivalsResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public RivalsListsData data;

    @InterfaceC65349Pkn("extra")
    public RivalsListExtra extra;

    @Override // X.F9E
    public final Object[] getObjects() {
        RivalsListsData rivalsListsData = this.data;
        RivalsListExtra rivalsListExtra = this.extra;
        return new Object[]{rivalsListsData, rivalsListsData, rivalsListExtra, rivalsListExtra};
    }
}

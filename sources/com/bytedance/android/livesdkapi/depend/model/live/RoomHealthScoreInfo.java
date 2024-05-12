package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class RoomHealthScoreInfo extends F9E {

    @InterfaceC65349Pkn("bubble_message")
    public String bubbleMessage;

    @InterfaceC65349Pkn("jump_url")
    public String jumpUrl;

    @InterfaceC65349Pkn("score")
    public Double score;

    @Override // X.F9E
    public final Object[] getObjects() {
        Double d = this.score;
        String str = this.bubbleMessage;
        String str2 = this.jumpUrl;
        return new Object[]{d, d, str, str, str2, str2};
    }
}

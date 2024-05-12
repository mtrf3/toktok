package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class BattleScore extends F9E {

    @InterfaceC65349Pkn("score")
    public Integer score;

    @InterfaceC65349Pkn("user_id")
    public Long userId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Integer num = this.score;
        Long l = this.userId;
        return new Object[]{num, num, l, l};
    }
}

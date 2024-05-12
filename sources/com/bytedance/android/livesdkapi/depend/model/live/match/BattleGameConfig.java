package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class BattleGameConfig extends F9E {

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("game_id")
    public Long gameId;

    @InterfaceC65349Pkn("prop_id")
    public Long propId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.gameId;
        Long l2 = this.propId;
        String str = this.extra;
        return new Object[]{l, l, l2, l2, str, str};
    }
}

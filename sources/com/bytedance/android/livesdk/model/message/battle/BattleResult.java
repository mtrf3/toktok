package com.bytedance.android.livesdk.model.message.battle;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class BattleResult extends F9E {

    @InterfaceC65349Pkn("result")
    public int result;

    @InterfaceC65349Pkn("score")
    public long score;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.userId), Integer.valueOf(this.result), Long.valueOf(this.score)};
    }
}

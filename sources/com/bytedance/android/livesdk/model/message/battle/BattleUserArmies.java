package com.bytedance.android.livesdk.model.message.battle;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes14.dex */
public final class BattleUserArmies extends F9E {

    @InterfaceC65349Pkn("hostScore")
    public int hostScore;

    @InterfaceC65349Pkn("user_armies")
    public List<BattleUserArmy> userArmies;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.hostScore), this.userArmies};
    }
}

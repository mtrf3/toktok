package com.bytedance.android.livesdk.model.message.battle;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes14.dex */
public final class BattleUserArmy extends F9E {
    public static final BattleUserArmy LJLIL = new BattleUserArmy();
    public static final BattleUserArmy LJLILLLLZI = new BattleUserArmy();

    @InterfaceC65349Pkn("avatar_thumb")
    public ImageModel avatarThumb;

    @InterfaceC65349Pkn("diamond_score")
    public Long diamondScore;

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @InterfaceC65349Pkn("score")
    public int score;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.userId), Integer.valueOf(this.score), this.nickname, this.avatarThumb};
    }
}

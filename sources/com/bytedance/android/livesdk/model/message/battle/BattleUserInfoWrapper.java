package com.bytedance.android.livesdk.model.message.battle;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BattleUserInfoWrapper extends F9E {

    @InterfaceC65349Pkn("key")
    public Long userId;

    @InterfaceC65349Pkn("value")
    public BattleUserInfo userInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public BattleUserInfoWrapper() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.userId, this.userInfo};
    }

    public BattleUserInfoWrapper(Long l, BattleUserInfo battleUserInfo) {
        this.userId = l;
        this.userInfo = battleUserInfo;
    }

    public /* synthetic */ BattleUserInfoWrapper(Long l, BattleUserInfo battleUserInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : battleUserInfo);
    }
}

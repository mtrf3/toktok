package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BattleTeamUser {

    @InterfaceC65349Pkn("score")
    public Long score;

    @InterfaceC65349Pkn("user_id")
    public Long userId;

    /* JADX WARN: Multi-variable type inference failed */
    public BattleTeamUser() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public BattleTeamUser(Long l, Long l2) {
        this.userId = l;
        this.score = l2;
    }

    public /* synthetic */ BattleTeamUser(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? 0L : l2);
    }
}

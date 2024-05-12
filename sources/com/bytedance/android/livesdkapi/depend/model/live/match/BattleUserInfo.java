package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class BattleUserInfo extends F9E {

    @InterfaceC65349Pkn("tags")
    public List<BattleRivalTag> tags;

    @InterfaceC65349Pkn("user")
    public BattleBaseUserInfo user;

    public BattleUserInfo() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.user, this.tags};
    }

    public BattleUserInfo(BattleBaseUserInfo battleBaseUserInfo, List<BattleRivalTag> tags) {
        o.LJIIIZ(tags, "tags");
        this.user = battleBaseUserInfo;
        this.tags = tags;
    }

    public BattleUserInfo(BattleBaseUserInfo battleBaseUserInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : battleBaseUserInfo, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}

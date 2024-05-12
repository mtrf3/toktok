package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import java.util.List;

/* loaded from: classes14.dex */
public final class BattleRival extends F9E {

    @InterfaceC65349Pkn("extra_info")
    public RivalExtraInfo extraInfo;

    @InterfaceC65349Pkn("tags")
    public List<BattleRivalTag> tags;

    @Override // X.F9E
    public final Object[] getObjects() {
        RivalExtraInfo rivalExtraInfo = this.extraInfo;
        List<BattleRivalTag> list = this.tags;
        return new Object[]{rivalExtraInfo, rivalExtraInfo, list, list, list};
    }
}

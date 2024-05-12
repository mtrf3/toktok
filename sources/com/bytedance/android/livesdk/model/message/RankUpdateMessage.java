package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import java.util.List;

/* loaded from: classes6.dex */
public final class RankUpdateMessage extends CR6 {

    @InterfaceC65349Pkn("animation_loop_for_off")
    public boolean animationLoopForOff;
    public int groupType;

    @InterfaceC65349Pkn("is_animation_loop_play")
    public boolean loop;
    public int opType;
    public long rankPriority;
    public List<RankTabInfo> tabInfo;
    public List<RankUpdate> updates;

    public RankUpdateMessage() {
        this.type = EnumC31509CYf.RANK_UPDATE_MESSAGE;
    }
}

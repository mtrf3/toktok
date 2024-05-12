package com.bytedance.android.livesdk.rank.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public final class RankEntrance extends F9E {

    @InterfaceC65349Pkn("related_tab_rank_type")
    public int belongRankType;

    @InterfaceC65349Pkn("block_message")
    public boolean blockMessage;

    @InterfaceC65349Pkn("countdown")
    public long countdown;

    @InterfaceC65349Pkn("default_content")
    public Text defaultContent;

    @InterfaceC65349Pkn("owner_on_rank")
    public boolean ownerOnRank;

    @InterfaceC65349Pkn("owner_rank_idx")
    public long ownerRankIdx;

    @InterfaceC65349Pkn("rank_type")
    public int rankType;

    @InterfaceC65349Pkn("request_first_show_type")
    public int requestFirstShowType;

    @InterfaceC65349Pkn("roll_config")
    public RollCfg rollConfig;

    @Override // X.F9E
    public final Object[] getObjects() {
        Text text = this.defaultContent;
        RollCfg rollCfg = this.rollConfig;
        return new Object[]{Integer.valueOf(this.rankType), Long.valueOf(this.countdown), text, text, rollCfg, rollCfg, Boolean.valueOf(this.blockMessage), Long.valueOf(this.ownerRankIdx), Boolean.valueOf(this.ownerOnRank)};
    }
}

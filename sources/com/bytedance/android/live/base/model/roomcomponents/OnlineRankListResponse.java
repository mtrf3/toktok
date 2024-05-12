package com.bytedance.android.live.base.model.roomcomponents;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.rank.api.model.Rank;
import java.util.List;

/* loaded from: classes.dex */
public class OnlineRankListResponse {

    @InterfaceC65349Pkn("display_config")
    public OnlineRankConfig config;

    @InterfaceC65349Pkn("currency")
    public String currency;

    @InterfaceC65349Pkn("anchor_show_contribution")
    public boolean isBroadcastMENAT;

    @InterfaceC65349Pkn("ranks")
    public List<Rank> ranks;

    @InterfaceC65349Pkn("rule_url")
    public String ruleUrl;

    @InterfaceC65349Pkn("self_info")
    public Rank selfInfo;

    @InterfaceC65349Pkn("total")
    public int total;
}

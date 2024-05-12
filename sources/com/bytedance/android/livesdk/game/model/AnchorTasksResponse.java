package com.bytedance.android.livesdk.game.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AnchorTasksResponse {

    @InterfaceC65349Pkn("ended_profit_infos")
    public List<TaskProfitInfo> endedProfitInfos;

    @InterfaceC65349Pkn("live_promote_ban_banner_text")
    public String livePromoteBanBannerText;

    @InterfaceC65349Pkn("maximum_task_num")
    public int maximum_task_num;

    @InterfaceC65349Pkn("promoting_profit_infos")
    public List<TaskProfitInfo> promotingProfitInfos;

    @InterfaceC65349Pkn("punish_event_info")
    public PunishEventInfo punishEventInfo;

    public AnchorTasksResponse() {
        this(0, null, null, 7, null);
    }

    public AnchorTasksResponse(int i, List<TaskProfitInfo> promotingProfitInfos, List<TaskProfitInfo> endedProfitInfos) {
        o.LJIIIZ(promotingProfitInfos, "promotingProfitInfos");
        o.LJIIIZ(endedProfitInfos, "endedProfitInfos");
        this.maximum_task_num = i;
        this.promotingProfitInfos = promotingProfitInfos;
        this.endedProfitInfos = endedProfitInfos;
    }

    public AnchorTasksResponse(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C61878OQg.INSTANCE : list, (i2 & 4) != 0 ? C61878OQg.INSTANCE : list2);
    }
}

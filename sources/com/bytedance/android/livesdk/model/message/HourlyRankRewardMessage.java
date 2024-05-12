package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class HourlyRankRewardMessage extends CR6 {

    @InterfaceC65349Pkn("winners")
    public List<HourlyRankRewardInfo> winners;

    public final List<HourlyRankRewardInfo> LIZ() {
        List<HourlyRankRewardInfo> list = this.winners;
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(this.winners);
    }

    public HourlyRankRewardMessage() {
        this.type = EnumC31509CYf.HOURLY_RANK_REWARD_MESSAGE;
    }
}

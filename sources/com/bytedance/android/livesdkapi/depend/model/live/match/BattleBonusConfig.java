package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public final class BattleBonusConfig {

    @InterfaceC65349Pkn("preview_start_time")
    public long previewStartTime;

    @InterfaceC65349Pkn("reward_config")
    public RewardPeriodConfig rewardPeriodConfig;

    @InterfaceC65349Pkn("target_config")
    public TaskPeriodConfig taskPeriodConfig;

    @InterfaceC65349Pkn("preview_config")
    public List<PreviewPeriod> previewPeriodConfig = new ArrayList();

    @InterfaceC65349Pkn("gift_amount_guide")
    public Map<Long, BattleTaskGiftAmountGuide> taskGiftGuide = new LinkedHashMap();
}

package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes14.dex */
public final class BattleTruthOrDareTriggerGuideV2 {

    @InterfaceC65349Pkn("guide_duration_second")
    public int guideDurationSecond;

    @InterfaceC65349Pkn("is_first_time")
    public boolean isFirstTime;

    @InterfaceC65349Pkn("lap_guide_duration_second")
    public int lapGuideDurationSecond;

    @InterfaceC65349Pkn("tip_duration_second")
    public int tipDurationSecond;

    @InterfaceC65349Pkn("tips")
    public List<TruthOrDareTip> tips;

    @InterfaceC65349Pkn("anchor_content_key")
    public String anchorContentKey = "";

    @InterfaceC65349Pkn("audience_content_key")
    public String audienceContentKey = "";

    @InterfaceC65349Pkn("rule_detail_url")
    public String ruleDetailUrl = "";

    @InterfaceC65349Pkn("lap_guide_key")
    public String lapGuideKey = "";

    /* loaded from: classes14.dex */
    public static final class TruthOrDareTip {

        @InterfaceC65349Pkn("tip_type_key")
        public String tipTypeKey = "";

        @InterfaceC65349Pkn("tip_content_key")
        public String tipContentKey = "";
    }
}

package com.bytedance.android.livesdk.model.message.battle;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class BattleTruthOrDareTriggerGuide extends F9E {

    @InterfaceC65349Pkn("anchor_content_key")
    public String anchorContentKey;

    @InterfaceC65349Pkn("audience_content_key")
    public String audienceContentKey;

    @InterfaceC65349Pkn("guide_duration_second")
    public int guideDurationSecond;

    @InterfaceC65349Pkn("rule_detail_url")
    public String ruleDetailUrl;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.anchorContentKey, this.audienceContentKey, Integer.valueOf(this.guideDurationSecond), this.ruleDetailUrl};
    }
}

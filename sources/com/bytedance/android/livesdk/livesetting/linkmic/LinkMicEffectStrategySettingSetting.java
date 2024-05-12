package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58494MxW;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import org.json.JSONObject;

@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_effect_performance_downgrading_setting")
/* loaded from: classes11.dex */
public final class LinkMicEffectStrategySettingSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LinkMicEffectStrategySettingSetting INSTANCE = new LinkMicEffectStrategySettingSetting();
    public static final C5H3 config$delegate = C221108m2.LIZIZ(C58494MxW.LJLIL);

    private final JSONObject getConfig() {
        return (JSONObject) config$delegate.getValue();
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LinkMicEffectStrategySettingSetting.class);
    }

    public final JSONObject getStrategy() {
        return getConfig();
    }
}

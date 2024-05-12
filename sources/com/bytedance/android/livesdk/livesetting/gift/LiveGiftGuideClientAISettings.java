package com.bytedance.android.livesdk.livesetting.gift;

import X.C113554cx;
import X.C221108m2;
import X.C32155Cjf;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.Map;

@SettingsKey("gift_guide_client_ai_settings")
/* loaded from: classes6.dex */
public final class LiveGiftGuideClientAISettings {

    @Group(isDefault = true, value = "default group")
    public static final GiftGuideClientAI DEFAULT;
    public static final LiveGiftGuideClientAISettings INSTANCE;
    public static final Map<String, AutoTriggerConfig> autoTriggerConfig;
    public static final C5H3 value$delegate;

    static {
        LiveGiftGuideClientAISettings liveGiftGuideClientAISettings = new LiveGiftGuideClientAISettings();
        INSTANCE = liveGiftGuideClientAISettings;
        DEFAULT = new GiftGuideClientAI(null, null, 0L, 0L, false, 0L, 0, 0, 0, 0, null, null, 4095, null);
        value$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C32155Cjf.LJLIL);
        Map<String, AutoTriggerConfig> map = liveGiftGuideClientAISettings.getValue().autoTriggerConfigMap;
        if (map == null) {
            map = C113554cx.LJJJLIIL();
        }
        autoTriggerConfig = map;
    }

    public final GiftGuideClientAI getValue() {
        return (GiftGuideClientAI) value$delegate.getValue();
    }

    public final Map<String, AutoTriggerConfig> getAutoTriggerConfig() {
        return autoTriggerConfig;
    }

    public final GiftGuideClientAI getDEFAULT() {
        return DEFAULT;
    }
}

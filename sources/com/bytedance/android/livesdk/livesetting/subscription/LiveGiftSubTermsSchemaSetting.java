package com.bytedance.android.livesdk.livesetting.subscription;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

@SettingsKey("subscription_legal_urls")
/* loaded from: classes6.dex */
public final class LiveGiftSubTermsSchemaSetting {
    public static final LiveGiftSubTermsSchemaSetting INSTANCE = new LiveGiftSubTermsSchemaSetting();

    @Group(isDefault = true, value = "default group")
    public static final HashMap<String, String> DEFAULT = C113554cx.LJJJLZIJ(new OSZ("en", "https://lf16-web.tiktokcdn.com/obj/ies-hotsoon-draft-sg/tiktok-live/12e180d0-1adc-47fa-9def-d9b2aaddfd10_en-US.html"));

    public final Map<String, String> getValue() {
        Map<String, String> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveGiftSubTermsSchemaSetting.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    public final String getSchema(String language) {
        o.LJIIIZ(language, "language");
        String str = getValue().get(language);
        if (str == null) {
            String str2 = getValue().get("en");
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        return str;
    }
}

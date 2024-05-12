package com.bytedance.android.livesdk.livesetting.subscription;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@SettingsKey("live_subscription_anchor_videos_url")
/* loaded from: classes6.dex */
public final class SubOnlyVideoLynxUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final SubOnlyVideoLynxUrlSetting INSTANCE;
    public static final String subOnlyVideosFAQ;

    static {
        SubOnlyVideoLynxUrlSetting subOnlyVideoLynxUrlSetting = new SubOnlyVideoLynxUrlSetting();
        INSTANCE = subOnlyVideoLynxUrlSetting;
        String optString = subOnlyVideoLynxUrlSetting.getValue().optString("subonly_videos_faq", "");
        o.LJIIIIZZ(optString, "getValue().optString(\"subonly_videos_faq\", \"\")");
        subOnlyVideosFAQ = optString;
    }

    public final JSONObject getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        if (TextUtils.isEmpty(settingsManager.getStringValue(SubOnlyVideoLynxUrlSetting.class))) {
            return new JSONObject();
        }
        return new JSONObject(settingsManager.getStringValue(SubOnlyVideoLynxUrlSetting.class));
    }

    public final String getSubOnlyVideosFAQ() {
        return subOnlyVideosFAQ;
    }
}

package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.RedEnvelopeUrls;
import kotlin.jvm.internal.o;

@SettingsKey("live_golden_envelope_schemes")
/* loaded from: classes6.dex */
public final class RedEnvelopeURLConfig {
    public static final RedEnvelopeURLConfig INSTANCE = new RedEnvelopeURLConfig();

    @Group(isDefault = true, value = "default group")
    public static RedEnvelopeUrls DEFAULT = new RedEnvelopeUrls();

    public final String getSendUrl() {
        RedEnvelopeUrls redEnvelopeUrls = (RedEnvelopeUrls) SettingsManager.INSTANCE.getValueSafely(RedEnvelopeURLConfig.class);
        if (redEnvelopeUrls != null) {
            return redEnvelopeUrls.sendUrl;
        }
        return null;
    }

    public final String getShortTouchUrl() {
        RedEnvelopeUrls redEnvelopeUrls = (RedEnvelopeUrls) SettingsManager.INSTANCE.getValueSafely(RedEnvelopeURLConfig.class);
        if (redEnvelopeUrls != null) {
            return redEnvelopeUrls.shortTouchUrl;
        }
        return null;
    }

    public final RedEnvelopeUrls getDEFAULT() {
        return DEFAULT;
    }

    public final void setDEFAULT(RedEnvelopeUrls redEnvelopeUrls) {
        o.LJIIIZ(redEnvelopeUrls, "<set-?>");
        DEFAULT = redEnvelopeUrls;
    }
}

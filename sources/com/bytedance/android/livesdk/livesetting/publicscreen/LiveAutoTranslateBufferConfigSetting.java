package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_auto_translate_buffer_config")
/* loaded from: classes6.dex */
public final class LiveAutoTranslateBufferConfigSetting {
    public static LiveTranslateBufferConfig cacheValue;
    public static final LiveAutoTranslateBufferConfigSetting INSTANCE = new LiveAutoTranslateBufferConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveTranslateBufferConfig DEFAULT = new LiveTranslateBufferConfig();

    /* loaded from: classes6.dex */
    public static final class LiveTranslateBufferConfig {

        @InterfaceC65349Pkn("live_auto_translate_buffer_size")
        public int autoTranslateBufferSize = 10;

        @InterfaceC65349Pkn("live_auto_translate_buffer_timeout")
        public long autoTranslateBufferTimeout = 1500;

        @InterfaceC65349Pkn("live_message_auto_translate_request_timeout")
        public long messageAutoTranslateRequestTimeout = 1500;
    }

    public static final LiveTranslateBufferConfig getValue() {
        if (cacheValue == null) {
            cacheValue = (LiveTranslateBufferConfig) SettingsManager.INSTANCE.getValueSafely(LiveAutoTranslateBufferConfigSetting.class);
        }
        LiveTranslateBufferConfig liveTranslateBufferConfig = cacheValue;
        if (liveTranslateBufferConfig == null) {
            return DEFAULT;
        }
        return liveTranslateBufferConfig;
    }

    public final LiveTranslateBufferConfig getCacheValue() {
        return cacheValue;
    }

    public final void setCacheValue(LiveTranslateBufferConfig liveTranslateBufferConfig) {
        cacheValue = liveTranslateBufferConfig;
    }
}

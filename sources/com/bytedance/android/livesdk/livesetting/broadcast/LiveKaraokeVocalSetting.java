package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C31056CGu;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_karaoke_vocal")
/* loaded from: classes6.dex */
public final class LiveKaraokeVocalSetting {
    public static final LiveKaraokeVocalSetting INSTANCE = new LiveKaraokeVocalSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveKaraokeVocal DEFAULT = new LiveKaraokeVocal(0.0f, 0.0f, 0.0f, 7, null);
    public static final C5H3 setting$delegate = C221108m2.LIZIZ(C31056CGu.LJLIL);

    public final LiveKaraokeVocal getSetting() {
        return (LiveKaraokeVocal) setting$delegate.getValue();
    }

    /* renamed from: default, reason: not valid java name */
    public final float m62default() {
        LiveKaraokeVocal setting = getSetting();
        if (setting == null) {
            setting = DEFAULT;
        }
        return setting.f8default;
    }

    public final float max() {
        LiveKaraokeVocal setting = getSetting();
        if (setting == null) {
            setting = DEFAULT;
        }
        return setting.max;
    }

    public final float min() {
        LiveKaraokeVocal setting = getSetting();
        if (setting == null) {
            setting = DEFAULT;
        }
        return setting.min;
    }

    public final int uiDefault() {
        float max = max();
        float min = min();
        float m62default = m62default();
        if (min >= max) {
            max = 1.0f;
            min = 0.0f;
        }
        if (m62default > max) {
            m62default = max;
        }
        if (m62default < min) {
            m62default = min;
        }
        return (int) ((m62default * 100) / (max - min));
    }
}

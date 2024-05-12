package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C31055CGt;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_karaoke_accompaniment")
/* loaded from: classes6.dex */
public final class LiveKaraokeAccompanySetting {
    public static final LiveKaraokeAccompanySetting INSTANCE = new LiveKaraokeAccompanySetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveKaraokeAccompany DEFAULT = new LiveKaraokeAccompany(0.0f, 0.0f, 0.0f, 7, null);
    public static final C5H3 setting$delegate = C221108m2.LIZIZ(C31055CGt.LJLIL);

    public final LiveKaraokeAccompany getSetting() {
        return (LiveKaraokeAccompany) setting$delegate.getValue();
    }

    /* renamed from: default, reason: not valid java name */
    public final float m61default() {
        LiveKaraokeAccompany setting = getSetting();
        if (setting == null) {
            setting = DEFAULT;
        }
        return setting.f7default;
    }

    public final float max() {
        LiveKaraokeAccompany setting = getSetting();
        if (setting == null) {
            setting = DEFAULT;
        }
        return setting.max;
    }

    public final float min() {
        LiveKaraokeAccompany setting = getSetting();
        if (setting == null) {
            setting = DEFAULT;
        }
        return setting.min;
    }

    public final int uiDefault() {
        float max = max();
        float min = min();
        float m61default = m61default();
        if (min >= max) {
            max = 1.0f;
            min = 0.0f;
        }
        if (m61default > max) {
            m61default = max;
        }
        if (m61default < min) {
            m61default = min;
        }
        return (int) ((m61default * 100) / (max - min));
    }
}

package com.ss.android.ugc.aweme.commerce.tools.music.promote;

import com.bytedance.ies.abmock.SettingsManager;

/* loaded from: classes8.dex */
public final class PromoteReplaceMusicDataExpireTimeSetting {
    public static final PromoteReplaceMusicDataExpireTimeSetting INSTANCE = new PromoteReplaceMusicDataExpireTimeSetting();
    public static final int DEFAULT = 72;

    public static final int get() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LJ("promote_music_change_request_info_save_time", 72);
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}

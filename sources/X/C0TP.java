package X;

import com.bytedance.android.livesdk.livesetting.broadcast.AutoSpeedTestSceneSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.ManualSpeedTestSceneSetting;

/* renamed from: X.0TP, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0TP {
    SCENE_UNKNOWN("unknown"),
    SCENE_TIKTOK_GAME_LIVE_AUTO(AutoSpeedTestSceneSetting.INSTANCE.getValue()),
    SCENE_TIKTOK_GAME_LIVE_MANUAL(ManualSpeedTestSceneSetting.INSTANCE.getValue()),
    SCENE_TIKTOK_SERVER_ERROR_DEBUG("tiktok_server_error_debug");

    public final String LJLIL;

    public static C0TP valueOf(String str) {
        return (C0TP) V0N.LJJJ(C0TP.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    C0TP(String str) {
        this.LJLIL = str;
    }
}

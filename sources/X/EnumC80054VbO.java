package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;

/* renamed from: X.VbO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC80054VbO {
    AFD(3000),
    LOCAL_FILE(LiveNetAdaptiveHurryTimeSetting.DEFAULT),
    PRELOAD_CACHE(1000),
    VIDEO_MODEL(LiveMaxRetainAlogMessageSizeSetting.DEFAULT),
    PLAY_URL(0),
    INIT(-1);

    public final int LJLIL;

    public static EnumC80054VbO valueOf(String str) {
        return (EnumC80054VbO) V0N.LJJJ(EnumC80054VbO.class, str);
    }

    EnumC80054VbO(int i) {
        this.LJLIL = i;
    }
}

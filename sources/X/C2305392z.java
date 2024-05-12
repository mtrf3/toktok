package X;

import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;

/* renamed from: X.92z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2305392z {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(AnonymousClass930.LJLIL);

    public static int LIZ() {
        if (C2NW.LIZ().isNewUser()) {
            if (C2NW.LIZ().LJIL() && C2NW.LIZ().LJIILLIIL(C2304792t.LJLIL)) {
                if (C35478DwA.LIZIZ()) {
                    return LiveEffectMusicFadeDurationSetting.DEFAULT;
                }
                return 3000;
            }
            return ((Number) AnonymousClass934.LIZ.getValue()).intValue();
        }
        return ((Number) AnonymousClass934.LIZ.getValue()).intValue();
    }

    public static int LIZIZ() {
        if (C2NW.LIZ().isNewUser()) {
            if (C2NW.LIZ().LJIL() && C2NW.LIZ().LJIILLIIL(C2304792t.LJLIL)) {
                if (C35478DwA.LIZIZ()) {
                    return LiveCenterDelayLoadSetting.DEFAULT;
                }
                return LivePlayerResourceReleaseSetting.ENABLE;
            }
            return ((Number) AnonymousClass932.LIZ.getValue()).intValue();
        }
        return ((Number) AnonymousClass932.LIZ.getValue()).intValue();
    }
}

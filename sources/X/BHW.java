package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* loaded from: classes6.dex */
public final class BHW {
    public static BHZ LIZ(LiveMode liveMode) {
        if (liveMode != null) {
            int i = C28490BGc.LIZ[liveMode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return BHZ.LIVE_VOICE;
                        }
                    } else {
                        return BHZ.THIRD_PARTY;
                    }
                } else {
                    return BHZ.SCREEN_RECORD;
                }
            } else {
                return BHZ.VIDEO;
            }
        }
        return null;
    }
}

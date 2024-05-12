package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.o;

/* renamed from: X.BGv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28509BGv {
    public static final String LIZ(LiveMode liveMode) {
        o.LJIIIZ(liveMode, "<this>");
        int i = C28489BGb.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "";
                        }
                        return "live_voice";
                    }
                    return "live_studio";
                }
                return "screen_share";
            }
            return "third_party";
        }
        return "video_live";
    }

    public static final boolean LIZIZ(LiveMode liveMode) {
        o.LJIIIZ(liveMode, "<this>");
        if (liveMode != LiveMode.VIDEO) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(LiveMode liveMode) {
        o.LJIIIZ(liveMode, "<this>");
        if (liveMode == LiveMode.LIVE_STUDIO) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(LiveMode liveMode) {
        o.LJIIIZ(liveMode, "<this>");
        if (liveMode == LiveMode.LIVE_VOICE) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(LiveMode liveMode) {
        o.LJIIIZ(liveMode, "<this>");
        if (liveMode == LiveMode.SCREEN_RECORD) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(LiveMode liveMode) {
        o.LJIIIZ(liveMode, "<this>");
        if (liveMode == LiveMode.THIRD_PARTY) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(LiveMode liveMode) {
        o.LJIIIZ(liveMode, "<this>");
        if (liveMode == LiveMode.VIDEO) {
            return true;
        }
        return false;
    }
}

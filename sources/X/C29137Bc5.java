package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.Bc5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29137Bc5 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(LiveMode liveMode) {
        if (liveMode == LiveMode.LIVE_VOICE) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Room room) {
        LiveMode liveMode;
        if (room != null) {
            liveMode = room.getStreamType();
        } else {
            liveMode = null;
        }
        return LIZ(liveMode);
    }

    public static boolean LIZJ(LiveMode liveMode) {
        if (liveMode == LiveMode.SCREEN_RECORD) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Room room) {
        LiveMode liveMode;
        if (room != null) {
            liveMode = room.getStreamType();
        } else {
            liveMode = null;
        }
        return LIZJ(liveMode);
    }

    public static boolean LJ(LiveMode liveMode) {
        if (liveMode == LiveMode.VIDEO) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(Room room) {
        LiveMode liveMode;
        if (room != null) {
            liveMode = room.getStreamType();
        } else {
            liveMode = null;
        }
        return LJ(liveMode);
    }
}

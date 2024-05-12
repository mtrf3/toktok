package X;

import com.ss.android.ugc.gamora.editor.audioservice.service.experiment.EnableMicWithBGMConfig;

/* loaded from: classes15.dex */
public final class WJR {
    public static final WJR LIZ = new WJR();
    public static final EnableMicWithBGMConfig LIZIZ = new EnableMicWithBGMConfig(false, false, false, false, false, 31, null);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(WJS.LJLIL);

    public static final EnableMicWithBGMConfig LIZ() {
        return (EnableMicWithBGMConfig) LIZJ.getValue();
    }

    public static boolean LIZIZ(boolean z) {
        if (LIZ().useRedButton && LIZ().enableMicButton && z) {
            return true;
        }
        return false;
    }
}

package X;

import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;

/* loaded from: classes12.dex */
public final class QXF {
    public static final boolean LIZ = ReplaceMusicServiceImpl.LIZ().isCopyrightPhase2Enabled();

    public static final int LIZIZ() {
        return C00F.LIZ(31744, 0, "studio_recommend_music_panel_redesign", true);
    }

    public static int LIZ() {
        if (LIZLLL() && LIZIZ() == 3) {
            return 70;
        }
        return 50;
    }

    public static final boolean LIZJ() {
        if (LIZLLL() && LIZIZ() == 4) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL() {
        if (LIZIZ() != 0 && !LIZ) {
            return true;
        }
        return false;
    }
}

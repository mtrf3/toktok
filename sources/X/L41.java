package X;

import com.ss.android.ugc.aweme.dsp.experiment.MusicDspExpConfig;

/* loaded from: classes10.dex */
public final class L41 {
    public static final L41 LIZ = new L41();
    public static final MusicDspExpConfig LIZIZ = new MusicDspExpConfig(0, 0, false, false, 0, 31, null);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(L42.LJLIL);

    public static MusicDspExpConfig LIZIZ() {
        return (MusicDspExpConfig) LIZJ.getValue();
    }

    public static boolean LIZ() {
        return LIZIZ().getDspEnableBgPlay();
    }

    public static boolean LIZJ() {
        if (LIZIZ().getDspEntrance() == 4 || LIZIZ().getDspEntrance() == 5 || LIZIZ().getDspEntrance() == 6) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL() {
        if (LIZIZ().getDspEntrance() == 4) {
            return true;
        }
        return false;
    }

    public static boolean LJ() {
        if (LIZIZ().getDspUgcEntrance() == 3) {
            return true;
        }
        return false;
    }

    public static boolean LJFF() {
        if (LIZIZ().getDspUgcEntrance() == 1) {
            return true;
        }
        return false;
    }
}

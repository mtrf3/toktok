package X;

import com.ss.android.ugc.aweme.dsp.experiment.DspClipConfig;

/* loaded from: classes16.dex */
public final class YBM {
    public static final YBM LIZ = new YBM();
    public static final DspClipConfig LIZIZ = new DspClipConfig();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(YBN.LJLIL);

    public static DspClipConfig LIZ() {
        return (DspClipConfig) LIZJ.getValue();
    }

    public static boolean LIZIZ() {
        if (LIZ().getDspClipCanReplay() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        if (LIZ().getDspClipLandingPageStrategy() > 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL() {
        if (LIZ().getDspClipWmg() > 0) {
            return true;
        }
        return false;
    }
}

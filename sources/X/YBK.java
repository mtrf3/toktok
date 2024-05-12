package X;

import com.ss.android.ugc.aweme.dsp.experiment.MusicDspConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YBK {
    public static final YBK LIZ = new YBK();
    public static final MusicDspConfig LIZIZ = new MusicDspConfig();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(YBL.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(SUA.LJLIL);

    public static final MusicDspConfig LIZ() {
        LIZ.getClass();
        MusicDspConfig value = LIZJ();
        o.LJIIIIZZ(value, "value");
        return value;
    }

    public static int LIZIZ() {
        YBM.LIZ.getClass();
        if (YBM.LIZ().getDspClipSongMax() > 0) {
            return YBM.LIZ().getDspClipSongMax();
        }
        if (C52424Kho.LIZ() > 0) {
            return C52424Kho.LIZ();
        }
        return LIZ().copyrightRestrictions.getMaxMusics();
    }

    public static MusicDspConfig LIZJ() {
        return (MusicDspConfig) LIZJ.getValue();
    }
}

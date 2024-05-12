package com.ss.android.ugc.aweme.music.model;

import X.C44687HgJ;
import X.C45773Hxp;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StickPointBeanUtil {
    public static final StickPointBeanUtil INSTANCE = new StickPointBeanUtil();

    public static final boolean existOnSetAlgFile(StickPointMusicAlg stickPointMusicAlg) {
        o.LJIIIZ(stickPointMusicAlg, "<this>");
        return C44687HgJ.LIZIZ(stickPointMusicAlg.getVeBeatsPath());
    }

    public static final boolean existSuccessivelyAlgFile(StickPointMusicAlg stickPointMusicAlg) {
        o.LJIIIZ(stickPointMusicAlg, "<this>");
        int algType = stickPointMusicAlg.getAlgType();
        C45773Hxp c45773Hxp = StickPointMusicAlg.Companion;
        c45773Hxp.getClass();
        if (algType == StickPointMusicAlg.BEATES_FILE_BEATS_A0) {
            return C44687HgJ.LIZIZ(stickPointMusicAlg.getVeBeatsPath());
        }
        int algType2 = stickPointMusicAlg.getAlgType();
        c45773Hxp.getClass();
        if (algType2 == StickPointMusicAlg.BEATES_FILE_SERVER_C) {
            return C44687HgJ.LIZIZ(stickPointMusicAlg.getDownBeatsPath());
        }
        int algType3 = stickPointMusicAlg.getAlgType();
        c45773Hxp.getClass();
        if (algType3 == StickPointMusicAlg.BEATES_FILE_CUSTOM) {
            return C44687HgJ.LIZIZ(stickPointMusicAlg.getManModeBeatsPath());
        }
        return false;
    }

    public static final boolean isSuccessivelyAlgType(StickPointMusicAlg stickPointMusicAlg) {
        o.LJIIIZ(stickPointMusicAlg, "<this>");
        int algType = stickPointMusicAlg.getAlgType();
        C45773Hxp c45773Hxp = StickPointMusicAlg.Companion;
        c45773Hxp.getClass();
        if (algType != StickPointMusicAlg.BEATES_FILE_SERVER_C) {
            int algType2 = stickPointMusicAlg.getAlgType();
            c45773Hxp.getClass();
            if (algType2 != StickPointMusicAlg.BEATES_FILE_BEATS_A0) {
                int algType3 = stickPointMusicAlg.getAlgType();
                c45773Hxp.getClass();
                if (algType3 != StickPointMusicAlg.BEATES_FILE_CUSTOM) {
                    return false;
                }
            }
        }
        return true;
    }
}

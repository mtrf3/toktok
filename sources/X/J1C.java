package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.music.model.Music;

/* loaded from: classes9.dex */
public final class J1C {
    public static boolean LIZ;
    public static int LIZIZ;

    public static void LJ() {
        JYH jyh = JYH.LIZIZ;
        if (!jyh.LJIIJJI()) {
            return;
        }
        if (jyh.LJIIJ()) {
            if (LIZIZ != 1) {
                LIZJ(1);
            }
        } else {
            if (!LIZ) {
                return;
            }
            LIZ = false;
            if (LIZIZ == 0) {
                return;
            }
            LIZJ(0);
        }
    }

    static {
        int i;
        if (C46314IFq.LIZ() == 2) {
            i = 1;
        } else {
            i = 0;
        }
        LIZ = true;
        LIZIZ = i;
        LIZIZ = J1D.LIZIZ.LIZ.getInt("key_search_auto_play_sound", i);
    }

    public static boolean LIZIZ() {
        LJ();
        if (LIZIZ == 1) {
            return true;
        }
        return false;
    }

    public static void LIZJ(int i) {
        LIZIZ = i;
        J1D.LIZIZ.LIZ.storeInt("key_search_auto_play_sound", i);
    }

    public static boolean LIZLLL(Context context) {
        EnumC48204Ivw LIZIZ2;
        if (((Number) J21.LIZ.getValue()).intValue() == 0 || !C48203Ivv.LJ(context)) {
            return false;
        }
        if (((Number) J1E.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        EnumC48204Ivw enumC48204Ivw = C48207Ivz.LIZ;
        if (enumC48204Ivw == null || enumC48204Ivw == EnumC48204Ivw.NONE) {
            LIZIZ2 = C48203Ivv.LIZIZ(context);
        } else {
            LIZIZ2 = C48207Ivz.LIZ;
        }
        if (EnumC48204Ivw.MOBILE_2G != LIZIZ2 && EnumC48204Ivw.MOBILE_3G != LIZIZ2 && EnumC48204Ivw.MOBILE_4G != LIZIZ2 && EnumC48204Ivw.MOBILE != LIZIZ2) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(int i, int i2, Aweme aweme) {
        Music music;
        AwemeStatus status;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        if (aweme != null && (((music = aweme.getMusic()) != null && music.getMusicStatus() == 0) || ((status = aweme.getStatus()) != null && (videoMuteInfo = status.getVideoMuteInfo()) != null && videoMuteInfo.isMute()))) {
            return true;
        }
        if (i == 0) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        return LIZIZ();
    }
}

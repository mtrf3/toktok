package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* renamed from: X.Dzo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35704Dzo {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C35714Dzy.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C35715Dzz.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C35100Dq4.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C35707Dzr.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C35708Dzs.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C35709Dzt.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C35706Dzq.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C35705Dzp.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C35075Dpf.LJLIL);
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C35093Dpx.LJLIL);
    public static final int LJIIJ = ((Number) C35095Dpz.LIZ.getValue()).intValue();
    public static final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(C35713Dzx.LJLIL);
    public static final boolean LJIIL;
    public static final boolean LJIILIIL;
    public static final boolean LJIILJJIL;
    public static final C62822Ol8 LJIILL;
    public static final boolean LJIILLIIL;
    public static final C62822Ol8 LJIIZILJ;
    public static final C62822Ol8 LJIJ;
    public static final C62822Ol8 LJIJI;
    public static final C62822Ol8 LJIJJ;
    public static final C62822Ol8 LJIJJLI;
    public static final C62822Ol8 LJIL;
    public static final C62822Ol8 LJJ;
    public static final C62822Ol8 LJJI;
    public static final C62822Ol8 LJJIFFI;
    public static final C62822Ol8 LJJII;
    public static final C62822Ol8 LJJIII;
    public static final C62822Ol8 LJJIIJ;
    public static final C62822Ol8 LJJIIJZLJL;
    public static final C62822Ol8 LJJIIZ;

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (E01.LIZ != 1) {
            z = false;
        } else {
            z = true;
        }
        LJIIL = z;
        if (((Number) E04.LIZ.getValue()).intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        LJIILIIL = z2;
        if (((Number) E02.LIZ.getValue()).intValue() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        LJIILJJIL = z3;
        LJIILL = C221108m2.LIZIZ(C35710Dzu.LJLIL);
        if (E00.LIZ == 1) {
            z4 = true;
        }
        LJIILLIIL = z4;
        LJIIZILJ = C221108m2.LIZIZ(C35073Dpd.LJLIL);
        LJIJ = C221108m2.LIZIZ(C35074Dpe.LJLIL);
        LJIJI = C221108m2.LIZIZ(C35711Dzv.LJLIL);
        LJIJJ = C221108m2.LIZIZ(C35703Dzn.LJLIL);
        LJIJJLI = C221108m2.LIZIZ(C35702Dzm.LJLIL);
        LJIL = C221108m2.LIZIZ(C35712Dzw.LJLIL);
        LJJ = C221108m2.LIZIZ(C35246DsQ.LJLIL);
        LJJI = C221108m2.LIZIZ(C35247DsR.LJLIL);
        LJJIFFI = C221108m2.LIZIZ(C35764E1w.LJLIL);
        LJJII = C221108m2.LIZIZ(C35250DsU.LJLIL);
        LJJIII = C221108m2.LIZIZ(C35249DsT.LJLIL);
        LJJIIJ = C221108m2.LIZIZ(C35248DsS.LJLIL);
        LJJIIJZLJL = C221108m2.LIZIZ(C35251DsV.LJLIL);
        LJJIIZ = C221108m2.LIZIZ(C35245DsP.LJLIL);
    }

    public static int LIZ() {
        return ((Number) LJIL.getValue()).intValue();
    }

    public static int LIZIZ() {
        if (C44432HcC.LJLJI) {
            return ((Number) LJIILL.getValue()).intValue();
        }
        return C00F.LIZ(31744, LiveExchangeConfirmThreshold.DEFAULT, "player_prerender_check_video_duration", true);
    }

    public static float LIZJ() {
        if (C44432HcC.LJLJI) {
            return ((Number) LJIIZILJ.getValue()).floatValue();
        }
        FFL.LJIIIZ().getClass();
        return FFL.LJIIIIZZ(31744, "player_volume_loud_unity_exp", -10.0f);
    }

    public static boolean LJ() {
        if (C44432HcC.LJLJI) {
            return ((Boolean) LIZJ.getValue()).booleanValue();
        }
        if (((Number) C35099Dq3.LIZ.getValue()).intValue() == 1 && ((Number) C35132Dqa.LIZ.getValue()).intValue() == 2) {
            return true;
        }
        return false;
    }

    public static boolean LJFF() {
        if (C44432HcC.LJLJI) {
            return ((Boolean) LJII.getValue()).booleanValue();
        }
        if (C00F.LIZ(31744, 1, "player_prerender_need_check_cache", true) == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJI() {
        if (C44432HcC.LJLJI) {
            return ((Boolean) LJIIIIZZ.getValue()).booleanValue();
        }
        if (C00F.LIZ(31744, 0, "player_prerender_need_scroll_check_cache", true) != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJII() {
        if (C44432HcC.LJLJI) {
            return ((Boolean) LJI.getValue()).booleanValue();
        }
        if (C00F.LIZ(31744, 1, "player_prerender_prev_enable", true) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        VideoUrlModel videoUrlModel;
        if (!((Boolean) LJJII.getValue()).booleanValue() || aweme == null) {
            return true;
        }
        if (J8V.LJLJLLL && ((Boolean) LJJIIJ.getValue()).booleanValue()) {
            return true;
        }
        if (C46728IVo.LJIIJ(aweme)) {
            return false;
        }
        Video video = aweme.getVideo();
        if (video != null) {
            videoUrlModel = video.getPlayAddr();
        } else {
            videoUrlModel = null;
        }
        if (C46728IVo.LJ(videoUrlModel) < LJIIJ) {
            return true;
        }
        return false;
    }
}

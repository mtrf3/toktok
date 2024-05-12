package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserProgressBarManager;

/* renamed from: X.2NK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2NK {
    public static int LIZ() {
        return ((int) Math.floor(((NewUserProgressBarManager.LJII / 60) * 100) / 5)) * 5;
    }

    public static Keva LIZIZ() {
        return (Keva) NewUserProgressBarManager.LJIIIZ.getValue();
    }

    public static boolean LIZLLL() {
        if (NewUserProgressBarManager.LJII >= 60) {
            NewUserProgressBarManager.LJFF.removeCallbacks(NewUserProgressBarManager.LJIIJ);
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme) {
        if (aweme == null || aweme.isAd() || aweme.isRelieve() || aweme.isLive() || aweme.isVr() || aweme.getActivityPendant() != null || C220858ld.LJIIIIZZ(aweme)) {
            return false;
        }
        return true;
    }
}

package X;

import Y.ARunnableS37S0100000_1;
import android.R;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import defpackage.i0;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.LqV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55511LqV {
    public static boolean LIZ;
    public static boolean LIZJ;
    public static String LIZLLL;
    public static Long LJ;
    public static String LJFF;
    public static boolean LJII;
    public static String LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static long LJIIL;
    public static boolean LJIILIIL;
    public static boolean LJIILJJIL;
    public static boolean LIZIZ = true;
    public static boolean LJI = true;

    public static final boolean LJII() {
        if (!TextUtils.isEmpty(LJIIIIZZ)) {
            return true;
        }
        TroubleshootingLogDelegate.awesomeSplashLog$default(TroubleshootingLogDelegate.INSTANCE, "no TopView id", null, 2, null);
        return false;
    }

    public static final ISplashAdService LIZ() {
        ISplashAdService LJJI = SplashAdServiceImpl.LJJI();
        o.LJIIIIZZ(LJJI, "get().getService(ISplashAdService::class.java)");
        return LJJI;
    }

    public static final String LIZIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(new C268313n("y+6T0e/qfIqkZDbYHfFiN/8XI5L6pbEB5d+bZ2FLxi1E6LD99U2nNfzcaGWObA==").getAbsolutePath());
        LIZ2.append(File.separator);
        return X1D.LIZIZ(LIZ2);
    }

    public static final VideoUrlModel LIZJ(Video video) {
        if (video == null) {
            return null;
        }
        if (C55120LkC.LIZIZ.LJI()) {
            return video.getPlayAddrH264();
        }
        return video.getPlayAddr();
    }

    public static final String LIZLLL(String str) {
        if (str == null) {
            return null;
        }
        return i0.LJFF(str, "ENC");
    }

    public static final boolean LJ(Aweme aweme) {
        Video video;
        String str = null;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        VideoUrlModel LIZJ2 = LIZJ(video);
        if (LIZJ2 != null) {
            str = LIZJ2.getaK();
        }
        if (C78685UuP.LJJJZ(str)) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(VideoUrlModel videoUrlModel) {
        if (C78685UuP.LJJJZ(videoUrlModel.getaK())) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (splashInfo = awemeRawAd.getSplashInfo()) == null) {
            return false;
        }
        return C78685UuP.LJJJZ(splashInfo.getAwesomeSplashId());
    }

    public static final boolean LJIIIZ(AwemeRawAd awemeRawAd) {
        AwemeSplashInfo splashInfo;
        if (awemeRawAd != null && (splashInfo = awemeRawAd.getSplashInfo()) != null) {
            return C78685UuP.LJJJZ(splashInfo.getAwesomeSplashId());
        }
        return false;
    }

    public static final boolean LJIIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (splashInfo = awemeRawAd.getSplashInfo()) == null || !C78685UuP.LJJJZ(splashInfo.getAwesomeSplashId()) || splashInfo.isShown()) {
            return false;
        }
        return true;
    }

    public static final String LJI(String str, boolean z) {
        if (z) {
            str = LIZLLL(str);
        }
        String LIZIZ2 = LIZIZ();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(LIZIZ2)) {
            String LJFF2 = i0.LJFF(LIZIZ2, str);
            if (C1B6.LIZIZ(LJFF2)) {
                return LJFF2;
            }
        }
        return null;
    }

    public static final void LJIIJJI(int i, View... viewArr) {
        int i2 = 0;
        if (viewArr.length == 0) {
            return;
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                for (View view : viewArr) {
                    if (view != null && view.getVisibility() != 8) {
                        view.setVisibility(0);
                        view.setAlpha(1.0f);
                    }
                }
                return;
            }
            int length = viewArr.length;
            while (i2 < length) {
                View view2 = viewArr[i2];
                if (view2 != null && view2.getVisibility() != 8) {
                    view2.postDelayed(new ARunnableS37S0100000_1(view2, 7), 260L);
                }
                i2++;
            }
            return;
        }
        int length2 = viewArr.length;
        while (i2 < length2) {
            View view3 = viewArr[i2];
            if (view3 != null && view3.getVisibility() != 8) {
                view3.setVisibility(4);
            }
            i2++;
        }
    }

    public static final void LJIIL(ActivityC45651qj activityC45651qj, boolean z) {
        if (activityC45651qj == null) {
            return;
        }
        if (z) {
            if (LJIILJJIL) {
                return;
            } else {
                LJIILJJIL = true;
            }
        }
        View findViewById = activityC45651qj.findViewById(R.id.content);
        if (findViewById != null) {
            findViewById.setAlpha(1.0f);
        }
        activityC45651qj.getWindow().addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        activityC45651qj.getWindow().getDecorView().setBackgroundResource(com.zhiliaoapp.musically.R.drawable.a1n);
        activityC45651qj.getWindow().clearFlags(1024);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("awesome_splash", "recoveryTheme");
    }
}

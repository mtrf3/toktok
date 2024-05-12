package X;

import Y.ACallableS112S0100000_9;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LFR implements InterfaceC53942LFa {
    public static final LFR LJLIL = new LFR();
    public static int LJLILLLLZI = -1;
    public static int LJLJI = -1;
    public static long LJLJJI = -1;
    public static final ArrayList<String> LJLJJL = C47261Igj.LJII("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "com.ss.android.ugc.aweme.live.LivePlayActivity", "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "com.bytedance.hybrid.spark.page.SparkActivity", "com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity");

    public static void LIZ(Activity activity) {
        if (!C54966Lhi.LIZ()) {
            return;
        }
        String LJLLILLLL = C16880lQ.LJLLILLLL(activity.getClass());
        if (LJLLILLLL != null && LJLJJL.contains(LJLLILLLL)) {
            return;
        }
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            if (!LF2.LIZIZ(activity)) {
                activity.setRequestedOrientation(1);
                return;
            } else {
                activity.setRequestedOrientation(13);
                return;
            }
        }
        C10K.LIZIZ(new ACallableS112S0100000_9(activity, 27), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        CountDownTimer countDownTimer = LFT.LIZ;
        if (countDownTimer != null && countDownTimer.isPaused()) {
            LFT.LJ = SystemClock.uptimeMillis();
            CountDownTimer countDownTimer2 = LFT.LIZ;
            if (countDownTimer2 != null) {
                countDownTimer2.resume();
            }
        }
        int i = activity.getResources().getConfiguration().orientation;
        int i2 = LFT.LJFF;
        if (i != i2) {
            LFT.LIZ(i2);
            LFT.LJ = SystemClock.uptimeMillis();
            LFT.LJFF = i;
        }
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (C84763XOl.LJIIJJI) {
            CountDownTimer countDownTimer = LFT.LIZ;
            if (countDownTimer != null) {
                countDownTimer.pause();
            }
            LFT.LIZ(LFT.LJFF);
            LFT.LJ = -1L;
        }
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        int requestedOrientation = activity.getRequestedOrientation();
        int i = LJLILLLLZI;
        if (i != requestedOrientation) {
            if (i != -1) {
                C53946LFe.LIZJ(activity, null);
                C60996Nwm.LIZ = -1;
                C60996Nwm.LIZIZ = -1;
                C88547Yp5.LIZIZ.LJJIJ();
            }
            LJLILLLLZI = requestedOrientation;
        }
        C10K.LIZJ(new ACallableS112S0100000_9(activity, 28));
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // X.InterfaceC53942LFa
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        DisplayMetrics displayMetrics;
        int i;
        Configuration configuration;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(newConfig, "newConfig");
        int LJIILL = C17N.LJIILL(newConfig.screenWidthDp);
        Resources resources = activity.getResources();
        if (resources != null) {
            displayMetrics = resources.getDisplayMetrics();
        } else {
            displayMetrics = null;
        }
        if (displayMetrics != null) {
            i = displayMetrics.widthPixels;
        } else {
            i = 0;
        }
        Resources resources2 = activity.getResources();
        if (resources2 == null || (configuration = resources2.getConfiguration()) == null || newConfig.orientation != configuration.orientation || Math.abs(LJIILL - i) > 100) {
            FMX.LJIIL("tablet_screen_size_not_update", C0RN.LIZJ(LJIILL, "config_width_dp", i, "activity_width_dp").LIZ);
        }
        C53946LFe.LIZJ(activity, null);
        C60996Nwm.LIZ = -1;
        C60996Nwm.LIZIZ = -1;
        C88547Yp5.LIZIZ.LJJIJ();
        int i2 = newConfig.orientation;
        int i3 = LFT.LJFF;
        if (i2 != i3) {
            LFT.LIZ(i3);
            LFT.LJ = SystemClock.uptimeMillis();
            LFT.LJFF = i2;
        }
        LIZJ(newConfig.orientation, activity, "on_config_change");
        LIZ(activity);
    }

    public static void LIZJ(int i, Activity activity, String str) {
        Object obj;
        int i2 = LJLJI;
        if (i2 == -1) {
            LJLJI = i;
            return;
        }
        if (i2 != i) {
            long j = -1;
            if (o.LJ(str, "on_config_change")) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = LJLJJI;
                if (j2 != -1) {
                    j = (currentTimeMillis - j2) / 1000;
                }
                LJLJJI = currentTimeMillis;
            }
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("page_name", C16880lQ.LJLLJ(activity.getClass()));
            c198517qh.LIZ.put("class_name", C16880lQ.LJLLILLLL(activity.getClass()));
            String str2 = "3";
            if (LJLJI == 2) {
                obj = "3";
            } else {
                obj = "1";
            }
            c198517qh.LIZ.put("last_orientation", obj);
            if (i != 2) {
                str2 = "1";
            }
            c198517qh.LIZ.put("now_orientation", str2);
            c198517qh.LIZ.put("enter_method", str);
            c198517qh.LIZ.put("rotation_interval_duration", Long.valueOf(j));
            FMX.LJIILJJIL("screen_rotate", c198517qh.LJ());
            LJLJI = i;
        }
    }
}

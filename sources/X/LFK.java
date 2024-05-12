package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LFK implements InterfaceC53942LFa {
    public static int LJLILLLLZI;
    public static final LFK LJLIL = new LFK();
    public static final ArrayList<String> LJLJI = C47261Igj.LJII("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "com.ss.android.ugc.aweme.main.MainActivity", "com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "com.ss.android.ugc.aweme.live.LivePlayActivity", "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");

    @Override // X.InterfaceC53942LFa
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(newConfig, "newConfig");
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
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        if (bundle == null) {
            try {
                String LJLLILLLL = C16880lQ.LJLLILLLL(activity.getClass());
                if (LJLLILLLL != null) {
                    LJLILLLLZI++;
                    if (activity.getResources().getConfiguration().orientation != 1) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(C16880lQ.LJLLJ(activity.getClass()));
                        LIZ.append(".orientation:");
                        LIZ.append(activity.getResources().getConfiguration().orientation);
                        LIZ.append(" , onActivityPreCreated");
                        LFE.LIZIZ("orientationFix", X1D.LIZIZ(LIZ));
                        C198517qh c198517qh = new C198517qh();
                        c198517qh.LIZ.put("page_name", C16880lQ.LJLLJ(activity.getClass()));
                        c198517qh.LIZ.put("class_name", C16880lQ.LJLLILLLL(activity.getClass()));
                        c198517qh.LIZ.put("enter_method", "preCreated");
                        c198517qh.LIZ.put("page_number", Integer.valueOf(LJLILLLLZI));
                        FMX.LJIILJJIL("fix_activity_orientation_phone", c198517qh.LJ());
                        if (!LJLJI.contains(LJLLILLLL)) {
                            activity.setRequestedOrientation(1);
                        }
                    }
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // X.InterfaceC53942LFa, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }
}

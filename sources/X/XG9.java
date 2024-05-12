package X;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XG9 implements Application.ActivityLifecycleCallbacks {
    public static long LJLILLLLZI;
    public static Intent LJLJI;
    public static String LJLJJI;
    public static final XG9 LJLIL = new XG9();
    public static final C62822Ol8 LJLJJL = C221108m2.LIZIZ(XG8.LJLIL);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    public static void LIZ(String ticket) {
        o.LJIIIZ(ticket, "ticket");
        ((Keva) LJLJJL.getValue()).storeLong(ticket, System.currentTimeMillis());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (System.currentTimeMillis() - LJLILLLLZI < 120000 && LJLJI != null && !TextUtils.isEmpty(LJLJJI) && !((Keva) LJLJJL.getValue()).contains(LJLJJI)) {
            String str = LJLJJI;
            o.LJI(str);
            LIZ(str);
            C16880lQ.LIZJ(EF7.LIZIZ(), LJLJI);
            LJLJI = null;
            LJLJJI = "";
        }
    }
}

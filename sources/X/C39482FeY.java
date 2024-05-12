package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.hybrid.base.NavigationConfig;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.FeY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39482FeY implements Application.ActivityLifecycleCallbacks {
    public NavigationConfig LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
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

    public C39482FeY(NavigationConfig config) {
        o.LJIIIZ(config, "config");
        this.LJLIL = config;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        String LJLLILLLL;
        o.LJIIIZ(activity, "activity");
        if (this.LJLIL.enable && (LJLLILLLL = C16880lQ.LJLLILLLL(activity.getClass())) != null) {
            List<C39480FeW> list = C39481FeX.LIZ.get(LJLLILLLL);
            if (list != null) {
                ListProtector.remove(list, C47261Igj.LJJI(list));
            }
            if (this.LJLIL.enableRouterRecord) {
                C39483FeZ.LIZIZ.getClass();
                try {
                    C3C5.m7constructorimpl(C39483FeZ.LIZ.remove(LJLLILLLL));
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            if (this.LJLIL.enableUrlRecord) {
                String activityHashCode = String.valueOf(activity.hashCode());
                o.LJIIIZ(activityHashCode, "activityHashCode");
                try {
                    ConcurrentHashMap<String, List<C60682Zs>> concurrentHashMap = C39479FeV.LJI;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LJLLILLLL);
                    LIZ.append(activityHashCode);
                    C3C5.m7constructorimpl(concurrentHashMap.remove(X1D.LIZIZ(LIZ)));
                } catch (Throwable th2) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        String LJLLILLLL;
        o.LJIIIZ(activity, "activity");
        NavigationConfig navigationConfig = this.LJLIL;
        if (!navigationConfig.enable || !navigationConfig.enableRouterRecord || (LJLLILLLL = C16880lQ.LJLLILLLL(activity.getClass())) == null || LJLLILLLL.length() == 0) {
            return;
        }
        ConcurrentLinkedQueue<C39480FeW> concurrentLinkedQueue = C39481FeX.LIZIZ;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        try {
            if (o.LJ(LJLLILLLL, "com.ss.android.ugc.aweme.main.MainActivity") && (!o.LJ(((C39480FeW) ORZ.LLF(concurrentLinkedQueue)).LJLILLLLZI, "com.ss.android.ugc.aweme.main.MainActivity"))) {
                concurrentLinkedQueue.clear();
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}

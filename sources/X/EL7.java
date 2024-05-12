package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IAutoCutService;
import com.ss.android.ugc.aweme.servicimpl.AutoCutServiceImpl;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EL7 implements Application.ActivityLifecycleCallbacks {
    public final java.util.Set<Class<? extends Activity>> LJLIL;
    public final java.util.Set<Class<? extends Activity>> LJLILLLLZI;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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

    public EL7() {
        IAutoCutService iAutoCutService;
        Object LIZ = C58096Mr6.LIZ(IAutoCutService.class, false);
        if (LIZ != null) {
            iAutoCutService = (IAutoCutService) LIZ;
        } else {
            if (C58096Mr6.k6 == null) {
                synchronized (IAutoCutService.class) {
                    if (C58096Mr6.k6 == null) {
                        C58096Mr6.k6 = new AutoCutServiceImpl();
                    }
                }
            }
            iAutoCutService = C58096Mr6.k6;
        }
        this.LJLIL = iAutoCutService.LIZ();
        this.LJLILLLLZI = new LinkedHashSet();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        Class<?> cls = activity.getClass();
        if (this.LJLIL.contains(cls)) {
            this.LJLILLLLZI.remove(cls);
        }
        if (this.LJLILLLLZI.isEmpty()) {
            C36942Eeg.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        Class<?> cls = activity.getClass();
        if (this.LJLIL.contains(cls)) {
            this.LJLILLLLZI.add(cls);
        }
    }
}

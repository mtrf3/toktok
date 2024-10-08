package androidx.lifecycle;

import X.C16880lQ;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class LifecycleDispatcher {
    public static AtomicBoolean sInitialized = new AtomicBoolean(false);

    public static void init(Context context) {
        if (sInitialized.getAndSet(true)) {
            return;
        }
        ((Application) C16880lQ.LLLLL(context)).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
    }

    /* loaded from: classes.dex */
    public static class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ReportFragment.injectIfNeededIn(activity);
        }
    }
}

package X;

import android.app.Application;
import com.bytedance.common.push.ActivityLifecycleObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class QM0 {
    public static volatile Application LIZ;
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static void LIZ(Application application) {
        if (LIZIZ.getAndSet(true)) {
            return;
        }
        LIZ = application;
        if (!C36929EeT.LJFF(application)) {
            return;
        }
        LIZ.registerActivityLifecycleCallbacks(ActivityLifecycleObserver.getIns());
    }
}

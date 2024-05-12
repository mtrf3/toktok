package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.common.utility.collection.WeakHandler;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Iva, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48182Iva implements Application.ActivityLifecycleCallbacks {
    public static boolean LJLILLLLZI;
    public static final WeakHandler LJLJI = new WeakHandler(C16880lQ.LLJJJJ(), new C48184Ivc());
    public final List<AbstractC48183Ivb> LJLIL = new CopyOnWriteArrayList();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public C48182Iva() {
        java.util.Map map;
        Activity activity = null;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            map = (java.util.Map) declaredField.get(invoke);
        } catch (Throwable unused) {
        }
        if (map != null) {
            for (Object obj : map.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    activity = (Activity) declaredField3.get(obj);
                    if (activity != null) {
                        LJLILLLLZI = true;
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (LJLILLLLZI) {
            Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                LJLJI.postDelayed(((AbstractC48183Ivb) it.next()).LIZIZ, r0.LIZ);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (!LJLILLLLZI) {
            LJLILLLLZI = true;
            Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                ((AbstractC48183Ivb) it.next()).LIZIZ();
            }
        }
        LJLJI.removeCallbacksAndMessages(null);
    }
}

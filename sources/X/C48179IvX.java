package X;

import Y.ARunnableS44S0100000_8;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.lang.reflect.Field;

/* renamed from: X.IvX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48179IvX implements Application.ActivityLifecycleCallbacks {
    public static boolean LJLJI;
    public static final WeakHandler LJLJJI = new WeakHandler(C16880lQ.LLJJJJ(), new C48181IvZ());
    public C48180IvY LJLIL;
    public final ARunnableS44S0100000_8 LJLILLLLZI = new ARunnableS44S0100000_8(this, 75);

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

    public C48179IvX() {
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
                        LJLJI = true;
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (LJLJI) {
            LJLJJI.postDelayed(this.LJLILLLLZI, 30000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (!LJLJI) {
            LJLJI = true;
            if (this.LJLIL != null) {
                C64811Pc7 LJ = C64811Pc7.LJ();
                LJ.getClass();
                Message obtain = Message.obtain();
                obtain.obj = LJ;
                obtain.what = 7;
                C64811Pc7.LLD.sendMessage(obtain);
            }
        }
        LJLJJI.removeCallbacks(this.LJLILLLLZI);
    }
}

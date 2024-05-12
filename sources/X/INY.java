package X;

import android.app.Activity;
import android.app.ActivityOptions;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes9.dex */
public final class INY {
    public static void LIZ(Activity activity) {
        INX inx = new INX() { // from class: X.INZ
            @Override // X.INX
            public final void LIZ() {
            }
        };
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(activity, new Object[0]);
            for (Class<?> cls : Activity.class.getDeclaredClasses()) {
                if (C16880lQ.LJLLJ(cls).equals("TranslucentConversionListener")) {
                    if (cls == null) {
                        return;
                    }
                    Object newProxyInstance = Proxy.newProxyInstance(Activity.class.getClassLoader(), new Class[]{cls}, new INW(new WeakReference(inx)));
                    Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(activity, newProxyInstance, invoke);
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }
}

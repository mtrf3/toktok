package X;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class F62 extends Instrumentation {
    public final Instrumentation LIZ;
    public final F63 LIZIZ;

    public static void LIZ(F63 f63) {
        Field declaredField;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod == null) {
                return;
            }
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke == null || (declaredField = invoke.getClass().getDeclaredField("mInstrumentation")) == null) {
                return;
            }
            declaredField.setAccessible(true);
            Instrumentation instrumentation = (Instrumentation) declaredField.get(invoke);
            if (instrumentation == null) {
                return;
            }
            declaredField.set(invoke, new F62(instrumentation, f63));
        } catch (Exception unused) {
        }
    }

    public F62(Instrumentation instrumentation, F63 f63) {
        this.LIZ = instrumentation;
        this.LIZIZ = f63;
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        F63 f63;
        if (!TextUtils.isEmpty(str) && intent != null && (f63 = this.LIZIZ) != null) {
            str = f63.LIZ(intent, str);
        }
        return this.LIZ.newActivity(classLoader, str, intent);
    }
}

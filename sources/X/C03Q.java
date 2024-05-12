package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.03Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03Q {
    public static final Method LIZ;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            LIZ = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public static boolean LIZ(View view) {
        if (C16310kV.LIZLLL(view) == 1) {
            return true;
        }
        return false;
    }
}

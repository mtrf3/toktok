package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.IxN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48293IxN {
    public static final Method LIZ;
    public static final Field LIZIZ;
    public static final int LIZJ;

    static {
        try {
            Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
        } catch (NoSuchMethodException unused) {
        }
        try {
            LIZ = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            LIZIZ = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException unused3) {
        }
        try {
            LIZJ = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
        } catch (IllegalAccessException | NoSuchFieldException unused4) {
        }
    }

    public static void LIZIZ(Window window, boolean z) {
        int i;
        int i2;
        if (JF4.LIZ < 23) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            try {
                Field declaredField = attributes.getClass().getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                declaredField.setAccessible(true);
                int i3 = declaredField.getInt(attributes);
                Field declaredField2 = attributes.getClass().getDeclaredField("meizuFlags");
                declaredField2.setAccessible(true);
                int i4 = declaredField2.getInt(attributes);
                if (!z) {
                    i2 = (~i3) & i4;
                } else {
                    i2 = i3 | i4;
                }
                if (i4 != i2) {
                    declaredField2.setInt(attributes, i2);
                    return;
                }
                return;
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
                return;
            } catch (IllegalArgumentException e2) {
                C16880lQ.LLLLIIL(e2);
                return;
            } catch (NoSuchFieldException e3) {
                C16880lQ.LLLLIIL(e3);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = LIZJ | systemUiVisibility;
        } else {
            i = (~LIZJ) & systemUiVisibility;
        }
        if (i != systemUiVisibility) {
            decorView.setSystemUiVisibility(i);
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        Field field = LIZIZ;
        if (field != null) {
            try {
                if (field.getInt(attributes2) != 0) {
                    field.set(attributes2, 0);
                    window.setAttributes(attributes2);
                }
            } catch (IllegalAccessException e4) {
                C16880lQ.LLLLIIL(e4);
            }
        }
    }

    public static void LIZ(Activity activity, boolean z, boolean z2) {
        Method method = LIZ;
        if (method != null) {
            try {
                Object[] objArr = {Boolean.valueOf(z)};
                if (!new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{activity, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-1401730176918848709")).LIZ) {
                    method.invoke(activity, objArr);
                    return;
                }
                return;
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
                return;
            } catch (InvocationTargetException e2) {
                C16880lQ.LLLLIIL(e2);
                return;
            }
        }
        if (z2) {
            LIZIZ(activity.getWindow(), z);
        }
    }
}

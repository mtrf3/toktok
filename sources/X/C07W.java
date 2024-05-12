package X;

import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.07W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C07W {
    public static Method LIZ;
    public static boolean LIZIZ;
    public static Field LIZJ;
    public static boolean LIZLLL;

    public static void LIZ(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            C07V.LIZJ(popupWindow, z);
            return;
        }
        if (!LIZLLL) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                LIZJ = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            LIZLLL = true;
        }
        Field field = LIZJ;
        if (field == null) {
            return;
        }
        try {
            field.set(popupWindow, Boolean.valueOf(z));
        } catch (IllegalAccessException unused2) {
        }
    }

    public static void LIZIZ(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C07V.LIZLLL(popupWindow, i);
            return;
        }
        if (!LIZIZ) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                LIZ = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            LIZIZ = true;
        }
        Method method = LIZ;
        if (method == null) {
            return;
        }
        try {
            method.invoke(popupWindow, Integer.valueOf(i));
        } catch (Exception unused2) {
        }
    }
}

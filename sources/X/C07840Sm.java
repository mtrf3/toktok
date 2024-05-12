package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.0Sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07840Sm {
    public static Method LIZ;
    public static boolean LIZIZ;
    public static Method LIZJ;
    public static boolean LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            LIZ(C07810Sj.LIZJ((InsetDrawable) drawable));
            return;
        }
        if (drawable instanceof InterfaceC07870Sp) {
            LIZ(((InterfaceC07870Sp) drawable).LIZIZ());
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Drawable LIZIZ2 = C07810Sj.LIZIZ(drawableContainerState, i);
            if (LIZIZ2 != null) {
                LIZ(LIZIZ2);
            }
        }
    }

    public static int LIZIZ(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C07830Sl.LIZ(drawable);
        }
        if (!LIZLLL) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                LIZJ = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            LIZLLL = true;
        }
        Method method = LIZJ;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                LIZJ = null;
            }
        }
        return 0;
    }

    public static Drawable LJFF(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (!(drawable instanceof InterfaceC07860So)) {
            return new C42001kq(drawable);
        }
        return drawable;
    }

    public static boolean LIZJ(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C07830Sl.LIZIZ(drawable, i);
        }
        if (!LIZIZ) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                LIZ = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            LIZIZ = true;
        }
        Method method = LIZ;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                LIZ = null;
            }
        }
        return false;
    }
}

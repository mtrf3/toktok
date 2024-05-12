package X;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.Uxi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78890Uxi {
    public static final C78891Uxj LIZ;

    static {
        if (Build.VERSION.SDK_INT >= 22) {
            LIZ = new C47514Iko();
        } else {
            LIZ = new C78891Uxj();
        }
    }

    public static void LIZ(View view, Matrix matrix) {
        LIZ.LIZIZ.getClass();
        if (!C78886Uxe.LJLJLLL) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setAnimationMatrix", Matrix.class);
                C78886Uxe.LJLJLJ = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            C78886Uxe.LJLJLLL = true;
        }
        Method method = C78886Uxe.LJLJLJ;
        if (method != null) {
            try {
                C78886Uxe.LJ(view, method, new Object[]{matrix});
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e.getCause());
            } catch (InvocationTargetException unused2) {
            }
        }
    }

    public static void LIZIZ(ViewGroup viewGroup, boolean z) {
        LIZ.LIZ.getClass();
        if (!C77321UWf.LJLJI) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                C77321UWf.LJLILLLLZI = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            C77321UWf.LJLJI = true;
        }
        Method method = C77321UWf.LJLILLLLZI;
        if (method != null) {
            try {
                C77321UWf.LJIIIIZZ(viewGroup, method, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    public static void LIZJ(View view, Matrix matrix) {
        LIZ.LIZIZ.getClass();
        if (!C78886Uxe.LJLJL) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                C78886Uxe.LJLJJLL = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            C78886Uxe.LJLJL = true;
        }
        Method method = C78886Uxe.LJLJJLL;
        if (method != null) {
            try {
                C78886Uxe.LJ(view, method, new Object[]{matrix});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}

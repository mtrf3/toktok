package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.0Ez, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04330Ez {
    public static final Object LIZ = new Object();
    public static final Object LIZIZ = new Object();

    public static Executor LIZLLL(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C04310Ex.LIZ(context);
        }
        final Handler handler = new Handler(context.getMainLooper());
        return new Executor(handler) { // from class: X.0bL
            public final Handler LJLIL;

            {
                this.LJLIL = handler;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Handler handler2 = this.LJLIL;
                runnable.getClass();
                if (handler2.post(runnable)) {
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.LJLIL);
                LIZ2.append(" is shutting down");
                throw new RejectedExecutionException(X1D.LIZIZ(LIZ2));
            }
        };
    }

    public static int LIZ(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int LIZIZ(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C04280Eu.LIZ(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static ColorStateList LIZJ(int i, Context context) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0OY c0oy;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C0OZ c0oz = new C0OZ(resources, theme);
        synchronized (C06690Ob.LIZJ) {
            SparseArray<C0OY> sparseArray = C06690Ob.LIZIZ.get(c0oz);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (c0oy = sparseArray.get(i)) != null) {
                if (c0oy.LIZIZ.equals(resources.getConfiguration()) && ((theme == null && c0oy.LIZJ == 0) || (theme != null && c0oy.LIZJ == theme.hashCode()))) {
                    colorStateList2 = c0oy.LIZ;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = C06690Ob.LIZ;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        if (!z) {
            try {
                colorStateList = C0OP.LIZ(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateList != null) {
            C06690Ob.LIZ(c0oz, i, colorStateList, theme);
            return colorStateList;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return C0OX.LIZIZ(resources, i, theme);
        }
        return resources.getColorStateList(i);
    }

    public static <T> T LJ(Context context, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) C04280Eu.LIZIZ(context, cls);
        }
        String str = C04320Ey.LIZ.get(cls);
        if (str != null) {
            return (T) C16880lQ.LLILL(context, str);
        }
        return null;
    }
}

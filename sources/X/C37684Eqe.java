package X;

import android.os.Handler;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.Eqe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37684Eqe {
    public static final Class<?> LIZ;

    public static Object LIZLLL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-2843654214711561291"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static Handler LJ() {
        try {
            return (Handler) C36508EUm.LIZJ(LIZLLL(null, C36508EUm.LIZIZ(LIZ, "currentActivityThread", new Class[0]), new Object[0]), "mH");
        } catch (Throwable th) {
            android.util.Log.getStackTraceString(th);
            return null;
        }
    }

    static {
        C16880lQ.LJLLJ(C37684Eqe.class);
        try {
            LIZ = Class.forName("android.app.ActivityThread");
        } catch (Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public static boolean LIZ(Handler handler) {
        try {
            Class<?> cls = LIZ;
            C37685Eqf.LIZIZ(C37685Eqf.LIZ(C36508EUm.LIZ(cls, "mH")), LIZLLL(null, C36508EUm.LIZIZ(cls, "currentActivityThread", new Class[0]), new Object[0]), handler);
            return true;
        } catch (Throwable th) {
            android.util.Log.getStackTraceString(th);
            return false;
        }
    }

    public static Handler LJFF(ViewParent viewParent) {
        try {
            return (Handler) C36508EUm.LIZJ(viewParent, "mHandler");
        } catch (Throwable th) {
            android.util.Log.getStackTraceString(th);
            return null;
        }
    }

    public static boolean LIZIZ(Handler handler, Handler handler2) {
        try {
            Field LIZ2 = C36508EUm.LIZ(Handler.class, "mCallback");
            C37685Eqf.LIZIZ(C37685Eqf.LIZ(LIZ2), handler2, (Handler.Callback) LIZ2.get(handler));
            return true;
        } catch (Exception e) {
            android.util.Log.getStackTraceString(e);
            return false;
        }
    }

    public static boolean LIZJ(Handler handler, ViewParent viewParent) {
        try {
            C37685Eqf.LIZIZ(C37685Eqf.LIZ(C36508EUm.LIZ(viewParent.getClass(), "mHandler")), viewParent, handler);
            return true;
        } catch (Throwable th) {
            android.util.Log.getStackTraceString(th);
            return false;
        }
    }
}

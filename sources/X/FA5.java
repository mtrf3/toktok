package X;

import android.os.Handler;
import com.bytedance.sysoptimizer.java.ReflectionUtils;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public final class FA5 {
    public static void LIZIZ(Handler handler, Handler handler2) {
        try {
            Field LIZ = C36508EUm.LIZ(Handler.class, "mCallback");
            Handler.Callback callback = (Handler.Callback) LIZ.get(handler);
            if (callback != null) {
                ReflectionUtils.removeFinal(LIZ);
                LIZ.set(handler2, callback);
            }
        } catch (Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public static void LIZJ(Object obj, Field field, Object obj2) {
        try {
            C37685Eqf.LIZIZ(C37685Eqf.LIZ(field), obj, obj2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reset ");
            LIZ.append(obj.getClass().getName());
            LIZ.append(":");
            LIZ.append(field.getName());
            LIZ.append(" to ");
            LIZ.append(obj2.getClass().getName());
            LIZ.append(" success");
            X1D.LIZIZ(LIZ);
        } catch (Throwable th) {
            android.util.Log.getStackTraceString(th);
        }
    }

    public static void LIZ(Object obj, Field field, Object obj2, Object obj3) {
        try {
            C37685Eqf.LIZIZ(C37685Eqf.LIZ(field), obj, obj3);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("change ");
            LIZ.append(obj2.getClass().getName());
            LIZ.append(" to ");
            LIZ.append(obj3.getClass().getName());
            LIZ.append(" success");
            X1D.LIZIZ(LIZ);
        } catch (Throwable th) {
            android.util.Log.getStackTraceString(th);
        }
    }
}

package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EXU {
    public static final XIF LIZ;

    static {
        Handler handler;
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "Looper.getMainLooper()");
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, LLJJJJ);
            if (invoke != null) {
                handler = (Handler) invoke;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
            }
        } else {
            try {
                Constructor declaredConstructor = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE);
                o.LJIIIIZZ(declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
                Object newInstance = declaredConstructor.newInstance(LLJJJJ, null, Boolean.TRUE);
                o.LJIIIIZZ(newInstance, "constructor.newInstance(this, null, true)");
                handler = (Handler) newInstance;
            } catch (NoSuchMethodException unused) {
                handler = new Handler(LLJJJJ);
            }
        }
        LIZ = EXR.LIZIZ(handler, "fast-main");
    }
}

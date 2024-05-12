package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EXZ {
    public static final XIF LIZ;

    static {
        Handler handler;
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "getMainLooper()");
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Handler.createAsync(LLJJJJ);
            o.LJIIIIZZ(handler, "createAsync(this)");
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

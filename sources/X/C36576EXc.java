package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.o;

/* renamed from: X.EXc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36576EXc {
    public static final FSJ LIZ;
    public static final FSJ LIZIZ;
    public static final XIF LIZJ;

    static {
        Handler handler;
        C38020Ew4 c38020Ew4 = C37995Evf.LIZ;
        LIZ = new FSJ(c38020Ew4);
        LIZIZ = new FSJ(c38020Ew4);
        new FSJ(C37995Evf.LIZJ);
        new FSJ(C37995Evf.LIZIZ);
        new FSJ(C37995Evf.LIZLLL);
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
        LIZJ = EXR.LIZIZ(handler, "fast-main");
    }
}

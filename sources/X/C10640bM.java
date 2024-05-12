package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0bM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10640bM {
    public static Handler LIZ(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw cause;
                }
                throw new RuntimeException(cause);
            }
            throw cause;
        }
    }

    public static void LIZIZ(Handler handler, Runnable runnable, Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            handler.postDelayed(runnable, obj, j);
            return;
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        handler.sendMessageDelayed(obtain, j);
    }
}

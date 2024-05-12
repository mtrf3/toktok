package kotlinx.coroutines.android;

import X.C16880lQ;
import X.MB6;
import X.MBA;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes13.dex */
public final class AndroidExceptionPreHandler extends MB6 implements CoroutineExceptionHandler {
    public volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.LJJJJIZL);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(MBA mba, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        if (Build.VERSION.SDK_INT >= 28) {
            LLLLIIIILLL.getUncaughtExceptionHandler().uncaughtException(LLLLIIIILLL, th);
            return;
        }
        Method preHandler = preHandler();
        Object obj = null;
        if (preHandler != null) {
            obj = preHandler.invoke(null, new Object[0]);
        }
        if (!(obj instanceof Thread.UncaughtExceptionHandler) || (uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj) == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(LLLLIIIILLL, th);
    }
}

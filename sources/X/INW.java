package X;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public class INW implements InvocationHandler {
    public final WeakReference<INX> LIZ;

    public INW(WeakReference<INX> weakReference) {
        this.LIZ = weakReference;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            if (((Boolean) objArr[0]).booleanValue() && this.LIZ.get() != null) {
                this.LIZ.get().LIZ();
                return null;
            }
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}

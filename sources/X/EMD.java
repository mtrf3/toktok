package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* loaded from: classes7.dex */
public final class EMD {
    public static final /* synthetic */ int LIZ = 0;

    public static <T> T LIZ(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(EMD.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}

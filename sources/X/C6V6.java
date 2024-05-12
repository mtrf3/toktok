package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.o;

/* renamed from: X.6V6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6V6 {
    public static Object LIZ(Class cls) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: X.6VJ
            public static final /* synthetic */ int LIZ = 0;

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object proxy, Method method, Object[] objArr) {
                o.LJIIIZ(proxy, "proxy");
                o.LJIIIZ(method, "method");
                Class<?> returnType = method.getReturnType();
                if (returnType.isAssignableFrom(Void.class)) {
                    return null;
                }
                Class<?> cls2 = Integer.TYPE;
                if (!returnType.isAssignableFrom(cls2) && !returnType.isAssignableFrom(cls2)) {
                    Class<?> cls3 = Boolean.TYPE;
                    o.LJI(cls3);
                    if (returnType.isAssignableFrom(cls3)) {
                        return Boolean.FALSE;
                    }
                    if (returnType.isAssignableFrom(cls3)) {
                        return Boolean.FALSE;
                    }
                    if (returnType.isAssignableFrom(Boolean.class)) {
                        return Boolean.FALSE;
                    }
                    if (returnType.isAssignableFrom(String.class)) {
                        return "";
                    }
                    Class<?> cls4 = Float.TYPE;
                    if (returnType.isAssignableFrom(cls4)) {
                        return Float.valueOf(0.0f);
                    }
                    if (returnType.isAssignableFrom(cls4)) {
                        return Float.valueOf(0.0f);
                    }
                    if (!returnType.isInterface()) {
                        return null;
                    }
                    return Proxy.newProxyInstance(returnType.getClassLoader(), new Class[]{returnType}, this);
                }
                return 0;
            }
        });
    }
}

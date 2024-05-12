package com.ss.android.ugc.aweme.framework.services;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes7.dex */
public class DynamicProxy {
    public static <T> T get(Class<?> cls) {
        if (cls == null || !cls.isInterface()) {
            return null;
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.ss.android.ugc.aweme.framework.services.DynamicProxy.1
            public static Object com_ss_android_ugc_aweme_framework_services_DynamicProxy$1_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
                C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "6765807754880309192"));
                return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    return com_ss_android_ugc_aweme_framework_services_DynamicProxy$1_java_lang_reflect_Method_invoke(method, this, objArr);
                }
                Class<?> returnType = method.getReturnType();
                if (returnType.isPrimitive()) {
                    return Defaults.defaultValue(returnType);
                }
                return method.getDefaultValue();
            }
        });
    }
}

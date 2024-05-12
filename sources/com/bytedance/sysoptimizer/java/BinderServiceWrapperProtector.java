package com.bytedance.sysoptimizer.java;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* loaded from: classes12.dex */
public final class BinderServiceWrapperProtector {
    public static final AdminResult VOID_ADMIN_RESULT = new VoidAdminResult();
    public static boolean sDebug;

    /* loaded from: classes12.dex */
    public interface AdminResult {
        Object getDefaultResult(Object obj, Method method, Object[] objArr);
    }

    public static void setDebug(boolean z) {
        sDebug = z;
    }

    /* loaded from: classes12.dex */
    public static final class VoidAdminResult implements AdminResult {
        @Override // com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector.AdminResult
        public Object getDefaultResult(Object obj, Method method, Object[] objArr) {
            return 1;
        }
    }

    public static void setProxy(Object obj, Object obj2, Field field, String str) {
        try {
            field.set(obj2, obj);
        } catch (Throwable unused) {
        }
    }

    public static boolean install(Context context, String str, final List<String> list, final String str2, final AdminResult adminResult) {
        try {
            Object LLILL = C16880lQ.LLILL(context, str);
            if (LLILL == null) {
                return false;
            }
            Field declaredField = LLILL.getClass().getDeclaredField("mService");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(LLILL);
            if (obj == null) {
                return false;
            }
            setProxy(Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() { // from class: com.bytedance.sysoptimizer.java.BinderServiceWrapperProtector.1
                public static Object com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_java_lang_reflect_Method_invoke(Method method, Object obj2, Object[] objArr) {
                    C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj2, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "7796508879562285842"));
                    return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj2, objArr);
                }

                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj2, Method method, Object[] objArr) {
                    if (list.contains(method.getName())) {
                        try {
                            return com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_java_lang_reflect_Method_invoke(method, obj, objArr);
                        } catch (Throwable unused) {
                            AdminResult adminResult2 = adminResult;
                            if (adminResult2 != null) {
                                return adminResult2.getDefaultResult(obj2, method, objArr);
                            }
                        }
                    }
                    return com_bytedance_sysoptimizer_java_BinderServiceWrapperProtector$1_java_lang_reflect_Method_invoke(method, obj, objArr);
                }
            }), LLILL, declaredField, str2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

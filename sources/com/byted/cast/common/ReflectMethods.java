package com.byted.cast.common;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.X1D;
import java.lang.reflect.Method;

/* loaded from: classes29.dex */
public class ReflectMethods {
    public static final String TAG = ReflectMethods.class.getName();

    public static Object com_byted_cast_common_ReflectMethods_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-7461423701915122550"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static Object invokeStaticMethod(String str, String str2, Class[] clsArr, Object[] objArr) {
        try {
            Method method = null;
            for (Class<?> cls = Class.forName(str); cls != Object.class; cls = cls.getSuperclass()) {
                try {
                    method = cls.getMethod(str2, clsArr);
                } catch (Exception unused) {
                }
                if (method != null) {
                    break;
                }
            }
            if (method != null) {
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                Object com_byted_cast_common_ReflectMethods_java_lang_reflect_Method_invoke = com_byted_cast_common_ReflectMethods_java_lang_reflect_Method_invoke(method, null, objArr);
                String str3 = TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("invoke ");
                LIZ.append(str2);
                LIZ.append(" method succeed");
                Logger.d(str3, X1D.LIZIZ(LIZ));
                return com_byted_cast_common_ReflectMethods_java_lang_reflect_Method_invoke;
            }
            String str4 = TAG;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("not found ");
            LIZ2.append(str2);
            LIZ2.append(" method");
            Logger.i(str4, X1D.LIZIZ(LIZ2));
            return null;
        } catch (Exception e) {
            String str5 = TAG;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("invoke ");
            LIZ3.append(str2);
            LIZ3.append(" method failed: ");
            LIZ3.append(e);
            Logger.i(str5, X1D.LIZIZ(LIZ3));
            return null;
        }
    }
}

package com.bytedance.xtrace.utils;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class TraceHelper {
    public static Constructor getNoArgsConstructor(String str) {
        try {
            return Class.forName(str).getDeclaredConstructors()[0];
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<?>[] getParamsType(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof String) {
                try {
                    clsArr[i] = Class.forName((String) obj);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else if (obj instanceof Class) {
                clsArr[i] = obj;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("not support params type :");
                LIZ.append(obj.getClass().getName());
                throw new RuntimeException(X1D.LIZIZ(LIZ));
            }
        }
        return clsArr;
    }

    public static boolean isDebugApk(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) == 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void loadClass(String str) {
        try {
            Class.forName(str);
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static Constructor getNoArgsConstructor(Class cls) {
        return cls.getDeclaredConstructors()[0];
    }

    public static Constructor getConstructorWithArgs(Class cls, Class... clsArr) {
        try {
            return cls.getConstructor(clsArr);
        } catch (NoSuchMethodException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static Method getMethod(Class cls, String str, Object... objArr) {
        try {
            return cls.getDeclaredMethod(str, getParamsType(objArr));
        } catch (NoSuchMethodException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static Method getMethodByPassHiddenApi(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static Method getMethod(String str, String str2, Object... objArr) {
        try {
            return getMethod(Class.forName(str), str2, objArr);
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}

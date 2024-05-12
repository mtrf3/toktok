package com.bytedance.sysoptimizer;

import X.X1D;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class HackHelper {
    public static Map<String, Field> sFieldCache = new HashMap();
    public static Map<String, Method> sMethodCache = new HashMap();
    public static Map<String, Constructor> sConstructorCache = new HashMap();
    public static boolean sInited = false;

    public static void init() {
        if (!sInited) {
            try {
                writeField(HackHelperImpl.class, "classLoader", (Object) null);
            } catch (Exception unused) {
            }
            sInited = true;
        }
    }

    public static <T> void checkNotNull(T t, String str) {
        if (t != null) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void checkTrue(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static Constructor getConstructor(Class<?> cls, Class<?>... clsArr) {
        Constructor constructor;
        checkNotNull(cls, "The class must not be null !!!");
        String methodKey = getMethodKey(cls, "clinit", clsArr);
        synchronized (sConstructorCache) {
            constructor = sConstructorCache.get(methodKey);
        }
        if (constructor != null) {
            if (!constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
            return constructor;
        }
        try {
            Constructor constructor2 = HackHelperImpl.getConstructor(cls, clsArr);
            if (constructor2 != null) {
                synchronized (sConstructorCache) {
                    sConstructorCache.put(methodKey, constructor2);
                }
            }
            return constructor2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field getField(Class<?> cls, String str) {
        Field field;
        checkNotNull(cls, "The class must not be null !!!");
        checkTrue(!TextUtils.isEmpty(str), "The field name must not be blank !!!");
        String fieldKey = getFieldKey(cls, str);
        synchronized (sFieldCache) {
            field = sFieldCache.get(fieldKey);
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        try {
            Field field2 = HackHelperImpl.getField(cls, str);
            if (field2 != null) {
                synchronized (sFieldCache) {
                    sFieldCache.put(fieldKey, field2);
                }
            }
            return field2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getFieldKey(Class<?> cls, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(cls.getName());
        LIZ.append("#");
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        checkNotNull(cls, "The class must not be null !!!");
        checkTrue(!TextUtils.isEmpty(str), "The method name must not be blank !!!");
        String methodKey = getMethodKey(cls, str, clsArr);
        synchronized (sMethodCache) {
            method = sMethodCache.get(methodKey);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        try {
            Method method2 = HackHelperImpl.getMethod(cls, str, clsArr);
            if (method2 != null) {
                synchronized (sMethodCache) {
                    sMethodCache.put(methodKey, method2);
                }
            }
            return method2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getMethodKey(Class<?> cls, String str, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append("#");
        sb.append(str);
        if (clsArr != null && clsArr.length > 0) {
            for (Class<?> cls2 : clsArr) {
                sb.append(cls2.getName());
                sb.append("#");
            }
        } else {
            sb.append(Void.class.getName());
        }
        return sb.toString();
    }

    public static void writeField(Object obj, String str, Object obj2) {
        checkNotNull(obj, "target object must not be null");
        Field field = getField(obj.getClass(), str);
        if (field != null) {
            writeField(field, obj, obj2);
        }
    }

    public static void writeField(Field field, Object obj, Object obj2) {
        checkNotNull(field, "The field must not be null");
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        field.set(obj, obj2);
    }
}

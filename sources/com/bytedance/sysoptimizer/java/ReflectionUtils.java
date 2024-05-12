package com.bytedance.sysoptimizer.java;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.X1D;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.SysOptimizer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class ReflectionUtils {
    public static HashMap<String, Field> sCacheFiled = new HashMap<>();
    public static HashMap<String, Method> sCacheMethod = new HashMap<>();
    public static Method sGetDeclaredField;
    public static Method sGetDeclaredMethod;
    public static boolean sIsInit;

    public static native boolean changeTargetSuperClassToSpecificClassOnDalvik(Class<?> cls, Class<?> cls2, String str);

    public static Object com_bytedance_sysoptimizer_java_ReflectionUtils_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8129266929286659822"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static native boolean setModifiersForDalvik(Class<?> cls, int i, int i2, int i3, String str);

    static {
        sGetDeclaredField = null;
        sGetDeclaredMethod = null;
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            sGetDeclaredMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable unused) {
        }
        try {
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            sGetDeclaredField = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (Throwable unused2) {
        }
    }

    public static boolean isAndroidPHigher() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 || (i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            return true;
        }
        return false;
    }

    public static boolean isArt() {
        String property = System.getProperty("java.vm.version");
        if (property != null && property.startsWith("2")) {
            return true;
        }
        return false;
    }

    public static String getSuperClassNameInDescriptor(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null) {
            return "";
        }
        return "L" + superclass.getName().replaceAll("[.]", "/") + ";";
    }

    public static void removeFinal(Field field) {
        if (field == null) {
            return;
        }
        int modifiers = field.getModifiers();
        if (Build.VERSION.SDK_INT <= 22) {
            changeAccessFlagsBelowLForArt(field, modifiers & (-17));
        } else {
            changeAccessFlagsAboveL(field, modifiers & (-17));
        }
    }

    public static Field androidPHigherGetField(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void changeAccessFlagsAboveL(Field field, int i) {
        try {
            Field declaredField = Field.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            declaredField.setInt(field, i);
        } catch (Throwable unused) {
        }
    }

    public static void changeAccessFlagsBelowLForArt(Field field, int i) {
        try {
            Field declaredField = Field.class.getDeclaredField("artField");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(field);
            Field declaredField2 = obj.getClass().getDeclaredField("accessFlags");
            declaredField2.setAccessible(true);
            declaredField2.setInt(obj, i);
        } catch (Throwable unused) {
        }
    }

    public static void changeAccessFlagsBelowLForDalvik(Field field, int i) {
        if (!sIsInit) {
            sIsInit = SysOptimizer.loadOptimizerLibrary(null);
        }
        if (sIsInit) {
            try {
                Field declaredField = Field.class.getDeclaredField("slot");
                declaredField.setAccessible(true);
                declaredField.getInt(field);
                Field declaredField2 = Field.class.getDeclaredField("declaringClass");
                declaredField2.setAccessible(true);
            } catch (Throwable unused) {
            }
        }
    }

    public static void changeIfTableFrom(Object obj, Object obj2) {
        if (obj2 == null || obj == null) {
            return;
        }
        try {
            Class<?> cls = obj2.getClass();
            Class<?> cls2 = obj.getClass();
            Field declaredField = Class.class.getDeclaredField("ifTable");
            declaredField.setAccessible(true);
            Object[] objArr = (Object[]) declaredField.get(cls);
            if (Arrays.equals(objArr, (Object[]) declaredField.get(cls2))) {
                return;
            }
            declaredField.set(cls2, objArr);
        } catch (Throwable unused) {
        }
    }

    public static void changeSuperClass(Class<?> cls, Class<?> cls2) {
        if (isAndroidPHigher()) {
            Field androidPHigherGetField = androidPHigherGetField(Class.class, "superClass");
            if (androidPHigherGetField != null) {
                androidPHigherGetField.setAccessible(true);
                androidPHigherGetField.set(cls, cls2);
                return;
            }
            return;
        }
        Field declaredField = Class.class.getDeclaredField("superClass");
        declaredField.setAccessible(true);
        declaredField.set(cls, cls2);
    }

    public static Field getClassField(Class cls, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(cls.getName());
        LIZ.append(".");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (sCacheFiled.containsKey(LIZIZ)) {
            return sCacheFiled.get(LIZIZ);
        }
        Field field = null;
        while (cls != null && cls != Object.class) {
            try {
                Method method = sGetDeclaredField;
                if (method != null) {
                    field = (Field) com_bytedance_sysoptimizer_java_ReflectionUtils_java_lang_reflect_Method_invoke(method, cls, new Object[]{str});
                } else {
                    field = cls.getDeclaredField(str);
                }
                field.setAccessible(true);
            } catch (Throwable unused) {
            }
            if (field != null) {
                sCacheFiled.put(LIZIZ, field);
                return field;
            }
            cls = cls.getSuperclass();
        }
        sCacheFiled.put(LIZIZ, null);
        return null;
    }

    public static Method getClassMethod(Class cls, String str) {
        return getClassMethod(cls, str, null);
    }

    public static Object getFieldObject(String str, Object obj) {
        Field classField = getClassField(obj.getClass(), str);
        if (classField != null) {
            try {
                return classField.get(obj);
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        return null;
    }

    public static Object getStaticFieldObject(String str, Class cls) {
        Field classField = getClassField(cls, str);
        if (classField != null) {
            try {
                return classField.get(null);
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return null;
    }

    public static Object invokeStaticMethod(String str, String str2) {
        try {
            return invokeStaticMethod(Class.forName(str), str2);
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static Object invokeStaticMethod(Class<?> cls, String str) {
        return invokeStaticMethod(cls, str, null, null);
    }

    public static Method getClassMethod(Class cls, String str, Class<?>... clsArr) {
        if (cls != null && str != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(cls.getName());
            LIZ.append(".");
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (sCacheMethod.containsKey(LIZIZ)) {
                return sCacheMethod.get(LIZIZ);
            }
            Method method = null;
            while (cls != null && cls != Object.class) {
                try {
                    Method method2 = sGetDeclaredMethod;
                    if (method2 != null) {
                        method = (Method) com_bytedance_sysoptimizer_java_ReflectionUtils_java_lang_reflect_Method_invoke(method2, cls, new Object[]{str, clsArr});
                    } else {
                        method = cls.getDeclaredMethod(str, clsArr);
                    }
                    method.setAccessible(true);
                } catch (Throwable unused) {
                }
                if (method != null) {
                    sCacheMethod.put(LIZIZ, method);
                    return method;
                }
                cls = cls.getSuperclass();
            }
            sCacheMethod.put(LIZIZ, null);
        }
        return null;
    }

    public static Object getFieldObject(String str, String str2, Object obj) {
        try {
            Field classField = getClassField(Class.forName(str), str2);
            if (classField != null) {
                try {
                    return classField.get(obj);
                } catch (IllegalAccessException e) {
                    C16880lQ.LLLLIIL(e);
                    return null;
                }
            }
            return null;
        } catch (ClassNotFoundException e2) {
            C16880lQ.LLLLIIL(e2);
            return null;
        }
    }

    public static Object invokeVoidMethod(Class<?> cls, String str, Object obj) {
        return invokeMethod(cls, str, null, null, obj);
    }

    public static void setFieldObject(Object obj, String str, Object obj2) {
        Field classField = getClassField(obj.getClass(), str);
        if (classField != null) {
            try {
                classField.set(obj, obj2);
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static Object getFieldObject(Class cls, String str, Object obj) {
        Field classField = getClassField(cls, str);
        if (classField != null) {
            try {
                return classField.get(obj);
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        return null;
    }

    public static void changeField2Target(Object obj, Field field, Object obj2, Object obj3) {
        if (field == null || obj == null || obj2 == null || obj3 == null) {
            return;
        }
        try {
            Class<?> cls = obj3.getClass();
            Class<?> cls2 = obj2.getClass();
            if (!cls2.equals(cls)) {
                changeSuperClass(cls, cls2);
            }
            field.set(obj, obj3);
        } catch (Throwable unused) {
        }
    }

    public static Object invokeStaticMethod(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            if (clsArr == null) {
                clsArr = new Class[0];
            }
            if (objArr == null) {
                objArr = new Object[0];
            }
            try {
                Method classMethod = getClassMethod(cls, str, clsArr);
                if (classMethod == null) {
                    return null;
                }
                classMethod.setAccessible(true);
                return com_bytedance_sysoptimizer_java_ReflectionUtils_java_lang_reflect_Method_invoke(classMethod, null, objArr);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static void setFieldObject(Class cls, String str, Object obj, Object obj2) {
        Field classField = getClassField(cls, str);
        if (classField != null) {
            try {
                classField.set(obj, obj2);
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static Object invokeMethod(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr, Object obj) {
        if (cls != null && !TextUtils.isEmpty(str)) {
            if (clsArr == null) {
                clsArr = new Class[0];
            }
            if (objArr == null) {
                objArr = new Object[0];
            }
            try {
                Method classMethod = getClassMethod(cls, str, clsArr);
                if (classMethod == null) {
                    return null;
                }
                classMethod.setAccessible(true);
                return com_bytedance_sysoptimizer_java_ReflectionUtils_java_lang_reflect_Method_invoke(classMethod, obj, objArr);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}

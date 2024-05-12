package com.bytedance.common.utility.reflect;

import X.C03880Dg;
import X.C16880lQ;
import X.C25620zW;
import X.C39519Ff9;
import X.C65300Pk0;
import X.EY4;
import X.EY6;
import X.EY8;
import X.X1D;
import com.bytedance.common.utility.Logger;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes7.dex */
public final class Reflect {
    public final boolean isClass;
    public final Object object;

    public static Object com_bytedance_common_utility_reflect_Reflect_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-4742217092322762186"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public Reflect create() {
        return create(new Object[0]);
    }

    public Map<String, Reflect> fields() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> type = type();
        do {
            for (Field field : type.getDeclaredFields()) {
                if ((!this.isClass) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, field(name, new Class[0]));
                    }
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        return linkedHashMap;
    }

    public int hashCode() {
        return this.object.hashCode();
    }

    public String toString() {
        return this.object.toString();
    }

    public Class<?> type() {
        if (this.isClass) {
            return (Class) this.object;
        }
        return this.object.getClass();
    }

    public <T> T get() {
        return (T) this.object;
    }

    public Reflect(Class<?> cls) {
        this.object = cls;
        this.isClass = true;
    }

    public static <T extends AccessibleObject> T accessible(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    public static Class<?> forName(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            throw new EY6(e);
        }
    }

    public static Reflect on(String str) {
        return on(forName(str));
    }

    public static String property(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase(Locale.getDefault());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str.substring(0, 1).toLowerCase(Locale.getDefault()));
        LIZ.append(str.substring(1));
        return X1D.LIZIZ(LIZ);
    }

    public static Class<?>[] types(Object... objArr) {
        Class<?> cls;
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                cls = EY8.class;
            } else {
                cls = obj.getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }

    public static Object unwrap(Object obj) {
        if (obj instanceof Reflect) {
            return ((Reflect) obj).get();
        }
        return obj;
    }

    public static Class<?> wrapper(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Void.TYPE == cls) {
                return Void.class;
            }
            return cls;
        }
        return cls;
    }

    public <P> P as(Class<P> cls) {
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new EY4(this, this.object instanceof Map));
    }

    public Reflect call(String str) {
        return call(str, null, new Object[0]);
    }

    public Reflect create(Object... objArr) {
        Class<?>[] types = types(objArr);
        try {
            return on(type().getDeclaredConstructor(types), objArr);
        } catch (NoSuchMethodException e) {
            for (Constructor<?> constructor : type().getDeclaredConstructors()) {
                if (match(constructor.getParameterTypes(), types)) {
                    return on(constructor, objArr);
                }
            }
            throw new EY6(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Reflect) {
            return this.object.equals(((Reflect) obj).get());
        }
        return false;
    }

    public Reflect(Object obj) {
        this.object = obj;
    }

    public static Reflect on(Class<?> cls) {
        return new Reflect(cls);
    }

    public static Reflect on(Object obj) {
        return new Reflect(obj);
    }

    private Field field0(String str, Class<?>... clsArr) {
        Class<?> type = type();
        if (clsArr == null || clsArr.length <= 0) {
            try {
                return type.getField(str);
            } catch (NoSuchFieldException e) {
                do {
                    try {
                        return (Field) accessible(type.getDeclaredField(str));
                    } catch (NoSuchFieldException e2) {
                        C16880lQ.LLLLIIL(e2);
                        type = type.getSuperclass();
                    }
                } while (type != null);
                throw new EY6(e);
            }
        }
        do {
            try {
                for (Field field : type.getDeclaredFields()) {
                    Class<?> type2 = field.getType();
                    if (type2 != null && type2.getName().equals(clsArr[0].getName()) && field.getName().equals(str)) {
                        return (Field) accessible(field);
                    }
                }
            } catch (Exception e3) {
                C16880lQ.LLLLIIL(e3);
            }
            type = type.getSuperclass();
        } while (type != null);
        throw new EY6("NoSuchFieldException");
    }

    private boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != EY8.class && !wrapper(clsArr[i]).isAssignableFrom(wrapper(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    public static Reflect on(Constructor<?> constructor, Object... objArr) {
        try {
            return on(((Constructor) accessible(constructor)).newInstance(objArr));
        } catch (Exception e) {
            throw new EY6(e);
        }
    }

    private Method similarMethod(String str, Class<?>[] clsArr) {
        Class<?> type = type();
        for (Method method : type.getMethods()) {
            if (isSimilarSignature(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : type.getDeclaredMethods()) {
                if (isSimilarSignature(method2, str, clsArr)) {
                    return method2;
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        StringBuilder LIZIZ = C25620zW.LIZIZ("No similar method ", str, " with params ");
        LIZIZ.append(Arrays.toString(clsArr));
        LIZIZ.append(" could be found on type ");
        LIZIZ.append(type());
        LIZIZ.append(".");
        throw new NoSuchMethodException(X1D.LIZIZ(LIZIZ));
    }

    public Field exactField(String str, Class<?>... clsArr) {
        return field0(str, clsArr);
    }

    public Reflect field(String str, Class<?>... clsArr) {
        try {
            return on(field0(str, clsArr).get(this.object));
        } catch (Exception e) {
            throw new EY6(e);
        }
    }

    public <T> T get(String str, Class<?>... clsArr) {
        return (T) field(str, clsArr).get();
    }

    public Reflect set(String str, Object obj) {
        try {
            field0(str, new Class[0]).set(this.object, unwrap(obj));
            return this;
        } catch (Exception e) {
            throw new EY6(e);
        }
    }

    private boolean isSimilarSignature(Method method, String str, Class<?>[] clsArr) {
        if (method.getName().equals(str) && match(method.getParameterTypes(), clsArr)) {
            return true;
        }
        return false;
    }

    public static Reflect on(Method method, Object obj, Object... objArr) {
        try {
            accessible(method);
            if (method.getReturnType() == Void.TYPE) {
                com_bytedance_common_utility_reflect_Reflect_java_lang_reflect_Method_invoke(method, obj, objArr);
                return on(obj);
            }
            return on(com_bytedance_common_utility_reflect_Reflect_java_lang_reflect_Method_invoke(method, obj, objArr));
        } catch (Exception e) {
            throw new EY6(e);
        }
    }

    public Reflect call(String str, Class<?>[] clsArr, Object... objArr) {
        try {
            try {
                return on(exactMethod(str, clsArr, objArr), this.object, objArr);
            } catch (NoSuchMethodException unused) {
                return on(similarMethod(str, clsArr), this.object, objArr);
            }
        } catch (NoSuchMethodException e) {
            throw new EY6(e);
        }
    }

    public Method exactMethod(String str, Class<?>[] clsArr, Object... objArr) {
        Class<?> type = type();
        try {
            return type.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return type.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException e) {
                    C16880lQ.LLLLIIL(e);
                    type = type.getSuperclass();
                }
            } while (type != null);
            for (Method method : type().getMethods()) {
                if (str.equals(method.getName())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (Logger.debug()) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                        }
                    }
                    if (parameterTypes != null && parameterTypes.length == clsArr.length) {
                        return method;
                    }
                }
            }
            throw new NoSuchMethodException();
        }
    }
}

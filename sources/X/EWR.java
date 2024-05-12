package X;

import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class EWR {
    public static final HashMap<Class, HashMap<String, Method>> LIZ = new HashMap<>();

    public static HashMap<String, Method> LIZ(Class<?> cls) {
        HashMap<Class, HashMap<String, Method>> hashMap = LIZ;
        if (hashMap.containsKey(cls)) {
            return hashMap.get(cls);
        }
        HashMap<String, Method> hashMap2 = new HashMap<>();
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getAnnotation(EWS.class) != null) {
                hashMap2.put(method.getName(), method);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            hashMap2.putAll(LIZ(superclass));
        }
        LIZ.put(cls, hashMap2);
        return hashMap2;
    }
}

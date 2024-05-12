package X;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* renamed from: X.EXx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36597EXx {
    public static final Class<?>[] LIZ;
    public static final java.util.Map<Class<?>, Class<?>> LIZIZ;
    public static final java.util.Map<Class<?>, Class<?>> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Class<?> cls3 = Float.TYPE;
        LIZ = new Class[]{Byte.TYPE, Short.TYPE, Character.TYPE, cls, cls2, cls3, Double.TYPE};
        HashMap hashMap = new HashMap();
        LIZIZ = hashMap;
        LIZJ = new HashMap();
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(cls2, Long.class);
        hashMap.put(cls, Integer.class);
        hashMap.put(cls3, Float.class);
        hashMap.put(Double.TYPE, Double.class);
        Class cls4 = Void.TYPE;
        hashMap.put(cls4, cls4);
        for (Object obj : hashMap.keySet()) {
            Class<?> cls5 = LIZIZ.get(obj);
            if (!obj.equals(cls5)) {
                LIZJ.put(cls5, obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(AccessibleObject accessibleObject) {
        if (accessibleObject == 0 || accessibleObject.isAccessible()) {
            return;
        }
        Member member = (Member) accessibleObject;
        if (accessibleObject.isAccessible() || !Modifier.isPublic(member.getModifiers()) || (member.getDeclaringClass().getModifiers() & 7) != 0) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception unused) {
        }
    }

    public static float LIZ(Class<?>[] clsArr, Class<?>[] clsArr2) {
        float f;
        Object obj;
        float f2 = 0.0f;
        for (int i = 0; i < clsArr.length; i++) {
            Class<?> cls = clsArr2[i];
            Class<?> cls2 = clsArr[i];
            if (cls.isPrimitive()) {
                if (!cls2.isPrimitive()) {
                    f = 0.1f;
                    obj = ((HashMap) LIZJ).get(cls2);
                } else {
                    f = 0.0f;
                    obj = cls2;
                }
                int i2 = 0;
                Object obj2 = obj;
                while (obj2 != cls && i2 < 7) {
                    Object[] objArr = LIZ;
                    if (obj2 == objArr[i2]) {
                        f += 0.1f;
                        if (i2 < 6) {
                            obj2 = objArr[i2 + 1];
                        }
                    }
                    i2++;
                    obj2 = obj2;
                }
            } else {
                f = 0.0f;
                Class<?> cls3 = cls2;
                while (true) {
                    if (cls3 != null) {
                        if (cls.equals(cls3)) {
                            break;
                        }
                        if (cls.isInterface() && LIZIZ(cls3, cls)) {
                            f += 0.25f;
                            break;
                        }
                        f += 1.0f;
                        cls3 = cls3.getSuperclass();
                    } else {
                        f += 1.5f;
                        break;
                    }
                }
            }
            f2 += f;
        }
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZIZ(Class cls, Class cls2) {
        if (cls2 == 0) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (cls.isPrimitive() && !cls2.isPrimitive() && cls.isPrimitive() && (cls = (Class) ((HashMap) LIZIZ).get(cls)) == null) {
            return false;
        }
        if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = (Class) ((HashMap) LIZJ).get(cls)) == null) {
            return false;
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (cls.isPrimitive()) {
            if (!cls2.isPrimitive()) {
                return false;
            }
            Class cls3 = Integer.TYPE;
            if (cls3.equals(cls)) {
                if (!Long.TYPE.equals(cls2) && !Float.TYPE.equals(cls2) && !Double.TYPE.equals(cls2)) {
                    return false;
                }
            } else {
                Class cls4 = Long.TYPE;
                if (cls4.equals(cls)) {
                    if (!Float.TYPE.equals(cls2) && !Double.TYPE.equals(cls2)) {
                        return false;
                    }
                } else {
                    if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
                        return false;
                    }
                    Class cls5 = Float.TYPE;
                    if (cls5.equals(cls)) {
                        return Double.TYPE.equals(cls2);
                    }
                    if (Character.TYPE.equals(cls)) {
                        if (!cls3.equals(cls2) && !cls4.equals(cls2) && !cls5.equals(cls2) && !Double.TYPE.equals(cls2)) {
                            return false;
                        }
                    } else if (Short.TYPE.equals(cls)) {
                        if (!cls3.equals(cls2) && !cls4.equals(cls2) && !cls5.equals(cls2) && !Double.TYPE.equals(cls2)) {
                            return false;
                        }
                    } else {
                        if (!Byte.TYPE.equals(cls)) {
                            return false;
                        }
                        if (!Short.TYPE.equals(cls2) && !cls3.equals(cls2) && !cls4.equals(cls2) && !cls5.equals(cls2) && !Double.TYPE.equals(cls2)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return cls2.isAssignableFrom(cls);
    }
}

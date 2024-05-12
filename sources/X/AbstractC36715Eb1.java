package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.Eb1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC36715Eb1 extends AbstractC36718Eb4 implements InvocationHandler {
    public static final java.util.Map<String, AbstractC36718Eb4> LJ = new HashMap();
    public static final java.util.Map<Class<?>, Class<?>> LJFF;
    public Object LIZIZ;
    public boolean LIZLLL;
    public final HashMap<String, AbstractC36718Eb4> LIZ = new HashMap<>();
    public final boolean LIZJ = true;

    static {
        HashMap hashMap = new HashMap();
        LJFF = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        hashMap.put(Integer.class, Integer.TYPE);
        hashMap.put(Long.class, Long.TYPE);
        hashMap.put(Double.class, Double.TYPE);
        hashMap.put(Float.class, Float.TYPE);
    }

    public static void LIZJ(String str, AbstractC36718Eb4 abstractC36718Eb4) {
        ((HashMap) LJ).put(str, abstractC36718Eb4);
    }

    @Override // X.AbstractC36718Eb4
    public final Object LIZIZ(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        AbstractC36718Eb4 abstractC36718Eb4 = (AbstractC36718Eb4) ((HashMap) LJ).get(name);
        if (abstractC36718Eb4 != null || (abstractC36718Eb4 = this.LIZ.get(name)) != null) {
            return abstractC36718Eb4.LIZIZ(obj, method, objArr);
        }
        return null;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (this.LIZLLL) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            if (!this.LIZJ) {
                return method.invoke(this.LIZIZ, objArr);
            }
            try {
                obj2 = LIZIZ(this.LIZIZ, method, objArr);
            } catch (Throwable th) {
                th.toString();
                F8X.LIZ();
                obj2 = null;
            }
            if (obj2 == null) {
                try {
                    obj2 = method.invoke(this.LIZIZ, objArr);
                } catch (Throwable th2) {
                    th2.toString();
                    F8X.LIZ();
                }
            }
            try {
                obj2 = LIZ(this.LIZIZ, obj2, method, objArr);
            } catch (Throwable th3) {
                th3.toString();
                F8X.LIZ();
            }
            if (obj2 != null) {
                return obj2;
            }
            Class<?> returnType = method.getReturnType();
            if (returnType == null) {
                return null;
            }
            boolean isPrimitive = returnType.isPrimitive();
            Object obj3 = returnType;
            if (!isPrimitive) {
                Object obj4 = ((HashMap) LJFF).get(returnType);
                obj3 = obj4;
                if (obj4 == null) {
                    return null;
                }
            }
            if (obj3 == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            if (obj3 == Void.TYPE) {
                return new Object();
            }
            return 0;
        }
        throw new IllegalStateException("setTarget must be invoked before this invoke");
    }

    @Override // X.AbstractC36718Eb4
    public final Object LIZ(Object obj, Object obj2, Method method, Object[] objArr) {
        String name = method.getName();
        AbstractC36718Eb4 abstractC36718Eb4 = (AbstractC36718Eb4) ((HashMap) LJ).get(name);
        if (abstractC36718Eb4 != null || (abstractC36718Eb4 = this.LIZ.get(name)) != null) {
            return abstractC36718Eb4.LIZ(obj, obj2, method, objArr);
        }
        return obj2;
    }
}

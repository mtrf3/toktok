package X;

import java.lang.reflect.Method;

/* renamed from: X.Er4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37710Er4 {
    public static C1HQ<Class, Character> LIZLLL;
    public final Class[] LIZ;
    public boolean LIZIZ;
    public String LIZJ;

    public C37710Er4(Method method) {
        method.setAccessible(true);
        this.LIZ = method.getParameterTypes();
    }

    public static char LIZ(Class cls) {
        if (LIZLLL == null) {
            C1HQ<Class, Character> c1hq = new C1HQ<>();
            LIZLLL = c1hq;
            c1hq.put(Byte.TYPE, 'b');
            LIZLLL.put(Byte.class, 'B');
            LIZLLL.put(Short.TYPE, 's');
            LIZLLL.put(Short.class, 'S');
            LIZLLL.put(Long.TYPE, 'l');
            LIZLLL.put(Long.class, 'L');
            LIZLLL.put(Character.TYPE, 'c');
            LIZLLL.put(Character.class, 'C');
            LIZLLL.put(Boolean.TYPE, 'z');
            LIZLLL.put(Boolean.class, 'Z');
            LIZLLL.put(Integer.TYPE, 'i');
            LIZLLL.put(Integer.class, 'I');
            LIZLLL.put(Double.TYPE, 'd');
            LIZLLL.put(Double.class, 'D');
            LIZLLL.put(Float.TYPE, 'f');
            LIZLLL.put(Float.class, 'F');
            LIZLLL.put(String.class, 'T');
        }
        if (LIZLLL.containsKey(cls)) {
            return LIZLLL.getOrDefault(cls, null).charValue();
        }
        return (char) 0;
    }
}

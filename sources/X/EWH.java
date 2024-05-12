package X;

import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EWH {
    public final Class[] LIZ;
    public boolean LIZIZ;
    public String LIZJ;

    public EWH(Method method) {
        method.setAccessible(true);
        this.LIZ = method.getParameterTypes();
    }

    public static char LIZ(Class cls) {
        if (cls.equals(Byte.TYPE)) {
            return 'b';
        }
        if (cls.equals(Byte.class)) {
            return 'B';
        }
        if (cls.equals(Short.TYPE)) {
            return 's';
        }
        if (cls.equals(Short.class)) {
            return 'S';
        }
        if (cls.equals(Long.TYPE)) {
            return 'l';
        }
        if (cls.equals(Long.class)) {
            return 'L';
        }
        if (cls.equals(Character.TYPE)) {
            return 'c';
        }
        if (cls.equals(Character.class)) {
            return 'C';
        }
        if (cls.equals(Boolean.TYPE)) {
            return 'z';
        }
        if (cls.equals(Boolean.class)) {
            return 'Z';
        }
        if (cls.equals(Integer.TYPE)) {
            return 'i';
        }
        if (cls.equals(Integer.class)) {
            return 'I';
        }
        if (cls.equals(Double.TYPE)) {
            return 'd';
        }
        if (cls.equals(Double.class)) {
            return 'D';
        }
        if (cls.equals(Float.TYPE)) {
            return 'f';
        }
        if (cls.equals(Float.class)) {
            return 'F';
        }
        if (cls.equals(String.class)) {
            return 'T';
        }
        return (char) 0;
    }
}

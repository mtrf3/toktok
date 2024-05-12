package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class EZG {
    public static Field LIZ(Class<?> cls, String str) {
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Field ");
        LIZ.append(str);
        LIZ.append(" not found in ");
        LIZ.append(cls);
        throw new NoSuchFieldException(X1D.LIZIZ(LIZ));
    }

    public static Method LIZIZ(Object obj, Class... clsArr) {
        Class<?> cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("makePathElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("Method ", "makePathElements", " with parameters ");
        LIZIZ.append(Arrays.asList(clsArr));
        LIZIZ.append(" not found in ");
        LIZIZ.append(cls);
        throw new NoSuchMethodException(X1D.LIZIZ(LIZIZ));
    }
}

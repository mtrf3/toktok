package X;

import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EWW {
    public static final /* synthetic */ int LIZ = 0;

    public static Field LIZ(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            Field[] declaredFields = cls.getDeclaredFields();
            o.LJIIIIZZ(declaredFields, "c.declaredFields");
            for (Field field : declaredFields) {
                if (o.LJ(field.getName(), str)) {
                    field.setAccessible(true);
                    return field;
                }
            }
        }
        return null;
    }
}

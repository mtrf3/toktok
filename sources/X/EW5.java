package X;

import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public final class EW5 {
    public static Object LIZ(TTVideoEngine tTVideoEngine) {
        Class<?> cls = tTVideoEngine.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField("mIsPlayComplete");
                field.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        return field.get(tTVideoEngine);
    }
}

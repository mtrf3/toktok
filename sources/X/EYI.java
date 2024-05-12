package X;

import android.util.ArrayMap;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public final class EYI {
    public static final ArrayMap<Integer, WeakReference<Runnable>> LIZ = new ArrayMap<>();
    public static long LIZIZ = -1;
    public static Field LIZJ;
    public static Field LIZLLL;

    public static void LIZ() {
        if (LIZJ == null) {
            try {
                Class<?> cls = Class.forName("com.facebook.fresco.animation.drawable.AnimatedDrawable2");
                LIZJ = cls.getDeclaredField("mInvalidateRunnable");
                LIZLLL = cls.getDeclaredField("mFrameScheduler");
                Field field = LIZJ;
                if (field != null) {
                    field.setAccessible(true);
                }
                Field field2 = LIZLLL;
                if (field2 != null) {
                    field2.setAccessible(true);
                }
            } catch (Exception unused) {
            }
        }
    }
}

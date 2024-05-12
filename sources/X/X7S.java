package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationUIType;
import java.util.HashMap;

/* loaded from: classes16.dex */
public final class X7S {
    public static volatile X7S LIZIZ;
    public final java.util.Map<UIAnnotationUIType, XN7> LIZ = new HashMap(0);

    public static X7S LIZ() {
        if (LIZIZ != null) {
            return LIZIZ;
        }
        synchronized (X7S.class) {
            if (LIZIZ != null) {
                return LIZIZ;
            }
            LIZIZ = new X7S();
            return LIZIZ;
        }
    }

    public static void LIZIZ(UIAnnotationUIType uIAnnotationUIType, XN7 xn7) {
        ((HashMap) LIZ().LIZ).put(uIAnnotationUIType, xn7);
    }
}

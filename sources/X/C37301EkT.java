package X;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* renamed from: X.EkT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37301EkT {
    public static Field LIZ;
    public static Field LIZIZ;

    public static boolean LIZ() {
        Field field;
        if (LIZ == null) {
            try {
                Field declaredField = Class.forName("android.view.ViewGroup").getDeclaredField("mFirstTouchTarget");
                LIZ = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            try {
                Field field2 = LIZ;
                if (field2 != null) {
                    Class<?> type = field2.getType();
                    if (type != null) {
                        field = type.getDeclaredField("child");
                    } else {
                        field = null;
                    }
                    LIZIZ = field;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        if (LIZ != null && LIZIZ != null) {
            return true;
        }
        return false;
    }

    public static View LIZIZ(ViewGroup viewGroup) {
        Object obj;
        Object obj2;
        try {
            Field field = LIZ;
            if (field != null) {
                obj = field.get(viewGroup);
            } else {
                obj = null;
            }
            if (obj != null) {
                Field field2 = LIZIZ;
                if (field2 != null) {
                    obj2 = field2.get(obj);
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof View) {
                    return (View) obj2;
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return null;
    }
}

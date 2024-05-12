package X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: X.07N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C07N {
    public static Field LIZ;
    public static boolean LIZIZ;

    public static Drawable LIZ(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C07M.LIZ(compoundButton);
        }
        if (!LIZIZ) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                LIZ = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            LIZIZ = true;
        }
        Field field = LIZ;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                LIZ = null;
            }
        }
        return null;
    }
}

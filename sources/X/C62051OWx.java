package X;

import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

/* renamed from: X.OWx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62051OWx {
    public static final Field LIZ;

    static {
        try {
            Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
            LIZ = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}

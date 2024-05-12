package X;

import android.view.View;
import java.lang.reflect.Field;

/* renamed from: X.0lC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16740lC {
    public static final Field LIZ;
    public static final Field LIZIZ;
    public static final Field LIZJ;
    public static final boolean LIZLLL;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            LIZ = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            LIZIZ = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            LIZJ = declaredField3;
            declaredField3.setAccessible(true);
            LIZLLL = true;
        } catch (ReflectiveOperationException unused) {
        }
    }
}

package X;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.03B, reason: invalid class name */
/* loaded from: classes.dex */
public class C03B {
    public static final boolean LIZ;
    public static final Method LIZIZ;
    public static final Field LIZJ;
    public static final Field LIZLLL;
    public static final Field LJ;
    public static final Field LJFF;

    static {
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            Method method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
            Field field = cls.getField("left");
            Field field2 = cls.getField("top");
            Field field3 = cls.getField("right");
            Field field4 = cls.getField("bottom");
            LIZIZ = method;
            LIZJ = field;
            LIZLLL = field2;
            LJ = field3;
            LJFF = field4;
            LIZ = true;
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
            LIZIZ = null;
            LIZJ = null;
            LIZLLL = null;
            LJ = null;
            LJFF = null;
            LIZ = false;
        }
    }
}

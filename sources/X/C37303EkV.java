package X;

import com.google.gson.k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: X.EkV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37303EkV extends AbstractC37304EkW {
    public static Class LIZLLL;
    public final Object LIZIZ;
    public final Field LIZJ;

    public C37303EkV() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            LIZLLL = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.LIZIZ = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.LIZJ = field;
    }

    @Override // X.AbstractC37304EkW
    public final void LIZ(AccessibleObject accessibleObject) {
        if (this.LIZIZ != null && this.LIZJ != null) {
            try {
                LIZLLL.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.LIZIZ, accessibleObject, Long.valueOf(((Long) LIZLLL.getMethod("objectFieldOffset", Field.class).invoke(this.LIZIZ, this.LIZJ)).longValue()), Boolean.TRUE);
                return;
            } catch (Exception unused) {
                if (0 != 0) {
                    return;
                }
            }
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Gson couldn't modify fields for ");
            LIZ.append(accessibleObject);
            LIZ.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
            throw new k(X1D.LIZIZ(LIZ), e);
        }
    }
}

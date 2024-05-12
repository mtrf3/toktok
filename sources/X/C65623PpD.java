package X;

import java.lang.reflect.Field;

/* renamed from: X.PpD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65623PpD<T> {
    public final Field LIZ;

    public C65623PpD(Field field) {
        this.LIZ = field;
        field.setAccessible(true);
    }

    public final void LIZ(T t, Object obj) {
        try {
            this.LIZ.set(t, obj);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}

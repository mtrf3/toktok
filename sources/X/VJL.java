package X;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes15.dex */
public final class VJL implements PrivilegedExceptionAction<Unsafe> {
    /* JADX WARN: Type inference failed for: r0v2, types: [sun.misc.Unsafe, java.lang.Object] */
    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Unsafe run() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}

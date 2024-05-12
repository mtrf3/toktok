package X;

import java.lang.reflect.Method;

/* renamed from: X.Ee6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36906Ee6 {
    public static InterfaceC36907Ee7 LIZ;

    public static InterfaceC36907Ee7 LIZ() {
        InterfaceC36907Ee7 interfaceC36907Ee7 = LIZ;
        if (interfaceC36907Ee7 != null) {
            return interfaceC36907Ee7;
        }
        try {
            Method declaredMethod = Class.forName("com.ss.android.anywheredoor.core.AnyDoorServiceImpl").getDeclaredMethod("inst", new Class[0]);
            declaredMethod.setAccessible(true);
            LIZ = (InterfaceC36907Ee7) declaredMethod.invoke(null, new Object[0]);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return LIZ;
    }
}

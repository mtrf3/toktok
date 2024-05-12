package X;

import com.bytedance.keva.Keva;
import java.lang.reflect.Method;

/* renamed from: X.Hpn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45275Hpn {
    public static final Keva LIZ = Keva.getRepo("repo_ve_hook");
    public static String[] LIZIZ;

    public static void LIZ() {
        String[] strArr = LIZIZ;
        if (strArr != null) {
            try {
                Class<?> cls = Class.forName("com.ss.android.VEHook");
                Method declaredMethod = cls.getDeclaredMethod("hook", String[].class, Integer.TYPE);
                if (declaredMethod != null) {
                    declaredMethod.invoke(cls, strArr, 0);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}

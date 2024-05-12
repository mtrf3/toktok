package X;

import android.app.ActivityManager;
import android.content.Context;
import com.bytedance.keva.Keva;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.EdC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36850EdC {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    public static int LIZ() {
        Keva repo = Keva.getRepo("device_info_repo");
        int i = -1;
        if (repo.contains("device_type")) {
            return repo.getInt("device_type", -1);
        }
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            o.LJIIIIZZ(declaredMethod, "clazz.getDeclaredMethod(\"get\", String::class.java)");
            Object invoke = declaredMethod.invoke(null, "ro.com.google.gmsversion");
            o.LJII(invoke, "null cannot be cast to non-null type kotlin.String");
            i = s.LJJJLZIJ((String) invoke, "go", false);
        } catch (Exception unused) {
        }
        repo.storeInt("device_type", i);
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    public static int LIZIZ(Context context) {
        Keva repo = Keva.getRepo("device_info_repo");
        int i = -1;
        if (repo.contains("device_ram_state")) {
            return repo.getInt("device_ram_state", -1);
        }
        try {
            Object LLILL = C16880lQ.LLILL(context, "activity");
            o.LJII(LLILL, "null cannot be cast to non-null type android.app.ActivityManager");
            i = ((ActivityManager) LLILL).isLowRamDevice();
        } catch (Exception unused) {
        }
        repo.storeInt("device_ram_state", i);
        return i;
    }
}

package X;

import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* renamed from: X.04m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C016004m {
    public static void LIZ(View view) {
        o.LJIIIZ(view, "view");
        try {
            if (!C283919n.LJLZ) {
                C283919n.LJLZ = true;
                if (Build.VERSION.SDK_INT >= 28) {
                    C283919n.LJLLLL = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    C283919n.LJLLLLLL = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                } else {
                    C283919n.LJLLLL = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                    C283919n.LJLLLLLL = View.class.getDeclaredField("mRecreateDisplayList");
                }
                Method method = C283919n.LJLLLL;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = C283919n.LJLLLLLL;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = C283919n.LJLLLLLL;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = C283919n.LJLLLL;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            C283919n.LJZ = true;
        }
    }
}

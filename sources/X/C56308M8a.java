package X;

import android.os.Looper;
import android.view.Window;
import android.widget.PopupWindow;
import com.bytedance.common.utility.reflect.Reflect;
import java.lang.reflect.Field;

/* renamed from: X.M8a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56308M8a {
    public static boolean LIZ;
    public static Field LIZIZ;
    public static Field LIZJ;
    public static Field LIZLLL;

    public static void LIZIZ() {
        if (!LIZ) {
            try {
                LIZIZ = Reflect.on((Class<?>) PopupWindow.class).exactField("mWindowManager", new Class[0]);
                LIZJ = Reflect.on("android.view.WindowManagerImpl").exactField("mParentWindow", new Class[0]);
                LIZLLL = Reflect.on((Class<?>) Window.class).exactField("mHardwareAccelerated", new Class[0]);
            } catch (EY6 e) {
                C16880lQ.LLLLIIL(e);
            }
            LIZ = true;
        }
    }

    public static void LIZ() {
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("must be called on main thread");
            C16880lQ.LLLLIIL(illegalArgumentException);
            C78983UzD.LJIIZILJ(illegalArgumentException);
        }
    }
}

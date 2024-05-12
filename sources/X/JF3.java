package X;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JF3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Window window, boolean z) {
        int i;
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
        } catch (Throwable unused) {
        }
    }

    public static void LIZIZ(Activity activity, Window window, boolean z) {
        if (activity == null || window == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                View decorView = window.getDecorView();
                o.LJIIIIZZ(decorView, "window.decorView");
                int systemUiVisibility = decorView.getSystemUiVisibility();
                if (!z) {
                    decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
                } else {
                    decorView.setSystemUiVisibility(systemUiVisibility | FileUtils.BUFFER_SIZE);
                }
                window.clearFlags(67108864);
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
            if (JF4.LIZLLL()) {
                LIZ(window, z);
            }
            if (!JF4.LIZJ()) {
                return;
            }
            C48293IxN.LIZ(activity, z, true);
        } catch (Throwable unused) {
        }
    }
}

package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class JF2 {
    public static boolean LIZJ(Window window) {
        if (window == null) {
            return false;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((window.getDecorView().getSystemUiVisibility() & 1024) == 0 && (attributes.flags & 67108864) == 0) {
            return false;
        }
        return true;
    }

    public static void LJ(Window window) {
        char c;
        if (window == null) {
            return;
        }
        if (C35001Yy.LJ == null) {
            if (!TextUtils.isEmpty(C86793Y4n.LJJII("ro.miui.ui.version.name"))) {
                C86793Y4n.LJJII("ro.miui.ui.version.name");
                C35001Yy.LJ = "MIUI";
            } else if (!TextUtils.isEmpty(C86793Y4n.LJJII("ro.build.version.emui"))) {
                C86793Y4n.LJJII("ro.build.version.emui");
                C35001Yy.LJ = "EMUI";
            } else if (!TextUtils.isEmpty(C86793Y4n.LJJII("ro.build.version.opporom"))) {
                C86793Y4n.LJJII("ro.build.version.opporom");
                C35001Yy.LJ = "OPPO";
            } else if (!TextUtils.isEmpty(C86793Y4n.LJJII("ro.vivo.os.version"))) {
                C86793Y4n.LJJII("ro.vivo.os.version");
                C35001Yy.LJ = "VIVO";
            } else if (!TextUtils.isEmpty(C86793Y4n.LJJII("ro.smartisan.version"))) {
                C86793Y4n.LJJII("ro.smartisan.version");
                C35001Yy.LJ = "SMARTISAN";
            } else if (Build.DISPLAY.toUpperCase().contains("FLYME")) {
                C35001Yy.LJ = "FLYME";
            } else {
                C35001Yy.LJ = Build.MANUFACTURER.toUpperCase();
            }
            C35001Yy.LJ.equals("");
        }
        String str = C35001Yy.LJ;
        if ("MIUI".equals(str)) {
            c = 1;
        } else if ("FLYME".equals(str)) {
            c = 2;
        } else {
            c = 3;
        }
        if (c == 1) {
            LIZLLL(window, false);
        } else if (c == 2) {
            LIZIZ(window, false);
        } else {
            LIZ(window, false);
        }
    }

    public static void LJFF(Window window) {
        if (window != null && !LIZLLL(window, true) && !LIZIZ(window, true) && Build.VERSION.SDK_INT >= 23) {
            LIZ(window, true);
        }
    }

    public static void LIZ(Window window, boolean z) {
        int i;
        if (window == null) {
            return;
        }
        window.clearFlags(67108864);
        window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility | FileUtils.BUFFER_SIZE;
        } else {
            i = systemUiVisibility & (-8193);
        }
        decorView.setSystemUiVisibility(i);
    }

    public static boolean LIZIZ(Window window, boolean z) {
        int i;
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i2 = declaredField.getInt(null);
                int i3 = declaredField2.getInt(attributes);
                if (z) {
                    i = i3 | i2;
                } else {
                    i = i3 & (~i2);
                }
                declaredField2.setInt(attributes, i);
                window.setAttributes(attributes);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean LIZLLL(Window window, boolean z) {
        if (window == null) {
            return false;
        }
        Class<?> cls = window.getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            if (z) {
                method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
            } else {
                method.invoke(window, 0, Integer.valueOf(i));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (z) {
                    window.getDecorView().setSystemUiVisibility(FileUtils.BUFFER_SIZE);
                } else {
                    window.getDecorView().setSystemUiVisibility(0);
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

package X;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* renamed from: X.Njn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60191Njn {
    public static int LIZ(int i) {
        try {
            i = KL2.LJIILL(EF7.LIZIZ(), C63081OpJ.LJJJJLI(EF7.LIZIZ()));
            return i;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return i;
        }
    }

    public static void LIZIZ(Activity activity) {
        activity.getWindow().setFlags(1024, 1024);
        try {
            Class<?> loadClass = C16880lQ.LLLLJ(activity).getClassLoader().loadClass("android.os.SystemProperties");
            if (((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0)).intValue() == 1) {
                if (Build.VERSION.SDK_INT < 28) {
                    try {
                        Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(activity.getWindow(), 768);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public static void LIZJ(Activity activity, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT >= 23 && activity != null) {
            int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | FileUtils.BUFFER_SIZE;
            } else {
                i = systemUiVisibility & (-8193);
            }
            if (i != systemUiVisibility) {
                activity.getWindow().getDecorView().setSystemUiVisibility(i);
            }
        }
    }
}

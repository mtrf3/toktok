package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.gyf.barlibrary.FlymeOSStatusBarFontUtils;
import com.gyf.barlibrary.OSUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* renamed from: X.NqG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60592NqG {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Context context) {
        o.LJIIJ(context, "context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static void LIZIZ(Activity activity) {
        o.LJIIJ(activity, "activity");
        activity.getWindow().setFlags(1024, 1024);
        try {
            Context LLLLJ = C16880lQ.LLLLJ(activity);
            o.LJFF(LLLLJ, "activity.applicationContext");
            Class<?> loadClass = LLLLJ.getClassLoader().loadClass("android.os.SystemProperties");
            Method method = loadClass.getMethod("getInt", String.class, Integer.TYPE);
            o.LJFF(method, "systemProperties.getMeth…imitiveType\n            )");
            Object invoke = method.invoke(loadClass, "ro.miui.notch", 0);
            if (invoke != null) {
                if (((Integer) invoke).intValue() == 1 && Build.VERSION.SDK_INT < 28) {
                    try {
                        Class[] clsArr = new Class[1];
                        Class cls = Integer.TYPE;
                        if (cls != null) {
                            clsArr[0] = cls;
                            Method method2 = Window.class.getMethod("addExtraFlags", clsArr);
                            o.LJFF(method2, "Window::class.java.getMe…eType!!\n                )");
                            method2.invoke(activity.getWindow(), 768);
                            return;
                        }
                        o.LJIIZILJ();
                        throw null;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public static void LIZJ(Window window, boolean z) {
        int i;
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            Field field = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE");
            o.LJFF(field, "layoutParams.getField(\"E…AG_STATUS_BAR_DARK_MODE\")");
            int i2 = field.getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            o.LJFF(method, "clazz.getMethod(\"setExtr…:class.javaPrimitiveType)");
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

    public static void LIZLLL(Activity activity, int i) {
        o.LJIIJ(activity, "activity");
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            Window window = activity.getWindow();
            o.LJFF(window, "activity.window");
            window.setStatusBarColor(i);
            View findViewById = activity.getWindow().findViewById(R.id.content);
            o.LJFF(findViewById, "activity.window.findViewById(android.R.id.content)");
            findViewById.setForeground(null);
            return;
        }
        Window window2 = activity.getWindow();
        o.LJFF(window2, "activity.window");
        window2.setStatusBarColor(i);
    }

    public static void LJ(Activity activity, Window window, boolean z) {
        if (activity == null || window == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                View decorView = window.getDecorView();
                o.LJFF(decorView, "window.decorView");
                int systemUiVisibility = decorView.getSystemUiVisibility();
                if (!z) {
                    decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
                } else {
                    decorView.setSystemUiVisibility(systemUiVisibility | FileUtils.BUFFER_SIZE);
                }
                window.clearFlags(67108864);
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
            if (OSUtils.isMIUI6Later()) {
                LIZJ(window, z);
            }
            if (!OSUtils.isFlymeOS4Later()) {
                return;
            }
            FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(activity, z);
        } catch (Throwable unused) {
        }
    }
}

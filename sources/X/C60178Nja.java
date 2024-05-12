package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: X.Nja, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60178Nja {
    public static int LIZ(Context context) {
        int i = 0;
        if (!"Xiaomi".equals(Build.MANUFACTURER)) {
            return 0;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            i = ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String("ro.miui.notch"), new Integer(0))).intValue();
            return i;
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            return i;
        } catch (IllegalAccessException e2) {
            C16880lQ.LLLLIIL(e2);
            return i;
        } catch (IllegalArgumentException e3) {
            C16880lQ.LLLLIIL(e3);
            return i;
        } catch (NoSuchMethodException e4) {
            C16880lQ.LLLLIIL(e4);
            return i;
        } catch (InvocationTargetException e5) {
            C16880lQ.LLLLIIL(e5);
            return i;
        }
    }

    public static boolean LIZIZ(Context context) {
        boolean z;
        String string;
        String str = Build.BRAND;
        if (TextUtils.equals("oppo", str.toLowerCase())) {
            z = context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } else {
            z = false;
        }
        if (!z) {
            if (TextUtils.equals("vivo", str.toLowerCase())) {
                try {
                    Class<?> cls = Class.forName("android.util.FtFeature");
                    if (!((Boolean) cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue()) {
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            String lowerCase = Build.BRAND.toLowerCase();
            if (TextUtils.equals("huawei", lowerCase) || TextUtils.equals("honor", lowerCase)) {
                try {
                    Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                    if (!((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue()) {
                    }
                } catch (Throwable unused) {
                }
            }
            if (LIZ(context) != 1) {
                if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 28) {
                    View decorView = C45804HyK.LJIJJ(context).getWindow().getDecorView();
                    try {
                        Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
                        Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
                        List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
                        if (list != null) {
                            if (list.size() > 0) {
                            }
                        }
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                }
                if (context == null || Build.VERSION.SDK_INT < 27) {
                    return false;
                }
                try {
                    Resources resources = context.getResources();
                    int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
                    if (identifier <= 0 || (string = resources.getString(identifier)) == null) {
                        return false;
                    }
                    if (TextUtils.isEmpty(string)) {
                        return false;
                    }
                } catch (Exception unused2) {
                    return false;
                }
            }
        }
        return true;
    }
}

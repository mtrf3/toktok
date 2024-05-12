package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.0rE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20480rE {
    static {
        C0VW.LIZIZ("PackageManagerHelper");
    }

    public static void LIZ(Context context, Class<?> cls, boolean z) {
        int i;
        Object obj;
        String str = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            C0VW LIZ = C0VW.LIZ();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                obj = "enabled";
            } else {
                obj = "disabled";
            }
            objArr[1] = obj;
            C16880lQ.LLLZ("%s %s", objArr);
            LIZ.getClass();
        } catch (Exception unused) {
            C0VW LIZ2 = C0VW.LIZ();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = "disabled";
            }
            objArr2[1] = str;
            C16880lQ.LLLZ("%s could not be %s", objArr2);
            LIZ2.getClass();
        }
    }
}

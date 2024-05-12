package X;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: X.06P, reason: invalid class name */
/* loaded from: classes.dex */
public class C06P {
    public static void LIZ(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static boolean LIZJ(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void LIZIZ(Activity activity, String[] strArr, int i) {
        if (new C03880Dg(2).LIZJ(102600, "android/app/Activity", "requestPermissions", activity, new Object[]{strArr, Integer.valueOf(i)}, "void", new C65300Pk0(false, "([Ljava/lang/String;I)V", "2117134030214621577")).LIZ) {
            return;
        }
        activity.requestPermissions(strArr, i);
    }
}

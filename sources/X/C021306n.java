package X;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: X.06n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C021306n {
    public static String LIZIZ(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager LIZJ(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static int LIZ(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }
}

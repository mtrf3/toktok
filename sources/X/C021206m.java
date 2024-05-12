package X;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: X.06m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C021206m {
    public static String LIZLLL(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static <T> T LIZ(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static int LIZIZ(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    public static int LIZJ(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }
}

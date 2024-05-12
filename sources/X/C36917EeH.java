package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.bytedance.mt.protector.impl.PatternProtector;

/* renamed from: X.EeH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36917EeH {
    public static final /* synthetic */ int LIZ = 0;

    static {
        PatternProtector.compile("^0-([\\d]+)$");
    }

    public static boolean LIZ(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                return Settings.canDrawOverlays(context);
            } catch (Throwable unused) {
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C16880lQ.LLILL(context, "appops");
            Class cls = Integer.TYPE;
            if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke(appOpsManager, Integer.valueOf(AppOpsManager.class.getField("OP_SYSTEM_ALERT_WINDOW").getInt(null)), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }
}

package X;

import android.app.ApplicationExitInfo;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.BrZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30097BrZ {
    public static boolean LIZ;
    public static ApplicationExitInfo LIZIZ;

    public static void LIZ(ApplicationExitInfo applicationExitInfo, java.util.Map map) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        map.put("app_exit_reason", String.valueOf(applicationExitInfo.getReason()));
        String description = applicationExitInfo.getDescription();
        if (description == null) {
            description = "";
        }
        map.put("app_exit_description", description);
        map.put("app_exit_timestamp", String.valueOf(applicationExitInfo.getTimestamp()));
        map.put("app_exit_process_importance", String.valueOf(applicationExitInfo.getImportance()));
        map.put("app_exit_pss", String.valueOf(applicationExitInfo.getPss()));
        map.put("app_exit_rss", String.valueOf(applicationExitInfo.getRss()));
        String applicationExitInfo2 = applicationExitInfo.toString();
        o.LJIIIIZZ(applicationExitInfo2, "exitInfo.toString()");
        map.put("app_exit_info", applicationExitInfo2);
    }
}

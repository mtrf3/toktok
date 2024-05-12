package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.StatFs;

/* renamed from: X.OFc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61588OFc {
    public static float LIZIZ() {
        long j = -1;
        if (Environment.getDataDirectory() != null) {
            try {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                j = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            } catch (IllegalArgumentException unused) {
            }
        }
        return ((float) j) / 1048576.0f;
    }

    public static String LIZ(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(packageManager, context.getPackageName(), 0);
            if (LLLLLLLLL == null) {
                return "";
            }
            return LLLLLLLLL.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            OC6.LJ("gecko-debug-tag", "getApplicationName:", th);
            return "";
        }
    }

    public static String LIZJ(Context context) {
        try {
            return C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            OC6.LJ("gecko-debug-tag", "getVersion:", e);
            return "null";
        }
    }
}

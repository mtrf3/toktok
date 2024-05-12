package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import defpackage.s1;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class EGC {
    public static long LIZ;

    public static final boolean LIZ() {
        PackageInfo LLLLLLZ;
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        long j = LIZ;
        if (j == 0) {
            Context LIZIZ = EF7.LIZIZ();
            try {
                PackageManager packageManager = LIZIZ.getPackageManager();
                if (packageManager != null && (LLLLLLZ = C16880lQ.LLLLLLZ(packageManager, LIZIZ.getPackageName(), 0)) != null) {
                    j = LLLLLLZ.firstInstallTime;
                } else {
                    j = 0;
                }
                LIZ = j;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                j = 0;
            }
        }
        if (currentTimeMillis - j <= TimeUnit.DAYS.toMillis(7L)) {
            z = true;
        } else {
            z = false;
        }
        if (!s1.LIZLLL("isFirstInstallAndFirstLaunch()") && !z) {
            return false;
        }
        return true;
    }
}

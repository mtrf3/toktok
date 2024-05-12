package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class EGE {
    public static final EGE LIZIZ = new EGE();
    public long LIZ;

    public final long LIZ() {
        long j;
        PackageInfo LLLLLLZ;
        long j2 = this.LIZ;
        if (j2 != 0) {
            return j2;
        }
        Context LIZIZ2 = EF7.LIZIZ();
        try {
            PackageManager packageManager = LIZIZ2.getPackageManager();
            if (packageManager != null && (LLLLLLZ = C16880lQ.LLLLLLZ(packageManager, LIZIZ2.getPackageName(), 0)) != null) {
                j = LLLLLLZ.firstInstallTime;
            } else {
                j = 0;
            }
            this.LIZ = j;
            return j;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return 0L;
        }
    }

    public EGE() {
        Keva.getRepo("first_install_version");
    }
}

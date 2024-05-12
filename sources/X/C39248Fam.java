package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.wifi.WifiInfo;
import java.io.File;

/* renamed from: X.Fam, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39248Fam {
    public static volatile ApplicationInfo LIZ = null;
    public static volatile PackageInfo LIZIZ = null;
    public static volatile ApplicationInfo LIZJ = null;
    public static volatile PackageInfo LIZLLL = null;
    public static volatile PackageInfo LJ = null;
    public static volatile PackageInfo LJFF = null;
    public static volatile int LJI = -1;
    public static long LJII = -1;
    public static int LJIIIIZZ = -1;
    public static boolean LJIIIZ = false;
    public static volatile WifiInfo LJIIJ = null;
    public static long LJIIJJI = -1;
    public static int LJIIL = -1;
    public static volatile int LJIILIIL = 0;
    public static volatile int LJIILJJIL = 0;
    public static volatile int LJIILL = 0;
    public static volatile int LJIILLIIL = 0;
    public static File LJIIZILJ = null;
    public static String LJIJ = null;
    public static String LJIJI = "";

    public static boolean LIZ() {
        if (LJIIIIZZ > 0 && System.currentTimeMillis() - LJII > LJIIIIZZ) {
            LJII = System.currentTimeMillis();
            return true;
        }
        return false;
    }
}

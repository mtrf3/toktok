package X;

import a04.IDfS3S0000000_10;
import android.content.Context;
import android.text.TextUtils;
import defpackage.i0;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: X.O6h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61359O6h {
    public static InterfaceC58707N2h LIZIZ;
    public static volatile InterfaceC61377O6z LIZJ;
    public static InterfaceC61376O6y LIZLLL;
    public static ExecutorService LJ;
    public static ExecutorService LJFF;
    public static ExecutorService LJI;
    public static long LJII;
    public static long LJIIJ;
    public static O7O LJIIJJI;
    public static HashMap<String, String> LJIIL;
    public static QXX LJIILIIL;
    public static C06420Na LJIILJJIL;
    public static Context LJIILL;
    public static InterfaceC61405O8b LJIIZILJ;
    public static QXX LJIJ;
    public static int LJIJI;
    public static int LJIJJ;
    public static int LJIJJLI;
    public static int LJIL;
    public static volatile String LJJIFFI;
    public static volatile String LJJII;
    public static NPT LJJIIZI;
    public static QXX LJJJI;
    public static InterfaceC61396O7s LJJJJIZL;
    public static QXX LJJJJJ;
    public static QXX LJJJJJL;
    public static NPV LJJJJL;
    public static InterfaceC39141FXt LJJJJLL;
    public static O7N LJJJLIIL;
    public static final String LIZ = String.valueOf(2011090);
    public static boolean LJIIIIZZ = false;
    public static volatile boolean LJIIIZ = false;
    public static boolean LJIILLIIL = false;
    public static volatile boolean LJJ = false;
    public static volatile boolean LJJI = false;
    public static volatile long LJJIII = 864000000;
    public static volatile boolean LJJIIJ = true;
    public static int LJJIIJZLJL = 0;
    public static boolean LJJIIZ = true;
    public static boolean LJJIJ = false;
    public static int LJJIJIIJI = -1;
    public static boolean LJJIJIIJIL = false;
    public static long LJJIJIL = 2000;
    public static long LJJIJL = 2000;
    public static boolean LJJIJLIJ = false;
    public static boolean LJJIL = true;
    public static boolean LJJIZ = false;
    public static boolean LJJJ = false;
    public static boolean LJJJIL = false;
    public static boolean LJJJJ = false;
    public static int LJJJJI = 0;
    public static int LJJJJLI = 0;
    public static boolean LJJJJZ = false;
    public static final int LJJJJZI = -1;

    public static O7O LIZIZ() {
        if (LJIIJJI == null) {
            LJIIJJI = new O7O();
        }
        return LJIIJJI;
    }

    public static String LIZJ() {
        String str;
        O7O o7o = LJIIJJI;
        if (o7o != null) {
            str = o7o.LJ();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return O76.LJI().LIZJ.LIZLLL("splash_ad_did");
        }
        return str;
    }

    public static InterfaceC61396O7s LJ() {
        if (LJJJJIZL == null) {
            LJJJJIZL = new C61368O6q();
        }
        return LJJJJIZL;
    }

    public static String LJFF() {
        if (TextUtils.isEmpty(LJJII)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LLIIJLIL(LJIILL).getAbsolutePath());
            LIZ2.append("/splashCache/");
            return LIZ(X1D.LIZIZ(LIZ2));
        }
        return LIZ(LJJII);
    }

    public static QXX LJI() {
        if (LJJJJJL == null) {
            LJJJJJL = new IDfS3S0000000_10(1);
        }
        return LJJJJJL;
    }

    public static O7N LJII() {
        if (LJJJLIIL == null) {
            LJJJLIIL = O7N.LIZ(null);
        }
        return LJJJLIIL;
    }

    public static String LIZLLL() {
        if (!LJII().LIZIZ) {
            return LJFF();
        }
        String str = LJJIFFI;
        if (TextUtils.isEmpty(str)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LLIIJLIL(LJIILL).getAbsolutePath());
            LIZ2.append("/splashCache/");
            str = X1D.LIZIZ(LIZ2);
        }
        return LIZ(str);
    }

    public static String LIZ(String str) {
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            return str;
        }
        return i0.LJFF(str, str2);
    }
}

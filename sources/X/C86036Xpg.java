package X;

import com.bytedance.bddatefmt.BDDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Xpg */
/* loaded from: classes16.dex */
public final class C86036Xpg {
    public static String LIZIZ(long j) {
        if (System.currentTimeMillis() - j < 60000) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIIZILJ.getValue(), j);
        }
        if (System.currentTimeMillis() - j < 3600000) {
            return C86035Xpf.LIZ(LJII(j, 60000L), EnumC80568Vjg.MINUTE);
        }
        if (System.currentTimeMillis() - j < 86400000) {
            return C86035Xpf.LIZ(LJII(j, 3600000L), EnumC80568Vjg.HOUR);
        }
        if (System.currentTimeMillis() - j < 604800000) {
            return C86035Xpf.LIZ(LJII(j, 86400000L), EnumC80568Vjg.DAY);
        }
        if (LJII(j, 86400000L) == 7) {
            return C86035Xpf.LIZ(1, EnumC80568Vjg.WEEK);
        }
        if (LJIIIIZZ(j)) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJ.getValue(), j);
        }
        return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJFF.getValue(), j);
    }

    public static String LIZJ(long j) {
        if (LJIIIIZZ(j)) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIIL.getValue(), j);
        }
        return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJFF.getValue(), j);
    }

    public static String LJFF(long j) {
        long millis = TimeUnit.SECONDS.toMillis(j);
        if (j == 0) {
            return "";
        }
        if (SU4.LJ(millis)) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIJ.getValue(), millis);
        }
        if (SU4.LIZLLL(millis)) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIJJ.getValue(), millis);
        }
        if (LJIIIZ(millis)) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIL.getValue(), millis);
        }
        if (!LJIIIIZZ(millis)) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIIJ.getValue(), millis);
        }
        return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIIJJI.getValue(), millis);
    }

    public static String LJI(long j) {
        long millis = TimeUnit.SECONDS.toMillis(j);
        if (j == 0) {
            return "";
        }
        if (SU4.LIZLLL(millis)) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIJI.getValue(), millis);
        }
        if (LJIIIZ(millis)) {
            return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJIJJLI.getValue(), millis);
        }
        return BDDateFormat.LIZJ((BDDateFormat) C86037Xph.LJII.getValue(), millis);
    }

    public static boolean LJIIIIZZ(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (calendar2.get(1) == calendar.get(1)) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ(long j) {
        long LIZIZ = SU4.LIZIZ();
        C44435HcF LIZJ = SU4.LIZJ();
        long j2 = LIZJ.LIZ + LIZIZ;
        LIZJ.LIZ = j2;
        long j3 = LIZJ.LIZIZ + LIZIZ;
        if (j > j2 && j < j3) {
            return true;
        }
        return false;
    }

    public static String LIZ(long j, String str) {
        BDDateFormat bDDateFormat = new BDDateFormat(str);
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        return bDDateFormat.LIZIZ(j, locale);
    }

    public static int LJII(long j, long j2) {
        long currentTimeMillis = (System.currentTimeMillis() - j) / j2;
        if (currentTimeMillis > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) currentTimeMillis;
    }

    public static String LIZLLL(long j, Locale locale, boolean z) {
        o.LJIIIZ(locale, "locale");
        if (j == 0) {
            return "";
        }
        if (System.currentTimeMillis() < j) {
            if (z) {
                return ((BDDateFormat) C86037Xph.LIZIZ.getValue()).LIZIZ(j, locale);
            }
            return ((BDDateFormat) C86037Xph.LJFF.getValue()).LIZIZ(j, locale);
        }
        if (SU4.LIZLLL(j)) {
            return ((BDDateFormat) C86037Xph.LIZIZ.getValue()).LIZIZ(j, locale);
        }
        if (SU4.LJ(j)) {
            return ((BDDateFormat) C86037Xph.LJIILLIIL.getValue()).LIZIZ(j, locale);
        }
        if (System.currentTimeMillis() - j < 604800000) {
            return ((BDDateFormat) C86037Xph.LIZJ.getValue()).LIZIZ(j, locale);
        }
        if (LJIIIIZZ(j)) {
            return ((BDDateFormat) C86037Xph.LJ.getValue()).LIZIZ(j, locale);
        }
        return ((BDDateFormat) C86037Xph.LJFF.getValue()).LIZIZ(j, locale);
    }

    public static /* synthetic */ String LJ(long j, boolean z, int i) {
        Locale locale;
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
            o.LJIIIIZZ(locale, "getDefault()");
        } else {
            locale = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return LIZLLL(j, locale, z);
    }
}

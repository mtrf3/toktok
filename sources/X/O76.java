package X;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;

/* loaded from: classes11.dex */
public final class O76 {
    public static volatile O76 LIZLLL;
    public static String LJ;
    public static final Calendar LJFF = Calendar.getInstance();
    public long LIZ;
    public long LIZIZ;
    public volatile O7L LIZJ;

    public static String LIZLLL() {
        Calendar calendar = LJFF;
        calendar.setTimeInMillis(System.currentTimeMillis());
        return calendar.get(1) + "/" + calendar.get(2) + "/" + calendar.get(5);
    }

    public static O76 LJI() {
        if (LIZLLL == null) {
            synchronized (O76.class) {
                if (LIZLLL == null) {
                    LIZLLL = new O76();
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZJ() {
        this.LIZJ.LIZ();
    }

    public final String LJ() {
        return this.LIZJ.LIZLLL("key_empty_log_extra_substitute");
    }

    public final boolean LJFF() {
        Calendar calendar = LJFF;
        calendar.setTimeInMillis(System.currentTimeMillis());
        if (calendar.get(1) + calendar.get(2) + calendar.get(5) != this.LIZJ.LIZIZ("show_splash_ad_day")) {
            LJIIL();
            this.LIZJ.LJ(0, "splash_ad_show_count");
            this.LIZJ.LIZ.LIZIZ.putBoolean("splash_ad_has_first_refresh", false);
            LIZJ();
            return false;
        }
        return this.LIZJ.LIZ.LIZ.getBoolean("splash_ad_has_first_refresh", false);
    }

    public final String LJIIIIZZ() {
        if (C61359O6h.LJJJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJ);
            LIZ.append("splash_ad_ordered_data");
            return O5Y.LJJIIJZLJL(X1D.LIZIZ(LIZ));
        }
        return this.LIZJ.LIZLLL("splash_ad_data");
    }

    public final int LJIIIZ() {
        Calendar calendar = LJFF;
        calendar.setTimeInMillis(System.currentTimeMillis());
        if (calendar.get(1) + calendar.get(2) + calendar.get(5) != this.LIZJ.LIZIZ("show_splash_ad_day")) {
            this.LIZJ.LJ(0, "splash_ad_show_count");
            this.LIZJ.LIZ.LIZIZ.putBoolean("splash_ad_has_first_refresh", false);
            LIZJ();
            LJIIL();
            return 0;
        }
        return this.LIZJ.LIZIZ("splash_ad_show_count");
    }

    public final void LJIIL() {
        Calendar calendar = LJFF;
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(1) + calendar.get(2) + calendar.get(5);
        O7L o7l = this.LIZJ;
        o7l.LJ(i, "show_splash_ad_day");
        o7l.LIZ();
    }

    public O76() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(C61359O6h.LJIILL));
        LIZ.append("/SplashData/");
        LJ = X1D.LIZIZ(LIZ);
        if (this.LIZJ == null) {
            this.LIZJ = new O7L(C61359O6h.LJIILL);
        }
    }

    public final void LIZ() {
        int LJIIIZ = LJIIIZ() + 1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("show count: ");
        LIZ.append(LJIIIZ);
        C1DJ.LJIJJ(X1D.LIZIZ(LIZ));
        this.LIZJ.LJ(LJIIIZ, "splash_ad_show_count");
    }

    public final int LJII() {
        if (!LIZLLL().equals(this.LIZJ.LIZLLL("key_last_show_sequence_day"))) {
            O7L o7l = this.LIZJ;
            o7l.LJ(0, "key_splash_ad_show_sequence");
            o7l.LIZ();
            String LIZLLL2 = LIZLLL();
            O7L o7l2 = this.LIZJ;
            o7l2.LJI("key_last_show_sequence_day", LIZLLL2);
            o7l2.LIZ();
            return 0;
        }
        return this.LIZJ.LIZIZ("key_splash_ad_show_sequence");
    }

    public final void LIZIZ(String str) {
        String LJFF2 = i0.LJFF("bda_splash", str);
        O7L o7l = this.LIZJ;
        o7l.LJ(this.LIZJ.LIZIZ(LJFF2) + 1, LJFF2);
        o7l.LIZ();
    }

    public final synchronized boolean LJIIJ(String str) {
        boolean z = false;
        if (C78886Uxe.LJJIIZI(str)) {
            return false;
        }
        O7L o7l = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("splash_ad_url_has_download_");
        LIZ.append(C78840Uwu.LJJIIJZLJL(str));
        String LIZIZ = X1D.LIZIZ(LIZ);
        O7M o7m = o7l.LIZ;
        if (LIZIZ != null) {
            z = o7m.LIZ.getBoolean(LIZIZ, false);
        } else {
            o7m.getClass();
        }
        return z;
    }

    public final void LJIIJJI(long j) {
        if (j == 0) {
            return;
        }
        this.LIZ = SystemClock.elapsedRealtime();
        this.LIZIZ = j;
        O7L o7l = this.LIZJ;
        o7l.LJFF(j, "key_pre_remote_time");
        o7l.LJFF(this.LIZ, "key_pre_launch_time");
        o7l.LIZ();
    }

    public final void LJIILIIL(String str) {
        FileOutputStream fileOutputStream;
        if (C61359O6h.LJJJ) {
            String str2 = LJ;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty("splash_ad_ordered_data")) {
                return;
            }
            File file = new File(str2);
            if (!file.exists() && !file.mkdir()) {
                return;
            }
            String LJFF2 = i0.LJFF(str2, "splash_ad_ordered_data");
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(LJFF2, false);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                fileOutputStream.write(str.getBytes());
                fileOutputStream.flush();
                O5Y.LJIIIZ(fileOutputStream);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Exception:");
                LIZ.append(e);
                X1D.LIZIZ(LIZ);
                O5Y.LJIIIZ(fileOutputStream2);
                return;
            } catch (Throwable th2) {
                th = th2;
                O5Y.LJIIIZ(fileOutputStream);
                throw th;
            }
            return;
        }
        this.LIZJ.LJI("splash_ad_data", str);
    }

    public final synchronized void LJIILJJIL(String str) {
        if (C78886Uxe.LJJIIZI(str)) {
            return;
        }
        O7L o7l = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("splash_ad_url_has_download_");
        LIZ.append(C78840Uwu.LJJIIJZLJL(str));
        String LIZIZ = X1D.LIZIZ(LIZ);
        O7M o7m = o7l.LIZ;
        if (LIZIZ != null) {
            o7m.LIZIZ.putBoolean(LIZIZ, true);
        } else {
            o7m.getClass();
        }
        o7l.LIZ();
    }

    public final void LJIILL(O7G o7g) {
        String str;
        if (o7g == null || C78886Uxe.LJJIIZI(o7g.LIZLLL)) {
            return;
        }
        if (!TextUtils.isEmpty(o7g.LJI)) {
            str = o7g.LIZIZ();
        } else {
            str = o7g.LIZLLL;
        }
        LJIILJJIL(str);
    }
}

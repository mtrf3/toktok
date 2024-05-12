package X;

import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import kotlin.jvm.internal.AqS66S1200000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FLO {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LJI;
    public static long LJII;
    public static final Keva LIZ = Keva.getRepo("tpc_consent");
    public static boolean LIZLLL = true;
    public static String LJ = "";
    public static boolean LJFF = true;
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(FLP.INSTANCE);
    public static long LJIIIZ = -1;
    public static long LJIIJ = -1;

    public static final long LIZIZ() {
        Long valueOf = Long.valueOf(LJIIIZ);
        if (valueOf.longValue() != -1) {
            return valueOf.longValue();
        }
        try {
            long j = ((PackageInfo) LJIIIIZZ.getValue()).firstInstallTime;
            LJIIIZ = j;
            return j;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static final long LIZJ() {
        Long valueOf = Long.valueOf(LJIIJ);
        if (valueOf.longValue() != -1) {
            return valueOf.longValue();
        }
        try {
            long j = ((PackageInfo) LJIIIIZZ.getValue()).lastUpdateTime;
            LJIIJ = j;
            return j;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void LJ() {
        if (Keva.getRepo("appsflyer_repo").getBoolean("is_appsflyer_id_has_reported", false) || !LIZIZ) {
            return;
        }
        if (C61650OHm.LIZ.contains(AccountService.LJIJ().LJIILL())) {
            boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
            boolean z = LIZ.getBoolean("is_consent_accepted", false);
            if (!isLogin && !z) {
                return;
            }
            LIZLLL();
            return;
        }
        LIZLLL();
    }

    public static void LIZLLL() {
        String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(EF7.LIZIZ());
        o.LJIIIIZZ(appsFlyerUID, "getInstance().getAppsFlyerUID(context)");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("af_id", appsFlyerUID);
        FMX.LJIIL("appsflyer_id_init", c188727au.LIZ);
        Keva.getRepo("appsflyer_repo").storeBoolean("is_appsflyer_id_has_reported", true);
    }

    public static void LIZ(Cert cert) {
        String str;
        if (!LJI && LIZIZ && LIZJ) {
            if (LJFF) {
                boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
                boolean z = LIZ.getBoolean("is_consent_accepted", false);
                if (!isLogin && !z) {
                    return;
                }
            }
            Context LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ2 == null) {
                LJIIIIZZ2 = EF7.LIZIZ();
            }
            try {
                if (!AV1.LJIILLIIL()) {
                    LJII = SystemClock.uptimeMillis();
                    C1A8 c1a8 = new C1A8();
                    o.LJIIIZ(cert, "cert");
                    C1GE.LJIJJ(cert, "AppsFlyer", "start", new AqS66S1200000_11(LJIIIIZZ2, c1a8, 5));
                } else {
                    AppsFlyerLib.getInstance().stop(true, LJIIIIZZ2);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            LJI = true;
            if (FMX.LIZJ("appsflyer_start")) {
                C188727au c188727au = new C188727au();
                c188727au.LIZLLL(LIZLLL ? 1 : 0, "anonymize_user");
                c188727au.LIZLLL(LJFF ? 1 : 0, "delay_af_start");
                c188727au.LJIIIZ("country", LJ);
                c188727au.LIZLLL(((RBX) HG3.LJIILL()).isLogin() ? 1 : 0, "is_login");
                if (((RBX) HG3.LJIILL()).isLogin()) {
                    str = ((RBX) HG3.LJIILL()).getCurUserId();
                } else {
                    str = "";
                }
                c188727au.LJIIIZ("user_id", str);
                c188727au.LIZLLL(LIZ.getBoolean("is_consent_accepted", false) ? 1 : 0, "is_consent_accepted");
                FMX.LJIIL("appsflyer_start", c188727au.LIZ);
            }
        }
    }

    public static final synchronized void LJFF(TokenCert tokenCert) {
        synchronized (FLO.class) {
            if (((Boolean) FRI.LIZIZ.getValue()).booleanValue() || ((Boolean) C33809DOr.LIZIZ.getValue()).booleanValue()) {
                C38995FSd.LIZIZ().submit(new ARunnableS42S0100000_6(tokenCert, 65));
            } else {
                LIZ(tokenCert);
            }
        }
    }
}

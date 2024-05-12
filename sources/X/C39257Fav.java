package X;

import android.app.backup.BackupManager;
import android.content.SharedPreferences;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AutobackupService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.appsflyer.AppsflyerImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Fav, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39257Fav {
    public static boolean LIZ() {
        int i;
        int i2;
        int i3;
        Keva keva = C39263Fb1.LJIIIIZZ;
        if (keva.getBoolean("user_logged_in_atleast_once", false) || ((RBX) HG3.LJIILL()).isLogin() || keva.getBoolean("is_consent_accepted", false)) {
            return true;
        }
        boolean z = C39263Fb1.LJIIJJI.LIZIZ().getBoolean("consent_acceptance_from_backup", false);
        boolean contains = keva.contains("ug_should_show");
        if (contains && keva.getBoolean("ug_record_found", false)) {
            i = 1;
        } else {
            i = 0;
        }
        boolean z2 = keva.getBoolean("ug_should_show", false);
        Boolean isFirstInstall = C38987FRv.LIZLLL();
        if (!contains) {
            i2 = -1;
        } else if (i != 0 && !z2) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (z || i2 == 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        boolean z3 = keva.getBoolean("consent_once_shown", false);
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i3, "did_agree_prev");
        o.LJIIIIZZ(isFirstInstall, "isFirstInstall");
        c188727au.LIZLLL(isFirstInstall.booleanValue() ? 1 : 0, "is_first_install");
        c188727au.LIZLLL(z ? 1 : 0, "has_consent_backup");
        c188727au.LIZLLL(i2, "consent_api_result");
        c188727au.LIZLLL(i, "record_found");
        c188727au.LIZLLL(z3 ? 1 : 0, "consent_once_shown");
        FMX.LJIIL("consent_decision", c188727au.LIZ);
        if (EAW.LIZ()) {
            if (i != 0) {
                return !z2;
            }
            if (z) {
                return z;
            }
        }
        return false;
    }

    public static int LIZIZ() {
        int i;
        Keva keva = C39263Fb1.LJIIIIZZ;
        if (!keva.contains("consent_reason")) {
            if (AV1.LJIIJJI()) {
                i = 2;
            } else if (GuestModeServiceImpl.LJIIJJI().LJIIJ()) {
                i = 3;
            } else if (keva.getBoolean("is_consent_accepted", false)) {
                i = 6;
            } else if (keva.getBoolean("user_logged_in_atleast_once", false)) {
                i = 4;
            } else if (((RBX) HG3.LJIILL()).isLogin()) {
                i = 1;
            } else if (!LJ()) {
                i = 7;
            } else {
                i = 0;
            }
            keva.storeInt("consent_reason", i);
        }
        return keva.getInt("consent_reason", 0);
    }

    public static C39263Fb1 LIZJ() {
        return C39263Fb1.LJFF.getValue();
    }

    public static EnumC39259Fax LIZLLL() {
        String LJIILL = C39263Fb1.LJIIJ.LJIILL();
        if (o.LJ(LJIILL, "")) {
            return EnumC39259Fax.UNKNOWN;
        }
        if (o.LJ(LJIILL, "US")) {
            return EnumC39259Fax.US;
        }
        if (C61650OHm.LIZ.contains(LJIILL)) {
            return EnumC39259Fax.EU;
        }
        if (o.LJ(LJIILL, "KR")) {
            return EnumC39259Fax.KR;
        }
        return EnumC39259Fax.ROW;
    }

    public static boolean LJ() {
        boolean z;
        Keva keva = C39263Fb1.LJIIIIZZ;
        if (!keva.contains("have_passed_consent")) {
            if ((LIZ() && !AV1.LJIIJJI()) || GuestModeServiceImpl.LJIIJJI().LJIIJ()) {
                z = true;
            } else {
                z = false;
            }
            keva.storeBoolean("have_passed_consent", z);
            Iterator<? extends InterfaceC39262Fb0> it = C39263Fb1.LJIIIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(z);
            }
        }
        if (C39263Fb1.LJIIIIZZ.getBoolean("have_passed_consent", false)) {
            return true;
        }
        if (((RBX) HG3.LJIILL()).isLogin() && !AV1.LJIIJJI()) {
            return true;
        }
        return false;
    }

    public static void LJFF() {
        SharedPreferences.Editor putBoolean = AutobackupService.LIZJ().LIZIZ().edit().putBoolean("consent_acceptance_from_backup", true);
        String LJIILL = C39263Fb1.LJIIJ.LJIILL();
        o.LJIIIIZZ(LJIILL, "accountService.storeRegionUpperCase");
        String lowerCase = LJIILL.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        putBoolean.putString("last_acceptance_country_code", lowerCase).apply();
        BackupManager.dataChanged(FKM.LIZ().getPackageName());
        C39263Fb1.LJIIIIZZ.storeBoolean("is_consent_accepted", true);
        LJI(6);
        IWF.LJJLIIIIJ().LIZIZ();
        AppsflyerImpl.LJ().LIZJ();
        UgCommonServiceImpl.LJIJ().LJIIJJI();
        FLL.LJFF();
    }

    public static boolean LJII() {
        if ((GuestModeServiceImpl.LJIIJJI().LJIIJ() || LIZLLL() == EnumC39259Fax.ROW || LIZLLL() == EnumC39259Fax.KR) && !LIZ()) {
            IAccountService iAccountService = C39263Fb1.LJIIJ;
            if (!o.LJ(iAccountService.LJIILL(), "IT") && !iAccountService.LJFF().isLogin()) {
                return true;
            }
        }
        return false;
    }

    public static void LJI(int i) {
        Keva keva = C39263Fb1.LJIIIIZZ;
        if (!keva.getBoolean("have_passed_consent", false)) {
            SplashAdServiceImpl.LJJI().LJIIZILJ();
        }
        keva.storeBoolean("have_passed_consent", true);
        keva.storeInt("consent_reason", i);
        Iterator<? extends InterfaceC39262Fb0> it = C39263Fb1.LJIIIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(true);
        }
    }
}

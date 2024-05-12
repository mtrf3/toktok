package X;

import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Qax, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67287Qax extends AbstractC68049QnF {
    public long LIZJ;
    public String LIZLLL;
    public AccountManager LJ;
    public Boolean LJFF;
    public long LJI;

    public static AccountManagerFuture LJIIIZ(AccountManager accountManager, String[] strArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(102502, "android/accounts/AccountManager", "getAccountsByTypeAndFeatures", accountManager, new Object[]{"com.google", strArr, null, null}, "android.accounts.AccountManagerFuture", new C65300Pk0(false, "(Ljava/lang/String;[Ljava/lang/String;Landroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;", "-8261907262454631931"));
        return LIZJ.LIZ ? (AccountManagerFuture) LIZJ.LIZIZ : accountManager.getAccountsByTypeAndFeatures("com.google", strArr, null, null);
    }

    @Override // X.AbstractC68049QnF
    public final boolean LJI() {
        Calendar calendar = Calendar.getInstance();
        this.LIZJ = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.LIZLLL = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    public final long LJIIJ() {
        LJFF();
        return this.LJI;
    }

    public final long LJIIJJI() {
        LJII();
        return this.LIZJ;
    }

    public final String LJIIL() {
        LJII();
        return this.LIZLLL;
    }

    public C67287Qax(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
    }
}

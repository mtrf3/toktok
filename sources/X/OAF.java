package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OAF {
    public static Account[] LIZ(AccountManager accountManager) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(102500, "android/accounts/AccountManager", "getAccounts", accountManager, new Object[0], "android.accounts.Account[]", new C65300Pk0(false, "()[Landroid/accounts/Account;", "6942817602081376759"));
        return LIZJ.LIZ ? (Account[]) LIZJ.LIZIZ : accountManager.getAccounts();
    }

    public static boolean LIZIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        try {
            Account[] LIZ = LIZ(AccountManager.get(activity));
            o.LJIIIIZZ(LIZ, "get(activity).getAccounts()");
            for (Account account : LIZ) {
                if (account.type.equals("com.google")) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}

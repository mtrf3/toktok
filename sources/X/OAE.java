package X;

import android.accounts.Account;
import android.accounts.AccountManager;

/* loaded from: classes11.dex */
public final class OAE {
    public final int LIZ;

    public static Account[] LIZ(AccountManager accountManager) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(102500, "android/accounts/AccountManager", "getAccounts", accountManager, new Object[0], "android.accounts.Account[]", new C65300Pk0(false, "()[Landroid/accounts/Account;", "-2272485800273002414"));
        return LIZJ.LIZ ? (Account[]) LIZJ.LIZIZ : accountManager.getAccounts();
    }

    public OAE(int i) {
        this.LIZ = i;
    }
}

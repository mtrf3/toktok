package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.bytedance.common.utility.Logger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes9.dex */
public final class JFE extends JFC {
    public final AccountManager LIZIZ;
    public Account LIZJ;
    public final ConcurrentHashMap<String, String> LIZLLL = new ConcurrentHashMap<>();
    public volatile java.util.Set<String> LJ = null;

    public JFE(Context context) {
        this.LIZIZ = AccountManager.get(context);
    }

    @Override // X.JFC
    public final void LIZ(String str) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("AccountCacheHelper#cacheString key=", "device_id", " value=", str, " mAccount=");
        LIZLLL.append(this.LIZJ);
        X1D.LIZIZ(LIZLLL);
        if (this.LIZJ == null) {
            this.LIZLLL.put("device_id", str);
        } else {
            if (str == null) {
                return;
            }
            try {
                Logger.debug();
                this.LIZIZ.setUserData(this.LIZJ, "device_id", str);
            } catch (Throwable unused) {
                Logger.debug();
            }
        }
    }

    @Override // X.JFC
    public final void LIZIZ(String str) {
        AccountManager accountManager;
        ConcurrentHashMap<String, String> concurrentHashMap = this.LIZLLL;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
            this.LIZLLL.remove(str);
        }
        try {
            synchronized (this) {
                if (this.LIZJ == null) {
                    if (this.LJ == null) {
                        this.LJ = new CopyOnWriteArraySet();
                    }
                    if (!((CopyOnWriteArraySet) this.LJ).contains(str)) {
                        ((CopyOnWriteArraySet) this.LJ).add(str);
                    }
                }
            }
            Account account = this.LIZJ;
            if (account != null && (accountManager = this.LIZIZ) != null) {
                accountManager.setUserData(account, str, null);
            }
        } catch (Exception unused) {
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("AccountCacheHelper#clear key=", str, " mAccount=");
        LIZIZ.append(this.LIZJ);
        LIZIZ.append(" getCachedString(key)=");
        LIZIZ.append(LIZJ(str));
        X1D.LIZIZ(LIZIZ);
        super.LIZIZ(str);
    }

    @Override // X.JFC
    public final String LIZJ(String str) {
        Account account = this.LIZJ;
        if (account == null) {
            return null;
        }
        try {
            String userData = this.LIZIZ.getUserData(account, str);
            Logger.debug();
            return userData;
        } catch (Throwable unused) {
            Logger.debug();
            return null;
        }
    }
}

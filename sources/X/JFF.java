package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class JFF extends JFG {
    public final AccountManager LIZIZ;
    public final String LIZJ;
    public Account LIZLLL;
    public final ConcurrentHashMap<String, String> LJ = new ConcurrentHashMap<>();
    public final QIF LJFF;

    @Override // X.JFG, X.InterfaceC66819QKh
    public final String LIZ(String str) {
        String LJ = LJ(str);
        String str2 = this.LJ.get(LJ);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        Account account = this.LIZLLL;
        if (account == null) {
            return null;
        }
        try {
            return this.LIZIZ.getUserData(account, LJ);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.JFG
    public final void LIZLLL(List<String> list) {
        AccountManager accountManager;
        if (list == null) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String LJ = LJ(it.next());
            this.LJ.remove(LJ);
            try {
                Account account = this.LIZLLL;
                if (account != null && (accountManager = this.LIZIZ) != null) {
                    accountManager.setUserData(account, LJ, null);
                }
            } catch (Exception unused) {
            }
        }
        super.LIZLLL(list);
    }

    public final String LJ(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(this.LIZJ);
        if (!this.LJFF.LJJIIZI) {
            stringBuffer.append("_");
            stringBuffer.append(this.LJFF.LIZ());
        }
        return stringBuffer.toString();
    }

    @Override // X.JFG, X.InterfaceC66819QKh
    public final void LIZJ(String str, String str2) {
        String LJ = LJ(str);
        Account account = this.LIZLLL;
        if (account == null) {
            this.LJ.put(LJ, str2);
        } else {
            if (str2 == null) {
                return;
            }
            try {
                this.LIZIZ.setUserData(account, LJ, str2);
            } catch (Throwable unused) {
            }
        }
    }

    public JFF(Context context, String str, QIF qif) {
        this.LIZIZ = AccountManager.get(context);
        this.LIZJ = str;
        this.LJFF = qif;
    }
}

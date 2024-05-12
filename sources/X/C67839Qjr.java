package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: X.Qjr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67839Qjr extends AbstractC67789Qj3 {
    public final Bundle LLIIIL;

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 12451000;
    }

    @Override // X.AbstractC67863QkF
    public final Bundle LJJII() {
        return this.LLIIIL;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // X.AbstractC67863QkF
    public final boolean LJJIJIIJIL() {
        return true;
    }

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final boolean LIZIZ() {
        String str;
        C67736QiC c67736QiC = this.LLIIII;
        Account account = c67736QiC.LIZ;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (c67736QiC.LIZLLL.get(C67910Ql0.LIZ) == null) {
                if (!c67736QiC.LIZIZ.isEmpty()) {
                    return true;
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C67968Qlw) {
            return queryLocalInterface;
        }
        return new C67968Qlw(iBinder);
    }

    public C67839Qjr(Context context, Looper looper, C67736QiC c67736QiC, C67918Ql8 c67918Ql8, InterfaceC67784Qiy interfaceC67784Qiy, InterfaceC67712Qho interfaceC67712Qho) {
        super(context, looper, 16, c67736QiC, interfaceC67784Qiy, interfaceC67712Qho);
        Bundle bundle;
        if (c67918Ql8 == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle((Bundle) null);
        }
        this.LLIIIL = bundle;
    }
}

package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;

/* renamed from: X.QkE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67862QkE extends AbstractC67789Qj3 {
    public final Context LLIIIL;
    public final int LLIIIZ;
    public final String LLIIJI;
    public final int LLIIJLIL;
    public final boolean LLIIL;

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 12600000;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // X.AbstractC67863QkF
    public final boolean LJJIJIIJIL() {
        return true;
    }

    public final Bundle LJJIL() {
        int i = this.LLIIIZ;
        String packageName = this.LLIIIL.getPackageName();
        String str = this.LLIIJI;
        int i2 = this.LLIIJLIL;
        boolean z = this.LLIIL;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", packageName);
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    @Override // X.AbstractC67863QkF
    public final Feature[] LJJ() {
        return C67938QlS.LIZIZ;
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof C67945QlZ) {
            return queryLocalInterface;
        }
        return new C67945QlZ(iBinder);
    }

    public C67862QkE(Context context, Looper looper, C67736QiC c67736QiC, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj, int i, int i2, boolean z) {
        super(context, looper, 4, c67736QiC, interfaceC67706Qhi, interfaceC67707Qhj);
        String str;
        this.LLIIIL = context;
        this.LLIIIZ = i;
        Account account = c67736QiC.LIZ;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        this.LLIIJI = str;
        this.LLIIJLIL = i2;
        this.LLIIL = z;
    }
}

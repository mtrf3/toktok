package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

/* renamed from: X.Qja, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67822Qja extends AbstractC67789Qj3<C67927QlH> implements InterfaceC67779Qit {
    public static final /* synthetic */ int LLIIL = 0;
    public final boolean LLIIIL;
    public final C67736QiC LLIIIZ;
    public final Bundle LLIIJI;
    public final Integer LLIIJLIL;

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final boolean LIZIZ() {
        return this.LLIIIL;
    }

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 12451000;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // X.InterfaceC67779Qit
    public final void LIZ() {
        LJIIL(new C67880QkW(this));
    }

    @Override // X.AbstractC67863QkF
    public final Bundle LJJII() {
        if (!this.LJLJLJ.getPackageName().equals(this.LLIIIZ.LJFF)) {
            this.LLIIJI.putString("com.google.android.gms.signin.internal.realClientPackageName", this.LLIIIZ.LJFF);
        }
        return this.LLIIJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67779Qit
    public final void LJ() {
        try {
            C67901Qkr c67901Qkr = (C67901Qkr) LJJIIJ();
            Integer num = this.LLIIJLIL;
            QH7.LJIIIIZZ(num);
            int intValue = num.intValue();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c67901Qkr.LJLILLLLZI);
            obtain.writeInt(intValue);
            c67901Qkr.LJLJI(obtain, 7);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67779Qit
    public final void LJII(InterfaceC67967Qlv interfaceC67967Qlv) {
        GoogleSignInAccount googleSignInAccount;
        QH7.LJIIIZ(interfaceC67967Qlv, "Expecting a valid ISignInCallbacks");
        try {
            Account account = this.LLIIIZ.LIZ;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = C67690QhS.LIZ(this.LJLJLJ).LIZIZ();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.LLIIJLIL;
            QH7.LJIIIIZZ(num);
            zat zatVar = new zat(2, account, num.intValue(), googleSignInAccount);
            C67901Qkr c67901Qkr = (C67901Qkr) LJJIIJ();
            zai zaiVar = new zai(1, zatVar);
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c67901Qkr.LJLILLLLZI);
            obtain.writeInt(1);
            zaiVar.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(interfaceC67967Qlv.asBinder());
            c67901Qkr.LJLJI(obtain, 12);
        } catch (RemoteException e) {
            try {
                interfaceC67967Qlv.LLIIJLIL(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                android.util.Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C67927QlH) {
            return queryLocalInterface;
        }
        return new C67927QlH(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67779Qit
    public final void LJIILL(InterfaceC67936QlQ interfaceC67936QlQ, boolean z) {
        try {
            C67901Qkr c67901Qkr = (C67901Qkr) LJJIIJ();
            Integer num = this.LLIIJLIL;
            QH7.LJIIIIZZ(num);
            int intValue = num.intValue();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c67901Qkr.LJLILLLLZI);
            obtain.writeStrongBinder(interfaceC67936QlQ.asBinder());
            obtain.writeInt(intValue);
            obtain.writeInt(z ? 1 : 0);
            c67901Qkr.LJLJI(obtain, 9);
        } catch (RemoteException unused) {
        }
    }

    public C67822Qja(Context context, Looper looper, C67736QiC c67736QiC, Bundle bundle, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj) {
        super(context, looper, 44, c67736QiC, interfaceC67706Qhi, interfaceC67707Qhj);
        this.LLIIIL = true;
        this.LLIIIZ = c67736QiC;
        this.LLIIJI = bundle;
        this.LLIIJLIL = c67736QiC.LJIIIIZZ;
    }
}

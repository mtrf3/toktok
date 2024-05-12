package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* renamed from: X.Qii, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67768Qii extends AbstractC67782Qiw {
    public final /* synthetic */ C67761Qib LIZIZ;
    public final /* synthetic */ zak LIZJ;

    @Override // X.AbstractC67782Qiw
    public final void LIZ() {
        InterfaceC67936QlQ c67883QkZ;
        C67761Qib c67761Qib = this.LIZIZ;
        zak zakVar = this.LIZJ;
        if (!c67761Qib.LJIILIIL(0)) {
            return;
        }
        ConnectionResult connectionResult = zakVar.zab;
        if (connectionResult.LJJJJZ()) {
            zav zavVar = zakVar.zac;
            QH7.LJIIIIZZ(zavVar);
            ConnectionResult connectionResult2 = zavVar.zac;
            if (!connectionResult2.LJJJJZ()) {
                String valueOf = String.valueOf(connectionResult2);
                android.util.Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                c67761Qib.LJIIJ(connectionResult2);
                return;
            }
            c67761Qib.LJIILIIL = true;
            IBinder iBinder = zavVar.LJLILLLLZI;
            if (iBinder == null) {
                c67883QkZ = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof InterfaceC67936QlQ) {
                    c67883QkZ = (InterfaceC67936QlQ) queryLocalInterface;
                } else {
                    c67883QkZ = new C67883QkZ(iBinder);
                }
            }
            QH7.LJIIIIZZ(c67883QkZ);
            c67761Qib.LJIILJJIL = c67883QkZ;
            c67761Qib.LJIILL = zavVar.zad;
            c67761Qib.LJIILLIIL = zavVar.zae;
            c67761Qib.LJIIL();
            return;
        }
        if (c67761Qib.LJIIJJI && !connectionResult.LJJJJL()) {
            c67761Qib.LJII();
            c67761Qib.LJIIL();
        } else {
            c67761Qib.LJIIJ(connectionResult);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67768Qii(C67761Qib c67761Qib, C67761Qib c67761Qib2, zak zakVar) {
        super(c67761Qib);
        this.LIZIZ = c67761Qib2;
        this.LIZJ = zakVar;
    }
}

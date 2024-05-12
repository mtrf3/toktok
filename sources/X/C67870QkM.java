package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.QkM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67870QkM extends AbstractC67874QkQ {
    public final IBinder LJI;
    public final /* synthetic */ AbstractC67863QkF LJII;

    @Override // X.AbstractC67874QkQ
    public final boolean LJFF() {
        try {
            IBinder iBinder = this.LJI;
            QH7.LJIIIIZZ(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.LJII.LJJIIJZLJL().equals(interfaceDescriptor)) {
                int length = String.valueOf(this.LJII.LJJIIJZLJL()).length();
                new StringBuilder(length + 34 + String.valueOf(interfaceDescriptor).length());
                return false;
            }
            IInterface LJIJJLI = this.LJII.LJIJJLI(this.LJI);
            if (LJIJJLI == null) {
                return false;
            }
            if (!AbstractC67863QkF.LJJIJL(this.LJII, 2, 4, LJIJJLI) && !AbstractC67863QkF.LJJIJL(this.LJII, 3, 4, LJIJJLI)) {
                return false;
            }
            AbstractC67863QkF abstractC67863QkF = this.LJII;
            abstractC67863QkF.LLFII = null;
            Bundle LJJIFFI = abstractC67863QkF.LJJIFFI();
            InterfaceC67926QlG interfaceC67926QlG = this.LJII.LL;
            if (interfaceC67926QlG != null) {
                interfaceC67926QlG.H0(LJJIFFI);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // X.AbstractC67874QkQ
    public final void LJ(ConnectionResult connectionResult) {
        InterfaceC67948Qlc interfaceC67948Qlc = this.LJII.LLD;
        if (interfaceC67948Qlc != null) {
            interfaceC67948Qlc.onConnectionFailed(connectionResult);
        }
        this.LJII.LJJIJ(connectionResult);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67870QkM(AbstractC67863QkF abstractC67863QkF, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC67863QkF, i, bundle);
        this.LJII = abstractC67863QkF;
        this.LJI = iBinder;
    }
}

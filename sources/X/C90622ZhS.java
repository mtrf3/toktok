package X;

import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.ZhS, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90622ZhS extends ZX1 {
    public final /* synthetic */ C90613ZhJ LIZ;

    public /* synthetic */ C90622ZhS(C90613ZhJ c90613ZhJ) {
        this.LIZ = c90613ZhJ;
    }

    @Override // X.ZX1
    public final void LIZ() {
        C90613ZhJ c90613ZhJ = this.LIZ;
        if (c90613ZhJ.LJ == null) {
            return;
        }
        try {
            C90639Zhj c90639Zhj = c90613ZhJ.LJIIIIZZ;
            if (c90639Zhj != null) {
                c90639Zhj.LJIL();
            }
            this.LIZ.LJ.LLIIII();
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = C90613ZhJ.LJIIL;
            C16880lQ.LJLLJ(InterfaceC90112ZYe.class);
            c90469Zez.getClass();
        }
    }

    @Override // X.ZX1
    public final void LIZIZ(int i) {
        InterfaceC90112ZYe interfaceC90112ZYe = this.LIZ.LJ;
        if (interfaceC90112ZYe == null) {
            return;
        }
        try {
            interfaceC90112ZYe.LLJJJJ(new ConnectionResult(i));
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = C90613ZhJ.LJIIL;
            C16880lQ.LJLLJ(InterfaceC90112ZYe.class);
            c90469Zez.getClass();
        }
    }

    @Override // X.ZX1
    public final void LIZJ(int i) {
        InterfaceC90112ZYe interfaceC90112ZYe = this.LIZ.LJ;
        if (interfaceC90112ZYe == null) {
            return;
        }
        try {
            interfaceC90112ZYe.LJJ(i);
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = C90613ZhJ.LJIIL;
            C16880lQ.LJLLJ(InterfaceC90112ZYe.class);
            c90469Zez.getClass();
        }
    }

    @Override // X.ZX1
    public final void LIZLLL(int i) {
        InterfaceC90112ZYe interfaceC90112ZYe = this.LIZ.LJ;
        if (interfaceC90112ZYe == null) {
            return;
        }
        try {
            interfaceC90112ZYe.LLJJJJ(new ConnectionResult(i));
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = C90613ZhJ.LJIIL;
            C16880lQ.LJLLJ(InterfaceC90112ZYe.class);
            c90469Zez.getClass();
        }
    }
}

package X;

import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.HashMap;

/* renamed from: X.Qzk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68824Qzk {
    public final InterfaceC68823Qzj LIZ;
    public C0R4 LIZIZ;

    public final CameraPosition LIZJ() {
        try {
            return this.LIZ.getCameraPosition();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public final C30941Ji LIZLLL() {
        try {
            return new C30941Ji(this.LIZ.LLLJIL());
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public final C0R4 LJ() {
        try {
            if (this.LIZIZ == null) {
                this.LIZIZ = new C0R4(this.LIZ.LJJIIZI());
            }
            return this.LIZIZ;
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public C68824Qzk(InterfaceC68823Qzj interfaceC68823Qzj) {
        new HashMap();
        QH7.LJIIIIZZ(interfaceC68823Qzj);
        this.LIZ = interfaceC68823Qzj;
    }

    public final void LJFF(C30931Jh c30931Jh) {
        try {
            this.LIZ.H((InterfaceC68163Qp5) c30931Jh.LJLIL);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public final void LIZIZ(C30931Jh c30931Jh, InterfaceC68833Qzt interfaceC68833Qzt) {
        try {
            this.LIZ.LLI((InterfaceC68163Qp5) c30931Jh.LJLIL, new BinderC68831Qzr(interfaceC68833Qzt));
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public final void LIZ(C30931Jh c30931Jh, int i, InterfaceC68833Qzt interfaceC68833Qzt) {
        try {
            this.LIZ.O((InterfaceC68163Qp5) c30931Jh.LJLIL, i, new BinderC68831Qzr(interfaceC68833Qzt));
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }
}

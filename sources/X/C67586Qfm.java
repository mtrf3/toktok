package X;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Qfm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67586Qfm extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ IBinder LJLILLLLZI;
    public final /* synthetic */ ServiceConnectionC67589Qfp LJLJI;

    public C67586Qfm(ServiceConnectionC67589Qfp serviceConnectionC67589Qfp, IBinder iBinder) {
        this.LJLJI = serviceConnectionC67589Qfp;
        this.LJLILLLLZI = iBinder;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        C67585Qfl c67585Qfl = this.LJLJI.LJLIL;
        c67585Qfl.LJIIJ = (T) c67585Qfl.LJI.LIZ(this.LJLILLLLZI);
        C67585Qfl c67585Qfl2 = this.LJLJI.LJLIL;
        c67585Qfl2.LIZIZ.LIZJ("linkToDeath", 4, new Object[0]);
        try {
            c67585Qfl2.LJIIJ.asBinder().linkToDeath(c67585Qfl2.LJIIIIZZ, 0);
        } catch (RemoteException unused) {
            c67585Qfl2.LIZIZ.getClass();
        }
        C67585Qfl c67585Qfl3 = this.LJLJI.LJLIL;
        c67585Qfl3.LJ = false;
        Iterator it = ((ArrayList) c67585Qfl3.LIZLLL).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((ArrayList) this.LJLJI.LJLIL.LIZLLL).clear();
    }
}

package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Qfb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67575Qfb extends AbstractRunnableC67572QfY {
    public final /* synthetic */ IBinder LJLILLLLZI;
    public final /* synthetic */ ServiceConnectionC67578Qfe LJLJI;

    @Override // X.AbstractRunnableC67572QfY
    public final void LIZIZ() {
        IInterface queryLocalInterface;
        C67574Qfa c67574Qfa = this.LJLJI.LJLIL;
        IBinder iBinder = this.LJLILLLLZI;
        if (iBinder == null) {
            queryLocalInterface = null;
        } else {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            if (!(queryLocalInterface instanceof InterfaceC67566QfS)) {
                queryLocalInterface = new C67563QfP(iBinder);
            }
        }
        c67574Qfa.LJIIL = queryLocalInterface;
        C67574Qfa c67574Qfa2 = this.LJLJI.LJLIL;
        c67574Qfa2.LIZIZ.LIZ("linkToDeath", new Object[0]);
        try {
            c67574Qfa2.LJIIL.asBinder().linkToDeath(c67574Qfa2.LJIIIZ, 0);
        } catch (RemoteException unused) {
            C67554QfG c67554QfG = c67574Qfa2.LIZIZ;
            Object[] objArr = new Object[0];
            if (android.util.Log.isLoggable("PlayCore", 6)) {
                C67554QfG.LIZIZ(c67554QfG.LIZ, "linkToDeath failed", objArr);
            } else {
                c67554QfG.getClass();
            }
        }
        C67574Qfa c67574Qfa3 = this.LJLJI.LJLIL;
        c67574Qfa3.LJI = false;
        Iterator it = ((ArrayList) c67574Qfa3.LIZLLL).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((ArrayList) this.LJLJI.LJLIL.LIZLLL).clear();
    }

    public C67575Qfb(ServiceConnectionC67578Qfe serviceConnectionC67578Qfe, IBinder iBinder) {
        this.LJLJI = serviceConnectionC67578Qfe;
        this.LJLILLLLZI = iBinder;
    }
}

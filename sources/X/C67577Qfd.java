package X;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Qfd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C67577Qfd implements IBinder.DeathRecipient {
    public final /* synthetic */ int LJLIL;
    public final Object LJLILLLLZI;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.LJLIL) {
            case 0:
                C67585Qfl c67585Qfl = (C67585Qfl) this.LJLILLLLZI;
                c67585Qfl.LIZIZ.LIZJ("reportBinderDeath", 4, new Object[0]);
                InterfaceC67581Qfh interfaceC67581Qfh = c67585Qfl.LJII.get();
                if (interfaceC67581Qfh == null) {
                    c67585Qfl.LIZIZ.LIZJ("%s : Binder has died.", 4, new Object[]{c67585Qfl.LIZJ});
                    Iterator it = ((ArrayList) c67585Qfl.LIZLLL).iterator();
                    while (it.hasNext()) {
                        C40579FwF c40579FwF = ((AbstractRunnableC40619Fwt) it.next()).LJLIL;
                        if (c40579FwF != null) {
                            c40579FwF.LIZIZ(new RemoteException(String.valueOf(c67585Qfl.LIZJ).concat(" : Binder has died.")));
                        }
                    }
                    ((ArrayList) c67585Qfl.LIZLLL).clear();
                    return;
                }
                c67585Qfl.LIZIZ.LIZJ("calling onBinderDied", 4, new Object[0]);
                interfaceC67581Qfh.a();
                return;
            default:
                C67574Qfa c67574Qfa = (C67574Qfa) this.LJLILLLLZI;
                c67574Qfa.LIZIZ.LIZ("reportBinderDeath", new Object[0]);
                InterfaceC67582Qfi interfaceC67582Qfi = (InterfaceC67582Qfi) c67574Qfa.LJIIIIZZ.get();
                if (interfaceC67582Qfi != null) {
                    c67574Qfa.LIZIZ.LIZ("calling onBinderDied", new Object[0]);
                    interfaceC67582Qfi.a();
                } else {
                    c67574Qfa.LIZIZ.LIZ("%s : Binder has died.", c67574Qfa.LIZJ);
                    Iterator it2 = ((ArrayList) c67574Qfa.LIZLLL).iterator();
                    while (it2.hasNext()) {
                        ((AbstractRunnableC67572QfY) it2.next()).LIZ(new RemoteException(String.valueOf(c67574Qfa.LIZJ).concat(" : Binder has died.")));
                    }
                    ((ArrayList) c67574Qfa.LIZLLL).clear();
                }
                c67574Qfa.LIZIZ();
                return;
        }
    }

    public /* synthetic */ C67577Qfd(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}

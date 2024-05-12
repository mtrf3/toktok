package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.QkN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ServiceConnectionC67871QkN implements ServiceConnection {
    public final int LJLIL;
    public final /* synthetic */ AbstractC67863QkF LJLILLLLZI;

    public ServiceConnectionC67871QkN(AbstractC67863QkF abstractC67863QkF, int i) {
        this.LJLILLLLZI = abstractC67863QkF;
        this.LJLIL = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC67863QkF abstractC67863QkF;
        synchronized (this.LJLILLLLZI.LJLLL) {
            abstractC67863QkF = this.LJLILLLLZI;
            abstractC67863QkF.LJLLLL = null;
        }
        HandlerC67864QkG handlerC67864QkG = abstractC67863QkF.LJLLILLLL;
        handlerC67864QkG.sendMessage(handlerC67864QkG.obtainMessage(6, this.LJLIL, 1));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC67937QlR c67873QkP;
        AbstractC67863QkF abstractC67863QkF = this.LJLILLLLZI;
        if (iBinder == null) {
            AbstractC67863QkF.LJJIJIL(abstractC67863QkF);
            return;
        }
        synchronized (abstractC67863QkF.LJLLL) {
            AbstractC67863QkF abstractC67863QkF2 = this.LJLILLLLZI;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC67937QlR)) {
                c67873QkP = (InterfaceC67937QlR) queryLocalInterface;
            } else {
                c67873QkP = new C67873QkP(iBinder);
            }
            abstractC67863QkF2.LJLLLL = c67873QkP;
        }
        AbstractC67863QkF abstractC67863QkF3 = this.LJLILLLLZI;
        int i = this.LJLIL;
        HandlerC67864QkG handlerC67864QkG = abstractC67863QkF3.LJLLILLLL;
        handlerC67864QkG.sendMessage(handlerC67864QkG.obtainMessage(7, i, -1, new C67885Qkb(abstractC67863QkF3, 0)));
    }
}

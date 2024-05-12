package X;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

/* renamed from: X.QkL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67869QkL implements Handler.Callback {
    public final /* synthetic */ C67868QkK LJLIL;

    public /* synthetic */ C67869QkL(C67868QkK c67868QkK) {
        this.LJLIL = c67868QkK;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            synchronized (this.LJLIL.LIZLLL) {
                C65428Pm4 c65428Pm4 = (C65428Pm4) message.obj;
                ServiceConnectionC67867QkJ serviceConnectionC67867QkJ = this.LJLIL.LIZLLL.get(c65428Pm4);
                if (serviceConnectionC67867QkJ != null && serviceConnectionC67867QkJ.LJLILLLLZI == 3) {
                    new StringBuilder(String.valueOf(c65428Pm4).length() + 47);
                    new Exception();
                    ComponentName componentName = serviceConnectionC67867QkJ.LJLJJLL;
                    if (componentName == null) {
                        c65428Pm4.getClass();
                        String str = c65428Pm4.LIZIZ;
                        QH7.LJIIIIZZ(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    serviceConnectionC67867QkJ.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
        synchronized (this.LJLIL.LIZLLL) {
            C65428Pm4 c65428Pm42 = (C65428Pm4) message.obj;
            ServiceConnectionC67867QkJ serviceConnectionC67867QkJ2 = this.LJLIL.LIZLLL.get(c65428Pm42);
            if (serviceConnectionC67867QkJ2 != null && ((HashMap) serviceConnectionC67867QkJ2.LJLIL).isEmpty()) {
                if (serviceConnectionC67867QkJ2.LJLJI) {
                    serviceConnectionC67867QkJ2.LJLJL.LJFF.removeMessages(1, serviceConnectionC67867QkJ2.LJLJJL);
                    C67868QkK c67868QkK = serviceConnectionC67867QkJ2.LJLJL;
                    c67868QkK.LJI.LIZJ(c67868QkK.LJ, serviceConnectionC67867QkJ2);
                    serviceConnectionC67867QkJ2.LJLJI = false;
                    serviceConnectionC67867QkJ2.LJLILLLLZI = 2;
                }
                this.LJLIL.LIZLLL.remove(c65428Pm42);
            }
        }
        return true;
    }
}

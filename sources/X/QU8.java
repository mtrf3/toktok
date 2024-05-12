package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class QU8 {
    public final C67032QSm LIZ;
    public final InterfaceC67030QSk LIZIZ;
    public final List<InterfaceC67072QUa> LIZJ = new ArrayList();
    public final QUH LIZLLL;

    public final void LIZ(List<InterfaceC67072QUa> list) {
        boolean z;
        QUH quh;
        synchronized (this.LIZJ) {
            ArrayList arrayList = new ArrayList(list);
            synchronized (this.LIZJ) {
                Iterator it = arrayList.iterator();
                z = false;
                while (it.hasNext()) {
                    InterfaceC67072QUa interfaceC67072QUa = (InterfaceC67072QUa) it.next();
                    if (interfaceC67072QUa != null && !((ArrayList) this.LIZJ).contains(interfaceC67072QUa)) {
                        ((ArrayList) this.LIZJ).add(interfaceC67072QUa);
                        z = true;
                    }
                }
            }
        }
        if (z && (quh = this.LIZLLL) != null) {
            long j = this.LIZ.LIZ;
            C67087QUp c67087QUp = ((QU6) quh).LJ;
            c67087QUp.LIZIZ().removeMessages(102);
            c67087QUp.LIZIZ().sendMessageDelayed(c67087QUp.LIZIZ().obtainMessage(102), 50L);
            c67087QUp.LIZJ(0, j, 50L);
        }
    }

    public QU8(C67032QSm c67032QSm, QUC quc, QUH quh) {
        this.LIZ = c67032QSm;
        this.LIZIZ = quc;
        this.LIZLLL = quh;
    }
}

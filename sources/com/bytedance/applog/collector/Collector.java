package com.bytedance.applog.collector;

import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C66748QHo;
import X.C84763XOl;
import X.QI2;
import X.QI3;
import X.QI4;
import X.QIB;
import X.QIK;
import X.QIQ;
import X.QIX;
import X.X1D;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public class Collector extends BroadcastReceiver {
    public static void LIZ(Intent intent) {
        String[] stringArrayExtra = intent.getStringArrayExtra("K_DATA");
        if (stringArrayExtra != null && stringArrayExtra.length > 0) {
            Iterator it = ((CopyOnWriteArrayList) QI3.LJJJI).iterator();
            while (it.hasNext()) {
                QI3 qi3 = (QI3) it.next();
                String[] strArr = (String[]) stringArrayExtra.clone();
                qi3.getClass();
                if (strArr.length != 0) {
                    for (int i = 0; i < strArr.length; i++) {
                    }
                    if (qi3.LJIILIIL == null) {
                        C66748QHo c66748QHo = qi3.LIZJ;
                        synchronized (c66748QHo.LIZIZ) {
                            if (c66748QHo.LIZIZ.size() > 1000) {
                                String poll = c66748QHo.LIZIZ.poll();
                                QI2 LIZLLL = QI2.LIZLLL(poll);
                                c66748QHo.LIZJ.LIZLLL.LJFF(LIZLLL, QIK.f_cache);
                                c66748QHo.LIZJ.LIZLLL.LJIIIIZZ(QIQ.f_cache_event, QIB.LIZ(LIZLLL));
                                QIX qix = c66748QHo.LIZJ.LJJIZ;
                                List<String> list = C66748QHo.LIZLLL;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("AppLogCache overflow2 remove data: ");
                                LIZ.append(poll);
                                qix.LJIIIIZZ(0, list, X1D.LIZIZ(LIZ), new Object[0]);
                            }
                            c66748QHo.LIZIZ.addAll(Arrays.asList(strArr));
                        }
                    } else {
                        QI4 qi4 = qi3.LJIILIIL;
                        qi4.LJLLJ.removeMessages(4);
                        qi4.LJLLJ.obtainMessage(4, strArr).sendToTarget();
                    }
                }
            }
            return;
        }
        QIX.LJIJJ().LJIIJJI("Collector onReceive empty", new Object[0]);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}

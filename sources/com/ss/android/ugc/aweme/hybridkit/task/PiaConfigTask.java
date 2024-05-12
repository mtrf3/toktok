package com.ss.android.ugc.aweme.hybridkit.task;

import X.C37509Enp;
import X.C37535EoF;
import X.C37536EoG;
import X.C37537EoH;
import X.C37539EoJ;
import X.C58096Mr6;
import X.FKM;
import X.InterfaceC37408EmC;
import X.RunnableC37544EoO;
import com.bytedance.pia.core.spi.api.IPiaConfigTask;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class PiaConfigTask implements IPiaConfigTask {
    public static IPiaConfigTask LIZ() {
        Object LIZ = C58096Mr6.LIZ(IPiaConfigTask.class, false);
        if (LIZ != null) {
            return (IPiaConfigTask) LIZ;
        }
        if (C58096Mr6.f1 == null) {
            synchronized (IPiaConfigTask.class) {
                if (C58096Mr6.f1 == null) {
                    C58096Mr6.f1 = new PiaConfigTask();
                }
            }
        }
        return C58096Mr6.f1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AwemeHostApplication LIZ = FKM.LIZ();
        if (LIZ != null && C37509Enp.LIZ == null) {
            C37509Enp.LIZ = LIZ;
        }
        C37535EoF c37535EoF = new C37535EoF();
        if (C37509Enp.LIZJ == null) {
            C37509Enp.LIZJ = c37535EoF;
        }
        InterfaceC37408EmC interfaceC37408EmC = C37537EoH.LIZ;
        if (C37509Enp.LIZLLL == null) {
            C37509Enp.LIZLLL = interfaceC37408EmC;
        }
        InterfaceC37408EmC interfaceC37408EmC2 = C37536EoG.LIZ;
        if (C37509Enp.LJFF == null) {
            C37509Enp.LJFF = interfaceC37408EmC2;
        }
        ((ArrayList) C37509Enp.LJI).add(C37539EoJ.LIZ);
        RunnableC37544EoO runnableC37544EoO = RunnableC37544EoO.LJLIL;
        if (C37509Enp.LIZIZ != null) {
            return;
        }
        C37509Enp.LIZIZ = runnableC37544EoO;
    }
}

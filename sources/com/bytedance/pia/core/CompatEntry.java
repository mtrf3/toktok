package com.bytedance.pia.core;

import X.C37238EjS;
import X.C37392Elw;
import X.C37418EmM;
import X.C37420EmO;
import com.bytedance.pia.nsr.bridge.PiaNsrMethod;
import com.bytedance.pia.page.bridge.PiaPostWorkerMessageMethod;
import com.bytedance.pia.snapshot.bridge.PiaRemoveSnapshot;
import com.bytedance.pia.snapshot.bridge.PiaSaveSnapshotMethod;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class CompatEntry {
    public static void initialize() {
        C37420EmO c37420EmO;
        C37238EjS.LJI(6, "Initialize PIA-Core-Compat.", null);
        C37418EmM c37418EmM = new C37418EmM();
        C37420EmO c37420EmO2 = C37420EmO.LIZIZ;
        C37420EmO c37420EmO3 = c37420EmO2.LIZ;
        if (c37420EmO3 == null) {
            c37420EmO2.LIZ = c37418EmM;
        } else {
            C37420EmO c37420EmO4 = c37420EmO3.LIZ;
            while (true) {
                c37420EmO = c37420EmO3;
                c37420EmO3 = c37420EmO4;
                if (c37420EmO3 == null) {
                    break;
                } else {
                    c37420EmO4 = c37420EmO3.LIZ;
                }
            }
            c37420EmO.LIZ = c37418EmM;
        }
        HashMap hashMap = (HashMap) C37392Elw.LIZIZ;
        hashMap.put("pia.nsr", PiaNsrMethod.LIZ);
        hashMap.put("pia.saveSnapshot", PiaSaveSnapshotMethod.LIZ);
        hashMap.put("pia.removeSnapshot", PiaRemoveSnapshot.LIZ);
        hashMap.put("pia.postWorkerMessage", PiaPostWorkerMessageMethod.LIZ);
    }
}

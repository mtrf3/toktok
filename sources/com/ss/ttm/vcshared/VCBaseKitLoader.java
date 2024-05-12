package com.ss.ttm.vcshared;

import X.C16880lQ;
import X.C47821Ipl;
import X.C56662Kg;

/* loaded from: classes9.dex */
public class VCBaseKitLoader {
    public static volatile boolean LIZ;

    public static synchronized void LIZ() {
        synchronized (VCBaseKitLoader.class) {
            if (C47821Ipl.LJI && C56662Kg.LIZ().LIZLLL) {
                C56662Kg.LIZ().LIZJ("player_precreate_load_vcbasekit_so_duration", false);
            }
            com_ss_ttm_vcshared_VCBaseKitLoader__loadLibrary$___twin___();
            if (C47821Ipl.LJI && C56662Kg.LIZ().LIZLLL) {
                C56662Kg.LIZ().LJFF("player_precreate_load_vcbasekit_so_duration", false);
                C47821Ipl.LJI = false;
            }
        }
    }

    public static synchronized boolean com_ss_ttm_vcshared_VCBaseKitLoader__loadLibrary$___twin___() {
        synchronized (VCBaseKitLoader.class) {
            if (LIZ) {
                return true;
            }
            try {
                C16880lQ.LLJJJIL("vcbasekit");
                LIZ = true;
            } catch (Throwable unused) {
            }
            return LIZ;
        }
    }
}

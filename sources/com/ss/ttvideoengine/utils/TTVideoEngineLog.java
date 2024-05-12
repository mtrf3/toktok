package com.ss.ttvideoengine.utils;

import X.C78253UnR;
import X.InterfaceC46786IXu;

/* loaded from: classes9.dex */
public class TTVideoEngineLog {
    public static void d(Throwable th) {
    }

    public static boolean d() {
        if (((C78253UnR.LJLIL >> 1) & 1) == 1 || ((C78253UnR.LJLJI >> 1) & 1) == 1) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (((C78253UnR.LJLIL >> 6) & 1) == 1 || ((C78253UnR.LJLJI >> 6) & 1) == 1) {
            return true;
        }
        return false;
    }

    public static int getLogNotifyLevel() {
        return C78253UnR.LJLJI;
    }

    public static int getLogTurnOn() {
        return C78253UnR.LJLIL;
    }

    public static void setListener(InterfaceC46786IXu interfaceC46786IXu) {
        C78253UnR.LJLILLLLZI = interfaceC46786IXu;
    }

    public static void _notifyListener(String str, String str2) {
        C78253UnR.LIZ(str, str2);
    }

    public static void d(String str, String str2) {
        if (((C78253UnR.LJLJI >> 1) & 1) == 1) {
            C78253UnR.LIZ(str, str2);
        }
    }

    public static void e(String str, String str2) {
        C78253UnR.LIZLLL(str, str2);
    }

    public static void i(String str, String str2) {
        C78253UnR.LJI(str, str2);
    }

    public static void k(String str, String str2) {
        if (((C78253UnR.LJLJI >> 4) & 1) == 1) {
            C78253UnR.LIZ(str, str2);
        }
    }

    public static void setLogNotifyLevel(int i, int i2) {
        C78253UnR.LJLJI = (i2 << i) | ((~(1 << i)) & C78253UnR.LJLJI);
    }

    public static void t(String str, String str2) {
        if (((C78253UnR.LJLJI >> 3) & 1) == 1) {
            C78253UnR.LIZ(str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
    
        if (r7 >= 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void turnOn(int r7, int r8) {
        /*
            r1 = 1
            int r0 = r1 << r7
            int r2 = ~r0
            int r0 = X.C78253UnR.LJLIL
            r2 = r2 & r0
            int r0 = r8 << r7
            r2 = r2 | r0
            X.C78253UnR.LJLIL = r2
            if (r7 != r1) goto L16
            if (r8 != r1) goto L16
            r0 = r2 & (-5)
            r0 = r0 | 4
            X.C78253UnR.LJLIL = r0
        L16:
            r2 = 0
            if (r7 != r1) goto Le4
            if (r8 != r1) goto Le4
            com.bytedance.vcloud.abrmodule.ABRConfig.setLoglevel(r1)
            X.IlG r5 = X.C47606ImI.LIZ
            r0 = 33
            r5.LJIIIZ(r0, r1)
            X.C47606ImI.LIZ = r5
            r5.LJII()
            X.IlG r0 = X.C47606ImI.LIZ
            r6 = -1
            int r4 = r0.LIZLLL(r1, r6, r1)
            X.IlG r0 = X.C47606ImI.LIZ
            r3 = 2
            int r0 = r0.LIZLLL(r3, r6, r1)
            if (r3 != r4) goto Lb1
            if (r1 != r0) goto Lb1
            r0 = 44
            int r0 = r5.LIZJ(r0)
            com.bytedance.vcloud.abrmodule.ABRConfig.setSwitchModel(r0)
            r0 = 45
            int r0 = r5.LIZJ(r0)
            com.bytedance.vcloud.abrmodule.ABRConfig.setFixedLevel(r0)
            r0 = 46
            int r0 = r5.LIZJ(r0)
            com.bytedance.vcloud.abrmodule.ABRConfig.setStartupModel(r0)
            float r0 = r5.LIZIZ(r1)
            com.bytedance.vcloud.abrmodule.ABRConfig.setStartupBandwidthParameter(r0)
            r0 = 48
            double r3 = r5.LIZ(r1, r0)
            com.bytedance.vcloud.abrmodule.ABRConfig.setStartupModelFirstParam(r3)
            r0 = 49
            double r3 = r5.LIZ(r1, r0)
            com.bytedance.vcloud.abrmodule.ABRConfig.setStartupModelSecondParam(r3)
            r0 = 50
            double r3 = r5.LIZ(r1, r0)
            com.bytedance.vcloud.abrmodule.ABRConfig.setStartupModelThirdParam(r3)
            r0 = 51
            double r3 = r5.LIZ(r1, r0)
            com.bytedance.vcloud.abrmodule.ABRConfig.setStartupModelFourthParam(r3)
            r0 = 52
            int r0 = r5.LIZJ(r0)
            com.bytedance.vcloud.abrmodule.ABRConfig.setStartupUseCache(r0)
            r0 = 53
            java.lang.String r0 = r5.LJFF(r0)
            com.bytedance.vcloud.abrmodule.ABRConfig.setAbrFlowJson(r0)
            r0 = 54
            java.lang.String r0 = r5.LJFF(r0)
            com.bytedance.vcloud.abrmodule.ABRConfig.setAbrPreloadJson(r0)
            r0 = 55
            java.lang.String r0 = r5.LJFF(r0)
            com.bytedance.vcloud.abrmodule.ABRConfig.setAbrStartupJson(r0)
            r0 = 56
            int r0 = r5.LIZJ(r0)
            if (r0 != r1) goto Laf
            r2 = 1
        Laf:
            X.C47544IlI.LJFF = r2
        Lb1:
            X.IoN r0 = X.C47538IlC.LIZ
            r0.LJ = r1
        Lb5:
            r3 = 10000(0x2710, float:1.4013E-41)
            r2 = 5
            if (r8 <= 0) goto Ld3
            com.ss.ttvideoengine.DataLoaderHelper r0 = X.C47148Ieu.LIZ
            r0.getClass()
            if (r7 != r1) goto Lcf
            r7 = 1
        Lc2:
            r2 = r7
        Lc3:
            X.Il3 r1 = X.C47147Iet.LIZ
            com.bytedance.vcloud.strategy.StrategyCenter r0 = r1.LJ()
            r0.setIntValue(r3, r2)
            r1.LJIIIIZZ = r2
        Lce:
            return
        Lcf:
            r0 = 4
            if (r7 < r0) goto Lc2
            goto Lc3
        Ld3:
            com.ss.ttvideoengine.DataLoaderHelper r0 = X.C47148Ieu.LIZ
            r0.getClass()
            X.Il3 r1 = X.C47147Iet.LIZ
            com.bytedance.vcloud.strategy.StrategyCenter r0 = r1.LJ()
            r0.setIntValue(r3, r2)
            r1.LJIIIIZZ = r2
            goto Lce
        Le4:
            X.IoN r0 = X.C47538IlC.LIZ
            r0.LJ = r2
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.utils.TTVideoEngineLog.turnOn(int, int):void");
    }

    public static void w(String str, String str2) {
        if (((C78253UnR.LJLJI >> 5) & 1) == 1) {
            C78253UnR.LIZ(str, str2);
        }
    }
}

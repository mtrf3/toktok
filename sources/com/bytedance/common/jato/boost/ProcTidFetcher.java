package com.bytedance.common.jato.boost;

import X.C36943Eeh;
import X.C36944Eei;
import X.EVM;
import android.os.Process;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public class ProcTidFetcher {
    public static long LIZ;

    public static native int nativeGetRenderThreadTid(int i);

    public static void LIZ(C36944Eei c36944Eei) {
        try {
            LIZ = System.currentTimeMillis();
            while (System.currentTimeMillis() - LIZ < 1000) {
                int nativeGetRenderThreadTid = nativeGetRenderThreadTid(Process.myPid());
                if (nativeGetRenderThreadTid > 0) {
                    EVM.LIZ = nativeGetRenderThreadTid;
                    EVM.LIZJ = true;
                    CpusetManager.bindBigCore(nativeGetRenderThreadTid);
                    EVM.LIZ(nativeGetRenderThreadTid, ((C36943Eeh) c36944Eei.LIZ.l0).LJLJI);
                    return;
                }
                Thread.sleep(100L);
            }
            new TimeoutException("too long to fetch renderthread tid");
        } catch (Throwable unused) {
        }
    }
}

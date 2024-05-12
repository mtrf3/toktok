package com.benchmark.strategy;

import X.C37625Eph;
import X.C37626Epi;
import X.InterfaceC37632Epo;
import com.benchmark.port.nativePort.BSModuleInvoker;
import com.bytedance.vmsdk.worker.JsWorker;

/* loaded from: classes.dex */
public final class BXVmsdkHandler {
    public static JsWorker LIZ;

    public static synchronized void LIZ() {
        synchronized (BXVmsdkHandler.class) {
            if (LIZ != null) {
                return;
            }
            if (JsWorker.initialize()) {
                C37626Epi c37626Epi = new C37626Epi();
                c37626Epi.LJFF = null;
                c37626Epi.LIZ = JsWorker.EngineType.QUICKJS;
                c37626Epi.LIZJ = null;
                c37626Epi.LJ = false;
                c37626Epi.LIZLLL = true;
                c37626Epi.LIZIZ = "ByteBench";
                JsWorker jsWorker = new JsWorker(new C37625Eph(c37626Epi));
                LIZ = jsWorker;
                jsWorker.setOnMessageCallback(new InterfaceC37632Epo() { // from class: com.benchmark.strategy.BXVmsdkHandler.1
                    @Override // X.InterfaceC37632Epo
                    public final void LIZ(String str) {
                    }
                });
                BSModuleInvoker.LIZ(LIZ.getNativePtr());
            }
        }
    }
}
